package mycompany.tabletopassistant.models;

import java.util.ArrayList;

public class Race {
    private Race SubRace;
    private ArrayList<String> descriptions;
    private ArrayList<String> descriptionTitles;
    private String abilityScoreImprovement;
    private String averageLifeSpan;
    private ArrayList<Trait> traits;
    private String proficiencies;
    private String languages;

    public Race getSubRace() {
        return SubRace;
    }

    public void setSubRace(Race subRace) {
        SubRace = subRace;
    }

    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<String> descriptions) {
        this.descriptions = descriptions;
    }

    public ArrayList<String> getDescriptionTitles() {
        return descriptionTitles;
    }

    public void setDescriptionTitles(ArrayList<String> descriptionTitles) {
        this.descriptionTitles = descriptionTitles;
    }

    public String getAbilityScoreImprovement() {
        return abilityScoreImprovement;
    }

    public void setAbilityScoreImprovement(String abilityScoreImprovement) {
        this.abilityScoreImprovement = abilityScoreImprovement;
    }

    public String getAverageLifeSpan() {
        return averageLifeSpan;
    }

    public void setAverageLifeSpan(String averageLifeSpan) {
        this.averageLifeSpan = averageLifeSpan;
    }

    public ArrayList<Trait> getTraits() {
        return traits;
    }

    public void setTraits(ArrayList<Trait> traits) {
        this.traits = traits;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
