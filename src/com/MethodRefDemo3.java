package com;

/**
 * Иногда могут возникать ситуации, требующие указания метода экземпляра, который
 может использоваться с любым объектом данного класса, а не только с каким-то конкретным
 объектом. В этом случае ссьmка на метод создается с использованием следующего
 синтаксиса:
 имя класса::имя_метода_экземпляра
 где вместо имени конкретного объекта указывается имя класса, даже если применяется
 метод экземпляра. В этой форме первый параметр функционального интерфейса соответствует
 типу вызывающего объекта, а второй - параметру (если таковой имеется), заданному
 методом. Ниже приведен соответствующий пример, представляющий переработанный
 вариант предыдущего примера. Во-первых, интерфейс IntPredicate заменен
 интерфейсом MyintNumPredicate. В этом случае первый параметр метода test () имеет
 тип MyintNum. Он будет использоваться для получения объекта, подлежащего обработке.
 Это позволяет программе создать ссылку на экземплярный метод isFactor (), который  может использоваться с любым объектом MyintNum.

 // Использование ссылки на метод экземпляра для обращения  к любому интерфейсу.

 // Функциональный интерфейс для числовых предикатов, которые воздействуют на объект типа MyintNum и целочисленное значение
 */

interface MyIntNumPredicate{
    boolean test(MyIntNum3 mv, int n);
}
// Данный класс хранит значение типа int и определяет метод isFactor(), который возвращает true, если его аргумент
// является делителем числа, хранящегося в классе
class MyIntNum3 {
    private int v;
    MyIntNum3(int х) { v = х;}
    int getNum() { return v;}

    // Вернуть true, если n-делитель v
    boolean isFactor (int n){
    return (v%n)==0;
    }
}

public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum3 myNum=new MyIntNum3(12);
        MyIntNum3 myNum2=new MyIntNum3(16);

        //Создать ссылку inp на экземплярный метод isFactor()
        MyIntNumPredicate inp= MyIntNum3::isFactor;//Ссылка на метод любого объекта типа MyIntNum

        //Вызвать метод isFactor() для объекта myNum
        result =inp.test(myNum,3);
        if (result)
            System.out.println("3 является делителем " + myNum.getNum());

        //Вызвать метод isFactor() для объекта myNum2
        result =inp.test(myNum2,3);
        if (!result)
            System.out.println("3 не является делителем " + myNum2.getNum());

    }
}

