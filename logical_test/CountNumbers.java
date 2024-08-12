public class CountNumbers {

    public static void main(String[] args) {

        String[] input1 = {"b", "7", "h", "6", "h", "k", "i", "5", "g", "7", "8"};
        String[] input2 = {"7", "b", "8", "5", "6", "9", "n", "f", "y", "6", "9"};
        String[] input3 = {"u", "h", "b", "n", "7", "6", "5", "1", "g", "7", "9"};

        System.out.println("Jumlah angka: " + countNumbers(input1));
        System.out.println("Jumlah angka: " + countNumbers(input2));
        System.out.println("Jumlah angka: " + countNumbers(input3));
    }

    public static int countNumbers(String[] array) {
        int count = 0;

        for (String element : array) {
            if (isNumeric(element)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}