package com;

/*В отношении подклассов следует отметить еще одну интересную особенность применения нескольких операторов catch: условие перехвата исключений для суперкласса будет справедливо и для любых его подклассов. Например, класс Throwable является суперклассом для всех исключений, поэтому для перехвата всех возможных исключений в операторах catch следует указывать тип Throwable.
Если же требуется перехватывать исключения типа суперкласса и типа подкласса, то в блоке операторов первым должен быть указан тип исключения, генерируемого подклассом. В противном случае вместе с исключением типа суперкласса будут перехвачены и все исключения производных от него классов. Это правило соблюдается автоматически, и если указать первым тип исключения, генерируемого суперклассом, то будет создан недостижимый код, поскольку условие перехвата исключения, генерируемого подклассом, никогда не будет выполнено. А ведь недостижимый код в Java считается ошибкой.*/

//В операторах catch исключения типа подкласса должны предшествовать исключениям типа суперкласса,
class ExcDemo5 {
    public static void main(String args[]) {
        // Здесь массив numer длиннее массива denom.
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            }
            // Перехват исключения от суперкласса.
            catch (ArrayIndexOutOfBoundsException exc) {       // Перехватить исключение подкласса
                System.out.println("No matching element found.");

            } catch (Throwable exc) {                          //Перехват исключения суперкласса
                System.out.println("Some exception occurred.");
            }
        }
    }
}
/**
 * В данном случае оператор catch (Throwable) перехватывает все исключения, кроме ArraylndexOutOfBoundsException. Соблюдение правильного порядка следования
 * операторов catch приобретает особое значение в том случае, когда исключения генерируются в самой программе.
 */