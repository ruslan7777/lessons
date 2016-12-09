package com;

/**
 * Created by RUSLAN77 on  09.12.2016 in Ukraine
 */
/*1. Суперкласс не имеет, подкласс имеет.
 * 2. Создайте подкласс Circle, производный от класса TwoDShape. В нем должен
быть определен метод area () , вычисляющий площадь круга, а также конструктор
с ключевым словом super для инициализации членов, унаследованных от класса
TwoDShape.

// Подкласс, производный от класса TwoDShape, для окружностей
class Circle extends TwoDShape {
// Конструктор по умолчанию
Circle () {
super();
}
// Конструктор класса Circle
Circle(douЫe х) {
super(x, "circle"); // вызвать конструктор суперкласса
}
// Создать новый объект из имеющегося объекта
Circle (Circle оЬ) {
super(ob); // передать объект конструктору класса TwoDShape
}
douЫe area () {
return (getWidth() / 2) * (getWidth() / 2) * 3.1416;
}
}
3. объявить члены суперкласса как private

4. Ключевое слово super используется в двух случаях. Во-первых, с его помощью вызывается конструктор суперкласса. В этом случае общая форма вызова имеет
следующий вид:
suреr(список_параметров);

И во-вторых, это ключевое слово обеспечивает доступ к членам суперкласса (исп. когда член подкласса закрывает член суперкласса)
Ниже приведена общая форма такого доступа.
suреr. член_класса

5.Допустим, имеется следующая иерархия классов.
class Alpha { ...
class Beta extends Alpha
Class Gamma extends Beta
В каком порядке вызываются конструкторы этих классов при создании объекта класса Gamma?
Конструкторы всегда вызываются в порядке наследования. Таким образом, при создании экземпляра класса Gamma будет сначала вызван конструктор Alpha, затем
Beta и наконец Gamma.

6. Переменная ссылки на суперкласс может указывать на объект подкласса. Объясните,почему это важно и как это связано с переопределением методов?
Когда переопределяемый метод вызывается по ссылке на суперкласс, его вариант определяется по типу объекта, на который делается ссылка.

7. Что такое абстрактный класс?
Абстрактным называется такой класс, который содержит хотя бы один абстрактный метод.

8. Как предотвратить переопределение метода? И как предотвратить наследование класса?
Для того чтобы метод нельзя было переопределить, его нужно объявить как final. А для того чтобы предотвратить наследование от класса, его следует объявить
как final.

9. Объясните, каким образом механизмы наследования, переопределения методов и абстрактные классы используются для поддержки полиморфизма.
Наследование, переопределение методов и абстрактные классы поддерживают полиморфизм и позволяют создать обобщенную структуру, реализуемую различными
классами. Так, абстрактный класс определяет согласованный интерфейс,общий для всех реализующих его классов. Такой подход соответствует принципу
"один интерфейс - множество методов".

10. Какой класс является суперклассом всех остальных классов?
Класс Object.

11. Класс, который содержит хотя бы один абстрактный метод, должен быть объявлен абстрактным. Верно или не верно?
Верно.

12. Какое ключевое слово следует использовать для создания именованной константы?
Ключевое слово final.

 */
public class page_288 {
}
