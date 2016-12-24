package com.techpalle.preferenceexp1;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    EditText et1,et2;
    Button b1,b2;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_login, container, false);
        et1= (EditText) v.findViewById(R.id.edittext1);
        et2= (EditText) v.findViewById(R.id.edittext2);
        b1= (Button) v.findViewById(R.id.button1);
        b2= (Button) v.findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we are insert button click
                SharedPreferences sp= getActivity().getSharedPreferences("credentials",0);
                SharedPreferences.Editor editor=sp.edit();//open editor
                editor.putString("name",et1.getText().toString());//writename
                editor.putString("pw",et2.getText().toString());//writepw
                editor.commit();//save in to preference file

            }
        });
      b2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              MainActivity m= (MainActivity) getActivity();
              m.loadDetailsFrag();
          }
      });

        return v;
    }

}
