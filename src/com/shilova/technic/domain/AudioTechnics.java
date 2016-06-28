
package com.shilova.technic.domain;

public abstract class AudioTechnics extends Technics {
    
    private String audioType;
    private int hz;

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }


    public int getHz() {
        return hz;
    }


    public void setHz(int hz) {
        this.hz = hz;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
            .append(", audioType - ").append(getAudioType())
            .append(", frequency - ").append(getHz())
            .toString();
    }
    
    
}
