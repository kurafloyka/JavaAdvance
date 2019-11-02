package returnmultiobject;

public class Email implements ReadJson {

    public Email read(String filePath) {


        Email email = new Email();


        System.out.println(filePath);

        return email;
    }
}
