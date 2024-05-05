/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kosagyula.csigaprojekt;

/**
 *
 * @author kali
 */
public class Csiga implements Comparable<Csiga>{
    private final String color;
    public int position = 0;
    
    public Csiga(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setPosition(int pos, float speedup) {
        if (speedup <= 0.2f)
            this.position += pos * 2;
        else
            this.position += pos;
    }
    
    @Override
    public int compareTo(Csiga csiga) {
        return (int)(csiga.position - this.position);
    }
}
