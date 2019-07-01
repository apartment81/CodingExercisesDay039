package ro.mirodone;

public class CleverIsogram {

    boolean isIsogram ( String string) {
        return string.toLowerCase()
                .chars()
                .distinct()
                .count() == string.length();
    }

}
