package com.henu.exam.util;

import java.util.UUID;

public class BaseUtil {

    public static String getUid(){

        return UUID.randomUUID().toString().replaceAll("-","");
    }


}
