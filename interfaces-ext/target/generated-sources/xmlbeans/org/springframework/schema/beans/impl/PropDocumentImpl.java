/*
 * An XML document type.
 * Localname: prop
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.PropDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one prop(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class PropDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.PropDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROP$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "prop");
    
    
    /**
     * Gets the "prop" element
     */
    public org.springframework.schema.beans.PropDocument.Prop getProp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropDocument.Prop target = null;
            target = (org.springframework.schema.beans.PropDocument.Prop)get_store().find_element_user(PROP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prop" element
     */
    public void setProp(org.springframework.schema.beans.PropDocument.Prop prop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropDocument.Prop target = null;
            target = (org.springframework.schema.beans.PropDocument.Prop)get_store().find_element_user(PROP$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.PropDocument.Prop)get_store().add_element_user(PROP$0);
            }
            target.set(prop);
        }
    }
    
    /**
     * Appends and returns a new empty "prop" element
     */
    public org.springframework.schema.beans.PropDocument.Prop addNewProp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.PropDocument.Prop target = null;
            target = (org.springframework.schema.beans.PropDocument.Prop)get_store().add_element_user(PROP$0);
            return target;
        }
    }
    /**
     * An XML prop(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class PropImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.PropDocument.Prop
    {
        private static final long serialVersionUID = 1L;
        
        public PropImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("", "key");
        
        
        /**
         * Gets the "key" attribute
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "key" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                return target;
            }
        }
        
        /**
         * Sets the "key" attribute
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$0);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "key" attribute
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$0);
                }
                target.set(key);
            }
        }
    }
}
