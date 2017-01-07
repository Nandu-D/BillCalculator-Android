package com.example.hp.justjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberOfCoffees = 0;

    public void increment(View view) {
        numberOfCoffees++;
        display(numberOfCoffees);
        //displayPrice(numberOfCoffees * 5);
    }

    public void decrement(View view) {
        if(numberOfCoffees>0) {
            numberOfCoffees--;
            display(numberOfCoffees);
            //displayPrice(numberOfCoffees * 5);
        }
    }

    public void submitOrder(View view) {
        //display(numberOfCoffees);
        //displayPrice(numberOfCoffees*5);
        displayMessage("Total :  Rs " + (numberOfCoffees * 5) + "\nThank You! \nHave a nice day");
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
