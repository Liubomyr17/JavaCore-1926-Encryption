package com.company;

/*

1926 Перевертыши
1 Считать с консоли имя файла. Считать содержимое файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке.
2.2 вывести на экран.
3 Закрыть потоки.
Пример тела входного файла:
я - программист.
Амиго
Пример результата:
.тсиммаргорп - я
огимА

Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все символы из файла в обратном порядке.


*/

import com.sun.corba.se.pept.transport.ReaderThread;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = conReader.readLine();
        conReader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while(fileReader.ready()) {
            String line = fileReader.readLine();
            StringBuffer a = new StringBuffer(line);
            System.out.println(a.reverse());
        }
        fileReader.close();
    }
}
