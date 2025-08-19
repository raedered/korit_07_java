package org.example;

import java.util.*;

public class MapList {
    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        Map<String, Object> custom1 = new HashMap<>();
        custom1.put("name", "홍길동");
        custom1.put("rating", "vip");
        custom1.put("age", 30);
        customers.add(custom1);
        Map<String, Object> custom2 = new HashMap<>();
        custom2.put("name", "김기영");
        custom2.put("rating", "gold");
        custom2.put("age", 35);
        customers.add(custom2);

        for (Map<String, Object> customer : customers) {
            for (Map.Entry<String, Object> entry : customer.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key + "=" + value);
            }
        }

    }
}
