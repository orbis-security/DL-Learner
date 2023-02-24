/*
 * An XML document type.
 * Localname: bean
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.BeanDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans;


/**
 * A document containing one bean(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public interface BeanDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BeanDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("beanc84fdoctype");
    
    /**
     * Gets the "bean" element
     */
    org.springframework.schema.beans.BeanDocument.Bean getBean();
    
    /**
     * Sets the "bean" element
     */
    void setBean(org.springframework.schema.beans.BeanDocument.Bean bean);
    
    /**
     * Appends and returns a new empty "bean" element
     */
    org.springframework.schema.beans.BeanDocument.Bean addNewBean();
    
    /**
     * An XML bean(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public interface Bean extends org.springframework.schema.beans.IdentifiedType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bean.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("bean8c83elemtype");
        
        /**
         * Gets the "description" element
         */
        org.springframework.schema.beans.DescriptionDocument.Description getDescription();
        
        /**
         * True if has "description" element
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(org.springframework.schema.beans.DescriptionDocument.Description description);
        
        /**
         * Appends and returns a new empty "description" element
         */
        org.springframework.schema.beans.DescriptionDocument.Description addNewDescription();
        
        /**
         * Unsets the "description" element
         */
        void unsetDescription();
        
        /**
         * Gets array of all "meta" elements
         */
        org.springframework.schema.beans.MetaType[] getMetaArray();
        
        /**
         * Gets ith "meta" element
         */
        org.springframework.schema.beans.MetaType getMetaArray(int i);
        
        /**
         * Returns number of "meta" element
         */
        int sizeOfMetaArray();
        
        /**
         * Sets array of all "meta" element
         */
        void setMetaArray(org.springframework.schema.beans.MetaType[] metaArray);
        
        /**
         * Sets ith "meta" element
         */
        void setMetaArray(int i, org.springframework.schema.beans.MetaType meta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "meta" element
         */
        org.springframework.schema.beans.MetaType insertNewMeta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "meta" element
         */
        org.springframework.schema.beans.MetaType addNewMeta();
        
        /**
         * Removes the ith "meta" element
         */
        void removeMeta(int i);
        
        /**
         * Gets array of all "constructor-arg" elements
         */
        org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg[] getConstructorArgArray();
        
        /**
         * Gets ith "constructor-arg" element
         */
        org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg getConstructorArgArray(int i);
        
        /**
         * Returns number of "constructor-arg" element
         */
        int sizeOfConstructorArgArray();
        
        /**
         * Sets array of all "constructor-arg" element
         */
        void setConstructorArgArray(org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg[] constructorArgArray);
        
        /**
         * Sets ith "constructor-arg" element
         */
        void setConstructorArgArray(int i, org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg constructorArg);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "constructor-arg" element
         */
        org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg insertNewConstructorArg(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "constructor-arg" element
         */
        org.springframework.schema.beans.ConstructorArgDocument.ConstructorArg addNewConstructorArg();
        
        /**
         * Removes the ith "constructor-arg" element
         */
        void removeConstructorArg(int i);
        
        /**
         * Gets array of all "property" elements
         */
        org.springframework.schema.beans.PropertyType[] getPropertyArray();
        
        /**
         * Gets ith "property" element
         */
        org.springframework.schema.beans.PropertyType getPropertyArray(int i);
        
        /**
         * Returns number of "property" element
         */
        int sizeOfPropertyArray();
        
        /**
         * Sets array of all "property" element
         */
        void setPropertyArray(org.springframework.schema.beans.PropertyType[] propertyArray);
        
        /**
         * Sets ith "property" element
         */
        void setPropertyArray(int i, org.springframework.schema.beans.PropertyType property);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        org.springframework.schema.beans.PropertyType insertNewProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        org.springframework.schema.beans.PropertyType addNewProperty();
        
        /**
         * Removes the ith "property" element
         */
        void removeProperty(int i);
        
        /**
         * Gets array of all "qualifier" elements
         */
        org.springframework.schema.beans.QualifierDocument.Qualifier[] getQualifierArray();
        
        /**
         * Gets ith "qualifier" element
         */
        org.springframework.schema.beans.QualifierDocument.Qualifier getQualifierArray(int i);
        
        /**
         * Returns number of "qualifier" element
         */
        int sizeOfQualifierArray();
        
        /**
         * Sets array of all "qualifier" element
         */
        void setQualifierArray(org.springframework.schema.beans.QualifierDocument.Qualifier[] qualifierArray);
        
        /**
         * Sets ith "qualifier" element
         */
        void setQualifierArray(int i, org.springframework.schema.beans.QualifierDocument.Qualifier qualifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
         */
        org.springframework.schema.beans.QualifierDocument.Qualifier insertNewQualifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifier" element
         */
        org.springframework.schema.beans.QualifierDocument.Qualifier addNewQualifier();
        
        /**
         * Removes the ith "qualifier" element
         */
        void removeQualifier(int i);
        
        /**
         * Gets array of all "lookup-method" elements
         */
        org.springframework.schema.beans.LookupMethodDocument.LookupMethod[] getLookupMethodArray();
        
        /**
         * Gets ith "lookup-method" element
         */
        org.springframework.schema.beans.LookupMethodDocument.LookupMethod getLookupMethodArray(int i);
        
        /**
         * Returns number of "lookup-method" element
         */
        int sizeOfLookupMethodArray();
        
        /**
         * Sets array of all "lookup-method" element
         */
        void setLookupMethodArray(org.springframework.schema.beans.LookupMethodDocument.LookupMethod[] lookupMethodArray);
        
        /**
         * Sets ith "lookup-method" element
         */
        void setLookupMethodArray(int i, org.springframework.schema.beans.LookupMethodDocument.LookupMethod lookupMethod);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "lookup-method" element
         */
        org.springframework.schema.beans.LookupMethodDocument.LookupMethod insertNewLookupMethod(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "lookup-method" element
         */
        org.springframework.schema.beans.LookupMethodDocument.LookupMethod addNewLookupMethod();
        
        /**
         * Removes the ith "lookup-method" element
         */
        void removeLookupMethod(int i);
        
        /**
         * Gets array of all "replaced-method" elements
         */
        org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod[] getReplacedMethodArray();
        
        /**
         * Gets ith "replaced-method" element
         */
        org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod getReplacedMethodArray(int i);
        
        /**
         * Returns number of "replaced-method" element
         */
        int sizeOfReplacedMethodArray();
        
        /**
         * Sets array of all "replaced-method" element
         */
        void setReplacedMethodArray(org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod[] replacedMethodArray);
        
        /**
         * Sets ith "replaced-method" element
         */
        void setReplacedMethodArray(int i, org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod replacedMethod);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "replaced-method" element
         */
        org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod insertNewReplacedMethod(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "replaced-method" element
         */
        org.springframework.schema.beans.ReplacedMethodDocument.ReplacedMethod addNewReplacedMethod();
        
        /**
         * Removes the ith "replaced-method" element
         */
        void removeReplacedMethod(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * Gets the "class" attribute
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.apache.xmlbeans.XmlString xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.lang.String class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.apache.xmlbeans.XmlString class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "parent" attribute
         */
        java.lang.String getParent();
        
        /**
         * Gets (as xml) the "parent" attribute
         */
        org.apache.xmlbeans.XmlString xgetParent();
        
        /**
         * True if has "parent" attribute
         */
        boolean isSetParent();
        
        /**
         * Sets the "parent" attribute
         */
        void setParent(java.lang.String parent);
        
        /**
         * Sets (as xml) the "parent" attribute
         */
        void xsetParent(org.apache.xmlbeans.XmlString parent);
        
        /**
         * Unsets the "parent" attribute
         */
        void unsetParent();
        
        /**
         * Gets the "scope" attribute
         */
        java.lang.String getScope();
        
        /**
         * Gets (as xml) the "scope" attribute
         */
        org.apache.xmlbeans.XmlString xgetScope();
        
        /**
         * True if has "scope" attribute
         */
        boolean isSetScope();
        
        /**
         * Sets the "scope" attribute
         */
        void setScope(java.lang.String scope);
        
        /**
         * Sets (as xml) the "scope" attribute
         */
        void xsetScope(org.apache.xmlbeans.XmlString scope);
        
        /**
         * Unsets the "scope" attribute
         */
        void unsetScope();
        
        /**
         * Gets the "abstract" attribute
         */
        boolean getAbstract();
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetAbstract();
        
        /**
         * True if has "abstract" attribute
         */
        boolean isSetAbstract();
        
        /**
         * Sets the "abstract" attribute
         */
        void setAbstract(boolean xabstract);
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract);
        
        /**
         * Unsets the "abstract" attribute
         */
        void unsetAbstract();
        
        /**
         * Gets the "lazy-init" attribute
         */
        org.springframework.schema.beans.DefaultableBoolean.Enum getLazyInit();
        
        /**
         * Gets (as xml) the "lazy-init" attribute
         */
        org.springframework.schema.beans.DefaultableBoolean xgetLazyInit();
        
        /**
         * True if has "lazy-init" attribute
         */
        boolean isSetLazyInit();
        
        /**
         * Sets the "lazy-init" attribute
         */
        void setLazyInit(org.springframework.schema.beans.DefaultableBoolean.Enum lazyInit);
        
        /**
         * Sets (as xml) the "lazy-init" attribute
         */
        void xsetLazyInit(org.springframework.schema.beans.DefaultableBoolean lazyInit);
        
        /**
         * Unsets the "lazy-init" attribute
         */
        void unsetLazyInit();
        
        /**
         * Gets the "autowire" attribute
         */
        org.springframework.schema.beans.BeanDocument.Bean.Autowire.Enum getAutowire();
        
        /**
         * Gets (as xml) the "autowire" attribute
         */
        org.springframework.schema.beans.BeanDocument.Bean.Autowire xgetAutowire();
        
        /**
         * True if has "autowire" attribute
         */
        boolean isSetAutowire();
        
        /**
         * Sets the "autowire" attribute
         */
        void setAutowire(org.springframework.schema.beans.BeanDocument.Bean.Autowire.Enum autowire);
        
        /**
         * Sets (as xml) the "autowire" attribute
         */
        void xsetAutowire(org.springframework.schema.beans.BeanDocument.Bean.Autowire autowire);
        
        /**
         * Unsets the "autowire" attribute
         */
        void unsetAutowire();
        
        /**
         * Gets the "depends-on" attribute
         */
        java.lang.String getDependsOn();
        
        /**
         * Gets (as xml) the "depends-on" attribute
         */
        org.apache.xmlbeans.XmlString xgetDependsOn();
        
        /**
         * True if has "depends-on" attribute
         */
        boolean isSetDependsOn();
        
        /**
         * Sets the "depends-on" attribute
         */
        void setDependsOn(java.lang.String dependsOn);
        
        /**
         * Sets (as xml) the "depends-on" attribute
         */
        void xsetDependsOn(org.apache.xmlbeans.XmlString dependsOn);
        
        /**
         * Unsets the "depends-on" attribute
         */
        void unsetDependsOn();
        
        /**
         * Gets the "autowire-candidate" attribute
         */
        org.springframework.schema.beans.DefaultableBoolean.Enum getAutowireCandidate();
        
        /**
         * Gets (as xml) the "autowire-candidate" attribute
         */
        org.springframework.schema.beans.DefaultableBoolean xgetAutowireCandidate();
        
        /**
         * True if has "autowire-candidate" attribute
         */
        boolean isSetAutowireCandidate();
        
        /**
         * Sets the "autowire-candidate" attribute
         */
        void setAutowireCandidate(org.springframework.schema.beans.DefaultableBoolean.Enum autowireCandidate);
        
        /**
         * Sets (as xml) the "autowire-candidate" attribute
         */
        void xsetAutowireCandidate(org.springframework.schema.beans.DefaultableBoolean autowireCandidate);
        
        /**
         * Unsets the "autowire-candidate" attribute
         */
        void unsetAutowireCandidate();
        
        /**
         * Gets the "primary" attribute
         */
        boolean getPrimary();
        
        /**
         * Gets (as xml) the "primary" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetPrimary();
        
        /**
         * True if has "primary" attribute
         */
        boolean isSetPrimary();
        
        /**
         * Sets the "primary" attribute
         */
        void setPrimary(boolean primary);
        
        /**
         * Sets (as xml) the "primary" attribute
         */
        void xsetPrimary(org.apache.xmlbeans.XmlBoolean primary);
        
        /**
         * Unsets the "primary" attribute
         */
        void unsetPrimary();
        
        /**
         * Gets the "init-method" attribute
         */
        java.lang.String getInitMethod();
        
        /**
         * Gets (as xml) the "init-method" attribute
         */
        org.apache.xmlbeans.XmlString xgetInitMethod();
        
        /**
         * True if has "init-method" attribute
         */
        boolean isSetInitMethod();
        
        /**
         * Sets the "init-method" attribute
         */
        void setInitMethod(java.lang.String initMethod);
        
        /**
         * Sets (as xml) the "init-method" attribute
         */
        void xsetInitMethod(org.apache.xmlbeans.XmlString initMethod);
        
        /**
         * Unsets the "init-method" attribute
         */
        void unsetInitMethod();
        
        /**
         * Gets the "destroy-method" attribute
         */
        java.lang.String getDestroyMethod();
        
        /**
         * Gets (as xml) the "destroy-method" attribute
         */
        org.apache.xmlbeans.XmlString xgetDestroyMethod();
        
        /**
         * True if has "destroy-method" attribute
         */
        boolean isSetDestroyMethod();
        
        /**
         * Sets the "destroy-method" attribute
         */
        void setDestroyMethod(java.lang.String destroyMethod);
        
        /**
         * Sets (as xml) the "destroy-method" attribute
         */
        void xsetDestroyMethod(org.apache.xmlbeans.XmlString destroyMethod);
        
        /**
         * Unsets the "destroy-method" attribute
         */
        void unsetDestroyMethod();
        
        /**
         * Gets the "factory-method" attribute
         */
        java.lang.String getFactoryMethod();
        
        /**
         * Gets (as xml) the "factory-method" attribute
         */
        org.apache.xmlbeans.XmlString xgetFactoryMethod();
        
        /**
         * True if has "factory-method" attribute
         */
        boolean isSetFactoryMethod();
        
        /**
         * Sets the "factory-method" attribute
         */
        void setFactoryMethod(java.lang.String factoryMethod);
        
        /**
         * Sets (as xml) the "factory-method" attribute
         */
        void xsetFactoryMethod(org.apache.xmlbeans.XmlString factoryMethod);
        
        /**
         * Unsets the "factory-method" attribute
         */
        void unsetFactoryMethod();
        
        /**
         * Gets the "factory-bean" attribute
         */
        java.lang.String getFactoryBean();
        
        /**
         * Gets (as xml) the "factory-bean" attribute
         */
        org.apache.xmlbeans.XmlString xgetFactoryBean();
        
        /**
         * True if has "factory-bean" attribute
         */
        boolean isSetFactoryBean();
        
        /**
         * Sets the "factory-bean" attribute
         */
        void setFactoryBean(java.lang.String factoryBean);
        
        /**
         * Sets (as xml) the "factory-bean" attribute
         */
        void xsetFactoryBean(org.apache.xmlbeans.XmlString factoryBean);
        
        /**
         * Unsets the "factory-bean" attribute
         */
        void unsetFactoryBean();
        
        /**
         * An XML autowire(@).
         *
         * This is an atomic type that is a restriction of org.springframework.schema.beans.BeanDocument$Bean$Autowire.
         */
        public interface Autowire extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Autowire.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("autowiree657attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum DEFAULT = Enum.forString("default");
            static final Enum NO = Enum.forString("no");
            static final Enum BY_NAME = Enum.forString("byName");
            static final Enum BY_TYPE = Enum.forString("byType");
            static final Enum CONSTRUCTOR = Enum.forString("constructor");
            
            static final int INT_DEFAULT = Enum.INT_DEFAULT;
            static final int INT_NO = Enum.INT_NO;
            static final int INT_BY_NAME = Enum.INT_BY_NAME;
            static final int INT_BY_TYPE = Enum.INT_BY_TYPE;
            static final int INT_CONSTRUCTOR = Enum.INT_CONSTRUCTOR;
            
            /**
             * Enumeration value class for org.springframework.schema.beans.BeanDocument$Bean$Autowire.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DEFAULT
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_DEFAULT = 1;
                static final int INT_NO = 2;
                static final int INT_BY_NAME = 3;
                static final int INT_BY_TYPE = 4;
                static final int INT_CONSTRUCTOR = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("default", INT_DEFAULT),
                      new Enum("no", INT_NO),
                      new Enum("byName", INT_BY_NAME),
                      new Enum("byType", INT_BY_TYPE),
                      new Enum("constructor", INT_CONSTRUCTOR),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.springframework.schema.beans.BeanDocument.Bean.Autowire newValue(java.lang.Object obj) {
                  return (org.springframework.schema.beans.BeanDocument.Bean.Autowire) type.newValue( obj ); }
                
                public static org.springframework.schema.beans.BeanDocument.Bean.Autowire newInstance() {
                  return (org.springframework.schema.beans.BeanDocument.Bean.Autowire) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.springframework.schema.beans.BeanDocument.Bean.Autowire newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.springframework.schema.beans.BeanDocument.Bean.Autowire) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.springframework.schema.beans.BeanDocument.Bean newInstance() {
              return (org.springframework.schema.beans.BeanDocument.Bean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.springframework.schema.beans.BeanDocument.Bean newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.springframework.schema.beans.BeanDocument.Bean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.springframework.schema.beans.BeanDocument newInstance() {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.springframework.schema.beans.BeanDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.springframework.schema.beans.BeanDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.springframework.schema.beans.BeanDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.BeanDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.BeanDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.BeanDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
