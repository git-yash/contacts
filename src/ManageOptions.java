public enum ManageOptions {
    EXIT(0),
    ADD(1),
    EDIT(2),
    REMOVE(3);

    private final int option;

    ManageOptions(int option) {
        this.option = option;
    }

    public int getLevelCode() {
        return this.option;
    }

    public boolean equals(int option) {
        return this.getLevelCode() == option;
    }

    public static void printOptions(boolean hasContacts) {
        System.out.println("Enter " + ManageOptions.EXIT.getLevelCode() + " to exit");
        System.out.println("Enter " + ManageOptions.ADD.getLevelCode() + " to add a contact");
        if (hasContacts) {
            System.out.println("Enter " + ManageOptions.EDIT.getLevelCode() + " to edit a contact");
            System.out.println("Enter " + ManageOptions.REMOVE.getLevelCode() + " to remove a contact");
        }
    }

    public static int gatherOption(boolean hasContacts) {
        int max = hasContacts ? 3 : 1;
        return GatherInput.gatherIntInput("Enter an option: ", max, 0);
    }

    public static boolean shouldExit(int option) {
        return !ADD.equals(option) && !EDIT.equals(option) && !REMOVE.equals(option);
    }
}
