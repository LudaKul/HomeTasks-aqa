package School_OOP;

public class Secondary_School extends School implements Task, StartOfClasses {
    public Secondary_School() {
        this.setClassNumber(5);
        this.setCountPupil(250);
        this.setUseSlogan("Study, study and study again!");
        this.setNameTeacher("Sidorov Sidorov");
    }

   @Override
    public String generalTask() {
        return "Write a schedule";
    }

    @Override
    public int getStartTime() {
        return SCHOOL_START + 5;
    }

    @Override
    public int getEndTime() {
        return SCHOOL_END - 1;
    }

   @Override
   public String toString() {
       return "School_OOP.Secondary_School:\n" +
               "classNumber=" + getClassNumber() + "\n" +
               "countPupil=" + getCountPupil() + "\n" +
               "useSlogan='" + getUseSlogan() + "'\n" +
               "nameTeacher='" + getNameTeacher() + "'\n" +
               "startTime=" + getStartTime() + "\n" +
               "endTime=" + getEndTime();
   }
}
