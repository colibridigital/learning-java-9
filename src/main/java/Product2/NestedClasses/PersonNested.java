package Product2.NestedClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonNested {
    private Job job;
    private List<Skill> skills = new ArrayList<>();

    public PersonNested() {
        this.job = new Job();

        //Note direct access to a private field
        job.salary = 1000L;

        Skill skill = new Skill();
        skill.skillName = "Java developer";
        skill.skillCategory = "IT";
        skill.skillRank = 1;

        Skill skill2 = new Skill();
        skill2.skillName = "Project Manager";
        skill2.skillCategory = "IT";
        skill2.skillRank = 2;

        skills.add(skill);
        skills.add(skill2);
    }

    public long getSalary() {
        //Access private field directly
        return job.salary;
    }

    public List<String> getSkillNames() {
        //Access private field directly
        return skills.stream().map(skill -> skill.skillName).collect(Collectors.toList());
    }

    class Job {
        private String role;
        private long salary;
        private int id;
    }

    class Skill {
        private String skillName;
        private String skillCategory;
        private int skillRank;
    }
}
