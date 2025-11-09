package School_OOP;

public class FirstClass extends Primary_School {
    public FirstClass(){
        this.setClassNumber(1);
        this.setCountPupil(23);
        this.setUseSlogan("Let's learn with pleasure");
        this.setNameTeacher("Petrov Petrov");
        this.setBonuses(50);
    }

    @Override
    public String generalTask() {
        return "Send a message to parents";
    }

    @Override
    public int getStartTime() {
        return super.getStartTime() +1;
    }

    @Override
    public int getEndTime() {
        return super.getEndTime() -1;
    }

    @Override
    public String toString() {
        return "School_OOP.FirstClass:\n" +
                "classNumber=" + getClassNumber() + "\n" +
                "countPupil=" + getCountPupil() + "\n" +
                "useSlogan='" + getUseSlogan() + "'\n" +
                "nameTeacher='" + getNameTeacher() + "'\n" +
                "bonuses=" + getBonuses() + "\n" +
                "generalTask='" + generalTask() + "'\n" +
                "startTime=" + getStartTime() + "\n" +
                "endTime=" + getEndTime();
    }
    public void winnersFromFC(OlympiadWinners lastNames){
        System.out.println(lastNames.winnerNames());
    }
}
