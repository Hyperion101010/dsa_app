package com.example.hyperion.dsa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class year_spinner extends Main implements AdapterView.OnItemSelectedListener
{
    String[] year={"F.E","S.E","T.E","B.E"};
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Spinner sp=(Spinner) findViewById(R.id.year_spin);
        sp.setOnItemSelectedListener(this);
        //ArrayList<String> data = new ArrayList<String>(Arrays.asList(year));
        ArrayAdapter<String> data_adapter=new ArrayAdapter<>(this,android:R.layout.support_simple_spinner_dropdown_item,(Arrays.asList(year));
        sp.setAdapter(data_adapter);

    }
}
