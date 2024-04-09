public class removeLeadingZeros1 {
    public static void main(String[] args) {
        String stringWithZeros = "00000123789";
        String stringWithoutZeros = removeLeadingZeros(stringWithZeros);
        System.out.println("String with leading zeros: " + stringWithZeros);
        System.out.println("String without leading zeros: " + stringWithoutZeros);
    }

    public static String removeLeadingZeros(String str) {
        return str.replaceFirst("^0+(?!$)", "");
    }
}
