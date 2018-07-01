package mycompany.tabletopassistant.models;

public class Trait {
    private String name;
    private String description;
    private String shorthand;
    private boolean useage;
    private int numUses;
    private int modifier;
    private String modified;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShorthand() {
        return shorthand;
    }

    public void setShorthand(String shorthand) {
        this.shorthand = shorthand;
    }

    public boolean isUseage() {
        return useage;
    }

    public void setUseage(boolean useage) {
        this.useage = useage;
    }

    public int getNumUses() {
        return numUses;
    }

    public void setNumUses(int numUses) {
        this.numUses = numUses;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
}
