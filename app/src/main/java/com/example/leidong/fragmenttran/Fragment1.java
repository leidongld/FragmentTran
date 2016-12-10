package com.example.leidong.fragmenttran;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by leido on 2016/12/10.
 */

public class Fragment1 extends Fragment {
    private TextView textView1;
    private Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment1, null);
        textView1 = (TextView)view.findViewById(R.id.textView1);
        button1 = (Button)view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获得Fragment2的TextView中的值，并填入Fragment1的TextView中
                Toast.makeText(getActivity(), "何依 --->>> 按钮", Toast.LENGTH_LONG).show();
                Fragment2 fragment2 = (Fragment2) getFragmentManager().findFragmentByTag("fragment2");
                TextView temp = (TextView)fragment2.getView().findViewById(R.id.textView2);
                textView1.setText(temp.getText().toString());
            }
        });
        return view;
    }

    @Override
    public void onPause(){
        super.onPause();
    }

}
