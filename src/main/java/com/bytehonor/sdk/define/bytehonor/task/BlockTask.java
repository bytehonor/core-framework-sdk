package com.bytehonor.sdk.define.bytehonor.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BlockTask extends SafeTask {

    private static final Logger LOG = LoggerFactory.getLogger(BlockTask.class);

    public abstract void runInQueue() throws InterruptedException;

    @Override
    public final void runInSafe() {
        while (true) {
            try {
                runInQueue();
            } catch (Exception e) {
                LOG.error("runInQueue", e);
            }
        }
    }
}
