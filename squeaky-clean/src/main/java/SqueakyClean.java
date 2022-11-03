class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean makeUpper = false;

        for (int i = 0; i < identifier.length(); i++) {

            if (Character.isSpaceChar(identifier.charAt(i)) == true) {
                result.append('_');
            } else if (Character.isISOControl(identifier.charAt(i)) == true) {
                result.append("CTRL");
            } else if (identifier.charAt(i) == '-') {
                makeUpper = true;
            } else if (Character.isLetter(identifier.charAt(i)) == true
                    && !(identifier.charAt(i) >= 'α' && identifier.charAt(i) <= 'ω')) {
                if (makeUpper) {
                    result.append(Character.toUpperCase(identifier.charAt(i)));
                    makeUpper = false;
                } else {
                    result.append(identifier.charAt(i));
                }
            }
        }

        return result.toString();
    }
}
