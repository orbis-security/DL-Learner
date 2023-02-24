/*
 * An XML document type.
 * Localname: arg-type
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.ArgTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one arg-type(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class ArgTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.ArgTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArgTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARGTYPE$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "arg-type");
    
    
    /**
     * Gets the "arg-type" element
     */
    public org.springframework.schema.beans.ArgTypeDocument.ArgType getArgType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArgTypeDocument.ArgType target = null;
            target = (org.springframework.schema.beans.ArgTypeDocument.ArgType)get_store().find_element_user(ARGTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "arg-type" element
     */
    public void setArgType(org.springframework.schema.beans.ArgTypeDocument.ArgType argType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArgTypeDocument.ArgType target = null;
            target = (org.springframework.schema.beans.ArgTypeDocument.ArgType)get_store().find_element_user(ARGTYPE$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.ArgTypeDocument.ArgType)get_store().add_element_user(ARGTYPE$0);
            }
            target.set(argType);
        }
    }
    
    /**
     * Appends and returns a new empty "arg-type" element
     */
    public org.springframework.schema.beans.ArgTypeDocument.ArgType addNewArgType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ArgTypeDocument.ArgType target = null;
            target = (org.springframework.schema.beans.ArgTypeDocument.ArgType)get_store().add_element_user(ARGTYPE$0);
            return target;
        }
    }
    /**
     * An XML arg-type(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class ArgTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.ArgTypeDocument.ArgType
    {
        private static final long serialVersionUID = 1L;
        
        public ArgTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATCH$0 = 
            new javax.xml.namespace.QName("", "match");
        
        
        /**
         * Gets the "match" attribute
         */
        public java.lang.String getMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCH$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "match" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCH$0);
                return target;
            }
        }
        
        /**
         * True if has "match" attribute
         */
        public boolean isSetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MATCH$0) != null;
            }
        }
        
        /**
         * Sets the "match" attribute
         */
        public void setMatch(java.lang.String match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATCH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATCH$0);
                }
                target.setStringValue(match);
            }
        }
        
        /**
         * Sets (as xml) the "match" attribute
         */
        public void xsetMatch(org.apache.xmlbeans.XmlString match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATCH$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MATCH$0);
                }
                target.set(match);
            }
        }
        
        /**
         * Unsets the "match" attribute
         */
        public void unsetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MATCH$0);
            }
        }
    }
}
