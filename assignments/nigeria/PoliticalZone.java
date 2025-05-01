package assignments.nigeria;

public enum PoliticalZone {
    NorthCentral("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NorthEast("Adamawa", "Bauchi", "Bornu", "Gombe", "Taraba", "Yobe"),
    NorthWest("Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SouthEast("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SouthWest("Ekiti", "Lagos","Osun", "Ondo", "Ogun", "Oyo"),
    SouthSouth("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers");

    private String[] states;
    PoliticalZone(String... states) {
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }

    public static String[] getAllZones() {
        PoliticalZone[] zone = PoliticalZone.values();
        String[] allZones = new String[zone.length];
        for (int count = 0; count <zone.length; count++) {
            allZones[count] = zone[count].name();
        } return allZones;
    }

    public static String[] getAllStates() {
        int size = 0;
        for (PoliticalZone zone : PoliticalZone.values()) {
            size += zone.getStates().length;
        }
        int index = 0;
        String[] theStates = new String[size];
        for (PoliticalZone theZones : PoliticalZone.values()){
        for (String state : theZones.getStates()) theStates[index++] = state;
        } return theStates;
    }

    public static String findZoneByState(String state) {
        validate(state);
        for (PoliticalZone zone : PoliticalZone.values()) {
        for (String theState: zone.getStates()) {
            if (theState.equalsIgnoreCase(state)) return zone.name();
        }
        } throw new IllegalArgumentException("State not in any Political Zone");
    }

    private static void validate(String state) {
        if (state == null || state.trim().isEmpty() || !state.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Invalid state");
        }
    }



}
