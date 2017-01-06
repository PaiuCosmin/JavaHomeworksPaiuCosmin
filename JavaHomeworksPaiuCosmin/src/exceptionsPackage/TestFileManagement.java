/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsPackage;
import exceptionsPackage.FilesManagement;
/**
 *
 * @author Andromeda
 */
public class TestFileManagement {
    public static void main (String[]args){
    FilesManagement.WriteInFile();
    FilesManagement.ReadFromFile();
    FilesManagement.WriteInEmptyFile();
    FilesManagement.DeleteContentOfFile();
    }
}
