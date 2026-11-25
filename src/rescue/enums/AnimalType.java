package rescue.enums;

public enum AnimalType {
    BIRD, REPTILE, MAMMAL;

    public static AnimalType fromString(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Animal type is empty");
        }
        String key = text.trim().toUpperCase().replace(' ', '_');
        for (AnimalType t : values()) {
            if (t.name().equals(key)) {
                return t;
            }
        }
        throw new IllegalArgumentException("Invalid animal type: " + text);
    }
}