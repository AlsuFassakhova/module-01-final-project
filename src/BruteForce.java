public class BruteForce {
    public static String result = "";
    static String start() {
        InputOutput file = new InputOutput();
        String text = file.inputFile();

        String[] alphabet = (Constants.RU_ALPHABET + Constants.NUMBERS + Constants.SYMBOLS).split("");
        String[] textArray = text.split("");

        String[] resultArray = new String[textArray.length];
        int key = 1;
        while (true) {
            for (int i = 0; i < textArray.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (textArray[i].equals(alphabet[j])) {
                        if ((j + key) >= alphabet.length) {
                            resultArray[i] = alphabet[(j + key) - alphabet.length];
                        } else {
                            resultArray[i] = alphabet[j + key];
                        }
                    }
                }
                result = String.join("", resultArray);
            }
            if (result.contains(", но ") || result.contains(", а ")||result.contains(", что ")||result.contains(" и ")||result.contains(", и ")) {
                break;
            }
            key++;
        }
        return result;
    }
}
