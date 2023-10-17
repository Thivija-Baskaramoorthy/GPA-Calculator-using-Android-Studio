//package com.example.gpacalculator;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Spinner;
//import android.widget.TextView;
//
//public class ThirdActivity extends AppCompatActivity {
//
//    Spinner spinner1;
//    TextView selectedGradeTextView;
//    String grades[] = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_third);
//
//        spinner1 = findViewById(R.id.spinner1);
//        selectedGradeTextView = findViewById(R.id.selectedGradeTextView1);
//
//        ArrayAdapter<String> arr = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, grades);
//        arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        spinner1.setAdapter(arr);
//
//        // Set up a listener for item selection in the Spinner
//        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
//                // Update the TextView with the selected grade
//                String selectedGrade = grades[position];
//                selectedGradeTextView.setText(selectedGrade);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parentView) {
//                // Do nothing here
//            }
//        });
//    }
//}

package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private static final int NUM_SPINNERS = 10;

    Spinner[] spinners = new Spinner[NUM_SPINNERS];
    TextView[] selectedGradeTextViews = new TextView[NUM_SPINNERS];
    String[] grades = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        for (int i = 0; i < NUM_SPINNERS; i++) {
            int spinnerId = getResources().getIdentifier("spinner" + (i + 1), "id", getPackageName());
            int textViewId = getResources().getIdentifier("selectedGradeTextView" + (i + 1), "id", getPackageName());

            spinners[i] = findViewById(spinnerId);
            selectedGradeTextViews[i] = findViewById(textViewId);

            ArrayAdapter<String> arr = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, grades);
            arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinners[i].setAdapter(arr);

            final int spinnerIndex = i;

            spinners[i].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                    String selectedGrade = grades[position];
                    selectedGradeTextViews[spinnerIndex].setText(selectedGrade);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                    // Do nothing here
                }
            });
        }
    }
}

