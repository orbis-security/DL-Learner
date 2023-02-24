/*
 * An XML document type.
 * Localname: beans
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.BeansDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one beans(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class BeansDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.BeansDocument
{
    private static final long serialVersionUID = 1L;
    
    public BeansDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEANS$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "beans");
    
    
    /**
     * Gets the "beans" element
     */
    public org.springframework.schema.beans.BeansDocument.Beans getBeans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeansDocument.Beans target = null;
            target = (org.springframework.schema.beans.BeansDocument.Beans)get_store().find_element_user(BEANS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "beans" element
     */
    public void setBeans(org.springframework.schema.beans.BeansDocument.Beans beans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeansDocument.Beans target = null;
            target = (org.springframework.schema.beans.BeansDocument.Beans)get_store().find_element_user(BEANS$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.BeansDocument.Beans)get_store().add_element_user(BEANS$0);
            }
            target.set(beans);
        }
    }
    
    /**
     * Appends and returns a new empty "beans" element
     */
    public org.springframework.schema.beans.BeansDocument.Beans addNewBeans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeansDocument.Beans target = null;
            target = (org.springframework.schema.beans.BeansDocument.Beans)get_store().add_element_user(BEANS$0);
            return target;
        }
    }
    /**
     * An XML beans(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class BeansImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.BeansDocument.Beans
    {
        private static final long serialVersionUID = 1L;
        
        public BeansImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "description");
        private static final javax.xml.namespace.QName IMPORT$2 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "import");
        private static final javax.xml.namespace.QName ALIAS$4 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "alias");
        private static final javax.xml.namespace.QName BEAN$6 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "bean");
        private static final javax.xml.namespace.QName DEFAULTLAZYINIT$8 = 
            new javax.xml.namespace.QName("", "default-lazy-init");
        private static final javax.xml.namespace.QName DEFAULTMERGE$10 = 
            new javax.xml.namespace.QName("", "default-merge");
        private static final javax.xml.namespace.QName DEFAULTAUTOWIRE$12 = 
            new javax.xml.namespace.QName("", "default-autowire");
        private static final javax.xml.namespace.QName DEFAULTAUTOWIRECANDIDATES$14 = 
            new javax.xml.namespace.QName("", "default-autowire-candidates");
        private static final javax.xml.namespace.QName DEFAULTINITMETHOD$16 = 
            new javax.xml.namespace.QName("", "default-init-method");
        private static final javax.xml.namespace.QName DEFAULTDESTROYMETHOD$18 = 
            new javax.xml.namespace.QName("", "default-destroy-method");
        
        
        /**
         * Gets the "description" element
         */
        public org.springframework.schema.beans.DescriptionDocument.Description getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DescriptionDocument.Description target = null;
                target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(org.springframework.schema.beans.DescriptionDocument.Description description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DescriptionDocument.Description target = null;
                target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
        
        /**
         * Appends and returns a new empty "description" element
         */
        public org.springframework.schema.beans.DescriptionDocument.Description addNewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DescriptionDocument.Description target = null;
                target = (org.springframework.schema.beans.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
                return target;
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, 0);
            }
        }
        
        /**
         * Gets array of all "import" elements
         */
        public org.springframework.schema.beans.ImportDocument.Import[] getImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPORT$2, targetList);
                org.springframework.schema.beans.ImportDocument.Import[] result = new org.springframework.schema.beans.ImportDocument.Import[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "import" element
         */
        public org.springframework.schema.beans.ImportDocument.Import getImportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ImportDocument.Import target = null;
                target = (org.springframework.schema.beans.ImportDocument.Import)get_store().find_element_user(IMPORT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "import" element
         */
        public int sizeOfImportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPORT$2);
            }
        }
        
        /**
         * Sets array of all "import" element
         */
        public void setImportArray(org.springframework.schema.beans.ImportDocument.Import[] ximportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ximportArray, IMPORT$2);
            }
        }
        
        /**
         * Sets ith "import" element
         */
        public void setImportArray(int i, org.springframework.schema.beans.ImportDocument.Import ximport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ImportDocument.Import target = null;
                target = (org.springframework.schema.beans.ImportDocument.Import)get_store().find_element_user(IMPORT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ximport);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        public org.springframework.schema.beans.ImportDocument.Import insertNewImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ImportDocument.Import target = null;
                target = (org.springframework.schema.beans.ImportDocument.Import)get_store().insert_element_user(IMPORT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        public org.springframework.schema.beans.ImportDocument.Import addNewImport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ImportDocument.Import target = null;
                target = (org.springframework.schema.beans.ImportDocument.Import)get_store().add_element_user(IMPORT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "import" element
         */
        public void removeImport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPORT$2, i);
            }
        }
        
        /**
         * Gets array of all "alias" elements
         */
        public org.springframework.schema.beans.AliasDocument.Alias[] getAliasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALIAS$4, targetList);
                org.springframework.schema.beans.AliasDocument.Alias[] result = new org.springframework.schema.beans.AliasDocument.Alias[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alias" element
         */
        public org.springframework.schema.beans.AliasDocument.Alias getAliasArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.AliasDocument.Alias target = null;
                target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().find_element_user(ALIAS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alias" element
         */
        public int sizeOfAliasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIAS$4);
            }
        }
        
        /**
         * Sets array of all "alias" element
         */
        public void setAliasArray(org.springframework.schema.beans.AliasDocument.Alias[] aliasArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(aliasArray, ALIAS$4);
            }
        }
        
        /**
         * Sets ith "alias" element
         */
        public void setAliasArray(int i, org.springframework.schema.beans.AliasDocument.Alias alias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.AliasDocument.Alias target = null;
                target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().find_element_user(ALIAS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(alias);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alias" element
         */
        public org.springframework.schema.beans.AliasDocument.Alias insertNewAlias(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.AliasDocument.Alias target = null;
                target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().insert_element_user(ALIAS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alias" element
         */
        public org.springframework.schema.beans.AliasDocument.Alias addNewAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.AliasDocument.Alias target = null;
                target = (org.springframework.schema.beans.AliasDocument.Alias)get_store().add_element_user(ALIAS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "alias" element
         */
        public void removeAlias(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIAS$4, i);
            }
        }
        
        /**
         * Gets array of all "bean" elements
         */
        public org.springframework.schema.beans.BeanDocument.Bean[] getBeanArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BEAN$6, targetList);
                org.springframework.schema.beans.BeanDocument.Bean[] result = new org.springframework.schema.beans.BeanDocument.Bean[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "bean" element
         */
        public org.springframework.schema.beans.BeanDocument.Bean getBeanArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeanDocument.Bean target = null;
                target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "bean" element
         */
        public int sizeOfBeanArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEAN$6);
            }
        }
        
        /**
         * Sets array of all "bean" element
         */
        public void setBeanArray(org.springframework.schema.beans.BeanDocument.Bean[] beanArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(beanArray, BEAN$6);
            }
        }
        
        /**
         * Sets ith "bean" element
         */
        public void setBeanArray(int i, org.springframework.schema.beans.BeanDocument.Bean bean)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeanDocument.Bean target = null;
                target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bean);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bean" element
         */
        public org.springframework.schema.beans.BeanDocument.Bean insertNewBean(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeanDocument.Bean target = null;
                target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().insert_element_user(BEAN$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bean" element
         */
        public org.springframework.schema.beans.BeanDocument.Bean addNewBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeanDocument.Bean target = null;
                target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().add_element_user(BEAN$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "bean" element
         */
        public void removeBean(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEAN$6, i);
            }
        }
        
        /**
         * Gets the "default-lazy-init" attribute
         */
        public boolean getDefaultLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTLAZYINIT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTLAZYINIT$8);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-lazy-init" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDefaultLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTLAZYINIT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEFAULTLAZYINIT$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "default-lazy-init" attribute
         */
        public boolean isSetDefaultLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTLAZYINIT$8) != null;
            }
        }
        
        /**
         * Sets the "default-lazy-init" attribute
         */
        public void setDefaultLazyInit(boolean defaultLazyInit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTLAZYINIT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTLAZYINIT$8);
                }
                target.setBooleanValue(defaultLazyInit);
            }
        }
        
        /**
         * Sets (as xml) the "default-lazy-init" attribute
         */
        public void xsetDefaultLazyInit(org.apache.xmlbeans.XmlBoolean defaultLazyInit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTLAZYINIT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEFAULTLAZYINIT$8);
                }
                target.set(defaultLazyInit);
            }
        }
        
        /**
         * Unsets the "default-lazy-init" attribute
         */
        public void unsetDefaultLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTLAZYINIT$8);
            }
        }
        
        /**
         * Gets the "default-merge" attribute
         */
        public boolean getDefaultMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMERGE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTMERGE$10);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-merge" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDefaultMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTMERGE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEFAULTMERGE$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "default-merge" attribute
         */
        public boolean isSetDefaultMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTMERGE$10) != null;
            }
        }
        
        /**
         * Sets the "default-merge" attribute
         */
        public void setDefaultMerge(boolean defaultMerge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMERGE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTMERGE$10);
                }
                target.setBooleanValue(defaultMerge);
            }
        }
        
        /**
         * Sets (as xml) the "default-merge" attribute
         */
        public void xsetDefaultMerge(org.apache.xmlbeans.XmlBoolean defaultMerge)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTMERGE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEFAULTMERGE$10);
                }
                target.set(defaultMerge);
            }
        }
        
        /**
         * Unsets the "default-merge" attribute
         */
        public void unsetDefaultMerge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTMERGE$10);
            }
        }
        
        /**
         * Gets the "default-autowire" attribute
         */
        public org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire.Enum getDefaultAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTAUTOWIRE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTAUTOWIRE$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-autowire" attribute
         */
        public org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire xgetDefaultAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire target = null;
                target = (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire)get_store().find_attribute_user(DEFAULTAUTOWIRE$12);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire)get_default_attribute_value(DEFAULTAUTOWIRE$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "default-autowire" attribute
         */
        public boolean isSetDefaultAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTAUTOWIRE$12) != null;
            }
        }
        
        /**
         * Sets the "default-autowire" attribute
         */
        public void setDefaultAutowire(org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire.Enum defaultAutowire)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTAUTOWIRE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTAUTOWIRE$12);
                }
                target.setEnumValue(defaultAutowire);
            }
        }
        
        /**
         * Sets (as xml) the "default-autowire" attribute
         */
        public void xsetDefaultAutowire(org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire defaultAutowire)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire target = null;
                target = (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire)get_store().find_attribute_user(DEFAULTAUTOWIRE$12);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire)get_store().add_attribute_user(DEFAULTAUTOWIRE$12);
                }
                target.set(defaultAutowire);
            }
        }
        
        /**
         * Unsets the "default-autowire" attribute
         */
        public void unsetDefaultAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTAUTOWIRE$12);
            }
        }
        
        /**
         * Gets the "default-autowire-candidates" attribute
         */
        public java.lang.String getDefaultAutowireCandidates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTAUTOWIRECANDIDATES$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-autowire-candidates" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultAutowireCandidates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTAUTOWIRECANDIDATES$14);
                return target;
            }
        }
        
        /**
         * True if has "default-autowire-candidates" attribute
         */
        public boolean isSetDefaultAutowireCandidates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTAUTOWIRECANDIDATES$14) != null;
            }
        }
        
        /**
         * Sets the "default-autowire-candidates" attribute
         */
        public void setDefaultAutowireCandidates(java.lang.String defaultAutowireCandidates)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTAUTOWIRECANDIDATES$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTAUTOWIRECANDIDATES$14);
                }
                target.setStringValue(defaultAutowireCandidates);
            }
        }
        
        /**
         * Sets (as xml) the "default-autowire-candidates" attribute
         */
        public void xsetDefaultAutowireCandidates(org.apache.xmlbeans.XmlString defaultAutowireCandidates)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTAUTOWIRECANDIDATES$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTAUTOWIRECANDIDATES$14);
                }
                target.set(defaultAutowireCandidates);
            }
        }
        
        /**
         * Unsets the "default-autowire-candidates" attribute
         */
        public void unsetDefaultAutowireCandidates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTAUTOWIRECANDIDATES$14);
            }
        }
        
        /**
         * Gets the "default-init-method" attribute
         */
        public java.lang.String getDefaultInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTINITMETHOD$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-init-method" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTINITMETHOD$16);
                return target;
            }
        }
        
        /**
         * True if has "default-init-method" attribute
         */
        public boolean isSetDefaultInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTINITMETHOD$16) != null;
            }
        }
        
        /**
         * Sets the "default-init-method" attribute
         */
        public void setDefaultInitMethod(java.lang.String defaultInitMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTINITMETHOD$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTINITMETHOD$16);
                }
                target.setStringValue(defaultInitMethod);
            }
        }
        
        /**
         * Sets (as xml) the "default-init-method" attribute
         */
        public void xsetDefaultInitMethod(org.apache.xmlbeans.XmlString defaultInitMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTINITMETHOD$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTINITMETHOD$16);
                }
                target.set(defaultInitMethod);
            }
        }
        
        /**
         * Unsets the "default-init-method" attribute
         */
        public void unsetDefaultInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTINITMETHOD$16);
            }
        }
        
        /**
         * Gets the "default-destroy-method" attribute
         */
        public java.lang.String getDefaultDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTDESTROYMETHOD$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-destroy-method" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTDESTROYMETHOD$18);
                return target;
            }
        }
        
        /**
         * True if has "default-destroy-method" attribute
         */
        public boolean isSetDefaultDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTDESTROYMETHOD$18) != null;
            }
        }
        
        /**
         * Sets the "default-destroy-method" attribute
         */
        public void setDefaultDestroyMethod(java.lang.String defaultDestroyMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTDESTROYMETHOD$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTDESTROYMETHOD$18);
                }
                target.setStringValue(defaultDestroyMethod);
            }
        }
        
        /**
         * Sets (as xml) the "default-destroy-method" attribute
         */
        public void xsetDefaultDestroyMethod(org.apache.xmlbeans.XmlString defaultDestroyMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTDESTROYMETHOD$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTDESTROYMETHOD$18);
                }
                target.set(defaultDestroyMethod);
            }
        }
        
        /**
         * Unsets the "default-destroy-method" attribute
         */
        public void unsetDefaultDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTDESTROYMETHOD$18);
            }
        }
        /**
         * An XML default-autowire(@).
         *
         * This is an atomic type that is a restriction of org.springframework.schema.beans.BeansDocument$Beans$DefaultAutowire.
         */
        public static class DefaultAutowireImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire
        {
            private static final long serialVersionUID = 1L;
            
            public DefaultAutowireImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DefaultAutowireImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
