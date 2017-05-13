package pl.medgit.medgit.login.loginMVP;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import io.reactivex.Observable;

/**
 * Created by hp on 2017-05-12.
 */
public class LoginPresenterTest {

    @Mock
    LoginMVP.View view;

    @Mock
    LoginMVP.Model model;

    private LoginPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new LoginPresenter();
    }

    @Test
    public void loginSuccesfull() throws Exception{
        //Mockito.when(model.verify("login", "hasło")).thenReturn(Observable.just(true));

        //presenter.login("login", "hasło");

//        Mockito.verify(view.loginSuccesfull());
    }

    @Test
    public void loginFailed(){
  //      Mockito.when(model.verify("login", "hasło")).thenReturn(Observable.just(true));

    //    presenter.login("login", "haseło");

      //  Mockito.verify(view.loginFailed());
    }

}