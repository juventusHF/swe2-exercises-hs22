package ch.juventus.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterTest {

    private MapFilter mapFilter;

    @BeforeEach
    void init() {
        mapFilter = new MapFilter();
    }

    @Test
    void testCleanupWithIterator() {
        // Given
        Map<Integer, String> map = Map.of(
                1, "A",
                2, "B",
                3, "C",
                4, "B",
                5, "A"
        );

        // When
        Map<Integer, String> filteredMap = mapFilter.cleanup(map, "B");

        // Then
        assertEquals(2, filteredMap.size());
    }

    @Test
    void testCleanupWithRemoveIf() {
        // Given
        Map<Integer, String> map = Map.of(
                1, "A",
                2, "B",
                3, "C",
                4, "B",
                5, "A"
        );

        // When
        Map<Integer, String> filteredMap = mapFilter.cleanup2(map, "B");

        // Then
        assertEquals(2, filteredMap.size());
    }

}