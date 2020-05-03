public class Contact {
    public String name = "";
    public String address = "";
    public String phoneNumber = "";
    public String email = "";

    public void printLine(int id) {
        System.out.println(id + ". " + this.name);
    }
}
