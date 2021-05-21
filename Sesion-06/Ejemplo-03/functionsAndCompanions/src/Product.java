public class Product {
    public static int stock = 20;

    public static void removeArticle(){
        stock--;
        System.out.println("Artículo removido, restantes: " + stock);
    }

}
