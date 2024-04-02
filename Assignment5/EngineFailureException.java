class EngineFailureException extends Exception {
    public EngineFailureException(String message) {
        System.out.println("EngineFailureException: " + message);
    }
}