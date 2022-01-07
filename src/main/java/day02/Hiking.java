package day02;

import java.util.ArrayList;
import java.util.List;

public class Hiking {
    public List<GpsCoordinate> coordinates = new ArrayList<>();

    public Hiking(List<GpsCoordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public List<GpsCoordinate> getCoordinates() {
        return new ArrayList<>(coordinates);
    }

    public double getPlusElevation(List<GpsCoordinate> input) {
        checkEmptyList(input);
        double totalElevation = 0;
        for (int i = 0; i < input.size() - 1; i++) {
            double elevation = input.get(i + 1).getElevation() - input.get(i).getElevation();
            if (elevation > 0) {
                totalElevation += elevation;
            }
        }
        return totalElevation;
    }

    private void checkEmptyList(List<GpsCoordinate> input) {
        if (input == null) {
            throw new IllegalArgumentException("Input list is empty.");
        }
    }
}
