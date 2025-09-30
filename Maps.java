//HashMaps
// dB 9/30/25

import java.util.HashMap;

public class Maps {
public static void main(String[] args ){


    HashMap<String, Integer> empIds = new HashMap<>();

    empIds.put("Don", 12345);
    empIds.put("Jennie", 54321);
    empIds.put("Esther", 86754);

    System.out.println(empIds);

    empIds.get("Jennie");

    System.out.println(empIds.get("Jennie"));

    System.out.println(empIds.containsKey("Esther"));

    System.out.println(empIds.containsValue(6));

    empIds.put("Don", 98765);
    System.out.println(empIds);

    empIds.replace("Estelle", 777);
    System.out.println(empIds);

    empIds.putIfAbsent("Mina", 222);
    System.out.println(empIds);

    empIds.remove("Mina");
    System.out.println(empIds);

}


    }

