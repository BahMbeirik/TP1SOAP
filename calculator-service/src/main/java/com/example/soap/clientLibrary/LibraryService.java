
package client;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LibraryService", targetNamespace = "http://soap.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LibraryService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addBook", targetNamespace = "http://soap.example.com/", className = "client.AddBook")
    @ResponseWrapper(localName = "addBookResponse", targetNamespace = "http://soap.example.com/", className = "client.AddBookResponse")
    @Action(input = "http://soap.example.com/LibraryService/addBookRequest", output = "http://soap.example.com/LibraryService/addBookResponse")
    public String addBook(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns client.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBook", targetNamespace = "http://soap.example.com/", className = "client.GetBook")
    @ResponseWrapper(localName = "getBookResponse", targetNamespace = "http://soap.example.com/", className = "client.GetBookResponse")
    @Action(input = "http://soap.example.com/LibraryService/getBookRequest", output = "http://soap.example.com/LibraryService/getBookResponse")
    public Book getBook(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteBook", targetNamespace = "http://soap.example.com/", className = "client.DeleteBook")
    @ResponseWrapper(localName = "deleteBookResponse", targetNamespace = "http://soap.example.com/", className = "client.DeleteBookResponse")
    @Action(input = "http://soap.example.com/LibraryService/deleteBookRequest", output = "http://soap.example.com/LibraryService/deleteBookResponse")
    public String deleteBook(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}