/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networksList) {
        this.networkList = networksList;
    }

    public Network createAndAddNetwork(String name) {
        Network network = new Network();
        networkList.add(network);
        network.setName(name);
        return network;
    }
}
