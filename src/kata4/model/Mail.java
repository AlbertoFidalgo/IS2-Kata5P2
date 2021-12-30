package kata4.model;

public class Mail {
    private String email;
    private String domain;
    
    public Mail(String email){
        this.email = email;
        String[] split = email.split("@");
        domain = split[1];
    }
    
    public String getEmail() {
        return email;
    }

    public String getDomain() {
        return domain;
    }
    
}
