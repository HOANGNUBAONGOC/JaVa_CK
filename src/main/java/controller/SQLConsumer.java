package controller;

@FunctionalInterface
public interface SQLConsumer<T> {
    void accept(T t) throws Exception;
}
