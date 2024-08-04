package com.example.catalog.util;

import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Thông tin Garbage Collector (GC)
 */
public class GarbageCollectorInfo {

    public static List<GarbageCollectorDTO> getGarbageCollectors() {
        return ManagementFactory.getGarbageCollectorMXBeans().stream()
                .map(gc -> {
                    GarbageCollectorDTO dto = new GarbageCollectorDTO();
                    dto.setName(gc.getName());
                    dto.setCollectionCount(gc.getCollectionCount());
                    dto.setCollectionTime(gc.getCollectionTime());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    public static class GarbageCollectorDTO {
        private String name;
        private long collectionCount;
        private long collectionTime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCollectionCount() {
            return collectionCount;
        }

        public void setCollectionCount(long collectionCount) {
            this.collectionCount = collectionCount;
        }

        public long getCollectionTime() {
            return collectionTime;
        }

        public void setCollectionTime(long collectionTime) {
            this.collectionTime = collectionTime;
        }
    }

}
