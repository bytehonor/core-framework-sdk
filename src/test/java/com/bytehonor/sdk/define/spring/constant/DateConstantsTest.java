package com.bytehonor.sdk.define.spring.constant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateConstantsTest {

    private static final Logger LOG = LoggerFactory.getLogger(DateConstantsTest.class);

    @Test
    public void test() {
        List<DateTimeFormatter> list = new ArrayList<DateTimeFormatter>();
        list.add(DateConstants.HHMM);
        list.add(DateConstants.HHMMSS);
        list.add(DateConstants.YYYYMMDD);
        list.add(DateConstants.YYYY_MM_DD_HH);
        list.add(DateConstants.YYYY_MM_DD_HH_MM);
        list.add(DateConstants.YYYYMMDD_HHMM);
        list.add(DateConstants.YYYYMMDD_HHMMSS);
        list.add(DateConstants.CN_YYYYMMDD);
        list.add(DateConstants.CN_YYYYMMDD_HH);
        list.add(DateConstants.CN_YYYYMMDD_HHMM);
        list.add(DateConstants.CN_YYYYMMDD_HHMMSS);
        list.add(DateConstants.CN_YYYYMMDDHH);
        list.add(DateConstants.CN_YYYYMMDDHHMM);
        list.add(DateConstants.CN_YYYYMMDDHHMMSS);
        list.add(DateConstants.CN_MMDDHH);
        list.add(DateConstants.CN_MMDDHHMM);
        list.add(DateConstants.CN_MMDDHHMMSS);
        list.add(DateConstants.CN_MDHH);
        list.add(DateConstants.CN_MDHHMM);
        list.add(DateConstants.CN_MDHHMMSS);

        LocalDateTime ldt = LocalDateTime.now();
        for (DateTimeFormatter item : list) {
            LOG.info("{}", ldt.format(item));
        }
    }

}
