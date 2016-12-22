package com.goldmsg.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2016/12/22
 * Time: 17:56
 */
public class log4jMain {
    public static Logger LOG = LogManager.getLogger(log4jMain.class);

    public static void main(String[] args) {
        String etcDir = args[0];
        if (!(etcDir.endsWith("/") || etcDir.endsWith("\\"))) {
            etcDir = etcDir + "/";
        }
        PropertyConfigurator.configure(etcDir + "log4j.properties");
        int num = 0;



    }
}
