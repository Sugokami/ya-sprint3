import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ya.praktikum.sprint3.SpeedLights;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SpeedLightsParamsTest {

    private int speedLimit;
    private int currentSpeed;
    private String expectedLight;

    public SpeedLightsParamsTest(int speedLimit, int currentSpeed, String expectedLight) {
        this.speedLimit = speedLimit;
        this.currentSpeed = currentSpeed;
        this.expectedLight = expectedLight;
    }
    @Parameterized.Parameters
    public static Object[][] dataGen() {
        return new Object[][] {
                {60, 50, "green"},
                {60, 70, "yellow"},
                {60, 90, "red"},

        };
    }

    @Test
    public void showLightWhen50ThenGreen() {
        SpeedLights lights = new SpeedLights(speedLimit);
        String value = lights.showLight(currentSpeed);
        assertEquals(expectedLight, value);
    }
}

