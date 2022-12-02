package az.ikt.java.mini_project;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void deleteChild(Human child) {
        if (children.length == 0)
            System.out.println("Child is not exist!");
        else {
            Human[] children1 = new Human[children.length - 1];
            for (int i = 0; i < children.length; i++) {
                if (child != children[i])
                    children1[i] = children[i];
            }
            children = children1;
        }
    }

    public void addChild(Human child) {
        if (children == null) {
            children = new Human[1];
            children[0] = child;
        } else {
            Human[] children2 = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                children2[i] = children[i];
            }
            children2[children2.length - 1] = child;
            children = children2;
        }
    }

    public Family() {
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", \nfather=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running...");
    }
}
