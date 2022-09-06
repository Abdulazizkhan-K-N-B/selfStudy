package com.aknb.tasks.custom.apiChecker;

import java.util.Scanner;

public class ApiChecker {

    public static void ApiCheckerEx() {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            String IP = in.next();
            System.out.println(IP.matches(new Regex().pattern));
        }
        in.close();
    }

}

class Regex {
    String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
