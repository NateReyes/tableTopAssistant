package mycompany.tabletopassistant.models;

import java.util.ArrayList;

public class Level {
    private int lvl;
    private int proficiencyBonus;
    private ArrayList<Trait> features;
    private String spellSlots;
    private String spellsKnowFormual;
    private int spellsKnow;
    private String spellsPreparedFormual;
    private int spellsPrepared;

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public ArrayList<Trait> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Trait> features) {
        this.features = features;
    }

    public String getSpellSlots() {
        return spellSlots;
    }

    public void setSpellSlots(String spellSlots) {
        this.spellSlots = spellSlots;
    }

    public String getSpellsKnowFormual() {
        return spellsKnowFormual;
    }

    public void setSpellsKnowFormual(String spellsKnowFormual) {
        this.spellsKnowFormual = spellsKnowFormual;
    }

    public int getSpellsKnow() {
        return spellsKnow;
    }

    public void setSpellsKnow(int spellsKnow) {
        this.spellsKnow = spellsKnow;
    }

    public String getSpellsPreparedFormual() {
        return spellsPreparedFormual;
    }

    public void setSpellsPreparedFormual(String spellsPreparedFormual) {
        this.spellsPreparedFormual = spellsPreparedFormual;
    }

    public int getSpellsPrepared() {
        return spellsPrepared;
    }

    public void setSpellsPrepared(int spellsPrepared) {
        this.spellsPrepared = spellsPrepared;
    }
    public int calcSpellsKnow(Character c){
        String spellsKnowFormualTemp=spellsKnowFormual;
        String stat=parseStat(spellsKnowFormualTemp);
        int count=0;
        while(spellsKnowFormualTemp.length()>1){
            if(stat.equals("proficiencyBonus")){
                count+=this.proficiencyBonus;
            }
            else {
                count += c.findStatValue(stat);
            }
            spellsKnowFormualTemp  = spellsKnowFormualTemp.substring(stat.length());
        }
        this.spellsKnow = count;
        return count;
    }

    public int calcSpellsPrepared (Character c){
        String spellsPreparedFormualTemp=spellsPreparedFormual;
        String stat=parseStat(spellsPreparedFormualTemp);
        int count=0;
        while(spellsPreparedFormual.length()>1){
            count +=c.findStatValue(stat);
            spellsPreparedFormual  = spellsPreparedFormual.substring(stat.length());
        }
        this.spellsKnow = count;
        return count;
    }

    public String parseStat(String stats){
        String firstStat = stats.substring(0,stats.indexOf(';'));
        return firstStat;
    }
}
