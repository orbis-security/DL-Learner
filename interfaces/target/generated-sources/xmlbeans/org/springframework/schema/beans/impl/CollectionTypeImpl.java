/*
 * XML Type:  collectionType
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.CollectionType
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * An XML collectionType(@http://www.springframework.org/schema/beans).
 *
 * This is a complex type.
 */
public class CollectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.CollectionType
{
    private static final long serialVersionUID = 1L;
    
    public CollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUETYPE$0 = 
        new javax.xml.namespace.QName("", "value-type");
    
    
    /**
     * Gets the "value-type" attribute
     */
    public java.lang.String getValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value-type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUETYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "value-type" attribute
     */
    public boolean isSetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUETYPE$0) != null;
        }
    }
    
    /**
     * Sets the "value-type" attribute
     */
    public void setValueType(java.lang.String valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUETYPE$0);
            }
            target.setStringValue(valueType);
        }
    }
    
    /**
     * Sets (as xml) the "value-type" attribute
     */
    public void xsetValueType(org.apache.xmlbeans.XmlString valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUETYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUETYPE$0);
            }
            target.set(valueType);
        }
    }
    
    /**
     * Unsets the "value-type" attribute
     */
    public void unsetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUETYPE$0);
        }
    }
}
