public class CarAccidentErrorHandling {

    public static void main(String[] args) {
        boolean majorAccident = true;
        if(majorAccident){
            simulateCarAccident(true);
        }
        else{
            simulateCarAccident(false);
        }
        simulateCarAccidentWithEngineFailure();
    }

    private static void simulateCarAccident(boolean majorAccident) throws AirbagDeploymentException, NoAirbagDeploymentException {
        try {
            if (majorAccident) {
                throw new AirbagDeploymentException("Airbags deployed");
            } else {
                throw new NoAirbagDeploymentException("No airbags deployed");
            }
        } catch (AirbagDeploymentException e) {
            System.out.println("Airbags deployed");
            callAmbulance();
        } catch (NoAirbagDeploymentException e) {
            System.out.println("No airbags deployed");
        } finally {
            cleanUpAccidentScene();
        }
        
    }

    private static void simulateCarAccidentWithEngineFailure() throws EngineFailureException {
        try{
            throw new EngineFailureException("Car engine malfunctioned during the accident");
        } catch (EngineFailureException e) {
            System.out.println("Car engine malfunctioned during the accident");
        } finally {
            towCar();
        }
    }

    private static void callAmbulance() {
        System.out.println("Calling ambulance...");
    }

    private static void cleanUpAccidentScene() {
        System.out.println("Cleaning up the accident scene...");
    }

    private static void towCar() {
        System.out.println("Towing the car...");
    }
}