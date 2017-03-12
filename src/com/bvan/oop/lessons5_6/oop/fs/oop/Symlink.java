package com.bvan.oop.lessons5_6.oop.fs.oop;

/**
 * @author bvanchuhov
 */
public class Symlink extends NamedFSItem {

    public Symlink(String name) {
        super(name);
    }

    public Symlink() {
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "s";
    }
}
