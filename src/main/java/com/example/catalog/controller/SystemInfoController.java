package com.example.catalog.controller;

import com.example.catalog.util.GarbageCollectorInfo;
import com.example.catalog.util.MemoryInfo;
import com.example.catalog.util.OperatingSystemInfo;
import com.example.catalog.util.ThreadInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.MemoryUsage;
import java.util.List;
import java.util.Map;

@RestController
public class SystemInfoController {

    @GetMapping("/api/os-info")
    public Map<String, Object> getOsInfo() {
        return OperatingSystemInfo.getOsInfo();
    }

    @GetMapping("/api/thread-info")
    public Map<String, Object> getThreadInfo() {
        return ThreadInfo.getThreadInfo();
    }

    @GetMapping("/api/heap-memory")
    public MemoryUsage getHeapMemoryUsage() {
        return MemoryInfo.getHeapMemoryUsage();
    }

    @GetMapping("/api/non-heap-memory")
    public MemoryUsage getNonHeapMemoryUsage() {
        return MemoryInfo.getNonHeapMemoryUsage();
    }

    @GetMapping("/api/garbage-collectors")
    public List<GarbageCollectorInfo.GarbageCollectorDTO> getGarbageCollectors() {
        return GarbageCollectorInfo.getGarbageCollectors();
    }

}
