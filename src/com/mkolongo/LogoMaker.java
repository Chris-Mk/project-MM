package com.mkolongo;

public abstract class LogoMaker {

    private final int size;

    protected LogoMaker(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String repeatStr(String symbol, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(symbol);
        }

        return builder.toString();
    }

    protected abstract String print();
}
