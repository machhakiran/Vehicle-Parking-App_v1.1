package test.junit.com.gojek.parkinglot;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.gojek.parkinglot.GojeckParkingFacade;


/**
 * Created by Machha Kiran 05/11/2018.
 */
public class GojekParkingActivitesTest {
    GojeckParkingFacade commands = new GojeckParkingFacade();
    
    @Test
    public void checkCommandInList() throws Exception {
        assertFalse(commands.commandsMap.isEmpty());
        assertTrue(commands.commandsMap.containsKey("create_parking_lot"));
        assertFalse(commands.commandsMap.containsKey("mytestcommand"));
    }
}