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
    void testCleanupSolution1() {
        // Given
        Map<Integer, Double> map = Map.of(
                1, 1.5,
                2, 2.9,
                3, 8.3,
                4, 4.6,
                5, 2.9
        );

        // When
        Map<Integer, Double> filteredMap = mapFilter.cleanup1(map, 2.9);

        // Then
        assertEquals(2, filteredMap.size());
    }

    @Test
    void testCleanupSolution2() {
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

    @Test
    void testCleanupSolution3() {
        // Given
        Map<String, Integer> map = Map.of(
                "A", 10,
                "B", 20,
                "C", 30,
                "D", 20,
                "E", 10
        );

        // When
        Map<String, Integer> filteredMap = mapFilter.cleanup3(map, 20);

        // Then
        assertEquals(2, filteredMap.size());
    }

}