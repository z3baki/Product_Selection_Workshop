package com.example.tallerproducts;

import java.util.ArrayList;
import java.util.List;

public class ProductExpert {
    List<String> getProduct(String ProductType){
        List<String> product = new ArrayList<>();
        if(ProductType.equals("Mercancias Solidas")){
            product.add("Granos");
            product.add("Minerales");
            product.add("Qumicos");
        }
        else {
            if (ProductType.equals("Mercancias Liquidas")){
                product.add("Aceite");
                product.add("Petroleo");
                product.add("Solvente");
            }
            else {
                if (ProductType.equals("Mercancias Agricolas")){
                    product.add("Cereales");
                    product.add("Fertilizantes");
                    product.add("Semillas");
            }
                else {
                    if (ProductType.equals("Mercancia Textil")){
                        product.add("Algodon");
                        product.add("Lino");
                        product.add("Seda");
                    }
                }
        }
    }
        return product;
    } //List<String>
    }//ProductExpert
