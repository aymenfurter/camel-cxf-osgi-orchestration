package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-11-06T22:31:45.960+01:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "country", 
                  wsdlLocation = "file:/home/mika/dev/camel-cxf-osgi-orchistration/src/main/resources/wsdl/country.wsdl",
                  targetNamespace = "http://www.webserviceX.NET") 
public class Country extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.webserviceX.NET", "country");
    public final static QName CountryHttpGet = new QName("http://www.webserviceX.NET", "countryHttpGet");
    public final static QName CountrySoap = new QName("http://www.webserviceX.NET", "countrySoap");
    public final static QName CountrySoap12 = new QName("http://www.webserviceX.NET", "countrySoap12");
    public final static QName CountryHttpPost = new QName("http://www.webserviceX.NET", "countryHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/mika/dev/camel-cxf-osgi-orchistration/src/main/resources/wsdl/country.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Country.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/mika/dev/camel-cxf-osgi-orchistration/src/main/resources/wsdl/country.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Country(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Country(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Country() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Country(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Country(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Country(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CountryHttpGet
     */
    @WebEndpoint(name = "countryHttpGet")
    public CountryHttpGet getCountryHttpGet() {
        return super.getPort(CountryHttpGet, CountryHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryHttpGet
     */
    @WebEndpoint(name = "countryHttpGet")
    public CountryHttpGet getCountryHttpGet(WebServiceFeature... features) {
        return super.getPort(CountryHttpGet, CountryHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns CountrySoap
     */
    @WebEndpoint(name = "countrySoap")
    public CountrySoap getCountrySoap() {
        return super.getPort(CountrySoap, CountrySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountrySoap
     */
    @WebEndpoint(name = "countrySoap")
    public CountrySoap getCountrySoap(WebServiceFeature... features) {
        return super.getPort(CountrySoap, CountrySoap.class, features);
    }


    /**
     *
     * @return
     *     returns CountrySoap
     */
    @WebEndpoint(name = "countrySoap12")
    public CountrySoap getCountrySoap12() {
        return super.getPort(CountrySoap12, CountrySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountrySoap
     */
    @WebEndpoint(name = "countrySoap12")
    public CountrySoap getCountrySoap12(WebServiceFeature... features) {
        return super.getPort(CountrySoap12, CountrySoap.class, features);
    }


    /**
     *
     * @return
     *     returns CountryHttpPost
     */
    @WebEndpoint(name = "countryHttpPost")
    public CountryHttpPost getCountryHttpPost() {
        return super.getPort(CountryHttpPost, CountryHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryHttpPost
     */
    @WebEndpoint(name = "countryHttpPost")
    public CountryHttpPost getCountryHttpPost(WebServiceFeature... features) {
        return super.getPort(CountryHttpPost, CountryHttpPost.class, features);
    }

}
