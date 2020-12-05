package com.tubes.uts.UnitTest;

import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class LoginPresenter {
    private LoginView view;
    private LoginService service;
    private LoginCallback callback;
    public LoginPresenter(LoginView view, LoginService service) {
        this.view = view;
        this.service = service;
    }
    public static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );
    public void onLoginClicked() {
        if (view.getEmail().isEmpty()) {
            view.showEmailError("Email tidak boleh kosong");
            return;
        }else if (view.getPassword().isEmpty()) {
            view.showPasswordError("Password tidak boleh kosong");
            return;
        }else if(view.getPassword().length()<6){
            view.showPasswordError("Password kurang dari 6 karakter");
        }else if(!EMAIL_ADDRESS_PATTERN.matcher(view.getEmail()).matches()){
            view.showEmailError("Invalid Email");
        } else{
            service.login(view, view.getEmail(), view.getPassword(), new
                    LoginCallback() {
                        @Override
                        public void onSuccess(boolean value, FirebaseUser user) {
                                view.startMainActivity();
                        }
                        @Override
                        public void onError() {
                        }
                    });
            return;
        }
    }
}
