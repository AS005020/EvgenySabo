package Git03.Regex.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    static Pattern patternGroupe = Pattern.compile("(<.+?>)(.*)(<.*\\/.*>)|(<.+\\/>)");
    static Pattern pattern = Pattern.compile("(<(\\/)?.+?(\\/)?>)");
    static Matcher matcher;
    static String str = "<notes>" +
            "\t<note id = \"1\">" +
            "\t\t<to>Вася</to>" +
            "\t\t<from>Света</from>" +
            "\t\t<heading>Напоминание</heading>" +
            "\t\t<body>Позвони мне завтра!</body>" +
            "\t</note>" +
            "\t<note id = \"2\">" +
            "\t\t<to>Петя</to>" +
            "\t\t<from>Маша</from>" +
            "\t\t<heading>Важное сообщение</heading>" +
            "\t\t<body/>" +
            "\t</note>" +
            "</notes>";

    public static void main(String[] args) {
        matcher = pattern.matcher(str);
        parseXML(0);
    }

    public static void parseXML(int last) {

        while (matcher.find()) {
            if (matcher.group(2) != null) {
                infoXML(str.substring(last, matcher.end()));
                break;
            } else if (matcher.group(3) != null) {
                infoXML(matcher.group());
            } else if (matcher.group(1) != null) {
                parseXML(matcher.start());
            }
        }
    }

    public static void infoXML(String str){
        Matcher matcher = patternGroupe.matcher(str);
        matcher.find();
        if(matcher.group(4) != null){
            System.out.println("Пустой тег: " + matcher.group(4));
        }
        else
        {
            System.out.println("Открывающий тег: " + matcher.group(1));
            System.out.println("Закрывающий тег: " + matcher.group(3));
            System.out.println("Тело тега: " + matcher.group(2));
        }
        System.out.println();
    }
}