package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCount {
    public static void main(String[] args) {
        System.out.println(adCount());
    }

    public static String adCount() {
        String text = "Показать 24 503 предложения";
        Pattern pattern = Pattern.compile("\\d+");
        String word = text.replace(" ", "");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            String count = matcher.group();
            return count;
        }
        return text;
    }

}

