package com.example.irv.fragmenttutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by irv on 10/28/14.
 */
public class FragmentB extends Fragment {
    TextView text;
    String data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =  inflater.inflate(R.layout.fragment_b, container, false);
        if(savedInstanceState != null) {
            data = savedInstanceState.getString("text");
            TextView tv = (TextView) view.findViewById(R.id.textView);
            tv.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        text = (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outstate){
        super.onSaveInstanceState(outstate);
        outstate.putString("text", data);
    }

    public void changeText(String data){
        this.data = data;
        text.setText(data);
    }
}
