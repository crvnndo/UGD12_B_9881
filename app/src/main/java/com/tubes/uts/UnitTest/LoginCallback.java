package com.tubes.uts.UnitTest;

import com.google.firebase.auth.FirebaseUser;

public interface LoginCallback {
    void onSuccess(boolean value, FirebaseUser user);
    void onError();
}
