import Personage.Personage;

import java.util.ArrayList;
import java.util.List;

public class World_of_Warcraft {
    private final List<Personage> personages = new ArrayList<>();

    public String winnerDuel(Personage p1, Personage p2) {
        int dangerCapacityP1 = p1.getEnergyLevel() * p1.getOffensiveCapacity() - p1.getDefensiveCapacity();
        int dangerCapacityP2 = p2.getEnergyLevel() * p2.getOffensiveCapacity() - p2.getDefensiveCapacity();

        return dangerCapacityP1 > dangerCapacityP2 ? p1.getId() : p2.getId();
    }
    public int PersonageLessVictory(int[][] statistics){
        int lesserVictoriesIndex = 0;
        int victoriesValue = statistics[0][0];

        for(int i = 0; i < statistics.length; i++){
            if(statistics[i][0] < victoriesValue){
                lesserVictoriesIndex = i;
                victoriesValue = statistics[i][0];
            }
        }

        return lesserVictoriesIndex;
    }

    public String moreHordesAlliance(){
        int quantityHordes = (int) personages.stream().filter(p -> p.getBreed() == 'T' || p.getBreed() == 'O' || p.getBreed() == 'M').count();
        return personages.size() - quantityHordes < quantityHordes ? "Hordes" : "Alliance";
    }

    public int quantityPersonagesByBreed(String breed){
        char[] auxBreed = new char[1];

        switch (breed){
            case "Humano" -> auxBreed[0] = 'H';
            case "Elfos" -> auxBreed[0] = 'F';
            case "Enanos" -> auxBreed[0] = 'E';
            case "Trolls" -> auxBreed[0] = 'T';
            case "Orcos" -> auxBreed[0] = 'O';
            case "Muertos" -> auxBreed[0] = 'M';
        }

        return (int) personages.stream().filter(personage -> personage.getBreed() == auxBreed[0]).count();
    }

    public List<Personage> getPersonages() {
        return personages;
    }
}
