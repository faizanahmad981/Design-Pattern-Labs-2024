/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.bridge;

/**
 *
 * @author Faizan
 */
public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

   
    public boolean isEnabled() {
        return on;
    }

   
    public void enable() {
        on = true;
    }

   
    public void disable() {
        on = false;
    }

   
    public int getVolume() {
        return volume;
    }

   
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    
    public int getChannel() {
        return channel;
    }


    public void setChannel(int channel) {
        this.channel = channel;
    }

    
    public void printStatus() {
        System.out.println("-----------------------");
        System.out.println("| I'm Radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("-------------------------\n");
    }
}

