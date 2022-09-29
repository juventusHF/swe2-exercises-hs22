package ch.juventus.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapFilter {

    public <K, V> Map<K, V> cleanup(Map<K, V> input, V value) {
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

    public <K, V> Map<K, V> cleanup2(Map<K, V> input, V value) {
        Map<K, V> output = new HashMap<>(input);
        output.entrySet().removeIf(entry -> entry.getValue() != value);
        return output;
    }

}
