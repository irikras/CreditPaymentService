public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 36, 9.99);
//        loanTerm - срок кредитования в месяцах
        System.out.println(payment);
    }
}