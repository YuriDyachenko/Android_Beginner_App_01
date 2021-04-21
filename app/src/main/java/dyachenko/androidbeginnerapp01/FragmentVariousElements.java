package dyachenko.androidbeginnerapp01;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentVariousElements extends Fragment {
    private final String TAG = "VARIOUS_FRAGMENT";

    public FragmentVariousElements() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_various_elements, container, false);
        fragment.setTag(TAG);
        return fragment;
    }
}