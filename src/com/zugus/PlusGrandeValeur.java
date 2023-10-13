package com.zugus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * La classe PlusGrandeValeur permet de determiner la plus grande valeur 
 * dans un tableau de 15 elements generes aleatoirement.
 */
public class PlusGrandeValeur {

    private static final int TAILLE = 15;
    private static final int MAX_VALEUR = 100;

    /**
     * Le point d entree du programme.
     *
     * @param args Les arguments de la ligne de commande (non utilises ici).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir une option:");
        System.out.println("1. Utiliser ArrayList");
        System.out.println("2. Utiliser LinkedList");
        int choix = sc.nextInt();

        List<Integer> valeurs;
        if (choix == 1) {
            valeurs = initArrayList();
        } else {
            valeurs = initLinkedList();
        }

        afficherValeurs(valeurs);
        afficherPlusGrandeValeur(valeurs);
        System.out.println("Press any key to continue...");
        sc.next();
    }

     /**
     * Initialise une ArrayList avec des valeurs aleatoires.
     *
     * @return Une ArrayList remplie de valeurs aleatoires.
     */
    private static ArrayList<Integer> initArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < TAILLE; i++) {
            list.add(random.nextInt(MAX_VALEUR + 1));
        }
        return list;
    }

    /**
     * Initialise une LinkedList avec des valeurs aleatoires.
     *
     * @return Une LinkedList remplie de valeurs aleatoires.
     */
    private static LinkedList<Integer> initLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < TAILLE; i++) {
            list.add(random.nextInt(MAX_VALEUR + 1));
        }
        return list;
    }

    /**
     * Affiche les valeurs contenues dans la liste fournie.
     *
     * @param valeurs La liste contenant les valeurs à afficher.
     */
    private static void afficherValeurs(List<Integer> valeurs) {
        System.out.println("****Affichage du tableau*****");
        for (int i = 0; i < valeurs.size(); i++) {
            System.out.println("tableau[" + i + "] = " + valeurs.get(i));
        }
    }

       /**
     * Affiche la plus grande valeur de la liste fournie et son index.
     *
     * @param valeurs La liste contenant les valeurs a analyser.
     */
    private static void afficherPlusGrandeValeur(List<Integer> valeurs) {
        int maxValeur = Integer.MIN_VALUE;
        int indexMax = -1;
        for (int i = 0; i < valeurs.size(); i++) {
            if (valeurs.get(i) > maxValeur) {
                maxValeur = valeurs.get(i);
                indexMax = i;
            }
        }
        System.out.println("Le plus grand nombre du tableau est : " + maxValeur);
        System.out.println("Il est a l'index : " + indexMax);
    }
}
