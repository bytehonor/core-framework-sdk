package com.bytehonor.sdk.define.spring.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JoinUtilsTest {

    private static final Logger LOG = LoggerFactory.getLogger(JoinUtilsTest.class);

    @Test
    public void testJoinSafe() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            list.add("a" + i);
        }
        LOG.info("testJoinSafe:{}", JoinUtils.joinSafe(list));
    }

    @Test
    public void testJoin() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            list.add("a" + i);
        }
        LOG.info("testJoin:{}", JoinUtils.join(list));
    }

    @Test
    public void testJoinSafe2() {
        Set<String> list = new HashSet<String>();
        for (int i = 0; i < 15; i++) {
            list.add("a" + i);
        }
        LOG.info("testJoinSafe2:{}", JoinUtils.joinSafe(list));
    }

    @Test
    public void testJoin2() {
        Set<String> list = new HashSet<String>();
        for (int i = 0; i < 15; i++) {
            list.add("a" + i);
        }
        LOG.info("testJoin2:{}", JoinUtils.join(list));
    }

    @Test
    public void testLongs() {
        Set<Long> list = new HashSet<Long>();
        for (long i = 0; i < 15; i++) {
            list.add(i);
        }
        LOG.info("testLongs:{}", JoinUtils.longs(list));
    }

    @Test
    public void testIntegers() {
        Set<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        LOG.info("testIntegers:{}", JoinUtils.integers(list));
    }
}
