package School_OOP;

public class Primary_School extends School implements Task, StartOfClasses {

    int bonuses;

    public Primary_School() {
        this.setClassNumber(4);
        this.setCountPupil(100);
        this.setUseSlogan("We learn by playing");
        this.setBonuses(375);
        this.setNameTeacher("Ivanov Ivanov");
    }

    public int getBonuses() {
        return bonuses;
    }

    public void setBonuses(int bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    public String generalTask() {
        return "Get help from from each class";
    }

    @Override
    public int getStartTime() {
        return SCHOOL_START + 1;
    }

    @Override
    public int getEndTime() {
        return SCHOOL_END - 6;
    }

    @Override
    public String toString() {
        return "School_OOP.Primary_School:\n" +
                "classNumber=" + getClassNumber() + "\n" +
                "countPupil=" + getCountPupil() + "\n" +
                "useSlogan='" + getUseSlogan() + "'\n" +
                "nameTeacher='" + getNameTeacher() + "'\n" +
                "bonuses=" + getBonuses() + "\n" +
                "startTime=" + getStartTime() + "\n" +
                "endTime=" + getEndTime();
    }
}
