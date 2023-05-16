package model.services;

import java.util.InputMismatchException;
import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("Lista não pode ser vazia");
        }
    }
}
