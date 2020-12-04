package com.filbertfilbert.uts.UnitTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    private LoginView view;
    @Mock
    private LoginService service;
    private LoginPresenter presenter;
    @Before
    public void setUp() throws Exception {
        presenter = new LoginPresenter(view, service);
    }

    @Test
    public void shouldShowErrorMessageWhenEmailPasswordIsValid() throws Exception {
        when(view.getEmail()).thenReturn("filbertaliang@gmail.com");
        System.out.println("Email : "+view.getEmail());
        when(view.getPassword()).thenReturn("123123");
        System.out.println("Password : "+view.getPassword());
        presenter.  onLoginClicked();
    }

    @Test
    public void shouldShowErrorMessageWhenEmailIsInvalid() throws Exception {
        when(view.getEmail()).thenReturn("filbertaliang");
        System.out.println("Email : "+view.getEmail());
        when(view.getPassword()).thenReturn("123456");
        System.out.println("Password : "+view.getPassword());
        presenter.onLoginClicked();
        verify(view).showEmailError("Email invalid");
    }

    @Test
    public void shouldShowErrorMessageWhenPasswordTooShort() throws Exception {
        when(view.getEmail()).thenReturn("filbertaliang@gmail.com");
        System.out.println("Email : "+view.getEmail());
        when(view.getPassword()).thenReturn("123");
        System.out.println("Password : "+view.getPassword());
        presenter.  onLoginClicked();
        verify(view).showPasswordError("Password terlalu pendek");
    }

    @Test
    public void shouldStartMainActivityWhenEmailAndPasswordAreCorrect() throws
            Exception {
        when(view.getEmail()).thenReturn("filbertaliang2000@gmail.com");
        System.out.println("Email : "+view.getEmail());
        when(view.getPassword()).thenReturn("123456");
        System.out.println("password : "+view.getPassword());
        when(service.getValid(view, view.getEmail(),
                view.getPassword())).thenReturn(true);
        System.out.println("Hasil : "+service.getValid(view,view.getEmail(),
                view.getPassword()));
        presenter.onLoginClicked();
        //verify(view).startMainActivity();
    }

    @Test
    public void shouldShowErrorMessageWhenEmailIsEmpty() throws Exception {
        when(view.getEmail()).thenReturn("");
        System.out.println("Email : "+view.getEmail());
        presenter.onLoginClicked();
        verify(view).showEmailError("Email tidak boleh kosong");
    }

    @Test
    public void shouldShowErrorMessageWhenPasswordTooLong() throws Exception {
        when(view.getEmail()).thenReturn("filbertaliang@gmail.com");
        System.out.println("Email : "+view.getEmail());
        when(view.getPassword()).thenReturn("rahasiaaaaaaa");
        System.out.println("Password : "+view.getPassword());
        presenter.  onLoginClicked();
        verify(view).showPasswordError("Password terlalu panjang");
    }


}