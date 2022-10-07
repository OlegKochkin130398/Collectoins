import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {

    final static String pattern = "страдание";
    final static String regex = "^[Сс]трада(.*)";

    public static void main(String[] args) {
        File file = new File("warofpeace.txt");
        Parser parser = new Parser();

        ArrayList<String> lines = parser.parse(file);
        ArrayList<String> suffwords = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);

        for(String line : lines){
            if(pattern.matcher(line).find()){
                suffwords.add(line);
            }
        }

        System.out.println(suffwords.size());


    }
}
