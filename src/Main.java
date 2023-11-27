class GoodStudentDriver {
    public static void main(String[] args)
    {
        //instantiations
        GoodStudent alan = new GoodStudent("Alan", "Turing", "Big Al", "191254", 3.56, "Yes");
        GoodStudent flor = new GoodStudent("Florence", "Nightingale", "", "182010", 3.89, "No");
        GoodStudent grace = new GoodStudent("Grace", "Hopper", "Queen Bee", "190692", 3.99, "Yes");

        //Alan toString
        System.out.println(alan.toString());

        //Florence nickname and gpa
        flor.setNickName("Flo-No");
        flor.setGPA(3.92);
        System.out.println();
        System.out.println(flor.getNickName() + " GPA: " + flor.getGPA());

        //Grace name and cs status
        System.out.println();
        System.out.println(grace.getFirstName() + ": \nCS status: " + grace.getCS());

        //CreateID's for all
        System.out.println();
        System.out.println(alan.createID());
        System.out.println(flor.createID());
        System.out.println(grace.createID());

        //CSGPA for all
        System.out.println();
        System.out.println(alan.CSGPA());
        System.out.println(flor.CSGPA());
        System.out.println(grace.CSGPA());
    }
}