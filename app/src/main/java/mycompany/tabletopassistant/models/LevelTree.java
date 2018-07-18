package mycompany.tabletopassistant.models;

import java.util.ArrayList;

public class LevelTree {
    private int currentLvl;
    private ArrayList<Level> levels;
    private boolean spellcaster;

    public int getCurrentLvl() {
        return currentLvl;
    }

    public void setCurrentLvl(int currentLvl) {
        this.currentLvl = currentLvl;
    }

    public ArrayList<Level> getLevels() {
        return levels;
    }

    public void setLevels(ArrayList<Level> levels) {
        this.levels = levels;
    }
    public boolean isSpellcaster() {
        return spellcaster;
    }

    public void setSpellcaster(boolean spellcaster) {
        this.spellcaster = spellcaster;
    }

    public String getSpellSlots(){
        return this.levels.get(currentLvl).getSpellSlots();
    }

    public void levelUp(ArrayList<Trait> traits){
        currentLvl ++;
        ArrayList<Trait> features = levels.get(currentLvl).getFeatures();
        int size = features.size();
        int index = 0;
        while(index<size){
            traits.add(features.get(index));
            index ++;
        }

    }

    public void levelDown(ArrayList<Trait> traits){
        ArrayList<Trait> features = levels.get(currentLvl).getFeatures();
        currentLvl--;
        int size = features.size();
        int index = 0;
        while (index<size){
            traits.remove(features.get(index));
            index++;
        }
    }
}
