package lt.eif.viko.m.nar.client.generated_classes;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "OrderPort", targetNamespace = "http://www.springframework.org/schema/web-services")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface OrderPort {

    @WebMethod
    @WebResult(name = "getOrderResponse", targetNamespace = "http://www.springframework.org/schema/web-services", partName = "getOrderResponse")
    GetOrderResponse getOrder(
            @WebParam(name = "getOrderRequest", targetNamespace = "http://www.springframework.org/schema/web-services", partName = "getOrderRequest")
            GetOrderRequest getOrderRequest);

    @WebMethod
    @WebResult(name = "getAllTripResponse", targetNamespace = "http://www.springframework.org/schema/web-services", partName = "getAllTripResponse")
    GetAllTripResponse getAllTrip(
            @WebParam(name = "getAllTripRequest", targetNamespace = "http://www.springframework.org/schema/web-services", partName = "getAllTripRequest")
            GetAllTripRequest getAllTripRequest);
}
