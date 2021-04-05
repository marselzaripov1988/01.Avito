package tech.itpark.avito.manager;

import tech.itpark.avito.domain.Flat;

import java.util.ArrayList;

public class FlatManager {
    private ArrayList<Flat> flats = new ArrayList<>();

    public void add(Flat flat){
        flats.add(flat);
    }

    public ArrayList<Flat> filter(int minprice, int maxprice){

        ArrayList<Flat> result = new ArrayList<>();
        for(Flat flat : flats){
            if ( flat.getPrice() >= minprice && flat.getPrice() <= maxprice){
                result.add(flat);
            }
        }
        return result;
    }

    public ArrayList<Flat> getAll() {
        return flats;
    }




}
