package com.company;

import java.time.LocalTime;

public class AudioBook implements BookType{
    private FileInfo fragment;
    private LocalTime duration;
    private FileInfo audio;

    public AudioBook(FileInfo fragment, LocalTime duration, FileInfo audio) {
        this.fragment = fragment;
        this.duration = duration;
        this.audio = audio;
    }

    public FileInfo getFragment() {
        return fragment;
    }

    public void setFragment(FileInfo fragment) {
        this.fragment = fragment;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public FileInfo getAudio() {
        return audio;
    }

    public void setAudio(FileInfo audio) {
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
