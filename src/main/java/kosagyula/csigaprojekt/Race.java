/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kosagyula.csigaprojekt;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kali
 */
public class Race {
    private final int round = 5;
    private final Csiga[] csigak = new Csiga[3];
    private final Random rand  = new Random();
    private final List<String> colors = Arrays.asList("piros", "zöld", "kék");
    
    public Race() {
        for (int i = 0; i < colors.size(); i++) {
            csigak[i] = new Csiga(colors.get(i));
        }
    }
    
    public void start() {
        Scanner scn = new Scanner(System.in);
        
        System.out.format("Kérlek tippeld meg, hogy melyik csiga fog nyerni (%s)\n", String.join(", ", colors));
        String tipp = scn.nextLine();
        
        while (!colors.contains(tipp.toLowerCase())) {
            System.out.format("Kérlek érvényes színt adj meg (%s)\n", String.join(", ", colors));
            tipp = scn.nextLine();
        }
        
        for (int i = 0; i < round; i++) {
            System.out.format("Kör %d\n", i + 1);
            for (Csiga csiga : csigak) {
                csiga.setPosition(rand.nextInt(4), rand.nextFloat());
                System.out.format("A %s csiga %d egységnél tart\n", csiga.getColor(), csiga.position);
            }
            System.out.println("");
        }
        
        Arrays.sort(csigak);
        if (csigak[0].getColor().equals(tipp))
            System.out.println("Nyertél");
        else
            System.out.println("Vesztettél");
    }
    
}
