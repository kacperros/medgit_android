package pl.medgit.medgit.login.loginMVP;

/**
 * Created by hp on 2017-05-12.
 */

public class LoginPresenter implements LoginMVP.Presenter {

    private LoginMVP.View view;
    private LoginModel model;

    public LoginPresenter(LoginMVP.View view, LoginModel model){
        this.view = view;
        this.model = model;
    }

    @Override
    public void login(String login, String password) {

    }
}
