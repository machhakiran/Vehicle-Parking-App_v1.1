package test.junit.com.gojek.parkinglot;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gojek.parkinglot.GojeckParkingProcesser;

/**
 * Created by Machha Kiran 05/11/2018.
 */
public class GojekParkingProcesserTest {
    GojeckParkingProcesser inputParser = new GojeckParkingProcesser();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    @Test
    public void parseTextInput() throws Exception {
        inputParser.processCommand("hello");
        assertEquals("Invalidinput", outContent.toString().trim().replace(" ", ""));
        inputParser.processCommand("status");
        assertEquals("Invalidinput\nSorry,parkinglotisnotcreated", outContent.toString().trim().replace(" ", ""));
    }

}