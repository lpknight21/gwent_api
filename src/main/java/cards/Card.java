package cards;

import com.google.gson.Gson;

import java.util.List;

public class Card {

    private String id;

    private String name;
    private String frame;
    private String rarity;
    private String text;
    private List<String> traits;
    private String faction;

    public Card() {
    }

    public Card(String name, String frame, String rarity, String text, String faction, List<String> traits) {
        this.name = name;
        this.frame = frame;
        this.rarity = rarity;
        this.text = text;
        this.traits = traits;
        this.faction = faction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getTraits() {
        return traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
