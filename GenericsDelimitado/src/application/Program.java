package application;

import model.entities.Product;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list  = new ArrayList<>();

        String path = "..\\input.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            while(line != null){
                String [] field = line.split(",");
                list.add(new Product(field[0], Double.parseDouble(field[1])));
                System.out.println(new Product(field[0], Double.parseDouble(field[1])));
                line = bf.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println();
            System.out.println("Max: ");
            System.out.println(x);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
