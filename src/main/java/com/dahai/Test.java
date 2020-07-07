package com.dahai;


import com.dahai.utils.SHA256Util;

public class Test {

    public static void main(String[] args) throws Exception {

        String sha256StrJava = SHA256Util.getSHA256StrJava("http://www.qcwxjs.com/content/uploadfile/201903/cdc61553051953.jpg");
        System.out.println(sha256StrJava);
    }

}
