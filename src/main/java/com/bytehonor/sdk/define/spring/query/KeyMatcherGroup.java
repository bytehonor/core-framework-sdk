package com.bytehonor.sdk.define.spring.query;

import java.util.ArrayList;
import java.util.List;

public class KeyMatcherGroup {

    private final List<KeyMatcher> matchers;

    public KeyMatcherGroup() {
        this.matchers = new ArrayList<KeyMatcher>();
    }

    public static KeyMatcherGroup create() {
        return new KeyMatcherGroup();
    }

    public KeyMatcherGroup safeAdd(KeyMatcher matcher) {
        if (KeyMatcher.accept(matcher)) {
            this.matchers.add(matcher);
        }
        return this;
    }

    public List<KeyMatcher> getMatchers() {
        return matchers;
    }

}
