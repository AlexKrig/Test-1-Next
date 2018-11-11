public class Person {
    String login;
    String password;
    String email;
    int capcha;

    public void show () {
        System.out.println(login+" "+password);
    }

    public String show (String newPass) {
        if (newPass.equals(password)) {
            return "пароли совпадают";
        }
         else {
            password=newPass;
            return login+" "+password;
        }
    }

    public void validate(int newCapcha){
        if (newCapcha==capcha && capcha == 1){
            System.out.println("Получены права админа");
        } else System.out.println("Получены права юзера");


    }


    public Person() {
    }

    public Person(String login, String password, String email, int capcha) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.capcha = capcha;
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", capcha=" + capcha +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCapcha() {
        return capcha;
    }

    public void setCapcha(int capcha) {
        this.capcha = capcha;
    }
}
