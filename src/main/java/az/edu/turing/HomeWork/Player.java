package az.edu.turing.HomeWork;


public class Player {
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
