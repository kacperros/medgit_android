package pl.medgit.medgit.login.loginMVP;

/**
 * Created by hp on 2017-05-12.
 */

public interface LoginMVP {
    interface View {

        public void loginSuccessfull();

        public void loginFailed();

    }

    interface Presenter {

        public void login(String login, String password);

    }

    interface Model{

        public void isCorrect(String login, String password);

    }

}
