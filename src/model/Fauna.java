package model;

public class Fauna extends Species {
    private Boolean migratory;
    private double maximumWeight;

    public Fauna(String name, String scientificName, Boolean migratory, double maximumWeight, SpeciesType type) {
        super(name,scientificName,type);
        this.migratory = migratory;
        this.maximumWeight = maximumWeight;
    }

    public Boolean getMigratory() {
        return migratory;
    }

    public void setMigratory(Boolean migratory) {
        this.migratory = migratory;
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public String migratoryToString() {
        if (migratory) {
            return "yes";
        } else {
            return "no";
        }
    }

    @Override
    public String typeToString(){
        String typeString= "";
        if (getType() == SpeciesType.BIRD) {
            typeString= "Fauna : bird";
        } else if (getType() == SpeciesType.MAMMAL) {
            typeString= "Fauna : mammal";
        } else if (getType() == SpeciesType.AQUATIC_FAUNA) {
            typeString= "Fauna :  aquatic ";
            
        }
        return typeString;
    }
    @Override
    public String toString() {
        return "Name: "+getName()+"\n"+"Scientific Name: "+getScientificName()+"\n"+"Type: "+typeToString()+"\n"+"migratory :" + migratoryToString()+"\n" + "maximumWeight :" + maximumWeight;
    }


}


