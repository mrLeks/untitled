package com.company;

public class Main {
    public class homeWork1 {
        // Создать пустой проект в IntelliJ IDEA и прописать метод main();
        public static void main(String[] args) {

        }

        //Создать переменные всех пройденных типов данных, и инициализировать их значения;
        static void job2() {

            byte b = 12;
            short s = 1234;
            int i = 123456;
            long l = 1234L;
            float f = 123.4f;
            double d = 12.3456;
            boolean bool = true;
            char c = 'A';
        }

        //Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода;
        public static void main(String[] args) {
            double result = job3(2,5,3,2);
            System.out.println(result);
        }

        public static double job3(double a,double b,double c,double d){
            return (a * (b + (c / d)));
        }

        //Написать метод, принимающий на вход два числа, и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false;

        public static void main(String[] args) {
            boolean getSum = job4(5,9);
            System.out.println(getSum);
        }

        public static boolean job4(int a,int b){
            int sum = a + b;
            if((sum > 9) && (sum < 21))
                return true;
            else
                return false;

        }

        //Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль положительное число передали или отрицательное
        // (Замечание: ноль считаем положительным числом.);
        public static void main(String[] args) {
            int getA = job5(0);
        }
        public static int job5(int a){
            if(a >= 0)
                System.out.println("Положительное число");
            else
                System.out.println("Отрицательное число");
            return a;
        }

        //Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true, если число отрицательное;
        public static void main(String[] args) {
            boolean getA = job6(5);
            System.out.println(getA);
        }
        public static boolean job6(int a){
            return a < 0;
        }

        //Написать метод, которому в качестве параметра передается строка,
        // обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        public static void main(String[] args) {
            String getName = sayHi("Александр");
        }
        public static String sayHi(String name){
            System.out.printf("Привет, %s", name);
            return name;
        }

        //*Написать метод, который определяет, является ли год високосным,
        // и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        public static void main(String[] args) {

            int a = getYears(2015);

        }

        public static int getYears(int years){

            if(((years % 4 == 0) && !(years % 100 == 0 )) || (years % 400 == 0)) {
                System.out.printf("Год високосный");
            } else
                System.out.printf("Год не високосный");
            return years;
        }
}






