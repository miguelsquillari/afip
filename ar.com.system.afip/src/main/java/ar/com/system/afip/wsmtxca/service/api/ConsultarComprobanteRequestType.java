
package ar.com.system.afip.wsmtxca.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import static com.google.common.base.Preconditions.checkNotNull;


/**
 * <p>Clase Java para ConsultarComprobanteRequestType complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType name="ConsultarComprobanteRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *         &lt;element name="consultaComprobanteRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}ConsultaComprobanteRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarComprobanteRequestType", propOrder = {
        "authRequest",
        "consultaComprobanteRequest"
})
@Root(name = "consultarComprobanteRequest")
@Namespace(reference = MTXCAServicePortType.SERVICE_NAMESPACE)
public class ConsultarComprobanteRequestType {

    @XmlElement(required = true)
    @Element
    protected AuthRequestType authRequest;
    @XmlElement(required = true)
    @Element
    protected ConsultaComprobanteRequestType consultaComprobanteRequest;

    public ConsultarComprobanteRequestType(AuthRequestType authRequest, ConsultaComprobanteRequestType consultaComprobanteRequest) {
        this.authRequest = checkNotNull(authRequest);
        this.consultaComprobanteRequest = checkNotNull(consultaComprobanteRequest);
    }

    /**
     * Obtiene el valor de la propiedad authRequest.
     *
     * @return possible object is
     * {@link AuthRequestType }
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Define el valor de la propiedad authRequest.
     *
     * @param value allowed object is
     *              {@link AuthRequestType }
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad consultaComprobanteRequest.
     *
     * @return possible object is
     * {@link ConsultaComprobanteRequestType }
     */
    public ConsultaComprobanteRequestType getConsultaComprobanteRequest() {
        return consultaComprobanteRequest;
    }

    /**
     * Define el valor de la propiedad consultaComprobanteRequest.
     *
     * @param value allowed object is
     *              {@link ConsultaComprobanteRequestType }
     */
    public void setConsultaComprobanteRequest(ConsultaComprobanteRequestType value) {
        this.consultaComprobanteRequest = value;
    }

}
