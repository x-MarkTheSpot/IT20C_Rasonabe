
package javaapplication9;

public class JavaApplication9 {


    public static void main(String[] args) {
        String[][] geno = {
            {"*" + " " +  " " + "*" + "*" + "*" + "*"},
            {"*" + " " +  " " + "*" + " " + " " + " "},
            {"*" + " " +  " " + "*" + " " + " " + " "},
            {"*" + "*" +  "*" + "*" + "*" + "*" + "*"},
            {" " + " " +  " " + "*" + " " + " " + "*"},
            {" " + " " +  " " + "*" + " " + " " + "*"},
            {"*" + "*" +  "*" + "*" + " " + " " + "*"},
        };
        for (int i=0;i<geno.length;i++){
            for (int j=0; j<geno[i].length;j++){
                System.out.print(geno[i][j]);
            }
            System.out.println(" ");
        }
    }               
    
    }

