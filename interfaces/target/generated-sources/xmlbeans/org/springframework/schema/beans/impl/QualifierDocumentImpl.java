/*
 * An XML document type.
 * Localname: qualifier
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.QualifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one qualifier(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class QualifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.QualifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public QualifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUALIFIER$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "qualifier");
    
    
    /**
     * Gets the "qualifier" element
     */
    public org.springframework.schema.beans.QualifierDocument.Qualifier getQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.QualifierDocument.Qualifier target = null;
            target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().find_element_user(QUALIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "qualifier" element
     */
    public void setQualifier(org.springframework.schema.beans.QualifierDocument.Qualifier qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.QualifierDocument.Qualifier target = null;
            target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().find_element_user(QUALIFIER$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().add_element_user(QUALIFIER$0);
            }
            target.set(qualifier);
        }
    }
    
    /**
     * Appends and returns a new empty "qualifier" element
     */
    public org.springframework.schema.beans.QualifierDocument.Qualifier addNewQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.QualifierDocument.Qualifier target = null;
            target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().add_element_user(QUALIFIER$0);
            return target;
        }
    }
    /**
     * An XML qualifier(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class QualifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.QualifierDocument.Qualifier
    {
        private static final long serialVersionUID = 1L;
        
        public QualifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "attribute");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets array of all "attribute" elements
         */
        public org.springframework.schema.beans.MetaType[] getAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTRIBUTE$0, targetList);
                org.springframework.schema.beans.MetaType[] result = new org.springframework.schema.beans.MetaType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "attribute" element
         */
        public org.springframework.schema.beans.MetaType getAttributeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.MetaType target = null;
                target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(ATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "attribute" element
         */
        public int sizeOfAttributeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIBUTE$0);
            }
        }
        
        /**
         * Sets array of all "attribute" element
         */
        public void setAttributeArray(org.springframework.schema.beans.MetaType[] attributeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attributeArray, ATTRIBUTE$0);
            }
        }
        
        /**
         * Sets ith "attribute" element
         */
        public void setAttributeArray(int i, org.springframework.schema.beans.MetaType attribute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.MetaType target = null;
                target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(ATTRIBUTE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attribute);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attribute" element
         */
        public org.springframework.schema.beans.MetaType insertNewAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.MetaType target = null;
                target = (org.springframework.schema.beans.MetaType)get_store().insert_element_user(ATTRIBUTE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attribute" element
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
        
        /**
         * Removes the ith "attribute" element
         */
        public void removeAttribute(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIBUTE$0, i);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TYPE$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$2);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$4) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$4);
            }
        }
    }
}
