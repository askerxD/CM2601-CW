package rescue.enums;

public enum IncidentStatus {
    PENDING_ASSIGNMENT("Pending Assignment"),
    ASSIGNED("Assigned"),
    COMPLETED("Completed");

    private final String label;

    IncidentStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static IncidentStatus fromString(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Incident status is empty");
        }
        String key = text.trim().toUpperCase().replace(' ', '_');
        for (IncidentStatus s : values()) {
            if (s.name().equals(key)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Invalid incident status: " + text);
    }
}