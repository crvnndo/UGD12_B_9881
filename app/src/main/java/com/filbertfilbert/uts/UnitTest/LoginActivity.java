package com.filbertfilbert.uts.UnitTest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.filbertfilbert.uts.AdminActivity;
import com.filbertfilbert.uts.MainActivity;
import com.filbertfilbert.uts.R;
import com.filbertfilbert.uts.RegisterActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static android.widget.Toast.LENGTH_SHORT;

public class LoginActivity extends AppCompatActivity implements LoginView{
    TextInputEditText txtEmailUser,txtPasswordUser;
    private Button btnAdmin,btnLogin;
    FirebaseAuth fauth;
    TextView txtRegister;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtEmailUser = findViewById(R.id.input_email);
        txtPasswordUser = findViewById(R.id.input_password);
        txtRegister = findViewById(R.id.txt_register);
        fauth = FirebaseAuth.getInstance();

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        btnAdmin = findViewById(R.id.btn_admin);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adminIntent;
                adminIntent = new Intent(LoginActivity.this, AdminActivity.class);
                startActivity(adminIntent);
            }
        });
        presenter = new LoginPresenter(this, new LoginService());
        btnLogin=findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onLoginClicked();
            }
        });
    }

    @Override
    public String getEmail() {
        return txtEmailUser.getText().toString();
    }

    @Override
    public void showEmailError(String message) {
        txtEmailUser.setError(message);
    }

    @Override
    public String getPassword() {
        return txtPasswordUser.getText().toString();
    }

    @Override
    public void showPasswordError(String message) {
        txtPasswordUser.setError(message);
    }

    @Override
    public void startMainActivity() {
        new ActivityUtil(this).startMainActivity();
    }

    @Override
    public void showLoginError(String message) {
        Toast.makeText(this, message, LENGTH_SHORT).show();
    }

    @Override
    public void showErrorResponse(String message) {
        Toast.makeText(this, message, LENGTH_SHORT).show();
    }
}