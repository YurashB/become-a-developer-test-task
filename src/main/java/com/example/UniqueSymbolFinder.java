package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueSymbolFinder {

    public String getFirstUniqueSymbolInText(String text) {
        String[] splitToWordsArray = text.split(" "); // split our text into words
        String[][] splitToSymbolsArray = Arrays.stream(splitToWordsArray)
                .map((word) -> word.split("")).toArray(String[][]::new); // split the words into symbols

        List<String> firstUniqueSymbolInWordList = new ArrayList<>(); // list of first unique symbols in words

        // find the first unique symbol in each word
        for (String[] arrayOfSymbols : splitToSymbolsArray) {
            Map<String, Long> symbolCountMap = Arrays.stream(arrayOfSymbols)
                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

            for (String symbol : arrayOfSymbols) {
                if (symbolCountMap.get(symbol) == 1) {
                    firstUniqueSymbolInWordList.add(symbol);
                    break;
                }
            }
        }


        String[] firstUniqueSymbolInArray = firstUniqueSymbolInWordList.toArray(new String[0]);
        Map<String, Long> stringCountMap = Arrays.stream(firstUniqueSymbolInArray)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting())); // Map where key is first unique symbol in word and value amount of this symbol in text

        for (String uniqueSymbol : firstUniqueSymbolInArray) {
            if (stringCountMap.get(uniqueSymbol) == 1) {
                return uniqueSymbol; // return first unique symbol
            }
        }

        return "";
    }

}
