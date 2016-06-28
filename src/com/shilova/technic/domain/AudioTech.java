/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shilova.technic.domain;

/**
 *
 * @author Юля
 */
public abstract class AudioTech extends Technic {
    
    private String audioType;
    private int gerc;

    /**
     * @return the audioType
     */
    public String getAudioType() {
        return audioType;
    }

    /**
     * @param audioType the audioType to set
     */
    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    /**
     * @return the gerc
     */
    public int getGerc() {
        return gerc;
    }

    /**
     * @param gerc the gerc to set
     */
    public void setGerc(int gerc) {
        this.gerc = gerc;
    }

    @Override
    public String toString() {
        return super.toString() + "audioType=" + getAudioType() + ", gerc=" + getGerc();
    }
    
    
}
