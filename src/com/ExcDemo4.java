package com;

/*
 с блоком try можно связать несколько операторов catch. Обычно разработчики так и поступают на практике. Каждый из операторов catch должен перехватывать отдельный тип исключений. Например, в приведенной ниже программе обрабатываются как исключения, связанные с обращением за границы массива, так и ошибки деления на нуль.
*/
// Применение нескольких операторов catch.  '
class ExcDemo4 {
    public static void main(String args[]) {
        // Здесь массив numer длиннее массива denom.
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            }
            // За блоком try следует несколько блоков catch подряд,
            catch (ArithmeticException exc) {
                // перехватить исключение
                System.out.println(numer[i] + " / " + denom[i] + " can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // перехватить исключение
                System.out.println("No matching element found.");
            }
        }
    }
}
/*В каждом блоке оператора catch обрабатывается свой тип исключения.
Вообще говоря, выражения с операторами catch проверяются в том порядке, в котором они встречаются в программе.
И выполняется лишь тот из них, который соответствует типу возникшего исключения. А остальные блоки операторов catch просто игнорируются.*/