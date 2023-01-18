public class CaesarDecrypt {
    public static String result;


    static void start() {
        InputOutput file = new InputOutput();
        String text = file.inputFile();

        String[] alphabet = (Constants.RU_ALPHABET + Constants.NUMBERS).split("");
        String[] textArray = text.split("");
        String[] resultArray = new String[textArray.length];

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < textArray.length; j++) {
                if (textArray[j].equals(alphabet[i])) {
                    if (Constants.KEY >= 0) {
                        if ((i - Constants.KEY) < 0) {
                            resultArray[j] = alphabet[i - Constants.KEY + alphabet.length];
                        } else {
                            resultArray[j] = alphabet[i - Constants.KEY];
                        }
                    } else {
                        if ((i - Constants.KEY) > alphabet.length) {
                            resultArray[j] = alphabet[i - Constants.KEY - alphabet.length];
                        } else {
                            resultArray[j] = alphabet[i - Constants.KEY];
                        }
                    }
                }
//                if (Constants.SYMBOLS.contains(textArray[j])) {
//                    resultArray[j] = textArray[j];
//                }
            }
        }
        result = String.join("", resultArray);
        file.outputFile(result);
    }
}
