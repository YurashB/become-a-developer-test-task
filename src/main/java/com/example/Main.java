package com.example;

public class Main {
    public static void main(String[] args) {
        String text1 = "The Tao gave birth to machine language.  Machine language gave birth " +
                "to the assembler. " +
                "The assembler gave birth to the compiler.  Now there are ten thousand " +
                "languages. " +
                "Each language has its purpose, however humble.  Each language " +
                "expresses the Yin and Yang of software.  Each language has its place within " +
                "the Tao. " +
                "But do not program in COBOL if you can avoid it. " +
                "        -- Geoffrey James, \"The Tao of Programming\"";

        String text2 = "C makes it easy for you to shoot yourself in the foot. C++ makes that harder," +
                " but when you do, it blows away your whole leg. (с) Bjarne Stroustrup";

        UniqueSymbolFinder uniqueSymbolFinder = new UniqueSymbolFinder();
        System.out.println("First unique symbol in text 1: " + uniqueSymbolFinder.getFirstUniqueSymbolInText(text1));
        System.out.println("First unique symbol in text 2: " + uniqueSymbolFinder.getFirstUniqueSymbolInText(text2));

    }
}