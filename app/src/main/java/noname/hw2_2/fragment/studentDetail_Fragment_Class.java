package noname.hw2_2.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import noname.hw2_2.R;

/**
 * Created by hp on 9/28/2017.
 */

public class studentDetail_Fragment_Class extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.studentdetail_fragment, container, false);
        Bundle bundle=getArguments();
        Student temp= bundle.getParcelable("infor");
        ((TextView)view.findViewById(R.id.txtName)).setText(temp.name);
        ((TextView)view.findViewById(R.id.viewQueQuan)).setText(temp.queQuan);
        ((TextView)view.findViewById(R.id.viewDOB)).setText(temp.ngayThangSinh);
        ((TextView)view.findViewById(R.id.viewSex)).setText(temp.gioiTinh);
        ((TextView)view.findViewById(R.id.viewClass)).setText(temp.lop);
        ((TextView)view.findViewById(R.id.viewtCourse)).setText(temp.khoaHoc);
        return view;
    }
}
