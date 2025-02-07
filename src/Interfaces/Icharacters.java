package Interfaces;

public interface Icharacters {
    String str = "установили в интерфесе";

    public default String getStr() {
        return str;
    }
}
