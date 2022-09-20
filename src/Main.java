public class Main {
    public static void main(String[] args) {
        ageTemperature(21,34);
        ageTemperature(24,42);
        ageTemperature(52,36);
        ageTemperature(42,23);
        ageTemperature(51,26);
        

    }

    public static String ageTemperature(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > 20 && temperature < 30) {
            System.out.println("Можно идти гулять");

        } else if (age < 20 && temperature > 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= 10 && temperature > 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Остовайтесь дома");
        }
        return "возраст человека" + age + "темпиратура" + temperature;

    }
}