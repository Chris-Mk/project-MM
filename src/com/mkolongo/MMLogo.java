package com.mkolongo;

public class MMLogo extends LogoMaker {
    private static final int REPEAT_COUNT = 2;
    private static final String SPACES = "-";
    private static final String SYMBOL = "*";

    public MMLogo(int size) {
        super(size);
    }

    @Override
    public String print() {
        int size = getSize();

        // first row
        String firstRow = repeatStr(SPACES, size) +
                          repeatStr(SYMBOL, size) +
                          repeatStr(SPACES, size) +
                          repeatStr(SYMBOL, size) +
                          repeatStr(SPACES, size);

        StringBuilder builder = new StringBuilder();

        builder.append(repeatStr(firstRow, REPEAT_COUNT))
                .append(System.lineSeparator());

        //middle rows
        int middle = (size - 1) / 2;
        int prev = size * 2 - 1, odd = 1;

        for (int i = 1; i <= size - 1; i++) {
            String row;

            if (i <= middle) {
                row = repeatStr(SPACES, size - i) +
                      repeatStr(SYMBOL, size + i + i) +
                      repeatStr(SPACES, size - i - i) +
                      repeatStr(SYMBOL, size + i + i) +
                      repeatStr(SPACES, size - i);
            } else {
                row = repeatStr(SPACES, size - i) +
                      repeatStr(SYMBOL, size) +
                      repeatStr(SPACES, odd) +
                      repeatStr(SYMBOL, prev) +
                      repeatStr(SPACES, odd) +
                      repeatStr(SYMBOL, size) +
                      repeatStr(SPACES, size - i);

                prev -= 2;
                odd += 2;
            }

            builder.append(repeatStr(row, REPEAT_COUNT))
                    .append(System.lineSeparator());
        }

        //last row
        String lastRow = repeatStr(SYMBOL, size) +
                         repeatStr(SPACES, size) +
                         repeatStr(SYMBOL, size) +
                         repeatStr(SPACES, size) +
                         repeatStr(SYMBOL, size);

        builder.append(repeatStr(lastRow, REPEAT_COUNT));

        return builder.toString();
    }
}
