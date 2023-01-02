package ru.netology.Design.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void ChangeStations() {
        Radio cond = new Radio();

        cond.StationNumber = 9;

        int expected = 9;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void ChangeVolume() {
        Radio cond = new Radio();

        cond.SoundVolume = 10;

        int expected = 10;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }

}
