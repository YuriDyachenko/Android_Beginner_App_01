package dyachenko.androidbeginnerapp01;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentEditingElements extends Fragment {
    private final String TAG = "EDITING_FRAGMENT";

    public FragmentEditingElements() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_editing_elements, container, false);
        fragment.setTag(TAG);
        return fragment;
    }
}