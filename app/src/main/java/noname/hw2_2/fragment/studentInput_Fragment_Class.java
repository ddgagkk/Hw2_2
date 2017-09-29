package noname.hw2_2.fragment;

/**
 * Created by hp on 9/28/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import noname.hw2_2.MainActivity;
import noname.hw2_2.R;

public class studentInput_Fragment_Class extends Fragment implements View.OnClickListener{
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.studentinput_fragment, container, false);
        Bundle bundle = getArguments();
        String name= bundle.getString("Name","");
        ((TextView)view.findViewById(R.id.txtName)).setText(name);
        view.findViewById(R.id.btnsubmit).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        ((MainActivity)getActivity()).changeScrenn2();
    }
}
