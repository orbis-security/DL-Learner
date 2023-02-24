/*
 * An XML document type.
 * Localname: replaced-method
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.ReplacedMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one replaced-method(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class ReplacedMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.ReplacedMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReplacedMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLACEDMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "replaced-method");
    
    
    /**
     * Gets the "replaced-method" element
     */
    public org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod getReplacedMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod target = null;
            target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().find_element_user(REPLACEDMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "replaced-method" element
     */
    public void setReplacedMethod(org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod replacedMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod target = null;
            target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().find_element_user(REPLACEDMETHOD$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().add_element_user(REPLACEDMETHOD$0);
            }
            target.set(replacedMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "replaced-method" element
     */
    public org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod addNewReplacedMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod target = null;
            target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().add_element_user(REPLACEDMETHOD$0);
            return target;
        }
    }
    /**
     * An XML replaced-method(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class ReplacedMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod
    {
        private static final long serialVersionUID = 1L;
        
        public ReplacedMethodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARGTYPE$0 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "arg-type");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName REPLACER$4 = 
            new javax.xml.namespace.QName("", "replacer");
        
        
        /**
         * Gets array of all "arg-type" elements
         */
        public org.springframework.schema.beans.ArgTypeDocument.ArgType[] getArgTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ARGTYPE$0, targetList);
                org.springframework.schema.beans.ArgTypeDocument.ArgType[] result = new org.springframework.schema.beans.ArgTypeDocument.ArgType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "arg-type" element
         */
        public org.springframework.schema.beans.ArgTypeDocument.ArgType getArgTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ArgTypeDocument.ArgType target = null;
                target = (org.springframework.schema.beans.ArgTypeDocument.ArgType)get_store().find_element_user(ARGTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "arg-type" element
         */
        public int sizeOfArgTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARGTYPE$0);
            }
        }
        
        /**
         * Sets array of all "arg-type" element
         */
        public void setArgTypeArray(org.springframework.schema.beans.ArgTypeDocument.ArgType[] argTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(argTypeArray, ARGTYPE$0);
            }
        }
        
        /**
         * Sets ith "arg-type" element
         */
        public void setArgTypeArray(int i, org.springframework.schema.beans.ArgTypeDocument.ArgType argType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ArgTypeDocument.ArgType target = null;
                target = (org.springframework.schema.beans.ArgTypeDocument.ArgType)get_store().find_element_user(ARGTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(argType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "arg-type" element
         */
        public org.springframework.schema.beans.ArgTypeDocument.ArgType insertNewArgType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ArgTypeDocument.ArgType target = null;
                target = (org.springframework.schema.beans.ArgTypeDocument.ArgType)get_store().insert_element_user(ARGTYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "arg-type" element
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
         * Removes the ith "arg-type" element
         */
        public void removeArgType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARGTYPE$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
                return get_store().find_attribute_user(NAME$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
                get_store().remove_attribute(NAME$2);
            }
        }
        
        /**
         * Gets the "replacer" attribute
         */
        public java.lang.String getReplacer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACER$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "replacer" attribute
         */
        public org.apache.xmlbeans.XmlString xgetReplacer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLACER$4);
                return target;
            }
        }
        
        /**
         * True if has "replacer" attribute
         */
        public boolean isSetReplacer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REPLACER$4) != null;
            }
        }
        
        /**
         * Sets the "replacer" attribute
         */
        public void setReplacer(java.lang.String replacer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPLACER$4);
                }
                target.setStringValue(replacer);
            }
        }
        
        /**
         * Sets (as xml) the "replacer" attribute
         */
        public void xsetReplacer(org.apache.xmlbeans.XmlString replacer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPLACER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REPLACER$4);
                }
                target.set(replacer);
            }
        }
        
        /**
         * Unsets the "replacer" attribute
         */
        public void unsetReplacer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REPLACER$4);
            }
        }
    }
}
