package com.qcw.flowermanagerment.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {


    //密码长度为8到20位,必须包含字母和数字，字母区分大小写
    private static String regExPassword = "^(?=.*[0-9])(?=.*[a-zA-Z])(.{8,20})$";

    // userId 8位数字
    private static final String regExUserId = "^\\d{8}$";

    public static boolean checkUserId(String userId){
        Pattern pat = Pattern.compile(regExUserId);
        Matcher mat = pat.matcher(userId);
        return mat.matches();

    }
    public  static boolean checkPassword(String password){
        Pattern pat = Pattern.compile(regExPassword);
        Matcher mat = pat.matcher(password);
        return mat.matches();
    }
}
