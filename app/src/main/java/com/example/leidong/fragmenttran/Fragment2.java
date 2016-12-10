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
 * Created by leidong on 2016/12/10.
 */

public class Fragment2 extends Fragment {
    private TextView textView2;
    private Button button2;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment2, null);
        textView2 = (TextView)view.findViewById(R.id.textView2);
        button2 = (Button)view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获得Fragment1的TextView中的内容，并填入Fragment2的TextView中
                Toast.makeText(getActivity(), "雷栋 --->>> 按钮", Toast.LENGTH_LONG).show();
                Fragment1 fragment1 = (Fragment1) getFragmentManager().findFragmentByTag("fragment1");
                TextView temp = (TextView) fragment1.getView().findViewById(R.id.textView1);
                textView2.setText(temp.getText().toString());
            }
        });
        return view;
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
