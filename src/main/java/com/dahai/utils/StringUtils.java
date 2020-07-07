package com.dahai.utils;

import java.util.Random;

public class StringUtils {

    /**
     * 检查字符串为空
     * @param str str
     * @return true 空
     */
    public static boolean checkStrNull(String str) {
        if (str==null || str.length()==0) {
            return true;
        }

        return false;
    }

    /**
     * 生成4位验证码
     * @return 验证码
     */
    public static String getFourCode() {
        String str="0123456789";
        StringBuilder sb=new StringBuilder(4);
        for(int i=0;i<4;i++) {
            char ch=str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }

        return sb.toString();
    }
}
