package com.alibou.example.AdvanceConcepts.LambdasStreamsExceptions;

import java.io.FileNotFoundException;

public class randomClass {
    void randomMethod(int x){
        try {
            randomMethod2(5);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally --> DB Connection Closed");
        }
    }
    void randomMethod2(int x) throws FileNotFoundException {
        if (x % 2 == 0 ){
            //Runtimr or Unchecked exceptions
            throw new NullPointerException();
        } else if (x % 2 != 0) {
            //Checked exception
            //Either throw exception or need to handle that exception
            throw new FileNotFoundException();
        }
    }
    // Test : https://docs.google.com/document/d/1o6FdM_3j4NacEfFVm3ZFAXu9I_dOp3oEBW056V72Y2Y/edit?tab=t.0#heading=h.m4vfwkjm2dgv
}
