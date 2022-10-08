public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //taskOnePartTwo();
        //taskTwoPartTwo();
        //taskThreePartTwo();
        //taskOnePartThree();
        taskTwoPartThree();
    }
    public static void task1(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    public static void task2(){
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }
    public static void task3(){
        for (int i = 0; i < 17; i++){
            if (i % 2 == 0 && i != 0){
                System.out.println(i);
            }
        }
    }
    public static void task4(){
        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }
    }
    public static void taskOnePartTwo(){
        for (int i = 1904; i <= 2096; i++){
            if (i % 4 == 0){
                System.out.println(i + " год является високосным");
            }
        }
    }
    public static void taskTwoPartTwo(){
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }
    }
    public static void taskThreePartTwo(){
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }
    }
    public static void taskOnePartThree(){
        int money = 29000;
        int result = 0;
        for (int i = 1; i <= 12; i++) {
            result += money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + result + "рублей");
        }
    }
    public static void taskTwoPartThree(){
        int money = 29000;
        int result = 0;
        int pais = 0;
        for (int i = 1; i <= 12; i++) {
             pais = result / 100;
             result = result + pais + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
        }
    }
}