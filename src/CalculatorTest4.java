public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        System.out.println("Table Total (all party attendees):" +
        (calc.findTotal(10, "Lisa", 0)
        + calc.findTotal(12, "Alyssa", 0)
        + calc.findTotal(9,  "William", 0)
        + calc.findTotal(8,  "Alan", 0)
        + calc.findTotal(7,  "Gary", 0)
        + calc.findTotal(15, "Alex", 0)
        + calc.findTotal(11, "Jian", 0)
        + calc.findTotal(30, "Bruce", 0)) + "\n\n") ;

        //Bruce(person8) forgot his wallet!!  Alex's (person6) meal was supposed to be a
       //birthday present.  
       //Modify findTotal() so that the cost of their meals are shared 
       //equally with the rest of the party.
       
       //possible solution:
       //Alex's meal was $15, Bruce's meal was $30
       //Total for both to be split between the remaining guests is $45
       //To modify findTotal(), we will add another parameter, extra
       
        System.out.println("Table Total(Without Alex and Bruce): " + 
         (calc.findTotal(10, "Lisa", (45.0/6))     
        + calc.findTotal(12, "Alyssa", (45.0/6))
        + calc.findTotal(9,  "William",(45.0/6))
        + calc.findTotal(8,  "Alan", (45.0/6))
        + calc.findTotal(7,  "Gary", (45.0/6))
        + calc.findTotal(11, "Jian", (45.0/6))) + "\n\n");
    } 
}
