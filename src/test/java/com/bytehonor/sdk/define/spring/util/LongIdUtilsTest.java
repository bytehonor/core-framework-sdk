package com.bytehonor.sdk.define.spring.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongIdUtilsTest {

    private static final Logger LOG = LoggerFactory.getLogger(LongIdUtilsTest.class);

    @Test
    public void test() {
        long val = 1234567L;
        int size = 100000;
        int success = 0;
        for (int i = 0; i < size; i++) {
            String src = LongIdUtils.encode(val);
            LOG.info("val:{}, src:{}", val, src);
            long n = LongIdUtils.decode(src);
            if (n == val) {
                success++;
            }
            val = val + i * i;
        }
        assertTrue("*testDecode*", size == success);
    }

}
