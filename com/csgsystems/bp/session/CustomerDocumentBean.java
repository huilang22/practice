
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CustomerDocumentBean.java
 * Definition File: Customer/CustomerDocument.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Object Summary Information
 *---------------------------------------------------------------------------*/
 /**--------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.session;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.*;
import javax.naming.*;
import javax.resource.*;
import javax.resource.cci.*;

import com.csgsystems.api.defaults.*;
import com.csgsystems.api.constraint.*;

import com.csgsystems.aruba.connection.BSDMConnectionManager;
import com.csgsystems.aruba.connection.BSDMConnectionSpec;
import com.csgsystems.aruba.connection.BSDMInteractionSpec;
import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.bali.connection.ApiMappings;

import javax.ejb.Stateless;  
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.BeanParam;
import javax.inject.Inject;



import com.csgsystems.bp.data.*;
import com.csgsystems.bp.interfaces.CustomerDocumentInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CustomerDocumentSessionBean"
 * display-name="CustomerDocument Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CustomerDocumentBean"
 * transaction-type="Bean"
 * @ejb:permission role-name="ArubaUser"
 * @ejb:security-identity run-as="ArubaUser"
 * @ejb:resource-ref res-name="BSDMEIS"
 * res-type="javax.resource.cci.ConnectionFactory"
 * res-auth="Container"
 * @jboss:resource-manager res-man-class="javax.resource.cci.ConnectionFactory"
 * res-man-name="BSDMEIS"
 * res-man-jndi-name="java:/eis/JNITux"
 * @weblogic:resource-description res-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @websphere:resource-ref res-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @jrun:resource-ref resource-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @ejb:transaction type="NotSupported"
 * @ejb:bean view-type="remote"
 */

@Stateless(name="CustomerDocumentBean", mappedName = "CustomerDocument")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CustomerDocuments")

