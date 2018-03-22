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

public class LoginTest2 {

    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule=new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity mainActivity=null;

    @Before
    public void setUp() throws Exception {
        mainActivity=activityActivityTestRule.getActivity();
    }

    @Test
    public  void testActivity(){

        assertNotNull(mainActivity.findViewById(R.id.tv_email));
        assertNotNull(mainActivity.findViewById(R.id.tv_password));
        assertNotNull(mainActivity.findViewById(R.id.btn_login));
        ////////////////////////////////////////////////////////////////////////////////////////////

        onView(withId(R.id.tv_email)).perform(typeText("ghost")).toString();

        onView(withId(R.id.tv_password)).perform(typeText("ghost123"));

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.tv_email)).perform(clearText());

        pressBack();
    }

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }
}
