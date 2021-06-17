package wang.icopy.function;

/**
 * 多态函数
 */
public interface Function<T, U> {
    U apply(T t);
}
