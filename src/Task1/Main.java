package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by admin on 22.10.2018.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String ss = null;
        System.out.println("Введите начальную строку, структуру матрицы и операции над матрицей. По окончании ввода введите end");
        while (true){
            ss= reader.readLine();
            if(ss.equals("end"))
                break;
            stringBuilder.append(ss);
            stringBuilder.append("\n");

        }
        main.matrix(stringBuilder.toString());
    }
    //Реализовать метод, который принимает String в качестве аргумента. В аргемент будет передана "многострочная" строка. Напомню, что символ конца строки - '\n'.
    public void matrix(String str){
        String[] countLines = str.split("\n");
        String[] firstLine = countLines[0].split(" ");
        int n = Integer.parseInt(firstLine[0]);//кол-во строк матрицы
        int m = Integer.parseInt(firstLine[1]);//Кол-во столбцов матрицы
        int k = Integer.parseInt(firstLine[2]);//кол-во запросов

        int mass[][] = new int[n][m];
        //заполняем значениями матрицу
        for(int i = 0;i<n;i++){
            String[] lineI = countLines[i+1].split(" ");
            for(int j =0;j<m;j++){
                mass[i][j] = Integer.parseInt(lineI[j]);
            }
        }
        for(int i =0;i<k;i++){
            String[] line = countLines[i+n+1].split(" ");
            int a = Integer.parseInt(line[1]);
            int b = Integer.parseInt(line[2]);
            switch (line[0]){
                case "g":
                    System.out.println(mass[a-1][b-1]);
                    break;
                case "c": //меняем столбцы
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    for(int f = 0;f<n;f++){
                        arrayList.add(mass[f][a-1]);
                    }
                    for(int r=0;r<n;r++){
                        mass[r][a-1] = mass[r][b-1];
                        mass[r][b-1] = arrayList.get(r);
                    }
                    break;
                case "r": //меняем строки
                    ArrayList<Integer> arrayList2 = new ArrayList<>();
                    for(int f = 0;f<m;f++){
                        arrayList2.add(mass[a-1][f]);
                    }
                    for(int r=0;r<m;r++){
                        mass[a-1][r] = mass[b-1][r];
                        mass[b-1][r] = arrayList2.get(r);
                    }
                    break;
            }
        }


    }
}
