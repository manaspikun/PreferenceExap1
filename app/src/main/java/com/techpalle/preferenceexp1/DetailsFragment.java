package com.techpalle.preferenceexp1;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {
    TextView tv1,tv2;


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_details, container, false);
        tv1= (TextView) v.findViewById(R.id.textview1);
        tv2= (TextView) v.findViewById(R.id.textview2);
        //we haave to read data from preference file here
        SharedPreferences sp=getActivity().getSharedPreferences("credentials",0);
        String value1=sp.getString("name",null);
        String value2=sp.getString("pw",null);
        tv1.setText("name:"+value1);
        tv2.setText("pw:"+value2);
        return v;
    }

}
