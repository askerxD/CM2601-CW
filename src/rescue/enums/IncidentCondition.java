package rescue.enums;

public enum IncidentCondition {
    INJURED(4),
    TRAPPED(3),
    ABANDONED(2),
    DISPLACED(1);

    private final int weight;

    IncidentCondition(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public static IncidentCondition fromString(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Condition is empty");
        }
        String key = text.trim().toUpperCase().replace(' ', '_');
        for (IncidentCondition c : values()) {
            if (c.name().equals(key)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid condition: " + text);
    }
}