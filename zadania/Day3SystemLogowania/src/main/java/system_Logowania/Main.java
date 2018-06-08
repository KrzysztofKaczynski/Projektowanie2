package system_Logowania;

public class Main {
    public static void main(String[] args) {

    }

    SystemLogowania systemLogowania =new SystemLogowania() {
        @Override
        public String getUsername() {
            return super.getUsername();
        }

        @Override
        public String getPass() {
            return super.getPass();
        }
    }
}
