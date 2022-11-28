public class TestPerson {
    public static void main(String[] args) {
        Person chi = new Person();
        chi.setName("Chi");
        chi.setAddress("Ballybane");
        chi.setTelephone("1358");

        System.out.println("Chi details: " + chi.getName());
        System.out.println("Chi details: " + chi.getAddress());
        System.out.println("Chi details: " + chi.getTelephone());
    }
}
