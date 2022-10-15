package ya.praktikum.sprint3;

public class SpeedLights {
    private final int speedLimit;

    public SpeedLights(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    /**
     *
     * если нет превышения -green
     * если превышение <= 20 км - yellow
     * если превышение > 20 - red
     */
    public String showLight(int currentSpeed) {
        if (currentSpeed <= speedLimit)
            return "green";
        else if (currentSpeed <= speedLimit +20)
            return "yellow";
        else
            return "red";
    }

}
