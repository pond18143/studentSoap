/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsoapclient;

import serviceClient.Student;

/**
 *
 * @author poramet
 */
public class StudentSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insertStudent(1,"pond",3.9);
        findStudentById(1);
        updateStudentByid(1,"newpond",4.0);
        removeStudentById(1);
    }

    private static Student findStudentById(int id) {
        serviceClient.StudentWebService_Service service = new serviceClient.StudentWebService_Service();
        serviceClient.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }

    private static Student insertStudent(int id, String name, double gpa) {
        serviceClient.StudentWebService_Service service = new serviceClient.StudentWebService_Service();
        serviceClient.StudentWebService port = service.getStudentWebServicePort();
        return port.insertStudent(id, name, gpa);
    }

    private static Student updateStudentByid(int id, String name, double gpa) {
        serviceClient.StudentWebService_Service service = new serviceClient.StudentWebService_Service();
        serviceClient.StudentWebService port = service.getStudentWebServicePort();
        return port.updateStudentByid(id, name, gpa);
    }

    private static Student removeStudentById(int id) {
        serviceClient.StudentWebService_Service service = new serviceClient.StudentWebService_Service();
        serviceClient.StudentWebService port = service.getStudentWebServicePort();
        return port.removeStudentById(id);
    }

}
