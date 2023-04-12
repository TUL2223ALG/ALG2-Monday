package week07_elevengame.app;

public class Card {
    private String value;
    private String symbol;
    private int nPoints;

    public Card(String value, String symbol, int nPoints) {
        this.value = value;
        this.symbol = symbol;
        this.nPoints = nPoints;
    }

    public String getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getnPoints() {
        return nPoints;
    }

    
    
}
