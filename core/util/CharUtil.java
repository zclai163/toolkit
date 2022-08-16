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

    public static void main(String[] args) {
        System.out.println(Character.isWhitespace('y'));
    }
}
