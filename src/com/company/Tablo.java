package com.company;

public class Tablo {

    public static Double getAvgPrice(ITransport transport) {
        Double[] prices = transport.getArrayModelsPrice();

        if (prices.length != 0) {
            int count = 0;
            Double sum = 0.0d;
            for (int i = 0; i < prices.length; i++) {
                sum += prices[i];
                count++;
            }
            return sum / count;
        } else {
            return 0.0d;
        }
    }

    public static void showModels(ITransport transport) {
        System.out.println("models for " + transport.getMark());
        String[] modelsNames = transport.getArrayModelsNames();

        for (int i = 0; i < modelsNames.length; i++) {
            System.out.println("  " + modelsNames[i]);
        }
    }

    public static void showPrices(ITransport transport) {
        System.out.println("prices for " + transport.getMark());
        Double[] prices = transport.getArrayModelsPrice();

        for (int i = 0; i < prices.length; i++) {
            System.out.println("  " + prices[i]);
        }
    }

    public static void showModelsAndPrices(ITransport transport) {
        System.out.println("prices for " + transport.getMark());
        String[] modelsNames = transport.getArrayModelsNames();
        Double[] prices = transport.getArrayModelsPrice();

        for (int i = 0; i < modelsNames.length; i++) {
            System.out.println("  " + modelsNames[i] + " = " + prices[i]);
        }
    }
}
