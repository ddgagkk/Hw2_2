package noname.hw2_2.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import noname.hw2_2.MainActivity;
import noname.hw2_2.R;

/**
 * Created by hp on 9/28/2017.
 */

public class studentName_Fragment_Class extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.studentname_fragment, container, false);
        view.findViewById(R.id.btnsubmit).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        ((MainActivity)getActivity()).changeScreen1();
    }
}
