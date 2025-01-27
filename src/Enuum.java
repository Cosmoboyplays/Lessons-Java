public enum Enuum {
    P("65"), Z("345"), D("000"), C("101010");

    String num;

    Enuum(String s) {
        this.num = s;
    }

    public String getNum() {
        return this.num + " я из геттера";
    }
}
