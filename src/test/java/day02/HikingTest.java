package day02;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HikingTest {
    public static final List<GpsCoordinate> COORDINATES =
            List.of(new GpsCoordinate(33, 10, 10), new GpsCoordinate(45, 66, 20),
                    new GpsCoordinate(91,58, 15), new GpsCoordinate(88, 40, 18));

    @Test
    void testGetElevation() {
        Hiking hiking = new Hiking(COORDINATES);
        assertEquals(13, hiking.getPlusElevation(hiking.getCoordinates()));
    }

    @Test
    void testGetElevationEmptyList() {
        Hiking hiking = new Hiking(null);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> hiking.getPlusElevation(null));
        assertEquals("Input list is empty.", iae.getMessage());
    }
}