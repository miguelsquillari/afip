
package ar.com.system.afip.wsmtxca.service.api;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarUnidadesMedidaRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarUnidadesMedidaRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequest" type="{http://impl.service.wsmtxca.afip.gov.ar/service/}AuthRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarUnidadesMedidaRequestType", propOrder = {
    "authRequest"
})
public class ConsultarUnidadesMedidaRequestType {

    @XmlElement(required = true)
    protected AuthRequestType authRequest;
    
    public ConsultarUnidadesMedidaRequestType(AuthRequestType authRequest) {
		this.authRequest = checkNotNull(authRequest);
	}

	/**
     * Obtiene el valor de la propiedad authRequest.
     * 
     * @return
     *     possible object is
     *     {@link AuthRequestType }
     *     
     */
    public AuthRequestType getAuthRequest() {
        return authRequest;
    }

    /**
     * Define el valor de la propiedad authRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthRequestType }
     *     
     */
    public void setAuthRequest(AuthRequestType value) {
        this.authRequest = value;
    }

}