public class Main {
    public static void main(String[] args) {

        CreditService service = new CreditService();

        int payment12 = (int) service.calculate(1_000_000, 12, 9.99);
        System.out.println(payment12);

        int payment24 = (int) service.calculate(1_000_000, 24, 9.99);
        System.out.println(payment24);

        int payment36 = (int) service.calculate(1_000_000, 36, 9.99);
        System.out.println(payment36);



    }
}
