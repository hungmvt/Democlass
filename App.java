

public class App {
    public static void main(String[] args) {
        Hero Thor = new Hero("Chien Binh Thor", 100, 20);
        Hero Thanos = new Hero("Quai Vat Thanos", 100, 15);

        System.out.println(Thor.showInfo());
        System.out.println(Thanos.showInfo());
        Thor.attack(Thanos);
        System.out.println(Thanos.showInfo());
    }
}