
package serviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceClient package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindStudentById_QNAME = new QName("http://services/", "findStudentById");
    private final static QName _FindStudentByIdResponse_QNAME = new QName("http://services/", "findStudentByIdResponse");
    private final static QName _InsertStudent_QNAME = new QName("http://services/", "insertStudent");
    private final static QName _InsertStudentResponse_QNAME = new QName("http://services/", "insertStudentResponse");
    private final static QName _RemoveStudentById_QNAME = new QName("http://services/", "removeStudentById");
    private final static QName _RemoveStudentByIdResponse_QNAME = new QName("http://services/", "removeStudentByIdResponse");
    private final static QName _Student_QNAME = new QName("http://services/", "student");
    private final static QName _UpdateStudentByid_QNAME = new QName("http://services/", "updateStudentByid");
    private final static QName _UpdateStudentByidResponse_QNAME = new QName("http://services/", "updateStudentByidResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindStudentById }
     * 
     */
    public FindStudentById createFindStudentById() {
        return new FindStudentById();
    }

    /**
     * Create an instance of {@link FindStudentByIdResponse }
     * 
     */
    public FindStudentByIdResponse createFindStudentByIdResponse() {
        return new FindStudentByIdResponse();
    }

    /**
     * Create an instance of {@link InsertStudent }
     * 
     */
    public InsertStudent createInsertStudent() {
        return new InsertStudent();
    }

    /**
     * Create an instance of {@link InsertStudentResponse }
     * 
     */
    public InsertStudentResponse createInsertStudentResponse() {
        return new InsertStudentResponse();
    }

    /**
     * Create an instance of {@link RemoveStudentById }
     * 
     */
    public RemoveStudentById createRemoveStudentById() {
        return new RemoveStudentById();
    }

    /**
     * Create an instance of {@link RemoveStudentByIdResponse }
     * 
     */
    public RemoveStudentByIdResponse createRemoveStudentByIdResponse() {
        return new RemoveStudentByIdResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link UpdateStudentByid }
     * 
     */
    public UpdateStudentByid createUpdateStudentByid() {
        return new UpdateStudentByid();
    }

    /**
     * Create an instance of {@link UpdateStudentByidResponse }
     * 
     */
    public UpdateStudentByidResponse createUpdateStudentByidResponse() {
        return new UpdateStudentByidResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentById }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentById")
    public JAXBElement<FindStudentById> createFindStudentById(FindStudentById value) {
        return new JAXBElement<FindStudentById>(_FindStudentById_QNAME, FindStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByIdResponse")
    public JAXBElement<FindStudentByIdResponse> createFindStudentByIdResponse(FindStudentByIdResponse value) {
        return new JAXBElement<FindStudentByIdResponse>(_FindStudentByIdResponse_QNAME, FindStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudent")
    public JAXBElement<InsertStudent> createInsertStudent(InsertStudent value) {
        return new JAXBElement<InsertStudent>(_InsertStudent_QNAME, InsertStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudentResponse")
    public JAXBElement<InsertStudentResponse> createInsertStudentResponse(InsertStudentResponse value) {
        return new JAXBElement<InsertStudentResponse>(_InsertStudentResponse_QNAME, InsertStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudentById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveStudentById }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "removeStudentById")
    public JAXBElement<RemoveStudentById> createRemoveStudentById(RemoveStudentById value) {
        return new JAXBElement<RemoveStudentById>(_RemoveStudentById_QNAME, RemoveStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudentByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveStudentByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "removeStudentByIdResponse")
    public JAXBElement<RemoveStudentByIdResponse> createRemoveStudentByIdResponse(RemoveStudentByIdResponse value) {
        return new JAXBElement<RemoveStudentByIdResponse>(_RemoveStudentByIdResponse_QNAME, RemoveStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Student }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentByid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStudentByid }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudentByid")
    public JAXBElement<UpdateStudentByid> createUpdateStudentByid(UpdateStudentByid value) {
        return new JAXBElement<UpdateStudentByid>(_UpdateStudentByid_QNAME, UpdateStudentByid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentByidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStudentByidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudentByidResponse")
    public JAXBElement<UpdateStudentByidResponse> createUpdateStudentByidResponse(UpdateStudentByidResponse value) {
        return new JAXBElement<UpdateStudentByidResponse>(_UpdateStudentByidResponse_QNAME, UpdateStudentByidResponse.class, null, value);
    }

}
