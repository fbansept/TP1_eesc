package edu.fbansept.td1;

import edu.fbansept.td1.models.Garage;
import edu.fbansept.td1.models.Voiture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Td1 {

    public static void main(String[] args) {

        Garage superGarage = new Garage("Super garage !");

        Voiture reno = new Voiture("Reno", 45);

        superGarage.ajoutVoiture(
                reno,
                new Voiture("Toytoy", 21),
                new Voiture("Merko", 90)
        );

        HashSet<Voiture> listeVoiture = new HashSet<>();
        listeVoiture.add(reno);
        listeVoiture.add(reno);
        listeVoiture.add(new Voiture("Mini",32));

        System.out.println(listeVoiture.size());

        HashMap<String,Voiture> mapVoiture = new HashMap<>();
        mapVoiture.put("Reno",reno);
        mapVoiture.put("Mini",new Voiture("Mini",32));

        System.out.println(mapVoiture.get("Mini").getNombreDeChevaux());


    }


}
