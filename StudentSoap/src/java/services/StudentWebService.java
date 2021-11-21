/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Student;
import model.StudentTable;

/**
 *
 * @author poramet
 */
@WebService(serviceName = "StudentWebService")
public class StudentWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findStudentById")
    public Student findStudentById(@WebParam(name = "id") int id) {
        Student stuObj = StudentTable.findStudentById(id);
        return stuObj;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertStudent")
    public Student insertStudent(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        Student stuObj = new Student();
        stuObj.setId(id);
        stuObj.setName(name);
        stuObj.setGpa(gpa);
        StudentTable.insertStudent(stuObj);
        return stuObj;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateStudentByid")
    public Student updateStudentByid(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        Student stuObj = new Student();
        stuObj.setId(id);
        stuObj.setName(name);
        stuObj.setGpa(gpa);
        Student update = StudentTable.updateStudent(stuObj);
        if (update == null) {
            return null;
        }
        return stuObj;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "removeStudentById")
    public Student removeStudentById(@WebParam(name = "id") int id) {
        Student stuObj = new Student();
        stuObj.setId(id);
        Student remove = StudentTable.removeStudent(stuObj);
        if (remove == null) {
            return null;
        }
        return stuObj;
    }

}
