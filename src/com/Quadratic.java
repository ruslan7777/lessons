package com;

/**
 * Created by RUSLAN77 on  03.02.2017 in Ukraine
 * Начиная с версии JDK 5 в Java была расширена область применения ключевого слова import, а именно: реализован механизм статического импорта. Указав после import ключевое слово static, можно сформировать выражение для импорта статических членов класса или интерфейса. Используя статический импорт, можно также ссылаться на статические члены непосредственно по именам, не указывая перед ними имена классов. Благодаря этому упрощается синтаксис и сокращается запись выражений, в которых применяются статические члены классов.

 Для того чтобы оценить по достоинству возможности статического импорта, начнем его рассмотрение с примера, в котором это языковое средство не используется. Ниже проведен пример программы для решения следующего квадратного уравнения:

 ах2 + bх + c = О
 В этой программе применяются два статических метода — Math.pow() и Math, sqrt() — из класса Math, который, в свою очередь, входит в пакет j ava. lang. Первый из них возвращает значение, возведенное в заданную степень, а второй — квадратный корень значения своего параметра.
 */
// Решение квадратного уравнения,
//class Quadratic {
//    public static void main(String args[]) {
//
//        // Переменные a, b и с обозначают коэффициенты
//        // квадратного уравнения ах2 + bх + с = О
//        double a, b, c, x;
//
//        // решить квадратное уравнение 4x2 + х - 3 = О
//        a = 4;
//        b = 1;
//        c = -3 ;
//
//        // найти первое решение
//        x = (-b + Math.sqrt(Math.pow(b, 2) -    4   *   a * c)) / (2    *   a) ;
//        System.out.println("First solution: " + x);
//
//        // найти второе решение
//        x = (-b - Math.sqrt(Math.pow(b, 2) -    4   *   a *c)) / (2    *   a) ;
//        System.out.println("Second solution:    "   +   x);
//    }
//}
/*Методы pow() и sqrt() являются статическими, а следовательно, их нужно вызывать, ссылаясь на имя класса Math. Их вызов осуществляется в приведенном ниже выражении, хотя и нельзя не признать, что оно получается довольно громоздким.

х = (-b + Math.sqrt(Math.pow(b, 2) - 4 *    a   *   с)) / (2 * a)   ;
В таких выражениях приходится постоянно следить за тем, чтобы перед методами pow() и sqrt() (и другими подобными методами, например sin(), cos() и tan()) было указано имя класса, что неудобно и чревато ошибками.

Утомительной обязанности указывать всякий раз имя класса перед статическим методом позволяет избежать статический импорт. Его применение демонстрирует приведенная ниже версия предыдущей программы.*/

// Применение статического импорта с целью
// упростить вызовы методов sqrt() и pow().
// Средствами статического импорта обеспечивается
// непосредственный доступ к методам sqrt() и pow().
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadratic {
    public static void main(String args[]) {

        // Переменные a, b и с обозначают коэффициенты
        // квадратного уравнения ах2 + Ьх + с = О
        double a, b, c, x;

        // решить квадратное уравнение 4x2 + х - 3 = О
        a = 4;
        b = 1;
        c = -3;

        // найти первое решение
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a );
        System.out.println("First solution: " + x) ;

        // найти второе решение
        x = (-b - sqrt(pow(b, 2) - 4 *a * c)) / (2 * a) ;
        System.out.println("Second solution: " + x);
    }
}

/*В данной версии программы имена методов sqrt и pow уже не нужно указывать полностью (т.е. вместе с именем их класса). И достигается это благодаря статическому импорту обоих методов в приведенных ниже операторах, делающих оба метода непосредственно доступными.

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
После статического импорта отпадает необходимость предварять имена методов sqrt() и pow() именем их класса. В итоге выражение для решения квадратного уравнения принимает следующий вид:

х = (-b + sqrt(pow(b, 2) - 4 * а * с)) / (2 * а) ;
Теперь оно выглядит проще и воспринимается намного лучше.
 В Java предусмотрены две общие формы оператора import static.
  В первой форме, использованной в предыдущем примере, непосредственно доступным для программы делается единственное имя.
  Ниже приведена эта общая форма статического импорта.

import static пакет.имя_типа. имя_статического_члена;
где имятипа обозначает класс или интерфейс, содержащий требуемый статический член, на который указывает имястатического_члена.

Вторая общая форма оператора статического импорта выглядит следующим образом:

import static пакет.имя_типа.*;
Если предполагается использовать несколько статических методов или полей, определенных в классе, то данная общая форма записи позволяет импортировать все эти члены одновременно. Таким образом, обеспечить непосредственный доступ к методам pow() и sqrt() в предыдущей версии программы (а также к другим статическим членам класса Math) без указания имени класса можно с помощью следующей единственной строки кода:

import static java.lang.Math.*;
Очевидно, что статический импорт не ограничивается только классом Math и его методами. Так, если требуется сделать непосредственно доступным статическое поле System, out потока стандартного вывода, в программу достаточно ввести следующую строку кода:

import static java.lang.System.out;
После этого данные можно выводить на консоль, не указывая перед статическим полем out имя его класса System:

out.println("After importing System.out, you can use out directly.");
Насколько целесообразно поступать именно так — вопрос спорный. С одной стороны, размер исходного кода в этом случае сокращается. А с другой стороны, тем, кто просматривает исходный код программы, может быть непонятно, что конкретно обозначает имя out: поток стандартного вывода System, out или нечто иное.

Каким бы удобным ни был статический импорт, важно следить за тем, чтобы он применялся правильно. Как известно, библиотеки классов Java организованы в пакеты именно для того, чтобы исключить конфликты имен. Если импортируются статические члены класса, они переносятся в глобальное пространство имен. Вследствие этого увеличивается вероятность конфликтов и неумышленного сокрытия имен. Если статический член используется в программе один или два раза, то импортировать его нет никакого смысла. Кроме того, некоторые имена статических членов (например, System, out) настолько знакомы всем программирующим на Java, что они окажутся менее узнаваемыми, если будут употребляться без имени своего класса. Статический импорт был внедрен в расчете на те программы, в которых постоянно применяются определенные статические члены, например при математических расчетах. Следовательно, статическим импортом следует пользоваться аккуратно, не злоупотребляя им.*/