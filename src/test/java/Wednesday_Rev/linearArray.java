package Wednesday_Rev;

public class linearArray {
    public static void main(String[] args) {

        //create a loop with an LinearArray where varialbe are going to be for jobs

        String[] jobs = new String[]{"Accounting", "Analysts", "Optician", "QA"};
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i] == "QA") {
                System.out.println("my job is " + jobs[i]);
            } else if (jobs[i]=="Optician") {
                System.out.println("my job is " + jobs[i]);

            }//end of conditional statement

        }//end of loop
    } //end of main method
}//end of main
