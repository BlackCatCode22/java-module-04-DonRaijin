// Animal.java
// dB 9/30/25

public class Animal {
    // Private attributes
    private String aniID;
    private String birthdate;
    private String color;
    private int weight;
    private String origin;
    private String arrivalDate;
    private String name;
    private String aniSound;
    private String sex;
    private static int numOfAnimals = 0;

    // Public getters and setters
    public String getAniID() {
        return aniID;
    }

    public void setAniID(String aniID) {
        this.aniID = aniID;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAniSound() {
        return aniSound;
    }

    public void setAniSound(String aniSound) {
        this.aniSound = aniSound;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    public static void setNumOfAnimals(int numOfAnimals) {
        Animal.numOfAnimals = numOfAnimals;
    }

    public static void incrementAnimalCount() {
        numOfAnimals++;
    }

    public static void decrementAnimalCount() {
        if (numOfAnimals > 0) {
            numOfAnimals--;
        }
    }
}