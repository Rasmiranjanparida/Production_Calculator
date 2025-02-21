package com.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CostingRequest {
    private double rmCost;        // C11 (User Input)
    private double cycleTime;     // C12 (User Input)
    private double extraMultiply; // C13 (User Input)
    private double coating;       // C14 (User Input)
    private double sizeAdjustment;// C15 (User Input)
    private double mf;            // C16 (User Input)
}
