package com.example.shujiahomework.utli;

public class Check {

    public static boolean isLetter(String str) {
        boolean isLetter = false;//定义一个boolean值，用来表示是否包含字母
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {   //用char包装类中的判断字母的方法判断每一个字符
                isLetter = true;
            }
        }
        String regex = ".*[a-zA-z].*";
        boolean isRight = isLetter && str.matches(regex);
        return isRight;
    }
}
