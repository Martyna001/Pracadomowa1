package com.company;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    List<Position> positions = new ArrayList<>();
    int numberOfData;


    public void addPosition(Position p) {
        this.positions.add(p);

    }

    public double CalculateValue() {
        double value = 0.0;

        for (int i = 0; i < positions.size(); i++) {
            Position position = positions.get(i);
            value += position.CalculateValue();
        }
        return value;


    }

    @Override
    public String toString() {
        return "Orders{" +
                 positions
                 + "Suma :" + CalculateValue() +"zł "+
                '}';
    }
}
