package lab04_plural;

public class Plural {
    String input;
    int lenght;
    public Plural(String input) {
        this.input = input.trim();
        lenght = this.input.length();
    }

    public String getPluralString() {
        String plural = null;
        if (input.substring(lenght-1).equals("s")) {
            plural = input + "es";
        } else if (input.substring(lenght-1).equals("x")) {
            plural = input + "es";
        } else if (input.substring(lenght-2,lenght).equals("ch")) {
            plural = input + "es";
        } else {
            plural = input + "s";
        } if (input.substring(lenght-1).equals("y")) {
            int count = 0;
            String[] vocal = {"a","e","i","o","u"};
            for (int i = 0; i < vocal.length; i++) {
                if (input.substring(lenght-2,lenght-1).equals(vocal[i])) {
                    count++;
                    plural = input +"s";
                    break;
                }
                if (count==0) {
                    plural = input.substring(0,lenght-1)+"ies";
                }
            }
        }
        return plural;
    }
}
