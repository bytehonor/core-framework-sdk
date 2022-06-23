package com.bytehonor.sdk.define.bytehonor.function;

import java.io.Serializable;
import java.util.function.Function;

@FunctionalInterface
public interface ClassGetter<T, R> extends Function<T, R>, Serializable {
}
