package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> countryName = new ArrayList<>();
    ArrayList<String> arrName = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // For Spinner
        spin = findViewById(R.id.spin);
        autoCompleteTextView = findViewById(R.id.auto);

        countryName.add("India");
        countryName.add("Pakistan");
        countryName.add("China");
        countryName.add("Afghanistan");
        countryName.add("Sri Lanka");
        countryName.add("Bhutan");
        countryName.add("Bangladesh");
        countryName.add("Iran");
        countryName.add("Indonesia");
        countryName.add("Iraq");
        countryName.add("Japan");
        countryName.add("Israel");
        countryName.add("Maldives");
        countryName.add("Mongolia");
        countryName.add("Oman");
        countryName.add("Jordan");
        countryName.add("Russia");
        countryName.add("Egypt");
        countryName.add("Cambodia");
        countryName.add("North Korea");
        countryName.add("Qatar");
        countryName.add("Singapore");
        countryName.add("South Korea");
        countryName.add("Syria");
        countryName.add("Thailand");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countryName);
        spin.setAdapter(arrayAdapter);


        // For AutoCompleteTextView
        arrName.add("Subham");
        arrName.add("Kanha");
        arrName.add("Ranjan");
        arrName.add("Samir");
        arrName.add("Kaka");
        arrName.add("Sritam");
        arrName.add("Chandan");
        arrName.add("Ashu");
        arrName.add("Krishna");
        arrName.add("Barun");
        arrName.add("Subham");
        arrName.add("Shree");
        arrName.add("Subhashis");
        arrName.add("Subhakanta");
        arrName.add("Ankita");
        arrName.add("Chiki");


        ArrayAdapter<String> arrayNames = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrName);
        autoCompleteTextView.setAdapter(arrayNames);
        autoCompleteTextView.setThreshold(1);
    }
}