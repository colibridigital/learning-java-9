package Product2.Composition;

public class Skill {
    private String skillName;
    private String skillCategory;
    private int skillRank;

    public Skill() {
    }

    public Skill(String skillName, String skillCategory, int skillRank) {
        this.skillName = skillName;
        this.skillCategory = skillCategory;
        this.skillRank = skillRank;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(String skillCategory) {
        this.skillCategory = skillCategory;
    }

    public int getSkillRank() {
        return skillRank;
    }

    public void setSkillRank(int skillRank) {
        this.skillRank = skillRank;
    }
}
