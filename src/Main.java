import java.util.*;

public class Main {
    public static void main(String[] args) {
        Article article1 = new Article("Insalata", 0.99);
        Article article2 = new Article("Fanta", 1.29);
        Article article3 = new Article("Gelati", 4.39);

        Map<String, Article> mapArticle = new HashMap<>();
        mapArticle.put("Verdura", article1);
        mapArticle.put("Bevande", article2);
        mapArticle.put("Surgelati", article3);

        List<Article> listArticle = new ArrayList<>(mapArticle.values());
        Collections.sort(listArticle, new Comparator<Article>() {

            @Override
            public int compare(Article o1, Article o2) {
                return Double.compare(o1.prezzo, o2.prezzo);
            }
        });

        System.out.println("lista in ordine di prezzo: " + listArticle);

    }
}