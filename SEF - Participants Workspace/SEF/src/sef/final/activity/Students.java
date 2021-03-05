class Stundets extends Person{
    String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public void whereStudy(){
        System.out.println("I am studying in " + this.school);
    }

    public static void main(String[] args) {
        Stundets Poll = new Stundets();
        Poll.setSchool("Rigas Technical University");
        Poll.whereStudy();
    }
}