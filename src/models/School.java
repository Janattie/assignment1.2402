package models;

import java.util.List;
import java.util.ArrayList;

public class School {
    List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public List<Person> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person member : members) {
            sb.append(member.toString()).append("\n"+"\n");
        }
        return sb.toString();
    }
}