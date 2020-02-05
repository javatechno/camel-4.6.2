/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.client;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MiloClientComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MiloClientComponent target = (MiloClientComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "defaultconfiguration":
        case "defaultConfiguration": target.setDefaultConfiguration(property(camelContext, org.apache.camel.component.milo.client.MiloClientConfiguration.class, value)); return true;
        case "applicationname":
        case "applicationName": target.setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationuri":
        case "applicationUri": target.setApplicationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "producturi":
        case "productUri": target.setProductUri(property(camelContext, java.lang.String.class, value)); return true;
        case "reconnecttimeout":
        case "reconnectTimeout": target.setReconnectTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

