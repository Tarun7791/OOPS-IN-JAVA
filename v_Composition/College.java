package v_Composition;

public class College {

    private String collName;
    private int estYear;
    private final Department dept;

    public College(String collName,int estYear,String depname,String hodname ){
        this.collName=collName;
        this.estYear=estYear;
        dept=new Department(depname,hodname);
    }

    private class Department{

        private String depname;
        private String hodname;

        public Department(String depname,String hodname){
            this.depname=depname;
            this.hodname=hodname;
        }

        public String toString (){
            return "Department Name: "+this.depname +", Hod name "+this.hodname;
        }







    }

    public void showDetails(){
        System.out.println("College name is "+this.collName +"  Establishment year "+this.estYear);
        System.out.println("Department details "+dept);
    }














}
