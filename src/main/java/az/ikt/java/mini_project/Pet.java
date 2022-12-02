package az.ikt.java.mini_project;

import java.util.Arrays;

public class Pet extends Main{
   private Species species;
   private String nickname;
   private int age;
   private int trickLevel;
   private String[] habits;

    public Pet() {
    }

    Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        setTrickLevel(trickLevel);
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel> 0 && trickLevel <= 100)
            this.trickLevel=trickLevel;
        else
            System.out.println("TrickLevel is not correct");
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String eat()
    {
        return "I am eating";
    }
        public void respond() {
            System.out.println("Hello, owner. I am - "+ nickname +". I miss you!");
        }

        public void foul() {
            System.out.println("I need to cover it up");
        }

    @Override
    public String toString() {
        return  species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running...");
    }
}

