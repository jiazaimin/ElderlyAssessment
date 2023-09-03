package entity;

public class Spirit {
    public String idcard;
    public String know;
    public String attack;
    public String depression;
    public String grade;

    public Spirit(String idcard, String know, String attack, String depression, String grade) {
        this.idcard = idcard;
        this.know = know;
        this.attack = attack;
        this.depression = depression;
        this.grade = grade;
    }

    public Spirit(String know, String attack, String depression, String grade) {
        this.know = know;
        this.attack = attack;
        this.depression = depression;
        this.grade = grade;
    }

    public Spirit() {
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getKnow() {
        return know;
    }

    public void setKnow(String know) {
        this.know = know;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDepression() {
        return depression;
    }

    public void setDepression(String depression) {
        this.depression = depression;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Spirit{" +
                "idcard='" + idcard + '\'' +
                ", know='" + know + '\'' +
                ", attack='" + attack + '\'' +
                ", depression='" + depression + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
