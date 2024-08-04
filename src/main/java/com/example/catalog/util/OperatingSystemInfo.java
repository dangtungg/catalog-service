package com.example.catalog.util;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.HashMap;
import java.util.Map;

/**
 * Thông tin về Hệ điều hành
 */
public class OperatingSystemInfo {

    public static Map<String, Object> getOsInfo() {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        Map<String, Object> osInfo = new HashMap<>();
        osInfo.put("os_name", osBean.getName());
        osInfo.put("os_arch", osBean.getArch());
        osInfo.put("system_load_average", osBean.getSystemLoadAverage());
        osInfo.put("available_processors", osBean.getAvailableProcessors());
        return osInfo;
    }

}

