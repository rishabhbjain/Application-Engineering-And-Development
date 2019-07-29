/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author rishabhjain
 */
public class InventoryDirectory {
    private ArrayList<Inventory> inventoryList;

    public InventoryDirectory() {
        inventoryList = new ArrayList<>();
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }
    
    public Inventory createInventory(String name){
        Inventory inventory = new Inventory();
        inventory.setName(name);
        inventoryList.add(inventory);
        return inventory;
    } 
}
