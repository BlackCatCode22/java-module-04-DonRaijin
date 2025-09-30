//HashMap
// dB 9/30/25


import java.util.HashMap;

public class Maps2 {
public static void main(String[] args ) {

    HashMap<String, Integer> player = new HashMap<>();


    player.put("Lebron", 23);
    player.put("Steph", 30);
    player.put("Kevin", 7);

    System.out.println(player);

    player.get("Lebron");
    System.out.println(player.get("Lebron"));

    player.putIfAbsent("Luka", 77);
    System.out.println(player);

    player.remove("Luka");
    System.out.println(player);

    player.size();
    System.out.println(player.size());

    System.out.println(player.containsKey("Kawhi"));



  }
}
