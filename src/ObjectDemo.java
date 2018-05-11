import java.util.ArrayList;

/**
 *
 * @author PolinaYoga
 */
public class ObjectDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = new String("Polina");
        String sex = new String("F");
        String hair = new String("Blond");
        Integer year = new Integer(1983);
        Double weight = new Double(134.5);
        Double hight = new Double(5.8);
        
        ArrayList<Object> list = new ArrayList<Object>();
        
        list.add(name);
        list.add(sex);
        list.add(hair);
        list.add(year);
        list.add(weight);
        list.add(hight);
        
        for(Object obj : list)
        {
            System.out.println("Personal information: " + obj);
        }
    }
    
}
