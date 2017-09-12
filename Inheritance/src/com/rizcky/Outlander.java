package com.rizcky;

/**
 * Created by rizcky on 7/5/17.
 */
public class Outlander extends Car {

    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
}
