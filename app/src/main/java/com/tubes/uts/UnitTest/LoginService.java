package com.tubes.uts.UnitTest;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginService {
    private FirebaseAuth fauth = FirebaseAuth.getInstance();
    public void login(final LoginView view, String email, String password,
                      final LoginCallback callback){
        fauth.signInWithEmailAndPassword(email,password).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    callback.onSuccess(true,fauth.getCurrentUser());

                }else {
                    callback.onError();
                    view.showLoginError("Login Failed");
                }
            }
        });
    }
    public Boolean getValid(final LoginView view, String nim, String
            password){
        final Boolean[] bool = new Boolean[1];
        login(view, nim, password, new LoginCallback() {
            @Override
            public void onSuccess(boolean value,FirebaseUser user) {
                bool[0] = true;
            }
            @Override
            public void onError() {
                bool[0] = false;
            }
        });
        return bool[0];
    }
}
