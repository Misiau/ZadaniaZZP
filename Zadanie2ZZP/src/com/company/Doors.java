package com.company;

public class Doors {
    public boolean state;
    public boolean isLocked;

    public void Lock() {
        this.isLocked = true;
    }

    public void Unlock() {
        this.isLocked = false;
    }

    public void Open() {
        this.state = true;
    }

    public void Close() {
        this.state = false;
    }
}
