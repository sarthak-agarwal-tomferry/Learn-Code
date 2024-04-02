public class CarAccidentErrorHandling {

    public static void main(String[] args) {
        try {
            simulateCarAccident(true);
        } catch (AirbagDeploymentException e) {
            System.out.println("Airbags deployed");
        } finally {
            callAmbulance();
        }

        try {
            simulateCarAccident(false);
        } catch (NoAirbagDeploymentException e) {
            System.out.println("No airbags deployed");
        } finally {
            cleanUpAccidentScene();
        }

        try {
            simulateCarAccidentWithEngineFailure();
        } catch (EngineFailureException e) {
            System.out.println("Car engine malfunctioned during the accident");
        } finally {
            towCar();
        }
    }

    private static void simulateCarAccident(boolean majorAccident) throws AirbagDeploymentException, NoAirbagDeploymentException {
        if (majorAccident) {
            throw new AirbagDeploymentException("Airbags deployed");
        } else {
            throw new NoAirbagDeploymentException("No airbags deployed");
        }
    }

    private static void simulateCarAccidentWithEngineFailure() throws EngineFailureException {
        throw new EngineFailureException("Car engine malfunctioned during the accident");
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