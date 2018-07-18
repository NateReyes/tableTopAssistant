package mycompany.tabletopassistant.models;

public class Skill {
    private String name;
    private boolean proficient;
    private String statName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProficient() {
        return proficient;
    }

    public void setProficient(boolean proficient) {
        this.proficient = proficient;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public int calcBonus(Character c){
        if(proficient){
            return c.getProieciencyBonus() + c.findStatValue(statName);
        }
        else{
            return c.getProieciencyBonus();
        }

    }
}
