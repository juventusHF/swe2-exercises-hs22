package ch.juventus.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapFilter {

    public <K, V> Map<K, V> cleanup1(Map<K, V> input, V value) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<K, V> output = new HashMap<>();
        for (Map.Entry<K, V> entry : input.entrySet()) {
            if (entry.getValue().equals(value)) {
                output.put(entry.getKey(), entry.getValue());
            }
        }
        return output;
    }

    public <K, V> Map<K, V> cleanup2(Map<K, V> input, V value) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<K, V> output = new HashMap<>(input);
        Iterator<Map.Entry<K, V>> iterator = output.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (entry.getValue() != value) {
                iterator.remove();
            }
        }

        return output;
    }

    public <K, V> Map<K, V> cleanup3(Map<K, V> input, V value) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<K, V> output = new HashMap<>(input);
        output.entrySet().removeIf(entry -> entry.getValue() != value);
        return output;
    }

}
