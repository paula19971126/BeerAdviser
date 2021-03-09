package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Pilsner");
            brands.add("Viena");
        } else {
            brands.add("Alhambra");
            brands.add("Brown Ale");
        }

        return brands;
    }
}


