public class Article {
    public String name;
    public double prezzo;
    public Article (String name, double prezzo) {
        this.name = name;
        this.prezzo = prezzo;
    }

    public String getName() {
        return name;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
