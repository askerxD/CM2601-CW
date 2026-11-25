package rescue.enums;

public enum PriorityLevel {
    CRITICAL, HIGH, MEDIUM, LOW;

    public static PriorityLevel fromString(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Priority level is empty");
        }
        String key = text.trim().toUpperCase().replace(' ', '_');
        for (PriorityLevel p : values()) {
            if (p.name().equals(key)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Invalid priority level: " + text);
    }
}