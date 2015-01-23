package com.vaslabs.sdc.tests;

import com.vaslabs.sdc.connectivity.ActionResponderFactory;
import com.vaslabs.sdc.connectivity.ConnectionChangedConnectivityActionResponder;
import com.vaslabs.sdc.connectivity.ConnectivityActionResponder;
import com.vaslabs.sdc.connectivity.PeersChangedConnectivityActionResponder;
import com.vaslabs.sdc.connectivity.StateChangedConnectivityActionResponder;
import com.vaslabs.sdc.connectivity.WifiStateChangedConnectivityActionResponder;

import android.net.wifi.p2p.WifiP2pManager;
import android.test.AndroidTestCase;

public class TestWirelessBroadcastReceiverStates extends AndroidTestCase {
    
    
    public void test_that_correct_instance_is_initialised_from_action() {
        ConnectivityActionResponder car = 
                ActionResponderFactory.getResponder( WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION );
        assertTrue( car instanceof StateChangedConnectivityActionResponder );
        car = 
                ActionResponderFactory.getResponder( WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION );
        assertTrue( car instanceof PeersChangedConnectivityActionResponder );
        
        car = 
                ActionResponderFactory.getResponder( WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION );
        assertTrue( car instanceof ConnectionChangedConnectivityActionResponder );
        
        car = 
                ActionResponderFactory.getResponder( WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION );
        assertTrue( car instanceof WifiStateChangedConnectivityActionResponder );
        
        
    }
    
}
