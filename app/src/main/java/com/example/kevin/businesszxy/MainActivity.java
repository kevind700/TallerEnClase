package com.example.kevin.businesszxy;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText quantity;
    private Resources resources;
    private Spinner shoes, trademarks;
    private RadioButton genderMan, genderWoman;
    private String sh[], trade[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.lblResult);
        quantity = (EditText)findViewById(R.id.txtQuantity);
        genderMan = (RadioButton)findViewById(R.id.rbMan);
        genderWoman = (RadioButton)findViewById(R.id.rbWoman);
        shoes = (Spinner)findViewById(R.id.cmbShoesType);
        trademarks = (Spinner)findViewById(R.id.cmbTrademark);
        resources = this.getResources();
        sh = resources.getStringArray(R.array.shoeType);
        trade = resources.getStringArray(R.array.trademark);
        ArrayAdapter<String>  adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sh);
        ArrayAdapter<String>  adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, trade);
        shoes.setAdapter(adapter1);
        trademarks.setAdapter(adapter2);
    }

    public boolean validate(){
        int positionShoes = shoes.getSelectedItemPosition();
        int positionTradremarks = trademarks.getSelectedItemPosition();
        if (!genderMan.isChecked() && !genderWoman.isChecked()){
            Toast.makeText(this, R.string.error_message_ck, Toast.LENGTH_SHORT).show();
            return false;
        }

            if (quantity.getText().toString().length() == 0) {
                Toast.makeText(this, R.string.error_message_quantity, Toast.LENGTH_SHORT).show();
                return false;
            }else{
                return true;
            }
        }
    public void calculate(View v){
        int optionShoe, optionTrademark, quant=0;
        double result2 = 0;
        boolean gender1, gender2;
        result.setText("");

        if (validate()){
            quant = Integer.parseInt(quantity.getText().toString());
            gender1 = genderMan.isChecked();
            gender2 = genderWoman.isChecked();
            optionShoe = shoes.getSelectedItemPosition();
            optionTrademark = trademarks.getSelectedItemPosition();

            if (gender1 == true && optionShoe == 0 && optionTrademark ==0){
                result2 = quant * 120000;
            }else if(gender1 == true && optionShoe == 0 && optionTrademark == 1){
                {
                    result2 = quant * 140000;
                }
            }else if(gender1 == true && optionShoe == 0 && optionTrademark == 2){
                {
                    result2 = quant * 130000;
                }
            }else if(gender1 == true && optionShoe == 1 && optionTrademark == 0){
                {
                    result2 = quant * 50000;
                }
            }else if(gender1 == true && optionShoe == 1 && optionTrademark == 1){
                {
                    result2 = quant * 80000;
                }
            }else if(gender1 == true && optionShoe == 1 && optionTrademark == 2){
                {
                    result2 = quant * 100000;
                }
            }else if(gender2 == true && optionShoe == 0 && optionTrademark == 0){
                {
                    result2 = quant * 100000;
                }
            }else if(gender2 == true && optionShoe == 0 && optionTrademark == 1){
                {
                    result2 = quant * 130000;
                }
            }else if(gender2 == true && optionShoe == 0 && optionTrademark == 2){
                {
                    result2 = quant * 110000;
                }
            }else if(gender2 == true && optionShoe == 1 && optionTrademark == 0){
                {
                    result2 = quant * 60000;
                }
            }else if(gender2 == true && optionShoe == 1 && optionTrademark == 1){
                {
                    result2 = quant * 70000;
                }
            }else if(gender2 == true && optionShoe == 1 && optionTrademark == 2){
                {
                    result2 = quant * 120000;
                }
            }

            result.setText(""+String.format("%.2f", result2));
        }
    }

    public void clear(View v){
        genderMan.setChecked(false);
        genderWoman.setChecked(false);
        shoes.setSelection(0);
        trademarks.setSelection(0);
        quantity.setText("0");
        result.setText("");
    }
}
