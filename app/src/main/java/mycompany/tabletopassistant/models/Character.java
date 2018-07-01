package mycompany.tabletopassistant.models;

import java.util.ArrayList;

/**
 * Created by Nate on 6/3/2018.
 */

public class Character {
    private String name;
    private String playerName;
    private ArrayList<RPClass> rpc;
    private Race race;
    private String faction;
    private String Alignment;
    private RuleList rules;
    private String bonds;
    private String flaws;
    private String ideals;
    private Boolean spellCaster;
    private SpellBook spells;
    private int size;
    private int speed;
    private ArrayList<String> statNames;
    private ArrayList<Integer> statValues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<RPClass> getRpc() {
        return rpc;
    }

    public void setRpc(ArrayList<RPClass> rpc) {
        this.rpc = rpc;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getAlignment() {
        return Alignment;
    }

    public void setAlignment(String alignment) {
        Alignment = alignment;
    }

    public RuleList getRules() {
        return rules;
    }

    public void setRules(RuleList rules) {
        this.rules = rules;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public Boolean getSpellCaster() {
        return spellCaster;
    }

    public void setSpellCaster(Boolean spellCaster) {
        this.spellCaster = spellCaster;
    }

    public SpellBook getSpells() {
        return spells;
    }

    public void setSpells(SpellBook spells) {
        this.spells = spells;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<String> getStatNames() {
        return statNames;
    }

    public void setStatNames(ArrayList<String> statNames) {
        this.statNames = statNames;
    }

    public ArrayList<Integer> getStatValues() {
        return statValues;
    }

    public void setStatValues(ArrayList<Integer> statValues) {
        this.statValues = statValues;
    }
    public int findStatValue(String stat){
        int index = statNames.indexOf(stat);
        return index;
    }
}
