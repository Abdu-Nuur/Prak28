package com.company;

public class AudioBook implements BookType{
    private String fragment;
    private String duration;
    private String audio;

    public AudioBook(String fragment, String duration, String audio) {
        this.fragment = fragment;
        this.duration = duration;
        this.audio = audio;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "AudioBook " +
                "fragment = " + fragment +
                "  duration = " + duration +
                "  audio = " + audio +
                ' ';
    }
}
