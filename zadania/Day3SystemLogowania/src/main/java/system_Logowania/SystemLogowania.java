package system_Logowania;

public abstract class SystemLogowania {

    private String username;
    private String pass;

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public SystemLogowania(String username, String pass) {

        this.username = username;
        this.pass = pass;
    }
}
