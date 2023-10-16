package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    String[] grade = {"A+","A","A-","B+","B","B-", "C+","C","C-", "D+","D","D-","E"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterGrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        autoCompleteTextView=findViewById(R.id.auto_complete_textview);

        adapterGrade = new ArrayAdapter<String>(this.R.layout.activity_third.grade);
        autoCompleteTextView.setAdapter(adapterGrade);
        autoCompleteTextView.setOnClickListener(new AdapterView.OnClickListener(); {
            @Override
                    public void onGradeClick(AdapterView<?> adapterView, View view, int position,long l ) {
                string grade = adapterView.getItempPosition(position).toString();
                Toast.makeText()
            }
    }
});
}