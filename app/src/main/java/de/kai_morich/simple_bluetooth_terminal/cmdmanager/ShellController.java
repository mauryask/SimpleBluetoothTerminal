package de.kai_morich.simple_bluetooth_terminal.cmdmanager;

import android.util.Log;

import de.kai_morich.simple_bluetooth_terminal.SerialLogObserver;

public class ShellController implements SerialLogObserver {
    private static final String TAG = "!@# - ShellController";
    @Override
    public void receiveLogs(String logs) {
        Log.d(TAG, "Logs received: "+ logs);
    }
}
