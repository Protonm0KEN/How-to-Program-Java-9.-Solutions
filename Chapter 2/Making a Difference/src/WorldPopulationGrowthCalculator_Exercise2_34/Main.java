package WorldPopulationGrowthCalculator_Exercise2_34;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    static void main(String[] args) {
        double growthRate = 0.085; //8.5% at moment of 2025
        BigDecimal rateFactor = BigDecimal.valueOf(1.0 + growthRate);
        BigDecimal currentPopulation = new BigDecimal("8260287277"); //at data of 2025

        System.out.printf("Population in 1 year:%d \n", currentPopulation.multiply(rateFactor).toBigInteger());
        currentPopulation = currentPopulation.multiply(rateFactor);
        System.out.printf("Population in 2 years:%d \n", currentPopulation.multiply(rateFactor).toBigInteger());
        currentPopulation = currentPopulation.multiply(rateFactor);
        System.out.printf("Population in 3 year:%d \n", currentPopulation.multiply(rateFactor).toBigInteger());
        currentPopulation = currentPopulation.multiply(rateFactor);
        System.out.printf("Population in 4 year:%d \n", currentPopulation.multiply(rateFactor).toBigInteger());
        currentPopulation = currentPopulation.multiply(rateFactor);
        System.out.printf("Population in 5 years:%d \n", currentPopulation.multiply(rateFactor).toBigInteger());
    }
}
