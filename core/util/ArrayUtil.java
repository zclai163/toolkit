package core.util;

/**
 * 数组工具类
 */
public class ArrayUtil extends PrimitiveArrayUtil{

	/**
	 * 数组是否为空
	 *
	 * @param array 数组
	 * @param <T> 数组元素类型
	 * @return 是否为空
	 */
	public static <T> boolean isEmpty(T[] array) {
		return array == null || array.length == 0;
	}
}
