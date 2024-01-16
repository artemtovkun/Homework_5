public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! It's my HW_5 ");
        //Задача 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        int clientOS1 = 1;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Задача 3
        int year = 1852 ;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Год " + year+ " - является високосным");
        }
        else if (year > 1584 && ((year % 4 != 0 && year % 100 == 0) || year % 400 != 0)) {
            System.out.println("Год " + year+ " - НЕ является високосным");
        }
        else if  (year < 1584) {
            System.out.println("Год " + year+ " - НЕ является високосным т.к. високосный год ввели в 1584 году!");
        }
        //Задача 4
        int deliveryDistance = 0;
        if (deliveryDistance >= 0 && deliveryDistance <= 20){
            System.out.println("Ваше расстояние составляет " +deliveryDistance+ " км. Доставка в пределах 20 км займет сутки");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Ваше расстояние составляет " +deliveryDistance+ " км. Доставка в пределах 60 км займет 2 суток");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Ваше расстояние составляет " +deliveryDistance+ " км. Доставка в пределах 100 км займет 3 суток");
        }
        else if  (deliveryDistance > 100 || deliveryDistance < 0) {
            System.out.println("Ваше расстояние составляет " +deliveryDistance+ " км. Доставка на такое расстояние не осуществляется (свыше 100 км) или Вы ввели отрицательное число");
        }
        //Задача 5
        int monthNumber = 0;
        switch (monthNumber) {
            case 1:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это январь. Зима.");
                break;
            case 2:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это февраль. Зима.");
                break;
            case 3:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это март. Весна.");
                break;
            case 4:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это апрель. Весна.");
                break;
            case 5:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это май. Весна.");
                break;
            case 6:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это июнь. Лето.");
                break;
            case 7:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это июль. Лето.");
                break;
            case 8:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это август. Лето.");
                break;
            case 9:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это сентябрь. Осень.");
                break;
            case 10:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это октябрь. Осень.");
                break;
            case 11:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это ноябрь. Осень.");
                break;
            case 12:
                System.out.println("Вы указали месяц № " +monthNumber+ ". Это декабрь. Зима.");
                break;
            default:
                System.out.println("В году всего 12 месяцев, а Вы пытаетесь прописать месяц № " +monthNumber+ ". Так не бывает!");
        }
    }
}