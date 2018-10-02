package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.annotation.Nonnull;
import javax.xml.bind.annotation.*;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://ar.gov.afip.dif.FEV1/}FEAuthRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth"})
@XmlRootElement(name = "FEParamGetTiposConcepto")
@Root(name = "FEParamGetTiposConcepto")
@Namespace(reference = ServiceSoap.SERVICE_NAMESPACE)
public class FEParamGetTiposConcepto {
    @XmlElement(name = "Auth")
    @Element(name = "Auth")
    protected FEAuthRequest auth;

    public FEParamGetTiposConcepto() {
    }

    public FEParamGetTiposConcepto(@Nonnull FEAuthRequest auth) {
        this.auth = checkNotNull(auth);
    }

    /**
     * Obtiene el valor de la propiedad auth.
     *
     * @return possible object is {@link FEAuthRequest }
     */
    public FEAuthRequest getAuth() {
        return auth;
    }

    /**
     * Define el valor de la propiedad auth.
     *
     * @param value allowed object is {@link FEAuthRequest }
     */
    public void setAuth(FEAuthRequest value) {
        this.auth = value;
    }

}