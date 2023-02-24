/*
 * An XML document type.
 * Localname: property
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one property(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "property");
    
    
    /**
     * Gets the "property" element
     */
    public org.springframework.schema.beans.PropertyType getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropertyType target = null;
            target = (org.springframework.schema.beans.PropertyType)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(org.springframework.schema.beans.PropertyType property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropertyType target = null;
            target = (org.springframework.schema.beans.PropertyType)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.PropertyType)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public org.springframework.schema.beans.PropertyType addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropertyType target = null;
            target = (org.springframework.schema.beans.PropertyType)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
}
