package com.example.storebeacons;

/**
 * Created by jelle on 30/03/2017.
 */

public class ColorHelper {

    public static int getResourceId(String kleur) {
        switch (kleur) {
            case "Green":
                return R.drawable.green;
            case "blue":
                return R.drawable.blue;
            case "Purple":
                return R.drawable.purple;
            case "Red":
                return R.drawable.red;
            default:
                return R.drawable.beacon;
        }
    }
}
