import org.apache.commons.lang3.RandomStringUtils;

// References to: https://kodejava.org/how-do-i-generate-a-random-alpha-numeric-string/

class Main {
  public static void main(String[] args) {
    System.out.println("Testing Generate Strings");

    // Creates a 64 chars length random string of number.
    String result = RandomStringUtils.random(64, false, true);
    System.out.println("random = " + result);

    // Creates a 64 chars length of random alphabetic string.
    result = RandomStringUtils.randomAlphabetic(64);
    System.out.println("random = " + result);

    // Creates a 32 chars length of random ascii string.
    result = RandomStringUtils.randomAscii(32);
    System.out.println("random = " + result);

    // Creates a 32 chars length of string from the defined array of
    // characters including numeric and alphabetic characters.
    result = RandomStringUtils.random(32, 0, 20, true, true, "qw32rfHIJk9iQ8Ud7h0X".toCharArray());
    System.out.println("random = " + result);

    result = RandomStringUtils.randomAlphanumeric(8);
    System.out.println("random = " + result);
  }
}