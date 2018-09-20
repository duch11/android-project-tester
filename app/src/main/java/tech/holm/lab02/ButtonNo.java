package tech.holm.lab02;

public enum ButtonNo {
    BTN0("0"),BTN1("1"),BTN2("2"),BTN3("3"),BTN4("4"),BTN5("5"),BTN6("6"),BTN7("7"),BTN8("8"),BTN9("9");

    private final String symbol;

    //Parameter er hvad der er i ("0") i fx BTN0
    ButtonNo(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public String toString() {
        return symbol;
    }
    /*,BTN1,BTN2,BTN3,
    BTN4,BTN5,BTN6,BTN7,
    BTN8,BTN9,
    BTN_PLUS,BTN_MINUS,
    BTN_FACTOR,BTN_DIVIDE,
    BTN_RESULT,BTN_COMMA*/
}
