public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.11; //рост
        int weight = 60; //вес
        double bmi = service.calculate(height, weight);

        System.out.printf("Ваш индекс массы тела %.2f.", bmi); //выводим результат
    }
}
