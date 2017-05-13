package pl.medgit.medgit.login.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.medgit.medgit.R;
import pl.medgit.medgit.login.loginMVP.LoginMVP;

public class LoginActivity extends AppCompatActivity implements LoginMVP.View {

    @BindView(R.id.textLogin)
    EditText login;

    @BindView(R.id.textPassword)
    EditText password;

    @BindView(R.id.loginButton)
    Button loginButton;

    @BindView(R.id.registerButton)
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void loginSuccessfull() {

    }

    @Override
    public void loginFailed() {

    }
}
