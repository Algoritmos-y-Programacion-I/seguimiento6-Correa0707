package model;

public class Flora extends Species {

    private Boolean flowers;
    private Boolean fruits;
    private double maxHeight;

    public Flora(String name, String scientificName, Boolean flowers, Boolean fruits, double maxHeight,
            SpeciesType type) {
        super(name, scientificName,type);
        this.flowers = flowers;
        this.fruits = fruits;
        this.maxHeight = maxHeight;
    }

    public Boolean getFlowers() {
        return flowers;
    }

    public void setFlowers(Boolean flowers) {
        this.flowers = flowers;
    }

    public Boolean getFruits() {
        return fruits;
    }

    public void setFruits(Boolean fruits) {
        this.fruits = fruits;
    }

    public double getHeight() {
        return maxHeight;
    }

    public void setHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }


    public String flowersToString() {
        if (flowers) {
            return "yes";
        } else {
            return "no";
        }
    }
    public String fruitsToString() {
        if (fruits) {
            return "yes";
        } else {
            return "no";
        }
    }

    @Override
    public String typeToString() {
        if (getType() == SpeciesType.LAND_FLORA) {
            return "Flora : land";
        } else {
            return "Flora : aquatic";
        }
    }



    @Override
    public String toString() {
        return "Name : " + getName() +"\n"+ "Scientific Name: " + getScientificName()+"\n" + "Type: " + typeToString()+"\n" + "Flowers: " + flowersToString()+"\n" + "Fruits: "
                + fruitsToString()+"\n" + "Max Height: " + maxHeight;
    }
}
