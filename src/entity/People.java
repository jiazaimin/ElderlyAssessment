package entity;

public class People {
    public String name;
    public String sex;
    public String birth;
    public String idcard;
    public String sscard;
    public String nation;
    public String culture;
    public String religion;
    public String marriage;
    public String live;
    public String medfee;
    public String finsource;
    public String silly;
    public String mental;
    public String chdisease;
    public String fall;
    public String lost;
    public String choke;
    public String death;
    public String other;

    public People(String name, String sex, String birth, String idcard, String sscard, String nation, String culture, String religion, String marriage, String live, String medfee, String finsource, String silly, String mental, String chdisease, String fall, String lost, String choke, String death, String other) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.idcard = idcard;
        this.sscard = sscard;
        this.nation = nation;
        this.culture = culture;
        this.religion = religion;
        this.marriage = marriage;
        this.live = live;
        this.medfee = medfee;
        this.finsource = finsource;
        this.silly = silly;
        this.mental = mental;
        this.chdisease = chdisease;
        this.fall = fall;
        this.lost = lost;
        this.choke = choke;
        this.death = death;
        this.other = other;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSscard() {
        return sscard;
    }

    public void setSscard(String sscard) {
        this.sscard = sscard;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public String getMedfee() {
        return medfee;
    }

    public void setMedfee(String medfee) {
        this.medfee = medfee;
    }

    public String getFinsource() {
        return finsource;
    }

    public void setFinsource(String finsource) {
        this.finsource = finsource;
    }

    public String getSilly() {
        return silly;
    }

    public void setSilly(String silly) {
        this.silly = silly;
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }

    public String getChdisease() {
        return chdisease;
    }

    public void setChdisease(String chdisease) {
        this.chdisease = chdisease;
    }

    public String getFall() {
        return fall;
    }

    public void setFall(String fall) {
        this.fall = fall;
    }

    public String getLost() {
        return lost;
    }

    public void setLost(String lost) {
        this.lost = lost;
    }

    public String getChoke() {
        return choke;
    }

    public void setChoke(String choke) {
        this.choke = choke;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Older{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", idcard='" + idcard + '\'' +
                ", sscard='" + sscard + '\'' +
                ", nation='" + nation + '\'' +
                ", culture='" + culture + '\'' +
                ", religion='" + religion + '\'' +
                ", marriage='" + marriage + '\'' +
                ", live='" + live + '\'' +
                ", medfee='" + medfee + '\'' +
                ", finsource='" + finsource + '\'' +
                ", silly='" + silly + '\'' +
                ", mental='" + mental + '\'' +
                ", chdisease='" + chdisease + '\'' +
                ", fall='" + fall + '\'' +
                ", lost='" + lost + '\'' +
                ", choke='" + choke + '\'' +
                ", death='" + death + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
