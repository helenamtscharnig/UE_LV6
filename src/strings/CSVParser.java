package strings;

public class CSVParser {

    private String csvline;

    public CSVParser(String csvline) {
        this.csvline = csvline;
    }

    public String getCsvline() {
        return csvline;
    }

    public int countComma() {
        int count = 0;
        for (int i = 0; i < csvline.length(); i++) {
            if (csvline.charAt(i) == ';')
                count++;
        }
        return count;
    }

    public String[] parse() {
        String[] result = new String[countComma()];
        int pos = 0;
        for (int i = 0; i < result.length; i++)
            result[i] = "";

        for (int i = 0; i < csvline.length(); i++) {
            char c = csvline.charAt(i);
            if (c == ';') {
                pos++;
            } else {
                result[pos] += c;
                System.out.println(pos + ": " + result[pos]);
            }
        }
        return result;
    }
}