public class CustomerDocumentBean implements CustomerDocumentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CustomerDocumentGetSpec = null;
  /**
   * Get Customer Document object that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentGetIn Input Object Key.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerDocumentObjectData get (CustomerDocumentObjectKeyData CustomerDocumentGetIn) throws BSDMResourceException
  {
    return get (null, CustomerDocumentGetIn);
  }
  /**
   * Get Customer Document object that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentGetIn Input Object Key.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CustomerDocumentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CustomerDocumentObjectKeyData CustomerDocumentGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerDocumentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CustomerDocumentGetIn != null) CustomerDocumentObjectKeyHelper.toMap (CustomerDocumentGetIn, record, "CustomerDocument");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return CustomerDocumentObjectHelper.fromMap (record, "CustomerDocument");
}

  private BSDMInteractionSpec _CustomerDocumentFindSpec = null;
  /**
   * Find CustomerDocument that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentFindIn Input Filter Object.
   * @return CustomerDocumentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerDocumentObjectDataList find (CustomerDocumentObjectFilter CustomerDocumentFindIn) throws BSDMResourceException
  {
    return find (null, CustomerDocumentFindIn);
  }
  /**
   * Find CustomerDocument that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentFindIn Input Filter Object.
   * @return CustomerDocumentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CustomerDocumentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CustomerDocumentObjectFilter CustomerDocumentFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerDocumentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CustomerDocumentFindIn != null) CustomerDocumentObjectHelper.toMap (CustomerDocumentFindIn, record, "CustomerDocument");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return CustomerDocumentObjectHelper.fromMapList (record, "CustomerDocumentList");
}

  private BSDMInteractionSpec _CustomerDocumentUpdateSpec = null;
  /**
   * Update non-key fields of a CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentUpdateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerDocumentObjectData update (CustomerDocumentObjectData CustomerDocumentUpdateIn) throws BSDMResourceException
  {
    return update (null, CustomerDocumentUpdateIn);
  }
  /**
   * Update non-key fields of a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentUpdateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CustomerDocumentObjectData update (@HeaderParam ("context")BSDMSessionContext context,CustomerDocumentObjectData CustomerDocumentUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerDocumentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CustomerDocumentUpdateIn != null) CustomerDocumentObjectHelper.toMap (CustomerDocumentUpdateIn, record, "CustomerDocument");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return CustomerDocumentObjectHelper.fromMap (record, "CustomerDocument");
}

  private BSDMInteractionSpec _CustomerDocumentDeleteSpec = null;
  /**
   * Delete a CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentDeleteIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerDocumentObjectData delete (CustomerDocumentObjectData CustomerDocumentDeleteIn) throws BSDMResourceException
  {
    return delete (null, CustomerDocumentDeleteIn);
  }
  /**
   * Delete a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentDeleteIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CustomerDocumentObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CustomerDocumentObjectData CustomerDocumentDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerDocumentDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CustomerDocumentDeleteIn != null) CustomerDocumentObjectHelper.toMap (CustomerDocumentDeleteIn, record, "CustomerDocument");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return CustomerDocumentObjectHelper.fromMap (record, "CustomerDocument");
}

  private BSDMInteractionSpec _CustomerDocumentCreateSpec = null;
  /**
   * Create a new CustomerDocument..
   * Convenience method using default BSDMSessionContext.
   * @param CustomerDocumentCreateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CustomerDocumentObjectData create (CustomerDocumentObjectData CustomerDocumentCreateIn) throws BSDMResourceException
  {
    return create (null, CustomerDocumentCreateIn);
  }
  /**
   * Create a new CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentCreateIn Input  Object.
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CustomerDocumentObjectData create (@HeaderParam ("context")BSDMSessionContext context,CustomerDocumentObjectData CustomerDocumentCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CustomerDocumentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CustomerDocumentCreateIn != null) CustomerDocumentObjectHelper.toMap (CustomerDocumentCreateIn, record, "CustomerDocument");
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return CustomerDocumentObjectHelper.fromMap (record, "CustomerDocument");
}

  /**

   * Get Customer Document object that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CustomerDocumentGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerDocumentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerDocumentObjectData get (CustomerDocumentObjectKeyData CustomerDocumentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CustomerDocumentGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get Customer Document object that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerDocumentObjectData get (BSDMSessionContext context, CustomerDocumentObjectKeyData CustomerDocumentGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CustomerDocumentGetIn, defaultAction);
       
     cManager.checkConstraints(CustomerDocumentGetIn, constraintAction);
       return get (context, CustomerDocumentGetIn);
  }

  /**

   * Find CustomerDocument that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CustomerDocumentFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerDocumentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerDocumentObjectDataList find (CustomerDocumentObjectFilter CustomerDocumentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CustomerDocumentFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CustomerDocument that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerDocumentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerDocumentObjectDataList find (BSDMSessionContext context, CustomerDocumentObjectFilter CustomerDocumentFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CustomerDocumentFindIn, defaultAction);
       
     cManager.checkConstraints(CustomerDocumentFindIn, constraintAction);
       return find (context, CustomerDocumentFindIn);
  }

  /**

   * Update non-key fields of a CustomerDocument..

   * Convenience method using default BSDMSessionContext.

   * @param CustomerDocumentUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerDocumentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerDocumentObjectData update (CustomerDocumentObjectData CustomerDocumentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CustomerDocumentUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerDocumentObjectData update (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CustomerDocumentUpdateIn, defaultAction);
       
     cManager.checkConstraints(CustomerDocumentUpdateIn, constraintAction);
       return update (context, CustomerDocumentUpdateIn);
  }

  /**

   * Delete a CustomerDocument..

   * Convenience method using default BSDMSessionContext.

   * @param CustomerDocumentDeleteIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerDocumentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerDocumentObjectData delete (CustomerDocumentObjectData CustomerDocumentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CustomerDocumentDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentDeleteIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerDocumentObjectData delete (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CustomerDocumentDeleteIn, defaultAction);
       
     cManager.checkConstraints(CustomerDocumentDeleteIn, constraintAction);
       return delete (context, CustomerDocumentDeleteIn);
  }

  /**

   * Create a new CustomerDocument..

   * Convenience method using default BSDMSessionContext.

   * @param CustomerDocumentCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CustomerDocumentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CustomerDocumentObjectData create (CustomerDocumentObjectData CustomerDocumentCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CustomerDocumentCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CustomerDocument..
   * @param context The session context to use when connecting to the APITS server.
   * @param CustomerDocumentCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CustomerDocumentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CustomerDocumentObjectData create (BSDMSessionContext context, CustomerDocumentObjectData CustomerDocumentCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CustomerDocumentCreateIn, defaultAction);
       
     cManager.checkConstraints(CustomerDocumentCreateIn, constraintAction);
       return create (context, CustomerDocumentCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CustomerDocumentBean ()
  {
    try
    {
      _CustomerDocumentGetSpec = new BSDMInteractionSpec("CustomerDocumentGet", ApiMappings.getCallName ("CustomerDocumentGet"), Boolean.TRUE);

      _CustomerDocumentFindSpec = new BSDMInteractionSpec("CustomerDocumentFind", ApiMappings.getCallName ("CustomerDocumentFind"), Boolean.TRUE);

      _CustomerDocumentUpdateSpec = new BSDMInteractionSpec("CustomerDocumentUpdate", ApiMappings.getCallName ("CustomerDocumentUpdate"), Boolean.TRUE);

      _CustomerDocumentDeleteSpec = new BSDMInteractionSpec("CustomerDocumentDelete", ApiMappings.getCallName ("CustomerDocumentDelete"), Boolean.TRUE);

      _CustomerDocumentCreateSpec = new BSDMInteractionSpec("CustomerDocumentCreate", ApiMappings.getCallName ("CustomerDocumentCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CustomerDocumentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CustomerDocumentBean(BSDMSettings settings, BSDMConnectionManager cm)
  {
    this();
    this.settings = settings;
    cf = cm.getConnectionFactory ();
  }
  /** Method used by EJB App Servers. */
  public void setSessionContext(SessionContext sc)
  {
    this.sc = sc;
    Properties props = new Properties();
    String lookupName = "java:comp/env/BSDMEIS";
    try
    {
      props.load(this.getClass().getResourceAsStream("/bsdJndi.properties"));
      String url = props.getProperty("jndi.url");
      String principal = props.getProperty("jndi.principal");
      String credentials = props.getProperty("jndi.credentials");
      String factory = props.getProperty("jndi.factory");
      if (url != null) props.put(Context.PROVIDER_URL, url);
      if (principal != null) props.put(Context.SECURITY_PRINCIPAL, principal);
      if (credentials != null) props.put(Context.SECURITY_CREDENTIALS, credentials);
      if (factory != null) props.put(Context.INITIAL_CONTEXT_FACTORY, factory);
      lookupName = props.getProperty("ConnectorJndiName", "java:comp/env/BSDMEIS");
    }
    catch (Exception x)
    {
      x.printStackTrace();
      props = new Properties();
      lookupName = "java:comp/env/BSDMEIS";
    }
    try
    {
      Context ic = new InitialContext(props);
      cf = (ConnectionFactory) ic.lookup(lookupName);
      settings = BSDMSettings.getDefault ();
    }
    catch (NamingException ex)
    {
      ex.printStackTrace();
    }
  }
  private Connection openConnection() throws ResourceException
  {
    return cf.getConnection();
  }
  private void closeConnection(Connection connection) throws ResourceException
  {
    connection.close();
  }
}
