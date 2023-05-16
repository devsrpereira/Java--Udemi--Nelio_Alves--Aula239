package application;

import model.entities.Product;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list  = new ArrayList<>();

        String path = "..\\input.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            while(line != null){
                String [] field = line.split(",");
                list.add(new Product(field[0], Double.parseDouble(field[1])));
            }
            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
