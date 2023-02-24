/*
 * An XML document type.
 * Localname: lookup-method
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.LookupMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one lookup-method(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class LookupMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.LookupMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public LookupMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOKUPMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "lookup-method");
    
    
    /**
     * Gets the "lookup-method" element
     */
    public org.springframework.schema.beans.LookupMethodDocument.LookupMethod getLookupMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.LookupMethodDocument.LookupMethod target = null;
            target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().find_element_user(LOOKUPMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lookup-method" element
     */
    public void setLookupMethod(org.springframework.schema.beans.LookupMethodDocument.LookupMethod lookupMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.LookupMethodDocument.LookupMethod target = null;
            target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().find_element_user(LOOKUPMETHOD$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().add_element_user(LOOKUPMETHOD$0);
            }
            target.set(lookupMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "lookup-method" element
     */
    public org.springframework.schema.beans.LookupMethodDocument.LookupMethod addNewLookupMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.LookupMethodDocument.LookupMethod target = null;
            target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().add_element_user(LOOKUPMETHOD$0);
            return target;
        }
    }
    /**
     * An XML lookup-method(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class LookupMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.LookupMethodDocument.LookupMethod
    {
        private static final long serialVersionUID = 1L;
        
        public LookupMethodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName BEAN$2 = 
            new javax.xml.namespace.QName("", "bean");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
        
        /**
         * Gets the "bean" attribute
         */
        public java.lang.String getBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEAN$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bean" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEAN$2);
                return target;
            }
        }
        
        /**
         * True if has "bean" attribute
         */
        public boolean isSetBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BEAN$2) != null;
            }
        }
        
        /**
         * Sets the "bean" attribute
         */
        public void setBean(java.lang.String bean)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEAN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEAN$2);
                }
                target.setStringValue(bean);
            }
        }
        
        /**
         * Sets (as xml) the "bean" attribute
         */
        public void xsetBean(org.apache.xmlbeans.XmlString bean)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEAN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BEAN$2);
                }
                target.set(bean);
            }
        }
        
        /**
         * Unsets the "bean" attribute
         */
        public void unsetBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BEAN$2);
            }
        }
    }
}
