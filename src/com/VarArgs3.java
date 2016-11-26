package com;

/*Методы, принимающие переменное количество аргументов, можно перегружать.Например, в следующей программе представлены три перегруженные версии метода
vaTest ().*/

// Перегрузка метода с переменным числом аргументов

public class VarArgs3 {
    static void vaTest(int... v) {   //Первая версия метода vaTest ()
        System.out.println("vaTest(int ... ): " + "Количество аргументов: " + v.length);
        System.out.println("Coдepжимoe: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg  " + i + " - " + v[i]);
        System.out.println();
    }

    static void vaTest(boolean... v) {   //Вторая версия метода vaTest ()
        System.out.println("vaTest(int ... ): " + "Количество аргументов: " + v.length);
        System.out.println("Coдepжимoe: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg  " + i + " - " + v[i]);
        System.out.println();
    }

    static void vaTest(String msg, int... v) {                //Третья версия метода vaTest()
        System.out.println("vaTest(String, int ... ): " + msg + v.length);
        System.out.println("Coдepжимoe: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + "· " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Тестирование: ", 10, 20);
        vaTest(true, false, false);
    }
}
/*В этой программе продемонстрированы два способа перегрузки методов с переменным числом аргументов. Во-первых, перегруженные версии методов могут различаться
типом параметра, содержащего переменное количество аргументов. По этому принципу перегружены версии метода vaTest ( int ... ) и vaTest (boolean ... ) . Вспомните,
что многоточие говорит о том, что соответствующий аргумент должен рассматриваться как массив указанного типа. Поэтому, в полной аналогии с тем, как обычные
 методы можно перегружать за счет использования различных типов параметра, соответствующего массиву,методы с переменным числом аргументов можно перегружать,
  используя различные типы параметра varargs. На основании этого различия и будет определяться версия,подлежащая вызову.
  Второй способ перегрузки методов с переменным числом аргументов состоит в добавлении одного или нескольких обычных аргументов. Он реализован в версии метода
vaTest (String, int ... ) . В этом случае исполняющая система Java использует для выбора нужной версии метода как число параметров, так и их типы.*/