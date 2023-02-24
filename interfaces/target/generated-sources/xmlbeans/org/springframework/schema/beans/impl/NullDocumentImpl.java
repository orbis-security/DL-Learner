/*
 * An XML document type.
 * Localname: null
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.NullDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one null(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class NullDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.NullDocument
{
    private static final long serialVersionUID = 1L;
    
    public NullDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NULL$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "null");
    
    
    /**
     * Gets the "null" element
     */
    public org.springframework.schema.beans.NullDocument.Null getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "null" element
     */
    public void setNull(org.springframework.schema.beans.NullDocument.Null xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.NullDocument.Null)get_store().add_element_user(NULL$0);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Appends and returns a new empty "null" element
     */
    public org.springframework.schema.beans.NullDocument.Null addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.NullDocument.Null target = null;
            target = (org.springframework.schema.beans.NullDocument.Null)get_store().add_element_user(NULL$0);
            return target;
        }
    }
    /**
     * An XML null(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class NullImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.NullDocument.Null
    {
        private static final long serialVersionUID = 1L;
        
        public NullImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
