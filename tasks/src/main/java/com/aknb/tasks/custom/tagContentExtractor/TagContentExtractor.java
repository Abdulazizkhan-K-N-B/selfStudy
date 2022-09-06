package com.aknb.tasks.custom.tagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void tagContentExtractorFirstEx() {

        Pattern pattern = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");

        Scanner in = new Scanner(System.in);
        int textCases = Integer.parseInt(in.nextLine());

        while (textCases > 0) {

            String line = in.nextLine();

            Matcher m = pattern.matcher(line);
            boolean findMatch = true;

            while (m.find()) {
                System.out.println(m.group(2));
                findMatch = false;
            }

            if (findMatch) {
                System.out.println("None");
            }

            textCases--;
        }
        in.close();
    }
}
