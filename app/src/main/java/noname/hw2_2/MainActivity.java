package noname.hw2_2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import noname.hw2_2.fragment.*;

import static noname.hw2_2.R.layout.studentdetail_fragment;
import static noname.hw2_2.R.layout.studentinput_fragment;
import static noname.hw2_2.R.layout.studentname_fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        studentName_Fragment_Class fragmentName = new studentName_Fragment_Class();
        transaction.replace(R.id.fragementScrenn, fragmentName).commit();
    }
    public void changeScreen1(){

        String name=((EditText)findViewById(R.id.editTextName)).getText().toString();
       Bundle bundle= new Bundle();
        bundle.putString("Name",name);

        studentInput_Fragment_Class fragmentInput= new studentInput_Fragment_Class();
        fragmentInput.setArguments(bundle);
        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragementScrenn,fragmentInput).addToBackStack(null).commit();
    }

    public void changeScrenn2(){
        String name=   ((TextView)findViewById(R.id.txtName)).getText().toString();
        String queQuuan=((EditText)findViewById(R.id.editTextQueQuan)).getText().toString();
        String sex=((EditText)findViewById(R.id.editTextSex)).getText().toString();
        String dob=((EditText)findViewById(R.id.editTextDOB)).getText().toString();
        String lop= ((EditText)findViewById(R.id.editTextClass)).getText().toString();
        String khoahoac=((EditText)findViewById(R.id.editTextCourse)).getText().toString();
        Student temp= new Student(name,queQuuan,dob,sex,khoahoac,lop);
        Bundle bundle= new Bundle();
        bundle.putParcelable("infor",temp);
        studentDetail_Fragment_Class fragmentDetail= new studentDetail_Fragment_Class();
        fragmentDetail.setArguments(bundle);
        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragementScrenn,fragmentDetail).addToBackStack(null).commit();
    }
}
