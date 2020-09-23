public class Homework1 {

//ВАЖНО!
//модификаторы методов оставьте public - так нужно мне для тестов

    //посчитать факториал числа n
//0.5б - если посчитаете в цикле
//1б - если посчитаете рекурсией
    public static int fact(int n){
        int res=1;
        if(n==1 || n==0){
            return res;
        }
        else{
            res=n*fact(n-1);
            return res;
        }
    }

    //вывести таблицу умножения на экран - 1б
//подсказка - использовать двойной for
    public static void table(){
//Ваше решение здесь
        for(int i=1; i<11;i++){
            for(int j=0; j<11;j++){
                System.out.print(j * i + " ");
            }
            System.out.println("");
        }
    }

    //посчитать сумму цифр числа
//можно посчитать для трехзначного - 0.5б
//для любого числа - 1б
//подсказка - в случае для любого числа используйте while
    public static int sum(int n){
//Ваше решение здесь
        int summ=0;
        while(n!=0){
            summ +=(n%10);
            n/=10;
        }
        return summ;
    }

    //определить, является ли год високосным
//В високосном году - 366 дней, тогда как в обычном - 365.
//Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
//Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
//Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
//Годы 2100, 2200 и 2300 - не високосные.
//за правильный ответ - 0.5б
    public static int isLeapYear(int year) {
//Ваше решение здесь
        int k=0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            k=1;
        }
        else{
            k=2;
        }
        return k;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
//и вывести, сколько дней в году
//правильный ответ - 0.5б
    public static int daysInYear(int year) {
        int m=0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            m=366;
        }
        else {
            m=365;
        }
        return m;
    }

    //определить номер дня недели по строке
//например: Понедельник - 1
//правильный ответ - 1б
    public static int dayOfTheWeek(String n) {
        int s = 0;
        if (n == "Понедельник") {
            s = 1;
        }
        else if(n == "Вторник")
        {
            s = 2;
        }
        else if(n == "Среда")
        {
            s = 3;
        }
        else if(n == "Четверг")
        {
            s = 4;
        }
        else if(n == "Пятница")
        {
            s = 5;
        }
        else if(n == "Суббота")
        {
            s = 6;
        }
        else if(n == "Воскресенье")
        {
            s = 7;
        }
        return s;
    }
    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
//правильное решение - 0.5б
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //вывести двойной массив на экран в виде:
// [1, 5, 3, 7, 10, 2, 5]
// [1, 5, 3, 7, 10, 2, 5]
// ...
//правильное решение - 0.5б
    public static void printArray(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //отсортировать одномерный массив в порядке возрастания
//если не знаете, как сортировать, то подсказка -
//метод пузырька (один из самых простых для понимания)
//правильный ответ - 1б
    public static int[] sort(int[] array)
    {
        boolean isSorted = false;
        int h;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    h = array[i];
                    array[i] = array[i + 1];
                    array[i+1]=h;
                }
            }
        }
        return array;
    }
    //здесь можете тестировать свои решения
    public static void main(String[] array){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));
        System.out.println();

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}
