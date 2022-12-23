package az.ikt.java.repeat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("zakir",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Zakir " +
                "gozel insan");

        System.out.println(matcher.find());
    }}
