package exercice3;

public class Reverse {
    public static void Reverse(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        System.out.println(stringBuilder.reverse());
    }
}
