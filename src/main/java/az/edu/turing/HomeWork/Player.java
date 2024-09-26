package az.edu.turing.HomeWork;

import java.util.Comparator;

public class Player implements Comparator<Player> {
    private Integer id;
    private String name;
    private Integer age;
    private Double score;
    private Boolean isFemale;


    public Player() {
    }

    public Player(Integer id, String name, Integer age, Double score, Boolean isFemale) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.isFemale = isFemale;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Boolean getFemale() {
        return isFemale;
    }

    public void setFemale(Boolean female) {
        isFemale = female;
    }

    @Override
    public int compare(Player p1, Player p2) {
        int scoreComparison = p2.getScore().compareTo(p1.getScore());
        if (scoreComparison != 0) {
            return scoreComparison;
        }
        int genderComparison=p2.getFemale().compareTo(p1.getFemale());
        if(genderComparison!=0){
            return genderComparison;
        }
        int ageComparison=p1.getAge().compareTo(p2.getAge());
        if(ageComparison!=0){
            return ageComparison;
        }
        int nameComparison=p2.getName().compareTo(p1.getName());
        if(nameComparison!=0){
            return nameComparison;
        }
        return p1.getId().compareTo(p2.getId());

    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", isFemale=" + isFemale +
                '}';
    }
}
