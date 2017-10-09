package by.it.akhmelev.lesson05;

/*
Вывести таблицу умножения 10 x 10, но словами
два умножить на два равно четыре
три умножить на два равно шесть
четрые умножить на два равно четыре
пять умножить на два равно четыре
два умножить на два равно четыре
два умножить на два равно четыре
два умножить на два равно четыре
два умножить на два равно четыре
....
девять умножить на восемь равно семьдесят два
девять умножить на девять равно восемьдесят один
девять умножить на десять равно девяносто
десять умножить на два равно двадцать
десять умножить на три равно тридцать
десять умножить на четыре равно сорок
десять умножить на пять равно пятьдесят
десять умножить на шесть равно шестьдесят
десять умножить на семь равно семьдесят
десять умножить на восемь равно восемьдесят
десять умножить на девять равно девяносто
десять умножить на десять равно сто


*/


public class TaskC3 {

    static String cypherToString(int cypher) {
        String[][] w = {
                {"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять ",
                        "десять ", "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ",
                        "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать ", ""},

                {"", "", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "},
                {"", "сто ", "двести ", "триста ", "четырста ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "}
        };
        int i2 = cypher / 100;
        cypher = cypher - i2 * 100;
        int i1 = cypher / 10;
        cypher = cypher - i1 * 10;
        int i0 = i1 < 2 ? cypher + i1 * 10 : cypher;
        return w[2][i2] + w[1][i1] + w[0][i0];
    }


    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {

//                        System.out.println("testing = testing.include(\""+cypherToString(i) + "умножить на " + cypherToString(j) + "равно " + cypherToString(i * j)+"\");");
                System.out.println(cypherToString(i) + "умножить на " + cypherToString(j) + "равно " + cypherToString(i * j));
            }
        }
    }


}
