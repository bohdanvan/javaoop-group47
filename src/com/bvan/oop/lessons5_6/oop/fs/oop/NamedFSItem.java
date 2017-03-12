package com.bvan.oop.lessons5_6.oop.fs.oop;

/**
 * @author bvanchuhov
 */
public abstract class NamedFSItem implements FSItem {

    private final String name;

    public NamedFSItem(String name) {
        this.name = name;
    }

    public NamedFSItem() {
        this("unnamed");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract int getSize();
}
