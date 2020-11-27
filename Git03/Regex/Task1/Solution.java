package Git03.Regex.Task1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String str = "\tThe park says it is currently looking into the incident, would improve its safety management and \"do our best to handle the aftermath of the incident\"." +
                 "\tIt has since temporarily closed the wild beast area. Refunded tickets. For visitors and \"strengthened its safety. Operations\"." +
                 "\tThe video, circulating on China's Weibo, shows tourists yelling as they sit inside a bus!While several bears can be seen gathered outside, crowded in one spot.";
        System.out.println("Первое задание");
        System.out.println(sortByParagraphs(str));
        System.out.println("Второе задание");
        System.out.println(sortByWords(str));
        System.out.println("Третье задание");
        System.out.println(sortByChar(str,'e'));
    }
    public static String sortByChar(String str, char c){
        StringBuilder result=new StringBuilder();
        Pattern pattern = Pattern.compile(".+?[!?.]");
        Matcher matcher = pattern.matcher(str);
        Pattern patternWord = Pattern.compile(".+?(\\b)");

        while (matcher.find()){
            Matcher matcherWord=patternWord.matcher(matcher.group());
            StringBuilder stringBuilder = new StringBuilder();
            while(matcherWord.find()){
                String temp = matcherWord.group();
                if (isWord(temp))
                    stringBuilder.append(temp)
                            .append(' ');
            }
            String[] strArray = stringBuilder.toString().split(" ");

            for (int i = 0; i < strArray.length-1; i++) {

                for (int j = i+1; j < strArray.length; j++) {
                    if(countChar(strArray[i],c) < countChar(strArray[j],c)){
                        String temp = strArray[i];
                        strArray[i] = strArray[j];
                        strArray[j] = temp;
                    }
                    if(countChar(strArray[i],c) == countChar(strArray[j],c)
                            && strArray[i].toLowerCase().compareTo(strArray[j].toLowerCase()) > 0) {
                        String temp = strArray[i];
                        strArray[i] = strArray[j];
                        strArray[j] = temp;
                    }
                }
            }
            for (int i = 0; i < strArray.length; i++) {
                result.append(strArray[i]).append(' ');
            }
            result.append('\n');

        }
        return result.toString();
    }

    public static String sortByWords(String str){
        StringBuilder result=new StringBuilder();
        Pattern pattern = Pattern.compile(".+?[!?.]");
        Matcher matcher = pattern.matcher(str);
        Pattern patternWord = Pattern.compile(".+?(\\b)");

        while (matcher.find()){
            Matcher matcherWord=patternWord.matcher(matcher.group());
            StringBuilder stringBuilder = new StringBuilder();

            while(matcherWord.find()){
                String temp = matcherWord.group();
                if (isWord(temp))
                        stringBuilder.append(temp)
                                        .append(' ');

            }
            String[] strArray = stringBuilder.toString().split(" ");
            for (int i = 0; i < strArray.length; i++) {
                for (int j = i+1; j < strArray.length; j++) {
                    if(strArray[i].length() < strArray[j].length()) {
                        String temp = strArray[i];
                        strArray[i] = strArray[j];
                        strArray[j] = temp;
                    }
                }
                result.append(strArray[i])
                        .append(' ');
            }
            result.append('\n');

        }
        return result.toString();
    }
    public static String sortByParagraphs(String str){

        //Pattern pattern = Pattern.compile("[^\\n]+");
        Pattern pattern = Pattern.compile("\\t.+?(?=(\\t|$))");
        Matcher matcher = pattern.matcher(str);

        int i = 0;
        while(matcher.find()){
            i++;
            matcher.group();
        }
        String[] paragraphs = new String[i];
        matcher = pattern.matcher(str);
        for (int j = 0; j < paragraphs.length; j++) {
            matcher.find();
            paragraphs[j]=matcher.group();
        }

        for (int j = 0; j < paragraphs.length -1; j++) {
            for (int k = j+1; k < paragraphs.length; k++) {
                if(countSentens(paragraphs[j]) < countSentens(paragraphs[k]))
                {
                    String temp = new String(paragraphs[j]);
                    paragraphs[j] = paragraphs[k];
                    paragraphs[k] = temp;
                }
            }
        }

        String result = "";
        for (int j = 0; j < paragraphs.length; j++) {
            result+=paragraphs[j]+'\n';
        }
        return result;
    }

    public static int countSentens(String str){
        return str.split("[.!?]").length;
    }

    public static boolean isWord(String str){
        for(char ch : str.toCharArray()){
            if(Character.isAlphabetic(ch))
                return true;
        }
        return false;
    }

    public static int countChar(String str, char a){
        int countCh = 0;
        for (char ch : str.toCharArray())
        {
            if(ch == a)
                countCh++;
        }
        return countCh;
    }
}
