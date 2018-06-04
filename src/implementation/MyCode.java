/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import code.GuiException;
import code.X509;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Enumeration;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import x509.v3.CodeV3;

/**
 *
 * @author AM
 */
public class MyCode extends CodeV3{

    public MyCode(boolean[] algorithm_conf, boolean[] extensions_conf, boolean extensions_rules) throws GuiException {
        super(algorithm_conf, extensions_conf, extensions_rules);
    }

    @Override
    public Enumeration<String> loadLocalKeystore() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new Enumeration<String>() {
            @Override
            public boolean hasMoreElements() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return false;
            }

            @Override
            public String nextElement() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return "";
            }
        };
    }

    @Override
    public void resetLocalKeystore() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int loadKeypair(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    @Override
    public boolean saveKeypair(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean removeKeypair(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean importKeypair(String string, String string1, String string2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean exportKeypair(String string, String string1, String string2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean importCertificate(String string, String string1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean exportCertificate(String string, String string1, int i, int i1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean exportCSR(String string, String string1, String string2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public String importCSR(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Not Implemented";
    }

    @Override
    public boolean signCSR(String string, String string1, String string2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean importCAReply(String string, String string1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public boolean canSign(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public String getSubjectInfo(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Not Implemented";
    }

    @Override
    public String getCertPublicKeyAlgorithm(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Not Implemented";
    }

    @Override
    public String getCertPublicKeyParameter(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Not Implemented";
    }
    
    public static void main(String[] args){
        
        // Wrapping main function of the project entry point, in case that that 
        // run starts from here.
        X509.main(args);
        
        // TODO code application logic here
    }
}
