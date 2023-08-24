import com.sun.net.httpserver.Authenticator;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList();
        list.add("Jiii");
        list.add("Jiii");
        list.add("Jiii");
        list.add("Jiii");
        for(var item : list.items){
            System.out.println(item);
        }

    }

}


// Outputs Match found