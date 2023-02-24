/*
 * An XML document type.
 * Localname: ref
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.RefDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one ref(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class RefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.RefDocument
{
    private static final long serialVersionUID = 1L;
    
    public RefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REF$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "ref");
    
    
    /**
     * Gets the "ref" element
     */
    public org.springframework.schema.beans.RefDocument.Ref getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().find_element_user(REF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ref" element
     */
    public void setRef(org.springframework.schema.beans.RefDocument.Ref ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().find_element_user(REF$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.RefDocument.Ref)get_store().add_element_user(REF$0);
            }
            target.set(ref);
        }
    }
    
    /**
     * Appends and returns a new empty "ref" element
     */
    public org.springframework.schema.beans.RefDocument.Ref addNewRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.RefDocument.Ref target = null;
            target = (org.springframework.schema.beans.RefDocument.Ref)get_store().add_element_user(REF$0);
            return target;
        }
    }
    /**
     * An XML ref(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class RefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.RefDocument.Ref
    {
        private static final long serialVersionUID = 1L;
        
        public RefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEAN$0 = 
            new javax.xml.namespace.QName("", "bean");
        private static final javax.xml.namespace.QName LOCAL$2 = 
            new javax.xml.namespace.QName("", "local");
        private static final javax.xml.namespace.QName PARENT$4 = 
            new javax.xml.namespace.QName("", "parent");
        
        
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
        
        /**
         * Gets the "parent" attribute
         */
        public java.lang.String getParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parent" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENT$4);
                return target;
            }
        }
        
        /**
         * True if has "parent" attribute
         */
        public boolean isSetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARENT$4) != null;
            }
        }
        
        /**
         * Sets the "parent" attribute
         */
        public void setParent(java.lang.String parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENT$4);
                }
                target.setStringValue(parent);
            }
        }
        
        /**
         * Sets (as xml) the "parent" attribute
         */
        public void xsetParent(org.apache.xmlbeans.XmlString parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARENT$4);
                }
                target.set(parent);
            }
        }
        
        /**
         * Unsets the "parent" attribute
         */
        public void unsetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARENT$4);
            }
        }
    }
}
