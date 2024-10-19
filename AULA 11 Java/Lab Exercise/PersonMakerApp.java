public class PersonMakerApp {

    public static void main(String[] args) {
        // Create an Athlete object
        Athlete athlete1 = new Athlete("John", "Basketball");

        // Use inherited methods from Person
        athlete1.checkEnergy();
        athlete1.sleepWell();
        athlete1.checkEnergy();

        // Use overridden workOut method

        athlete1.checkPerformance();
        athlete1.workOut();
        athlete1.workOut();
        athlete1.workOut();
        athlete1.checkPerformance();
        athlete1.workOut();
        athlete1.workOut();
        athlete1.checkPerformance();

        // Use feedAthlete method
        athlete1.feedAthlete();
        athlete1.feedAthlete();
        athlete1.checkPerformance();
        
    }
}
