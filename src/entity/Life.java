package entity;

public class Life {
    public String idcard;
    public String eat;
    public String shower;
    public String wash;
    public String wear;
    public String wc;
    public String walk;
    public String grade;

    public Life(String idcard, String eat, String shower, String wash, String wear, String wc, String walk, String grade) {
        this.idcard = idcard;
        this.eat = eat;
        this.shower = shower;
        this.wash = wash;
        this.wear = wear;
        this.wc = wc;
        this.walk = walk;
        this.grade = grade;
    }

    public Life(String eat, String shower, String wash, String wear, String wc, String walk, String grade) {
        this.eat = eat;
        this.shower = shower;
        this.wash = wash;
        this.wear = wear;
        this.wc = wc;
        this.walk = walk;
        this.grade = grade;
    }

    public Life() {
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getShower() {
        return shower;
    }

    public void setShower(String shower) {
        this.shower = shower;
    }

    public String getWash() {
        return wash;
    }

    public void setWash(String wash) {
        this.wash = wash;
    }

    public String getWear() {
        return wear;
    }

    public void setWear(String wear) {
        this.wear = wear;
    }

    public String getWc() {
        return wc;
    }

    public void setWc(String wc) {
        this.wc = wc;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Life{" +
                "idcard='" + idcard + '\'' +
                ", eat='" + eat + '\'' +
                ", shower='" + shower + '\'' +
                ", wash='" + wash + '\'' +
                ", wear='" + wear + '\'' +
                ", wc='" + wc + '\'' +
                ", walk='" + walk + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
