package testdemo.greeter;
public class Greeting {

    public static String greet(String name) {
        if(name == null)
            return "Hello, my friend.";

        if(isUpperCase(name))
            return "HELLO " + name;

            return "Hello " + name.replaceAll(","," and ");
    }

   /* private static boolean isUpperCase(String name) {
        return name.toUpperCase().equals(name);
    }*/

    private static boolean isUpperCase(String name) {
        char[] chars = name.toCharArray();
        for (char aChar : chars)
            if (Character.isLowerCase(aChar))
                return false;
        return true;
    }
}
