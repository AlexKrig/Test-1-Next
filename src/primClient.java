public class primClient extends Person {

    private int capcha;
    public primClient(String login,String password,String email,int capcha){
        super(login, password, email, capcha);
        this.capcha=capcha;
    }

    public void validate (int capcha) {
        if (capcha==1) {
            return;
        }
        System.out.println("Только юзерские права");
    }
}
