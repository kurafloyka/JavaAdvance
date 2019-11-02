package returnmultiobject;

public class Call {

    void request(ReadJson p) {//upcasting
        if (p instanceof Email) {
            Email email = (Email) p;//Downcasting
            email.read("returnmultiobject.Email");
        }
        if (p instanceof Web) {
            Web web = (Web) p;//Downcasting
            web.read("returnmultiobject.Web");
        }
    }

}
