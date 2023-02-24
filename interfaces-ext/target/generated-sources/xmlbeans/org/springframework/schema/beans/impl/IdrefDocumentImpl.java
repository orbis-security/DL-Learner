/*
 * An XML document type.
 * Localname: idref
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.IdrefDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one idref(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class IdrefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.IdrefDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdrefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDREF$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "idref");
    
    
    /**
     * Gets the "idref" element
     */
    public org.springframework.schema.beans.IdrefDocument.Idref getIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().find_element_user(IDREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "idref" element
     */
    public void setIdref(org.springframework.schema.beans.IdrefDocument.Idref idref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().find_element_user(IDREF$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().add_element_user(IDREF$0);
            }
            target.set(idref);
        }
    }
    
    /**
     * Appends and returns a new empty "idref" element
     */
    public org.springframework.schema.beans.IdrefDocument.Idref addNewIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.IdrefDocument.Idref target = null;
            target = (org.springframework.schema.beans.IdrefDocument.Idref)get_store().add_element_user(IDREF$0);
            return target;
        }
    }
    /**
     * An XML idref(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class IdrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.IdrefDocument.Idref
    {
        private static final long serialVersionUID = 1L;
        
        public IdrefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEAN$0 = 
            new javax.xml.namespace.QName("", "bean");
        private static final javax.xml.namespace.QName LOCAL$2 = 
            new javax.xml.namespace.QName("", "local");
        
        
        /**
         * Gets the "bean" attribute
         */
        public java.lang.String getBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEAN$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEAN$0);
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
                return get_store().find_attribute_user(BEAN$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEAN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEAN$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEAN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BEAN$0);
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
                get_store().remove_attribute(BEAN$0);
            }
        }
        
        /**
         * Gets the "local" attribute
         */
        public java.lang.String getLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "local" attribute
         */
        public org.apache.xmlbeans.XmlIDREF xgetLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LOCAL$2);
                return target;
            }
        }
        
        /**
         * True if has "local" attribute
         */
        public boolean isSetLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCAL$2) != null;
            }
        }
        
        /**
         * Sets the "local" attribute
         */
        public void setLocal(java.lang.String local)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCAL$2);
                }
                target.setStringValue(local);
            }
        }
        
        /**
         * Sets (as xml) the "local" attribute
         */
        public void xsetLocal(org.apache.xmlbeans.XmlIDREF local)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlIDREF target = null;
                target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LOCAL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(LOCAL$2);
                }
                target.set(local);
            }
        }
        
        /**
         * Unsets the "local" attribute
         */
        public void unsetLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCAL$2);
            }
        }
    }
}
