/*
 * An XML document type.
 * Localname: attribute
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.AttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one attribute(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class AttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.AttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "attribute");
    
    
    /**
     * Gets the "attribute" element
     */
    public org.springframework.schema.beans.MetaType getAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MetaType target = null;
            target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(ATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attribute" element
     */
    public void setAttribute(org.springframework.schema.beans.MetaType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MetaType target = null;
            target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(ATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.MetaType)get_store().add_element_user(ATTRIBUTE$0);
            }
            target.set(attribute);
        }
    }
    
    /**
     * Appends and returns a new empty "attribute" element
     */
    public org.springframework.schema.beans.MetaType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.MetaType target = null;
            target = (org.springframework.schema.beans.MetaType)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
}
