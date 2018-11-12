package com.gojek.parkinglot;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
/**
 * @author L4932170
 *  Created by Machha Kiran 05/11/2018.

 * Vehicle Parking Management Solution Application . 
 */
public class GojeckParkingFacade {
    public Map<String, Method> commandsMap;

    public GojeckParkingFacade() {
        commandsMap = new HashMap<String, Method>();
        try {
            populateCommandsHashMap();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void populateCommandsHashMap() throws NoSuchMethodException {
        commandsMap.put("create_parking_lot", GojekParkingLot.class.getMethod("createParkingLot", String.class));
        commandsMap.put("park", GojekParkingLot.class.getMethod("park", String.class, String.class));
        commandsMap.put("leave", GojekParkingLot.class.getMethod("leave", String.class));
        commandsMap.put("status", GojekParkingLot.class.getMethod("status"));
        commandsMap.put("registration_numbers_for_cars_with_colour", GojekParkingLot.class.getMethod("getRegistrationNumbersFromColor", String.class));
        commandsMap.put("slot_numbers_for_cars_with_colour", GojekParkingLot.class.getMethod("getSlotNumbersFromColor", String.class));
        commandsMap.put("slot_number_for_registration_number", GojekParkingLot.class.getMethod("getSlotNumberFromRegNo", String.class));
    }
}
