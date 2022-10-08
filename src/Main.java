public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        taskOnePartTwo();

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


}