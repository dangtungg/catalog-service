package com.example.catalog.util;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import java.util.Map;

/**
 * Thông tin thread
 */
public class ThreadInfo {

    public static Map<String, Object> getThreadInfo() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        Map<String, Object> threadInfo = new HashMap<>();
        threadInfo.put("thread_count", threadMXBean.getThreadCount());
        threadInfo.put("total_started_thread_count", threadMXBean.getTotalStartedThreadCount());
        threadInfo.put("daemon_thread_count", threadMXBean.getDaemonThreadCount());
        return threadInfo;
    }

}
