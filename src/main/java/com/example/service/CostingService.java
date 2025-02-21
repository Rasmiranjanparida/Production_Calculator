package com.example.service;

import com.example.model.CostingRequest;
import org.springframework.stereotype.Service;

@Service
public class CostingService {

    public double[] calculateCost(CostingRequest request) {
        double c11 = request.getRmCost();
        double c12 = request.getCycleTime();
        double c13 = request.getExtraMultiply();
        double c14 = request.getCoating();
        double c15 = request.getSizeAdjustment();
        double c16 = request.getMf();

        double c17 = c12 * 25;   // CNC Cost
        double c18 = 0;          // Setup Fee
        double c19 = 0;          // EXTRA Plus
        double c20 = (c11 + c16 + c17 + c18 + c19) * c13 + c14; // TOTAL COST
        double c21 = c20 / 0.65; // Add 35% Margin
        double c22 = c21 * 1.3;  // Add +30% extra
        double c23 = c22 * c15;  // After Size Adjustment
        double c24 = c23 * 1.25; // FINAL PRICE

        return new double[]{c17, c20, c21, c22, c23, c24};
    }
}
