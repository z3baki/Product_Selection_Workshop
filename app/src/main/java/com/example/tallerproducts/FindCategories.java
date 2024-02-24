package com.example.tallerproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindCategories extends AppCompatActivity {

    private ProductExpert expert = new ProductExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FindProduct (View view){

        // Contain the text, get a reference to the TextView
        TextView Product = findViewById(R.id.Product);

        Spinner TypeOfProduct = findViewById(R.id.TypeOfProduct);

        String ProductType = String.valueOf(TypeOfProduct.getSelectedItem());

        List<String> ProductList = expert.getProduct(ProductType);
        StringBuilder productsFormatted = new StringBuilder();


        for(String product: ProductList){
            productsFormatted.append(product).append('\n');
        }


        Product.setText(productsFormatted);

    }
}