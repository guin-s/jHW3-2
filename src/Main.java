public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height= 1.90f;
        float mass=101f;
        float index = service.calculate(height, mass);
    String fBMI = String.format("%.2f",index);
    System.out.println("Индекс массы тела составляет:");
    System.out.println(fBMI);

    }


}
