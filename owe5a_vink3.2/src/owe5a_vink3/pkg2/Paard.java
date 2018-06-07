package owe5a_vink3.pkg2;

/**
 * Paard class
 * 
 * @author Martijn van der Bruggen
 * @version alpha release
 * (c) Hogeschool van Arnhem en Nijmegen
 *
 * Dit bestand niet aanpassen. Aanroepen vanuit Race
 *
 * 
 */

import java.util.Random;

import javax.imageio.ImageIO;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Paard {
    private int afstand, paardNummer;
    private static int aantal = 0;
    private String naam;
    private Color kleur;
    private Image img;
    Random random = new Random();
    
    /* Constructor voor Paard */
    Paard(String name, Color kl) {
        this.naam = name;
        this.kleur = kl;
        this.afstand = 0;
        this.img = null;
         paardNummer = ++aantal;
    }
    
    public String getNaam() {
        return this.naam;
    }

    public int getAfstand() {
        return this.afstand;
    }

    public int getPaardNummer() {
        return paardNummer;
    }

    public Color getKleur() {
        return kleur;
    }
    
    public void setImg(String adress) {
    	try {
	        img = ImageIO.read(new File(adress));
	    } catch (IOException e) {
	    }
    }

    public Image getImg() {
        return img;
    }
 
    public void run() {
        afstand = afstand + random.nextInt(11);
        System.out.println(naam + " is op positie " + afstand);
    }

}

