package ca326.com.activities;

import android.content.Intent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
@RunWith(MockitoJUnitRunner.class)
public class LoginTest {


    @Test
    public void email_validation(){
        ItemTwoFragment signIn = new ItemTwoFragment();
        boolean result = signIn.isEmailValid("James@j.com");
        assertEquals(true,result);
        boolean negativeResult = signIn.isEmailValid("James@j/com");
        assertEquals(false,negativeResult);
    }

    @Test
    public void password_validation() {
        ItemTwoFragment signIn = new ItemTwoFragment();
        boolean result = signIn.isPasswordValid("Knock5");
        assertEquals(true, result);
        boolean negativeResult = signIn.isPasswordValid("Knock");
        assertEquals(false, negativeResult);
    }

    @Mock private ItemTwoFragment mock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_login() {
        doCallRealMethod().when(mock).attemptLogin("","");
        verify(mock, times(0)).attemptLogin("","");
    }



}