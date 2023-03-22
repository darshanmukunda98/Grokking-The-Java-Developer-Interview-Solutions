package Error_showing_that_we_have_to_handle_most_specific_exceptions_first;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoException {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("");
        }catch(Exception e){
            e.printStackTrace();
        }/*catch (FileNotFoundException e){
            e.printStackTrace();
        }*/finally {
            System.out.println("Inside finally block");
        }

    }
}
