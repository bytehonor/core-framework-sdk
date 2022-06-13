package com.bytehonor.sdk.define.bytehonor.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class WhileTask extends SafeTask {

    private static final Logger LOG = LoggerFactory.getLogger(WhileTask.class);

    public abstract long millis();

    public abstract void runInWhile();

    @Override
    public final void runInSafe() {
        while (true) {
            try {
                runInWhile();
            } catch (Exception e) {
                LOG.error("runInWhile", e);
            }
            sleep(millis());
        }
    }

    private void sleep(long millis) {
        if (millis < 1L) {
            return;
        }
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            LOG.error("sleep", e);
        }
    }
}
