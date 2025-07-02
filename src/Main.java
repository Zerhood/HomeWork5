import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Bob", "Jennifer");

        List<String> names2 = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .toList();
    }
}