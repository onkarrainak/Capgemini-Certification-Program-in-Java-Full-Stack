package onkar.Core_Java_Java8;

@FunctionalInterface
interface SpaceBetweenInterface {
    String addSpace(String s);
}
public class SpaceBetweenInterfaceExample {
    String insertSpace(String s) {
    SpaceBetweenInterface spaceBetweenInterface = (String s1) -> {StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            if (i != s.length() - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    };
        return spaceBetweenInterface.addSpace(s);
    }
    public static void main(String[] args) {
        SpaceBetweenInterfaceExample example = new SpaceBetweenInterfaceExample();
        String s = "Onkar";
        System.out.println(example.insertSpace(s));
    }
}
