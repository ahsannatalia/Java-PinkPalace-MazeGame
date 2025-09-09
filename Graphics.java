import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Write a description of class Graphics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Graphics
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Graphics
     */
    public Graphics()
    {
        // initialise instance variables
        x = 0;
        
    }

    public void pinkPalace(){
        System.out.println("                 `'::::.");
        System.out.println("                   _____A_");
        System.out.println("                  /      /\\ ");
        System.out.println("               __/__/\\__/  \\_____");
        System.out.println("             ---/__|: :: :| /___/\\----");
        System.out.println("                |''|::||::| |' '||");
        System.out.println("                `**`**))**`*`****`* ");
    }
    
    public void mapOutside(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +              | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.             +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .| *|.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +     + e' m  .| ");
        System.out.println(" .|  |.             +     + s     .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|     |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.               -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
        
    }
    
    public void mapKitchen(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +              | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.     *       +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .|  |.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +     + e' m  .| ");
        System.out.println(" .|  |.             +     + s     .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|     |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.               -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
        
    }
    
    public void mapTeaRoom(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +              | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.             +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .|  |.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +     + e' m  .| ");
        System.out.println(" .|  |.             +     + s     .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|     |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.     *         -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
    }
    
    public void mapTunnel(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +              | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.             +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .|  |.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +     + e' m  .| ");
        System.out.println(" .|  |.             +     + s     .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|  *  |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.               -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
    }
    
    public void mapHall(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +              | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.             +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .|  |.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +  *  + e' m  .| ");
        System.out.println(" .|  |.             +     + s     .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|     |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.               -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
    }
    
    public void mapBedroom(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +              | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.             +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .|  |.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +     + e' m  .| ");
        System.out.println(" .|  |.             +     + s  *  .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|     |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.               -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
    }
    
    public void mapStudy(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +       *      | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.             +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .|  |.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +     + e' m  .| ");
        System.out.println(" .|  |.             +     + s     .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|     |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.               -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
    }
    
    public void mapCircus(){
        System.out.println(" .------------------.  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.    Circus       |  ");
        System.out.println(" |.     Room        |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |.       *         |  ");
        System.out.println(" |.                 |  ");
        System.out.println(" |__________________|______________. ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|  |.             +              | ");
        System.out.println(" .|o |.             +     Study    | ");
        System.out.println(" .|u |.   Kitchen   +              | ");
        System.out.println(" .|t |.             +              | ");
        System.out.println(" .|s |.             +-----+--------| ");
        System.out.println(" .|i |.             +     + C     .| ");
        System.out.println(" .|d |______________+     + o  B  .| ");
        System.out.println(" .|e |.             +  H  + r  e  .| ");
        System.out.println(" .|  |.             +  a  + a  d  .| ");
        System.out.println(" .|  |.   Magic     +  l  + l  r  .| ");
        System.out.println(" .|  |.   Room      +  l  + i  o  .| ");
        System.out.println(" .|  |.             +     + n  o  .| ");
        System.out.println(" .|  |.             +     + e' m  .| ");
        System.out.println(" .|  |.             +     + s     .| ");
        System.out.println(" .------------------+-----+--------. ");
        System.out.println("  |.               -|     |     ");
        System.out.println("  |.               -|  T  |     ");
        System.out.println("  |.               -.  u  .     ");
        System.out.println("  |.  Tea Room     -|  n  |     ");
        System.out.println("  |.               -|  n  |     ");
        System.out.println("  |.               -.  e  .     ");
        System.out.println("  |.               -|  l  |     ");
        System.out.println("  |.______________.-|_____|     ");
        System.out.println();
        System.out.println("Compass: ");
        System.out.println("                 N   ");
        System.out.println("              W -|- E");
        System.out.println("                 S   ");
    }
    
    
    public void welcomeMessage(){
        System.out.println("      ___       __   __         ___    ___  __ ");
        System.out.println("|  | |__  |    /  ` /  \\  |\\/| |__      |  /  \\ ");
        System.out.println("|/\\| |___ |___ \\__, \\__/  |  | |___     |  \\__/ ");
        System.out.println("");
        System.out.println(" __                  __                  __   ___");
        System.out.println("|__) | |\\ | |__/    |__)  /\\  |     /\\  /  ` |__ ");
        System.out.println("|    | | \\| |  \\    |    /~~\\ |___ /~~\\ \\__, |___ ");
        System.out.println("");
        System.out.println("      __        __  ___        ___      ___  __ ");
        System.out.println(" /\\  |__)  /\\  |__)  |   |\\/| |__  |\\ |  |  /__` ");
        System.out.println("/~~\\ |    /~~\\ |  \\  |   |  | |___ | \\|  |  .__/ ");
        
        
    }


}