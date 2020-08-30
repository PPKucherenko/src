public class Main {

    public static void main(String[] args){
        System.out.println("Hello, world!");

        System.out.println("Java");
        }
  public static void main(String[] args) {

//        System.out.println("Hello, \" world!");

//        long a = 700_000_000_000L;
        int a = 7;
        int countApple = 3;
        double result;
        // 1000
        result = 1.0 * a / countApple;

//        System.out.println("Результат: " + result);

        double f = 7.0;
        double r = 3.0;
        double resultFloat = f % r;
//        System.out.println(resultFloat);

        char ch = 'a';
        char ch2 = 34534;

/*        System.out.println("" + ch + ch2);

        for (int i = 0; i < 3000; i++) {
            System.out.printf("%4d : %2c\n", i, i);
        }*/

        boolean isFlag = false; //true

        String str = "Hello world!";
//        String str2 = new String("Hello!");

//        System.out.println(a + countApple + "Result" + (f + ch));

        int sum = 0;
        sum += countApple;
//        sum = sum + countApple;

        a += 1;
        a++;
        ++a;


        a = 0;
/*
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
*/

        int valA = 4;
        int valB = 5;

/*        comparison(valA, valB);
        comparison(54, 23);
        comparison(a, countApple);*/

        f = calcMoneyWithoutTax(100000);
        System.out.println(calcMoneyWithoutTax(25000));


    }

    public static void comparison(int a, int b) {

        if (a == b) {
            System.out.println("Числа равны!");
        } else if (a > b) {
            System.out.println("Первое число " + a + " больше");
        } else {
            System.out.println("Второе число " + b + " больше");
        }
    }

    public static double calcMoneyWithoutTax(int a) {
        return a * 0.87;

    }

    public static boolean isComparison(int a, int b) {
/*        if (a == b) {
            return true;
        }
        else {
            return false;
        }*/
        return a == b;

    }

    public static int comparisonAndReturn(int a, int b) {
        if (a > b) {
            a++;
            return a;
        }

        b--;
        return b;

    }

    public static boolean ex1() {
        //решение
        return true;
    }

    }

