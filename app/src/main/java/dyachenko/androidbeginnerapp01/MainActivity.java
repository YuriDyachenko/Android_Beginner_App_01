package dyachenko.androidbeginnerapp01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plugFragment(new FragmentVariousElements(), R.id.btVariousFragment, savedInstanceState == null);
        plugFragment(new FragmentEditingElements(), R.id.btEditingFragment, false);
        plugFragment(new FragmentCalendar(), R.id.btCalendarFragment, false);
    }

    private void plugFragment(Fragment fragment, int buttonId, boolean start) {
        if (start) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.container, fragment, fragment.getTag());
            fragmentTransaction.commit();
        }
        findViewById(buttonId).setOnClickListener(v -> {
            Fragment foundFragment = getSupportFragmentManager().findFragmentByTag(fragment.getTag());
            if (foundFragment == null) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment, fragment.getTag());
                fragmentTransaction.commit();
            }
        });
    }
}