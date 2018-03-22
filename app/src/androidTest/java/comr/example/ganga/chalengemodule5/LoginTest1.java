package comr.example.ganga.chalengemodule5;

import android.support.test.rule.ActivityTestRule;

import com.example.ganga.challengemodule5.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by GANGA on 21/03/2018.
 */

public class LoginTest1 {

    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule=new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity loginActivity;

    @Before
    public void setUp() throws Exception {
        loginActivity=activityActivityTestRule.getActivity();
    }

    @Test
    public  void testActivity(){

        assertNotNull(loginActivity.findViewById(R.id.tv_email));
        assertNotNull(loginActivity.findViewById(R.id.tv_password));
        assertNotNull(loginActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("ghost@gmail.com")).toString();

        onView(withId(R.id.tv_password)).perform(typeText(""));

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.tv_email)).perform(clearText());

        onView(withId(R.id.tv_password)).perform(clearText());
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("ghost123"));

        onView(withId(R.id.btn_login)).perform(click());

        pressBack();
    }

    @Test
    public  void testActivity2(){

        assertNotNull(loginActivity.findViewById(R.id.tv_email));
        assertNotNull(loginActivity.findViewById(R.id.tv_password));
        assertNotNull(loginActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("ghost")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("ghost123"));

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.tv_email)).perform(clearText());

        pressBack();
    }

    @Test
    public  void testActivity3(){

        assertNotNull(loginActivity.findViewById(R.id.tv_email));
        assertNotNull(loginActivity.findViewById(R.id.tv_password));
        assertNotNull(loginActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("ganga@gmail.com")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("ghost123"));

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.tv_email)).perform(clearText());

        pressBack();
    }

    @Test
    public  void testActivity4(){

        assertNotNull(loginActivity.findViewById(R.id.tv_email));
        assertNotNull(loginActivity.findViewById(R.id.tv_password));
        assertNotNull(loginActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("ghost@gmail.com")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("jap"));

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.tv_email)).perform(clearText());

        pressBack();
    }

    @Test
    public  void testActivity5(){

        assertNotNull(loginActivity.findViewById(R.id.tv_email));
        assertNotNull(loginActivity.findViewById(R.id.tv_password));
        assertNotNull(loginActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("ghost@gmail.com")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("ghost123"));

        onView(withId(R.id.btn_login)).perform(click());

        pressBack();
    }


    @After
    public void tearDown() throws Exception {
        loginActivity=null;
    }

}
