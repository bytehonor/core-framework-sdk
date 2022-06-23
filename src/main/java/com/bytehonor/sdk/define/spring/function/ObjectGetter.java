package com.bytehonor.sdk.define.spring.function;

@FunctionalInterface
public interface ObjectGetter<T> {
    T get();
}
