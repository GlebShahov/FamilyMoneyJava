package com.example.familymoneyjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class AddItemActivity extends AppCompatActivity {
    private EditText name;
    private EditText price;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        name = findViewById(R.id.name);
        price = findViewById(R.id.price);
        addButton = findViewById(R.id.addButton);
        TextWatcher editTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (name.getText().toString().trim().length() <= 0 || price.getText().toString().trim().length() <= 0)
                    addButton.setEnabled(false);
                else addButton.setEnabled(true);
            }

        };
        name.addTextChangedListener(editTextWatcher);
        price.addTextChangedListener(editTextWatcher);

    }

}