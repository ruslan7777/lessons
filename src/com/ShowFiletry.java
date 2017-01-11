package com;

/**
 * Created by RUSLAN77 on  11.01.2017 in Ukraine
 */

import java.io.*;

class ShowFileTry {
    public static void main(String args[]) {
        int i;

//        // Прежде всего следует убедиться, что оба файла были указаны,
//        if (args.length != 1) {
//            System.out.println("Usage: ShowFile filename");
//            return;
//        }

// Ниже оператор try с ресурсами применяется сначала для открытия, а затем для автоматического закрытия файла после выхода из блока try.
        try (FileInputStream fin = new FileInputStream("C://LESSONS//out//production//LESSONS//com//TEST22.txt")) {
            // Блок оператора try с ресурсами,
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
/*Особое внимание в данной программе обращает на себя следующая строка кода, в которой файл открывается в операторе try с ресурсами.
* try(FilelnputStream fin = new FilelnputStream(args[0])) {
* Как видите, в той части оператора try с ресурсами, где указывается конкретный ресурс, объявляется переменная fin типа FilelnputStream, которой затем
* присваивается ссылка на файл как объект, открываемый конструктором класса FilelnputStream. Следовательно, в данной версии программы переменная fin
* является локальной для блока try и создается при входе в этот блок. А при выходе из блока try файл, связанный с переменной fin, автоматически закрывается
* с помощью неявно вызываемого метода close(). Это означает, что метод close() не нужно вызывать явным образом, а следовательно, он избавляет от необходимости
 * помнить, что файл нужно закрыть. Именно в этом и заключается главное преимущество автоматического управления ресурсами.

Следует иметь в виду, что ресурс, объявляемый в операторе try с ресурсами, неявно считается как final. Это означает, что ресурс нельзя присвоить после того,
как он был создан. Кроме того, область действия ресурса ограничивается блоком оператора try с ресурсами.
* */
