package core.util;

/**
 * 字符工具类
 * 部分工具来自于Apache Commons系列
 */
public class CharUtil {

    /**
     * 是否空白符<br>
     * 空白符包括空格、制表符、全角空格和不间断空格<br>
     *
     * @param c 字符
     * @return 是否空白符
     * @see Character#isWhitespace(int)
     * @see Character#isSpaceChar(int)
     */
    public static boolean isBlankChar(char c) {
        return isBlankChar((int) c);
    }

    /**
     * 是否空白符<br>
     * 空白符包括空格、制表符、全角空格和不间断空格<br>
     *
     * @param c 字符
     * @return 是否空白符
     * @see Character#isWhitespace(int)
     * @see Character#isSpaceChar(int)
     */
    public static boolean isBlankChar(int c) {
        return Character.isWhitespace(c) // 判断是否为空格
                || Character.isSpaceChar(c) // 判断是否为Unicode空格
                || c == '\ufeff' //连接符
                || c == '\u202a' //顺序
                || c == '\u0000';//空格
    }

    /**
     * 判断是否为字母（包括大写字母和小写字母）<br>
     * 字母包括A~Z和a~z
     *
     * <pre>
     *     CharUtil.isLetter('a') = true
     *     CharUtil.isLetter('A') = true
     *     CharUtil.isLetter('3') = false
     *     CharUtil.isLetter('-') = false
     *     CharUtil.isLetter('\n') = false
     *     CharUtil.isLetter('&copy;') = false
     * </pre>
     * @param ch 被检查的字符
     * @return true 表示为字母
     */
    public static boolean isLetter(char ch) {
        return isLetterUpper(ch) || isLetterLower(ch);
    }

    /**
     * <p>
     *     判断是否为小写字母，小写字母包括a~z
     * </p>
     *
     * <pre>
     *     CharUtil.isLetterUpper('A') = false
     *     CharUtil.isLetterUpper('a') = true
     *     CharUtil.isLetterUpper('1') = false
     *     CharUtil.isLetterUpper('-') = false
     *     CharUtil.isLetterUpper('\n') = false
     *     CharUtil.isLetterUpper('&copy;') = false
     * </pre>
     *
     * @param ch 被检查的字符
     * @return true表示为小写字母，小写字母包括a~z
     */
    public static boolean isLetterLower(char ch) {
        return ch >= 'a' && ch <= 'z';
    }


    /**
     * <p>
     *     判断是否为大写字母，大写字母包括A~Z
     * </p>
     *
     * <pre>
     *     CharUtil.isLetterUpper('A') = true
     *     CharUtil.isLetterUpper('a') = false
     *     CharUtil.isLetterUpper('1') = false
     *     CharUtil.isLetterUpper('-') = false
     *     CharUtil.isLetterUpper('\n') = false
     *     CharUtil.isLetterUpper('&copy;') = false
     * </pre>
     *
     * @param ch 被检查的字符
     * @return true标识为大写字母，大写字母包括A~Z
     */
    public static boolean isLetterUpper(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    /**
     * <p>
     *     判断是否为数字字符，数字字符指0~9
     * </p>
     *
     * <pre>
     *     CharUtil.isLetterUpper('A') = false
     *     CharUtil.isLetterUpper('a') = false
     *     CharUtil.isLetterUpper('1') = true
     *     CharUtil.isLetterUpper('-') = false
     *     CharUtil.isLetterUpper('\n') = false
     *     CharUtil.isLetterUpper('&copy;') = false
     * </pre>
     *
     * @param ch 被检查字符
     * @return true表示为数字字符
     */
    public static boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }

    /**
     * 是否为数字或字母，包括A~Z、a~z、0~9
     *
     * <pre>
     *     CharUtil.isLetterUpper('A') = true
     *     CharUtil.isLetterUpper('a') = true
     *     CharUtil.isLetterUpper('1') = true
     *     CharUtil.isLetterUpper('-') = false
     *     CharUtil.isLetterUpper('\n') = false
     *     CharUtil.isLetterUpper('&copy;') = false
     * </pre>
     * @param ch 被检查字符
     * @return true表示为数字或字母
     */
    public static boolean isLetterOrNumber(char ch) {
        return isNumber(ch) || isLetter(ch);
    }

    /**
     * 比较两个字符是否相同
     *
     * @param c1                字符1
     * @param c2                字符2
     * @param caseInsensitive   是否忽略大小写
     * @return 是否相同
     * 如果忽略大小写 {@link Character#toLowerCase(char)} 统一转为小写进行比较
     */
    public static boolean equals(char c1, char c2, boolean caseInsensitive) {
        if (caseInsensitive) {
            return Character.toLowerCase(c1) == Character.toLowerCase(c2);
        }
        return c1 == c2;
    }
}
