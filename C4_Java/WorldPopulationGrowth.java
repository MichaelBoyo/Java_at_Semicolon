package C4_Java;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double currentWorldPopulation = 7.80;
        double populationGrowthRate = 0.01;

        double newPopulation;
        double increase;
        int j;

            for( j=1; j<=100; j++){
                newPopulation =( currentWorldPopulation+ (currentWorldPopulation * (populationGrowthRate * j)) );
                increase =(currentWorldPopulation * (populationGrowthRate));
                System.out.printf("Year%d    %.3fBn    %f%n",j,newPopulation, increase);
            }
    }
}
