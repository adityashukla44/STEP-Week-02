public class BankTransactionReferenceValidator {
    public static String normalizeReference(String raw) {
        String reference = raw.trim();
        if (reference.length() < 3) {
            return reference.toUpperCase();
        }
        return reference.substring(0, 3).toUpperCase() + reference.substring(3);
    }

    public static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: reference must contain exactly 14 characters";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        for (int i = 3; i < reference.length(); i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: reference body must contain only digits";
            }
        }

        String date = reference.substring(3, 9);
        String formattedDate = date.substring(0, 2) + "/" + date.substring(2, 4)
                + "/" + date.substring(4, 6);
        String sequence = reference.substring(9);
        StringBuilder result = new StringBuilder();
        result.append('[').append(reference.substring(0, 3)).append("] DATE: ")
                .append(formattedDate).append(" | SEQ: ").append(sequence);
        return result.toString();
    }

    public static void main(String[] args) {
        String valid = normalizeReference(" hdf03022600042 ");
        System.out.println(validateAndFormat(valid));
        System.out.println(validateAndFormat(normalizeReference("12F03022600042")));
    }
}
