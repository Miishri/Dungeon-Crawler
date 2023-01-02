package MainFiles.items;

public class Rarity{
    //common, rare, epic, legendary
    private String rarity;

    public Rarity (String howRare){
        //check if within rarity
        if (howRare.equals("common") ||
                howRare.equals("rare") ||
                howRare.equals("epic") ||
                howRare.equals("legendary")){
            rarity = howRare;
        }else {
            rarity = "common";
        }
    }
    //get rarity on call
    public String getRarity() {
        return rarity;
    }

    //set rarity on upgrade
    public void setRarity(String raritySet){
        if (raritySet.equals("common") ||
                raritySet.equals("rare") ||
                raritySet.equals("epic") ||
                raritySet.equals("legendary")){
            rarity = raritySet;
        }else {
            if (rarity.equals("legendary")){
                System.out.println("ITEM RARITY IS MAX");
            }else {
                System.out.println("RARITY DOES NOT EXIST!");
            }
        }
    }
}
