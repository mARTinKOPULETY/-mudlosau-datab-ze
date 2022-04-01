/*
 *prvni aplikace  vytvorena  pro dceru. Databaze smudlosauru .
Vytvori noveho uzivatele databaze. Po te uzivatel vytvori heslo.  Jmeno uctu a 
heslo se  overi. Pak je  uzivatel vyzvan
aby  zapsal jakeho smudlosaura
 */
package cz.itnetwork.mujprojektloginrandomuzivatel;

import java.util.Scanner;

/**
 *
 * @author mARTin
 */
public class MujProjektLoginRandomUzivatel {
      

    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        String jmeno = "";
        String heslo = "";
        int delkaJmena = 0;
        System.out.println("  //////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("  Vítejte ve šmudlosauří databázi");
        System.out.println("  \\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////");
        System.out.println("");
        System.out.println("Zadejte své nové uživatelské jméno.");
        System.out.println("<--------------------------------->");
        jmeno = sc.nextLine();
        System.out.println("");
        System.out.println("          zadejte heslo");
        System.out.println("          <----------->");
        heslo = sc.nextLine();
        System.out.println(" ");
        System.out.println("_______________________________________________________");
        
        System.out.println("Je vytvořen nový uživatel " + jmeno +" šmudlosauří databáze.");
        System.out.println("");
        
        
   
        String uzivatelskeJmeno = "";
        String uzivatelskeHeslo = "";
        if (!uzivatelskeJmeno.equals(jmeno)){
      
            System.out.println("Zadejte uživatelské jméno:");
            System.out.println("");
              
        
                while (!uzivatelskeJmeno.equalsIgnoreCase(jmeno)){
                uzivatelskeJmeno = sc.nextLine();
                if (!uzivatelskeJmeno.equalsIgnoreCase(jmeno)) {
                System.out.println("Špatné jméno, zkuste to znovu");
                System.out.println("-----------------------------");
                }
            }
            System.out.println("______________");    
            System.out.println("Zadejte heslo:");
            System.out.println("______________"); 
       }
        //String heslo = "";
        while (!uzivatelskeHeslo.equals(heslo)){
       uzivatelskeHeslo = sc.nextLine();
       if(!uzivatelskeHeslo.equals(heslo)) {
        System.out.println("Špatné heslo, zkuste to znovu.");
        System.out.println("-----------------------------");
       }
      }                                                          
    
        System.out.printf("Vítejte %s ve šmudlosaurináriu!\n", jmeno);
      
      String opakovani = "ano";
        while (opakovani.equals("ano")) {
        System.out.println("_________________________________________");
        System.out.println("zadej jméno šmudlosauruse třídy 'X'rrrrr! (např. šmudlosaurus Crrrr!)");
        System.out.println("_________________________________________");
        
        String volba = sc.nextLine();
        
       
        if (volba.startsWith("gr") ) { 
            System.out.println("šmudlosaurus grrr!!");
            System.out.println("-------------------");
            System.out.println("          ^^_      ");
            System.out.println("        /  Oo)     ");
            System.out.println("       /  /WW      ");
            System.out.println("      / /          ");
            System.out.println("     / /_____S     ");
            System.out.println("    (   ____ )     ");
            System.out.println("    //\\   //\\\\  ");
            System.out.println("   //  \\ //  \\\\ ");
            System.out.println("-------------------");
               
        }
        else if (volba.startsWith("vr") ) {
            System.out.println(" šmudlosaurus vrrr!!    ");
            System.out.println("--------------------    ");
            System.out.println("        ^ ^             ");
            System.out.println(" w  /\\ (O.o) /\\  w    ");
            System.out.println(" /\\/  \\/ W \\/  \\/\\ ");
            System.out.println(" \\               /     ");
            System.out.println("  \\/\\    #    /\\/    ");
            System.out.println("     \\/(   )\\/        ");
            System.out.println("       // \\\\          ");
            System.out.println("      mm   mm           ");
            System.out.println("--------------------    ");
                    
        }  
        else if (volba.startsWith("hr")){
        
        System.out.println(" šmudlosaurus hrrr!!    ");
            System.out.println("--------------------    ");
            System.out.println("                    ");
            System.out.println("                     ");
            System.out.println("  E_____ O _____E    ");
            System.out.println("        ||            ");
            System.out.println("        ||         ");
            System.out.println("       / \\    ");
            System.out.println("      /   \\        ");
            System.out.println("      i    i           ");
            System.out.println("--------------------    ");
        }
        else { 
            System.out.println("-------------------------------------");
            System.out.printf("Nemáme na skladě šmudlosaura %srrr!! \n", volba );
            System.out.println("-------------------------------------");
        } 
           System.out.println("Přejete si vidět jiného šmudlousaura? [ano/ne]");
           opakovani = sc.nextLine();
        }
        System.out.println("Děkujeme za použití šmudlosaučí databáze!");
            sc.close();
    }
}

