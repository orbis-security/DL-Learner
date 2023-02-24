/*
 * An XML document type.
 * Localname: beans
 * Namespace: http://www.springframework.org/schema/beans
 * Java type: org.springframework.schema.beans.BeansDocument
 *
 * Automatically generated - do not modify.
 */
package org.springframework.schema.beans;


/**
 * A document containing one beans(@http://www.springframework.org/schema/beans) element.
 *
 * This is a complex type.
 */
public interface BeansDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BeansDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("beansb110doctype");
    
    /**
     * Gets the "beans" element
     */
    org.springframework.schema.beans.BeansDocument.Beans getBeans();
    
    /**
     * Sets the "beans" element
     */
    void setBeans(org.springframework.schema.beans.BeansDocument.Beans beans);
    
    /**
     * Appends and returns a new empty "beans" element
     */
    org.springframework.schema.beans.BeansDocument.Beans addNewBeans();
    
    /**
     * An XML beans(@http://www.springframework.org/schema/beans).
     *
     * This is a complex type.
     */
    public interface Beans extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Beans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("beansc0bfelemtype");
        
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
         * Gets array of all "import" elements
         */
        org.springframework.schema.beans.ImportDocument.Import[] getImportArray();
        
        /**
         * Gets ith "import" element
         */
        org.springframework.schema.beans.ImportDocument.Import getImportArray(int i);
        
        /**
         * Returns number of "import" element
         */
        int sizeOfImportArray();
        
        /**
         * Sets array of all "import" element
         */
        void setImportArray(org.springframework.schema.beans.ImportDocument.Import[] ximportArray);
        
        /**
         * Sets ith "import" element
         */
        void setImportArray(int i, org.springframework.schema.beans.ImportDocument.Import ximport);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        org.springframework.schema.beans.ImportDocument.Import insertNewImport(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        org.springframework.schema.beans.ImportDocument.Import addNewImport();
        
        /**
         * Removes the ith "import" element
         */
        void removeImport(int i);
        
        /**
         * Gets array of all "alias" elements
         */
        org.springframework.schema.beans.AliasDocument.Alias[] getAliasArray();
        
        /**
         * Gets ith "alias" element
         */
        org.springframework.schema.beans.AliasDocument.Alias getAliasArray(int i);
        
        /**
         * Returns number of "alias" element
         */
        int sizeOfAliasArray();
        
        /**
         * Sets array of all "alias" element
         */
        void setAliasArray(org.springframework.schema.beans.AliasDocument.Alias[] aliasArray);
        
        /**
         * Sets ith "alias" element
         */
        void setAliasArray(int i, org.springframework.schema.beans.AliasDocument.Alias alias);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alias" element
         */
        org.springframework.schema.beans.AliasDocument.Alias insertNewAlias(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alias" element
         */
        org.springframework.schema.beans.AliasDocument.Alias addNewAlias();
        
        /**
         * Removes the ith "alias" element
         */
        void removeAlias(int i);
        
        /**
         * Gets array of all "bean" elements
         */
        org.springframework.schema.beans.BeanDocument.Bean[] getBeanArray();
        
        /**
         * Gets ith "bean" element
         */
        org.springframework.schema.beans.BeanDocument.Bean getBeanArray(int i);
        
        /**
         * Returns number of "bean" element
         */
        int sizeOfBeanArray();
        
        /**
         * Sets array of all "bean" element
         */
        void setBeanArray(org.springframework.schema.beans.BeanDocument.Bean[] beanArray);
        
        /**
         * Sets ith "bean" element
         */
        void setBeanArray(int i, org.springframework.schema.beans.BeanDocument.Bean bean);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bean" element
         */
        org.springframework.schema.beans.BeanDocument.Bean insertNewBean(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bean" element
         */
        org.springframework.schema.beans.BeanDocument.Bean addNewBean();
        
        /**
         * Removes the ith "bean" element
         */
        void removeBean(int i);
        
        /**
         * Gets the "default-lazy-init" attribute
         */
        boolean getDefaultLazyInit();
        
        /**
         * Gets (as xml) the "default-lazy-init" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetDefaultLazyInit();
        
        /**
         * True if has "default-lazy-init" attribute
         */
        boolean isSetDefaultLazyInit();
        
        /**
         * Sets the "default-lazy-init" attribute
         */
        void setDefaultLazyInit(boolean defaultLazyInit);
        
        /**
         * Sets (as xml) the "default-lazy-init" attribute
         */
        void xsetDefaultLazyInit(org.apache.xmlbeans.XmlBoolean defaultLazyInit);
        
        /**
         * Unsets the "default-lazy-init" attribute
         */
        void unsetDefaultLazyInit();
        
        /**
         * Gets the "default-merge" attribute
         */
        boolean getDefaultMerge();
        
        /**
         * Gets (as xml) the "default-merge" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetDefaultMerge();
        
        /**
         * True if has "default-merge" attribute
         */
        boolean isSetDefaultMerge();
        
        /**
         * Sets the "default-merge" attribute
         */
        void setDefaultMerge(boolean defaultMerge);
        
        /**
         * Sets (as xml) the "default-merge" attribute
         */
        void xsetDefaultMerge(org.apache.xmlbeans.XmlBoolean defaultMerge);
        
        /**
         * Unsets the "default-merge" attribute
         */
        void unsetDefaultMerge();
        
        /**
         * Gets the "default-autowire" attribute
         */
        org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire.Enum getDefaultAutowire();
        
        /**
         * Gets (as xml) the "default-autowire" attribute
         */
        org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire xgetDefaultAutowire();
        
        /**
         * True if has "default-autowire" attribute
         */
        boolean isSetDefaultAutowire();
        
        /**
         * Sets the "default-autowire" attribute
         */
        void setDefaultAutowire(org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire.Enum defaultAutowire);
        
        /**
         * Sets (as xml) the "default-autowire" attribute
         */
        void xsetDefaultAutowire(org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire defaultAutowire);
        
        /**
         * Unsets the "default-autowire" attribute
         */
        void unsetDefaultAutowire();
        
        /**
         * Gets the "default-autowire-candidates" attribute
         */
        java.lang.String getDefaultAutowireCandidates();
        
        /**
         * Gets (as xml) the "default-autowire-candidates" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultAutowireCandidates();
        
        /**
         * True if has "default-autowire-candidates" attribute
         */
        boolean isSetDefaultAutowireCandidates();
        
        /**
         * Sets the "default-autowire-candidates" attribute
         */
        void setDefaultAutowireCandidates(java.lang.String defaultAutowireCandidates);
        
        /**
         * Sets (as xml) the "default-autowire-candidates" attribute
         */
        void xsetDefaultAutowireCandidates(org.apache.xmlbeans.XmlString defaultAutowireCandidates);
        
        /**
         * Unsets the "default-autowire-candidates" attribute
         */
        void unsetDefaultAutowireCandidates();
        
        /**
         * Gets the "default-init-method" attribute
         */
        java.lang.String getDefaultInitMethod();
        
        /**
         * Gets (as xml) the "default-init-method" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultInitMethod();
        
        /**
         * True if has "default-init-method" attribute
         */
        boolean isSetDefaultInitMethod();
        
        /**
         * Sets the "default-init-method" attribute
         */
        void setDefaultInitMethod(java.lang.String defaultInitMethod);
        
        /**
         * Sets (as xml) the "default-init-method" attribute
         */
        void xsetDefaultInitMethod(org.apache.xmlbeans.XmlString defaultInitMethod);
        
        /**
         * Unsets the "default-init-method" attribute
         */
        void unsetDefaultInitMethod();
        
        /**
         * Gets the "default-destroy-method" attribute
         */
        java.lang.String getDefaultDestroyMethod();
        
        /**
         * Gets (as xml) the "default-destroy-method" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultDestroyMethod();
        
        /**
         * True if has "default-destroy-method" attribute
         */
        boolean isSetDefaultDestroyMethod();
        
        /**
         * Sets the "default-destroy-method" attribute
         */
        void setDefaultDestroyMethod(java.lang.String defaultDestroyMethod);
        
        /**
         * Sets (as xml) the "default-destroy-method" attribute
         */
        void xsetDefaultDestroyMethod(org.apache.xmlbeans.XmlString defaultDestroyMethod);
        
        /**
         * Unsets the "default-destroy-method" attribute
         */
        void unsetDefaultDestroyMethod();
        
        /**
         * An XML default-autowire(@).
         *
         * This is an atomic type that is a restriction of org.springframework.schema.beans.BeansDocument$Beans$DefaultAutowire.
         */
        public interface DefaultAutowire extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultAutowire.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s64573255CCD5DEC1A1EC4BE6858B9539").resolveHandle("defaultautowirec59fattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum NO = Enum.forString("no");
            static final Enum BY_NAME = Enum.forString("byName");
            static final Enum BY_TYPE = Enum.forString("byType");
            static final Enum CONSTRUCTOR = Enum.forString("constructor");
            
            static final int INT_NO = Enum.INT_NO;
            static final int INT_BY_NAME = Enum.INT_BY_NAME;
            static final int INT_BY_TYPE = Enum.INT_BY_TYPE;
            static final int INT_CONSTRUCTOR = Enum.INT_CONSTRUCTOR;
            
            /**
             * Enumeration value class for org.springframework.schema.beans.BeansDocument$Beans$DefaultAutowire.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_NO
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
                
                static final int INT_NO = 1;
                static final int INT_BY_NAME = 2;
                static final int INT_BY_TYPE = 3;
                static final int INT_CONSTRUCTOR = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
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
                public static org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire newValue(java.lang.Object obj) {
                  return (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire) type.newValue( obj ); }
                
                public static org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire newInstance() {
                  return (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.springframework.schema.beans.BeansDocument.Beans.DefaultAutowire) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.springframework.schema.beans.BeansDocument.Beans newInstance() {
              return (org.springframework.schema.beans.BeansDocument.Beans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.springframework.schema.beans.BeansDocument.Beans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.springframework.schema.beans.BeansDocument.Beans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.springframework.schema.beans.BeansDocument newInstance() {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.springframework.schema.beans.BeansDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.springframework.schema.beans.BeansDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.springframework.schema.beans.BeansDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.BeansDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.springframework.schema.beans.BeansDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.springframework.schema.beans.BeansDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
