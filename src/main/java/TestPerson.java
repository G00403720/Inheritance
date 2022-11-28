public class TestPerson {
    public static void main(String[] args) {
        Person chi = new Person();
        chi.setName("Chi");
        chi.setAddress("Ballybane");
        chi.setTelephone("0874721950");

        System.out.println("Chi details: " + chi.toString());

        Customer myCust = new Customer("Chi", "Ballybane", "0874721950", "0871358470", true );
        System.out.println("Details " + myCust.toString());
    }
}
