
package serviceClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentWebService {


    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns serviceClient.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertStudent", targetNamespace = "http://services/", className = "serviceClient.InsertStudent")
    @ResponseWrapper(localName = "insertStudentResponse", targetNamespace = "http://services/", className = "serviceClient.InsertStudentResponse")
    @Action(input = "http://services/StudentWebService/insertStudentRequest", output = "http://services/StudentWebService/insertStudentResponse")
    public Student insertStudent(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        double gpa);

    /**
     * 
     * @param id
     * @return
     *     returns serviceClient.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStudentById", targetNamespace = "http://services/", className = "serviceClient.FindStudentById")
    @ResponseWrapper(localName = "findStudentByIdResponse", targetNamespace = "http://services/", className = "serviceClient.FindStudentByIdResponse")
    @Action(input = "http://services/StudentWebService/findStudentByIdRequest", output = "http://services/StudentWebService/findStudentByIdResponse")
    public Student findStudentById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns serviceClient.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStudentByid", targetNamespace = "http://services/", className = "serviceClient.UpdateStudentByid")
    @ResponseWrapper(localName = "updateStudentByidResponse", targetNamespace = "http://services/", className = "serviceClient.UpdateStudentByidResponse")
    @Action(input = "http://services/StudentWebService/updateStudentByidRequest", output = "http://services/StudentWebService/updateStudentByidResponse")
    public Student updateStudentByid(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        double gpa);

    /**
     * 
     * @param id
     * @return
     *     returns serviceClient.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeStudentById", targetNamespace = "http://services/", className = "serviceClient.RemoveStudentById")
    @ResponseWrapper(localName = "removeStudentByIdResponse", targetNamespace = "http://services/", className = "serviceClient.RemoveStudentByIdResponse")
    @Action(input = "http://services/StudentWebService/removeStudentByIdRequest", output = "http://services/StudentWebService/removeStudentByIdResponse")
    public Student removeStudentById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
