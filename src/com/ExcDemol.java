package com;

/*Рассмотрим простой пример, демонстрирующий перехват и обработку исключения. Как известно, попытка обратиться за границы массива приводит к ошибке, и виртуальная машина Java генерирует соответствующее исключение ArraylndexOutOf BoundsException. Ниже приведен код программы, в которой намеренно создаются условия для появления данного исключения, которое затем перехватывается.*/

// Демонстрация обработки исключений,
class ExcDemol {
    public static void main (String args[]) {
        int nums[] = new int[4];

        // Создание блока try.
        try {
            System.out.println("Before exception is generated.");

            // Попытка обратиться за границы массива.
            nums[7] = 10;//Попытка исnользовать индекс, выходящий за границы массива
            System.out.println("This won't be displayed");
        }
        // Перехват исключения в связи с обращением за границы массива.
        catch (ArrayIndexOutOfBoundsException exc) { //Перехват исключений, обусловленный выходом за границы массива
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
/*Несмотря на всю простоту данного примера программы, он наглядно демонстрирует несколько важных особенностей обработки исключений. Во-первых, код, подлежащий проверке на наличие ошибок, помещается в блок try. И во-вторых, когда возникает исключение (в данном случае это происходит при попытке обратиться за границы массива), выполнение блока try прерывается и управление получает блок catch. Следовательно, явного обращения к блоку catch не происходит, но переход к нему осуществляется лишь при определенном условии, возникающем в ходе выполнения программы. Так, оператор вызова метода println(), следующий за выражением, в котором происходит обращение к несуществующему элементу массива, вообще не выполняется. По завершении блока catch выполнение программы продолжается с оператора, следующего за этим блоком. Таким образом, обработчик исключений предназначен для устранения программных ошибок, приводящих к исключительным ситуациям, а также для обеспечения нормального продолжения исполняемой программы.

Как упоминалось выше, если в блоке try не возникнут исключения, операторы в блоке catch не получат управление и выполнение программы продолжится после блока catch. Для того чтобы убедиться в этом, измените в предыдущей программе строку кода

nums[7] = 10;
на следующую строку кода:

nums[0] = 10;
Теперь исключение не возникнет и блок catch не выполнится.*/