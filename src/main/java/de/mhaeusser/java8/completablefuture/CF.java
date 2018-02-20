package de.mhaeusser.java8.completablefuture;

import java.util.Currency;
import java.util.concurrent.CompletableFuture;

public class CF {

    public static void main(String[] args) {
    }

    /*
    public void go() {
        findBestPrice("iPhone6")
                .thenCombine(lookupExchangeRate(Currency.getInstance("GBP")),
                        this::exchange)
                .thenAccept(localAmount -> System.out.printf("It will cost you %f GBP\n", localAmount));
    }

    private CompletableFuture<Price> findBestPrice(String productName) {
        return CompletableFuture.supplyAsync(() -> priceFinder.findBestPrice(productName));
    }

    private CompletableFuture<Double> lookupExchangeRate(Currency localCurrency) {
        return CompletableFuture.supplyAsync(() ->
            exchangeService.lookupExchangeRate(Currency.getInstance("USD"), localCurrency));
        }
    }
     */
}
