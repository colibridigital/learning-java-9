package Product2.Composition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    //Composition has-a relationships
    private Job job;
    private List<Skill> skills = new ArrayList<>();

    public Person() {
        this.job = new Job();
        job.setSalary(1000L);

        Skill skill = new Skill();
        skill.setSkillName("Java developer");
        skill.setSkillCategory("IT");
        skill.setSkillRank(1);

        Skill skill2 = new Skill();
        skill2.setSkillName("Project manager");
        skill2.setSkillCategory("IT");
        skill2.setSkillRank(2);

        skills.add(skill);
        skills.add(skill2);
    }

    public long getSalary() {
        return job.getSalary();
    }

    public List<String> getSkillNames() {
        return skills.stream().map(skill -> skill.getSkillName()).collect(Collectors.toList());
    }
}
