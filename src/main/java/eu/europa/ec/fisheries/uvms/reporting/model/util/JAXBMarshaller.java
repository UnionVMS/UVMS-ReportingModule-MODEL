/*
Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it 
and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of 
the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more 
details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.

 */
package eu.europa.ec.fisheries.uvms.reporting.model.util;

import eu.europa.ec.fisheries.uvms.commons.xml.AbstractJAXBMarshaller;
import eu.europa.ec.fisheries.uvms.commons.xml.JAXBRuntimeException;
import eu.europa.ec.fisheries.uvms.reporting.model.exception.ReportingModelException;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.Map;

public final class JAXBMarshaller extends AbstractJAXBMarshaller {

    private JAXBMarshaller() {
    }

    /**
     * Marshalls a JAXB Object to a XML String representation
     *
     * @param <T>
     * @param data
     * @return
     * @throws ReportingModelException
     */
    public static <T> String marshall(T data) throws ReportingModelException {
        try {
            Map<String,Object> properties = new HashMap<>();
            properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            return marshallToString(data, properties);
        } catch (JAXBException | JAXBRuntimeException e) {
            throw new ReportingModelException("Error when marshalling ", e);
        }
    }

    /**
     * Unmarshalls A textMessage to the desired Object. The object must be the
     * root object of the unmarshalled message!
     *
     * @param <R>
     * @param textMessage
     * @param clazz       clazz
     * @return
     * @throws ReportingModelException
     */
    public static <R> R unmarshall(TextMessage textMessage, Class<R> clazz) throws ReportingModelException {
        try {
            return unmarshallTo(textMessage, clazz);
        } catch (JMSException | JAXBException | JAXBRuntimeException e) {
            throw new ReportingModelException("Error when unmarshalling response in ResponseMapper: ", e);
        }
    }

}
