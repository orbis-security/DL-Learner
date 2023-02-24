/*
 * An XML document type.
 * Localname: bean
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.BeanDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans.impl;
/**
 * A document containing one bean(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public class BeanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.springframework.schema.beans.BeanDocument
{
    private static final long serialVersionUID = 1L;
    
    public BeanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEAN$0 = 
        new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "bean");
    
    
    /**
     * Gets the "bean" element
     */
    public org.springframework.schema.beans.BeanDocument.Bean getBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bean" element
     */
    public void setBean(org.springframework.schema.beans.BeanDocument.Bean bean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().find_element_user(BEAN$0, 0);
            if (target == null)
            {
                target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().add_element_user(BEAN$0);
            }
            target.set(bean);
        }
    }
    
    /**
     * Appends and returns a new empty "bean" element
     */
    public org.springframework.schema.beans.BeanDocument.Bean addNewBean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.springframework.schema.beans.BeanDocument.Bean target = null;
            target = (org.springframework.schema.beans.BeanDocument.Bean)get_store().add_element_user(BEAN$0);
            return target;
        }
    }
    /**
     * An XML bean(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public static class BeanImpl extends org.springframework.schema.beans.impl.IdentifiedTypeImpl implements org.springframework.schema.beans.BeanDocument.Bean
    {
        private static final long serialVersionUID = 1L;
        
        public BeanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "description");
        private static final javax.xml.namespace.QName META$2 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "meta");
        private static final javax.xml.namespace.QName CONSTRUCTORARG$4 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "constructor-arg");
        private static final javax.xml.namespace.QName PROPERTY$6 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "property");
        private static final javax.xml.namespace.QName QUALIFIER$8 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "qualifier");
        private static final javax.xml.namespace.QName LOOKUPMETHOD$10 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "lookup-method");
        private static final javax.xml.namespace.QName REPLACEDMETHOD$12 = 
            new javax.xml.namespace.QName("http://www.springframework.org/schema/beans", "replaced-method");
        private static final javax.xml.namespace.QName NAME$14 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName CLASS1$16 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName PARENT$18 = 
            new javax.xml.namespace.QName("", "parent");
        private static final javax.xml.namespace.QName SCOPE$20 = 
            new javax.xml.namespace.QName("", "scope");
        private static final javax.xml.namespace.QName ABSTRACT$22 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName LAZYINIT$24 = 
            new javax.xml.namespace.QName("", "lazy-init");
        private static final javax.xml.namespace.QName AUTOWIRE$26 = 
            new javax.xml.namespace.QName("", "autowire");
        private static final javax.xml.namespace.QName DEPENDSON$28 = 
            new javax.xml.namespace.QName("", "depends-on");
        private static final javax.xml.namespace.QName AUTOWIRECANDIDATE$30 = 
            new javax.xml.namespace.QName("", "autowire-candidate");
        private static final javax.xml.namespace.QName PRIMARY$32 = 
            new javax.xml.namespace.QName("", "primary");
        private static final javax.xml.namespace.QName INITMETHOD$34 = 
            new javax.xml.namespace.QName("", "init-method");
        private static final javax.xml.namespace.QName DESTROYMETHOD$36 = 
            new javax.xml.namespace.QName("", "destroy-method");
        private static final javax.xml.namespace.QName FACTORYMETHOD$38 = 
            new javax.xml.namespace.QName("", "factory-method");
        private static final javax.xml.namespace.QName FACTORYBEAN$40 = 
            new javax.xml.namespace.QName("", "factory-bean");
        
        
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
         * Gets array of all "meta" elements
         */
        public org.springframework.schema.beans.MetaType[] getMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(META$2, targetList);
                org.springframework.schema.beans.MetaType[] result = new org.springframework.schema.beans.MetaType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "meta" element
         */
        public org.springframework.schema.beans.MetaType getMetaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.MetaType target = null;
                target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(META$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "meta" element
         */
        public int sizeOfMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(META$2);
            }
        }
        
        /**
         * Sets array of all "meta" element
         */
        public void setMetaArray(org.springframework.schema.beans.MetaType[] metaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(metaArray, META$2);
            }
        }
        
        /**
         * Sets ith "meta" element
         */
        public void setMetaArray(int i, org.springframework.schema.beans.MetaType meta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.MetaType target = null;
                target = (org.springframework.schema.beans.MetaType)get_store().find_element_user(META$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(meta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "meta" element
         */
        public org.springframework.schema.beans.MetaType insertNewMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.MetaType target = null;
                target = (org.springframework.schema.beans.MetaType)get_store().insert_element_user(META$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "meta" element
         */
        public org.springframework.schema.beans.MetaType addNewMeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.MetaType target = null;
                target = (org.springframework.schema.beans.MetaType)get_store().add_element_user(META$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "meta" element
         */
        public void removeMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(META$2, i);
            }
        }
        
        /**
         * Gets array of all "constructor-arg" elements
         */
        public org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg[] getConstructorArgArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONSTRUCTORARG$4, targetList);
                org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg[] result = new org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "constructor-arg" element
         */
        public org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg getConstructorArgArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg target = null;
                target = (org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg)get_store().find_element_user(CONSTRUCTORARG$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "constructor-arg" element
         */
        public int sizeOfConstructorArgArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSTRUCTORARG$4);
            }
        }
        
        /**
         * Sets array of all "constructor-arg" element
         */
        public void setConstructorArgArray(org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg[] constructorArgArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(constructorArgArray, CONSTRUCTORARG$4);
            }
        }
        
        /**
         * Sets ith "constructor-arg" element
         */
        public void setConstructorArgArray(int i, org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg constructorArg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg target = null;
                target = (org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg)get_store().find_element_user(CONSTRUCTORARG$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(constructorArg);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "constructor-arg" element
         */
        public org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg insertNewConstructorArg(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg target = null;
                target = (org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg)get_store().insert_element_user(CONSTRUCTORARG$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "constructor-arg" element
         */
        public org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg addNewConstructorArg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg target = null;
                target = (org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg)get_store().add_element_user(CONSTRUCTORARG$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "constructor-arg" element
         */
        public void removeConstructorArg(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSTRUCTORARG$4, i);
            }
        }
        
        /**
         * Gets array of all "property" elements
         */
        public org.springframework.schema.beans.PropertyType[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$6, targetList);
                org.springframework.schema.beans.PropertyType[] result = new org.springframework.schema.beans.PropertyType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "property" element
         */
        public org.springframework.schema.beans.PropertyType getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.PropertyType target = null;
                target = (org.springframework.schema.beans.PropertyType)get_store().find_element_user(PROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$6);
            }
        }
        
        /**
         * Sets array of all "property" element
         */
        public void setPropertyArray(org.springframework.schema.beans.PropertyType[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$6);
            }
        }
        
        /**
         * Sets ith "property" element
         */
        public void setPropertyArray(int i, org.springframework.schema.beans.PropertyType property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.PropertyType target = null;
                target = (org.springframework.schema.beans.PropertyType)get_store().find_element_user(PROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        public org.springframework.schema.beans.PropertyType insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.PropertyType target = null;
                target = (org.springframework.schema.beans.PropertyType)get_store().insert_element_user(PROPERTY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        public org.springframework.schema.beans.PropertyType addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.PropertyType target = null;
                target = (org.springframework.schema.beans.PropertyType)get_store().add_element_user(PROPERTY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$6, i);
            }
        }
        
        /**
         * Gets array of all "qualifier" elements
         */
        public org.springframework.schema.beans.QualifierDocument.Qualifier[] getQualifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(QUALIFIER$8, targetList);
                org.springframework.schema.beans.QualifierDocument.Qualifier[] result = new org.springframework.schema.beans.QualifierDocument.Qualifier[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "qualifier" element
         */
        public org.springframework.schema.beans.QualifierDocument.Qualifier getQualifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.QualifierDocument.Qualifier target = null;
                target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().find_element_user(QUALIFIER$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "qualifier" element
         */
        public int sizeOfQualifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUALIFIER$8);
            }
        }
        
        /**
         * Sets array of all "qualifier" element
         */
        public void setQualifierArray(org.springframework.schema.beans.QualifierDocument.Qualifier[] qualifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(qualifierArray, QUALIFIER$8);
            }
        }
        
        /**
         * Sets ith "qualifier" element
         */
        public void setQualifierArray(int i, org.springframework.schema.beans.QualifierDocument.Qualifier qualifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.QualifierDocument.Qualifier target = null;
                target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().find_element_user(QUALIFIER$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(qualifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
         */
        public org.springframework.schema.beans.QualifierDocument.Qualifier insertNewQualifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.QualifierDocument.Qualifier target = null;
                target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().insert_element_user(QUALIFIER$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifier" element
         */
        public org.springframework.schema.beans.QualifierDocument.Qualifier addNewQualifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.QualifierDocument.Qualifier target = null;
                target = (org.springframework.schema.beans.QualifierDocument.Qualifier)get_store().add_element_user(QUALIFIER$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "qualifier" element
         */
        public void removeQualifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUALIFIER$8, i);
            }
        }
        
        /**
         * Gets array of all "lookup-method" elements
         */
        public org.springframework.schema.beans.LookupMethodDocument.LookupMethod[] getLookupMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOOKUPMETHOD$10, targetList);
                org.springframework.schema.beans.LookupMethodDocument.LookupMethod[] result = new org.springframework.schema.beans.LookupMethodDocument.LookupMethod[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "lookup-method" element
         */
        public org.springframework.schema.beans.LookupMethodDocument.LookupMethod getLookupMethodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.LookupMethodDocument.LookupMethod target = null;
                target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().find_element_user(LOOKUPMETHOD$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "lookup-method" element
         */
        public int sizeOfLookupMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOOKUPMETHOD$10);
            }
        }
        
        /**
         * Sets array of all "lookup-method" element
         */
        public void setLookupMethodArray(org.springframework.schema.beans.LookupMethodDocument.LookupMethod[] lookupMethodArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lookupMethodArray, LOOKUPMETHOD$10);
            }
        }
        
        /**
         * Sets ith "lookup-method" element
         */
        public void setLookupMethodArray(int i, org.springframework.schema.beans.LookupMethodDocument.LookupMethod lookupMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.LookupMethodDocument.LookupMethod target = null;
                target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().find_element_user(LOOKUPMETHOD$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(lookupMethod);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "lookup-method" element
         */
        public org.springframework.schema.beans.LookupMethodDocument.LookupMethod insertNewLookupMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.LookupMethodDocument.LookupMethod target = null;
                target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().insert_element_user(LOOKUPMETHOD$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "lookup-method" element
         */
        public org.springframework.schema.beans.LookupMethodDocument.LookupMethod addNewLookupMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.LookupMethodDocument.LookupMethod target = null;
                target = (org.springframework.schema.beans.LookupMethodDocument.LookupMethod)get_store().add_element_user(LOOKUPMETHOD$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "lookup-method" element
         */
        public void removeLookupMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOOKUPMETHOD$10, i);
            }
        }
        
        /**
         * Gets array of all "replaced-method" elements
         */
        public org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod[] getReplacedMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPLACEDMETHOD$12, targetList);
                org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod[] result = new org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "replaced-method" element
         */
        public org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod getReplacedMethodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod target = null;
                target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().find_element_user(REPLACEDMETHOD$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "replaced-method" element
         */
        public int sizeOfReplacedMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPLACEDMETHOD$12);
            }
        }
        
        /**
         * Sets array of all "replaced-method" element
         */
        public void setReplacedMethodArray(org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod[] replacedMethodArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(replacedMethodArray, REPLACEDMETHOD$12);
            }
        }
        
        /**
         * Sets ith "replaced-method" element
         */
        public void setReplacedMethodArray(int i, org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod replacedMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod target = null;
                target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().find_element_user(REPLACEDMETHOD$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(replacedMethod);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "replaced-method" element
         */
        public org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod insertNewReplacedMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod target = null;
                target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().insert_element_user(REPLACEDMETHOD$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "replaced-method" element
         */
        public org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod addNewReplacedMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod target = null;
                target = (org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod)get_store().add_element_user(REPLACEDMETHOD$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "replaced-method" element
         */
        public void removeReplacedMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPLACEDMETHOD$12, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
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
                return get_store().find_attribute_user(NAME$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$14);
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
                get_store().remove_attribute(NAME$14);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$16);
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$16) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$16);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$16);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENT$18);
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
                return get_store().find_attribute_user(PARENT$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENT$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARENT$18);
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
                get_store().remove_attribute(PARENT$18);
            }
        }
        
        /**
         * Gets the "scope" attribute
         */
        public java.lang.String getScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scope" attribute
         */
        public org.apache.xmlbeans.XmlString xgetScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCOPE$20);
                return target;
            }
        }
        
        /**
         * True if has "scope" attribute
         */
        public boolean isSetScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCOPE$20) != null;
            }
        }
        
        /**
         * Sets the "scope" attribute
         */
        public void setScope(java.lang.String scope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCOPE$20);
                }
                target.setStringValue(scope);
            }
        }
        
        /**
         * Sets (as xml) the "scope" attribute
         */
        public void xsetScope(org.apache.xmlbeans.XmlString scope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCOPE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCOPE$20);
                }
                target.set(scope);
            }
        }
        
        /**
         * Unsets the "scope" attribute
         */
        public void unsetScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCOPE$20);
            }
        }
        
        /**
         * Gets the "abstract" attribute
         */
        public boolean getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$22);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$22);
                return target;
            }
        }
        
        /**
         * True if has "abstract" attribute
         */
        public boolean isSetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABSTRACT$22) != null;
            }
        }
        
        /**
         * Sets the "abstract" attribute
         */
        public void setAbstract(boolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$22);
                }
                target.setBooleanValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$22);
                }
                target.set(xabstract);
            }
        }
        
        /**
         * Unsets the "abstract" attribute
         */
        public void unsetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABSTRACT$22);
            }
        }
        
        /**
         * Gets the "lazy-init" attribute
         */
        public org.springframework.schema.beans.DefaultableBoolean.Enum getLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAZYINIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LAZYINIT$24);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.springframework.schema.beans.DefaultableBoolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "lazy-init" attribute
         */
        public org.springframework.schema.beans.DefaultableBoolean xgetLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DefaultableBoolean target = null;
                target = (org.springframework.schema.beans.DefaultableBoolean)get_store().find_attribute_user(LAZYINIT$24);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.DefaultableBoolean)get_default_attribute_value(LAZYINIT$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "lazy-init" attribute
         */
        public boolean isSetLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LAZYINIT$24) != null;
            }
        }
        
        /**
         * Sets the "lazy-init" attribute
         */
        public void setLazyInit(org.springframework.schema.beans.DefaultableBoolean.Enum lazyInit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAZYINIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAZYINIT$24);
                }
                target.setEnumValue(lazyInit);
            }
        }
        
        /**
         * Sets (as xml) the "lazy-init" attribute
         */
        public void xsetLazyInit(org.springframework.schema.beans.DefaultableBoolean lazyInit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DefaultableBoolean target = null;
                target = (org.springframework.schema.beans.DefaultableBoolean)get_store().find_attribute_user(LAZYINIT$24);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.DefaultableBoolean)get_store().add_attribute_user(LAZYINIT$24);
                }
                target.set(lazyInit);
            }
        }
        
        /**
         * Unsets the "lazy-init" attribute
         */
        public void unsetLazyInit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LAZYINIT$24);
            }
        }
        
        /**
         * Gets the "autowire" attribute
         */
        public org.springframework.schema.beans.BeanDocument.Bean.Autowire.Enum getAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOWIRE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOWIRE$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.springframework.schema.beans.BeanDocument.Bean.Autowire.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "autowire" attribute
         */
        public org.springframework.schema.beans.BeanDocument.Bean.Autowire xgetAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeanDocument.Bean.Autowire target = null;
                target = (org.springframework.schema.beans.BeanDocument.Bean.Autowire)get_store().find_attribute_user(AUTOWIRE$26);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.BeanDocument.Bean.Autowire)get_default_attribute_value(AUTOWIRE$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "autowire" attribute
         */
        public boolean isSetAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOWIRE$26) != null;
            }
        }
        
        /**
         * Sets the "autowire" attribute
         */
        public void setAutowire(org.springframework.schema.beans.BeanDocument.Bean.Autowire.Enum autowire)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOWIRE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOWIRE$26);
                }
                target.setEnumValue(autowire);
            }
        }
        
        /**
         * Sets (as xml) the "autowire" attribute
         */
        public void xsetAutowire(org.springframework.schema.beans.BeanDocument.Bean.Autowire autowire)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.BeanDocument.Bean.Autowire target = null;
                target = (org.springframework.schema.beans.BeanDocument.Bean.Autowire)get_store().find_attribute_user(AUTOWIRE$26);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.BeanDocument.Bean.Autowire)get_store().add_attribute_user(AUTOWIRE$26);
                }
                target.set(autowire);
            }
        }
        
        /**
         * Unsets the "autowire" attribute
         */
        public void unsetAutowire()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOWIRE$26);
            }
        }
        
        /**
         * Gets the "depends-on" attribute
         */
        public java.lang.String getDependsOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPENDSON$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "depends-on" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDependsOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEPENDSON$28);
                return target;
            }
        }
        
        /**
         * True if has "depends-on" attribute
         */
        public boolean isSetDependsOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEPENDSON$28) != null;
            }
        }
        
        /**
         * Sets the "depends-on" attribute
         */
        public void setDependsOn(java.lang.String dependsOn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPENDSON$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPENDSON$28);
                }
                target.setStringValue(dependsOn);
            }
        }
        
        /**
         * Sets (as xml) the "depends-on" attribute
         */
        public void xsetDependsOn(org.apache.xmlbeans.XmlString dependsOn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEPENDSON$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEPENDSON$28);
                }
                target.set(dependsOn);
            }
        }
        
        /**
         * Unsets the "depends-on" attribute
         */
        public void unsetDependsOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEPENDSON$28);
            }
        }
        
        /**
         * Gets the "autowire-candidate" attribute
         */
        public org.springframework.schema.beans.DefaultableBoolean.Enum getAutowireCandidate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOWIRECANDIDATE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOWIRECANDIDATE$30);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.springframework.schema.beans.DefaultableBoolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "autowire-candidate" attribute
         */
        public org.springframework.schema.beans.DefaultableBoolean xgetAutowireCandidate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DefaultableBoolean target = null;
                target = (org.springframework.schema.beans.DefaultableBoolean)get_store().find_attribute_user(AUTOWIRECANDIDATE$30);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.DefaultableBoolean)get_default_attribute_value(AUTOWIRECANDIDATE$30);
                }
                return target;
            }
        }
        
        /**
         * True if has "autowire-candidate" attribute
         */
        public boolean isSetAutowireCandidate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOWIRECANDIDATE$30) != null;
            }
        }
        
        /**
         * Sets the "autowire-candidate" attribute
         */
        public void setAutowireCandidate(org.springframework.schema.beans.DefaultableBoolean.Enum autowireCandidate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOWIRECANDIDATE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOWIRECANDIDATE$30);
                }
                target.setEnumValue(autowireCandidate);
            }
        }
        
        /**
         * Sets (as xml) the "autowire-candidate" attribute
         */
        public void xsetAutowireCandidate(org.springframework.schema.beans.DefaultableBoolean autowireCandidate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.springframework.schema.beans.DefaultableBoolean target = null;
                target = (org.springframework.schema.beans.DefaultableBoolean)get_store().find_attribute_user(AUTOWIRECANDIDATE$30);
                if (target == null)
                {
                    target = (org.springframework.schema.beans.DefaultableBoolean)get_store().add_attribute_user(AUTOWIRECANDIDATE$30);
                }
                target.set(autowireCandidate);
            }
        }
        
        /**
         * Unsets the "autowire-candidate" attribute
         */
        public void unsetAutowireCandidate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOWIRECANDIDATE$30);
            }
        }
        
        /**
         * Gets the "primary" attribute
         */
        public boolean getPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARY$32);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "primary" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRIMARY$32);
                return target;
            }
        }
        
        /**
         * True if has "primary" attribute
         */
        public boolean isSetPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRIMARY$32) != null;
            }
        }
        
        /**
         * Sets the "primary" attribute
         */
        public void setPrimary(boolean primary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIMARY$32);
                }
                target.setBooleanValue(primary);
            }
        }
        
        /**
         * Sets (as xml) the "primary" attribute
         */
        public void xsetPrimary(org.apache.xmlbeans.XmlBoolean primary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRIMARY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRIMARY$32);
                }
                target.set(primary);
            }
        }
        
        /**
         * Unsets the "primary" attribute
         */
        public void unsetPrimary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRIMARY$32);
            }
        }
        
        /**
         * Gets the "init-method" attribute
         */
        public java.lang.String getInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITMETHOD$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "init-method" attribute
         */
        public org.apache.xmlbeans.XmlString xgetInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INITMETHOD$34);
                return target;
            }
        }
        
        /**
         * True if has "init-method" attribute
         */
        public boolean isSetInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INITMETHOD$34) != null;
            }
        }
        
        /**
         * Sets the "init-method" attribute
         */
        public void setInitMethod(java.lang.String initMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITMETHOD$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INITMETHOD$34);
                }
                target.setStringValue(initMethod);
            }
        }
        
        /**
         * Sets (as xml) the "init-method" attribute
         */
        public void xsetInitMethod(org.apache.xmlbeans.XmlString initMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INITMETHOD$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INITMETHOD$34);
                }
                target.set(initMethod);
            }
        }
        
        /**
         * Unsets the "init-method" attribute
         */
        public void unsetInitMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INITMETHOD$34);
            }
        }
        
        /**
         * Gets the "destroy-method" attribute
         */
        public java.lang.String getDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTROYMETHOD$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "destroy-method" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTROYMETHOD$36);
                return target;
            }
        }
        
        /**
         * True if has "destroy-method" attribute
         */
        public boolean isSetDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESTROYMETHOD$36) != null;
            }
        }
        
        /**
         * Sets the "destroy-method" attribute
         */
        public void setDestroyMethod(java.lang.String destroyMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTROYMETHOD$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTROYMETHOD$36);
                }
                target.setStringValue(destroyMethod);
            }
        }
        
        /**
         * Sets (as xml) the "destroy-method" attribute
         */
        public void xsetDestroyMethod(org.apache.xmlbeans.XmlString destroyMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTROYMETHOD$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESTROYMETHOD$36);
                }
                target.set(destroyMethod);
            }
        }
        
        /**
         * Unsets the "destroy-method" attribute
         */
        public void unsetDestroyMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESTROYMETHOD$36);
            }
        }
        
        /**
         * Gets the "factory-method" attribute
         */
        public java.lang.String getFactoryMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYMETHOD$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "factory-method" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFactoryMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYMETHOD$38);
                return target;
            }
        }
        
        /**
         * True if has "factory-method" attribute
         */
        public boolean isSetFactoryMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FACTORYMETHOD$38) != null;
            }
        }
        
        /**
         * Sets the "factory-method" attribute
         */
        public void setFactoryMethod(java.lang.String factoryMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYMETHOD$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FACTORYMETHOD$38);
                }
                target.setStringValue(factoryMethod);
            }
        }
        
        /**
         * Sets (as xml) the "factory-method" attribute
         */
        public void xsetFactoryMethod(org.apache.xmlbeans.XmlString factoryMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYMETHOD$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FACTORYMETHOD$38);
                }
                target.set(factoryMethod);
            }
        }
        
        /**
         * Unsets the "factory-method" attribute
         */
        public void unsetFactoryMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FACTORYMETHOD$38);
            }
        }
        
        /**
         * Gets the "factory-bean" attribute
         */
        public java.lang.String getFactoryBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYBEAN$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "factory-bean" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFactoryBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYBEAN$40);
                return target;
            }
        }
        
        /**
         * True if has "factory-bean" attribute
         */
        public boolean isSetFactoryBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FACTORYBEAN$40) != null;
            }
        }
        
        /**
         * Sets the "factory-bean" attribute
         */
        public void setFactoryBean(java.lang.String factoryBean)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTORYBEAN$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FACTORYBEAN$40);
                }
                target.setStringValue(factoryBean);
            }
        }
        
        /**
         * Sets (as xml) the "factory-bean" attribute
         */
        public void xsetFactoryBean(org.apache.xmlbeans.XmlString factoryBean)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACTORYBEAN$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FACTORYBEAN$40);
                }
                target.set(factoryBean);
            }
        }
        
        /**
         * Unsets the "factory-bean" attribute
         */
        public void unsetFactoryBean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FACTORYBEAN$40);
            }
        }
        /**
         * An XML autowire(@).
         *
         * This is an atomic type that is a restriction of org.springframework.schema.beans.BeanDocument$Bean$Autowire.
         */
        public static class AutowireImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.springframework.schema.beans.BeanDocument.Bean.Autowire
        {
            private static final long serialVersionUID = 1L;
            
            public AutowireImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AutowireImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
