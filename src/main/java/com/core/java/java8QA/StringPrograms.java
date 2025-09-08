package com.core.java.java8QA;

public class StringPrograms {
    public static void main(String[] args) {
        String str = "123a";
        StringBuffer br = new StringBuffer(str);
        br.reverse();
        System.out.println(br);
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            stringBuilder.append(chars[i]);
        }
        System.out.println(stringBuilder);
    }
}
