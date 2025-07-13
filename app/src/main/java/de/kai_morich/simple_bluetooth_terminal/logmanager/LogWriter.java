package de.kai_morich.simple_bluetooth_terminal.logmanager;

import android.util.Log;

import de.kai_morich.simple_bluetooth_terminal.SerialLogObserver;

public class LogWriter implements SerialLogObserver {
    private static final String TAG = "!@# - LogWriter";

    @Override
    public void receiveLogs(String logs) {
        Log.d(TAG, "Logs received: " + logs);
    }
}
