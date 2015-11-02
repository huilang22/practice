
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: OpenItemBean.java
 * Definition File: Admin/OpenItem.xml
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
import com.csgsystems.bp.interfaces.OpenItemInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="OpenItemSessionBean"
 * display-name="OpenItem Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/OpenItemBean"
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

@Stateless(name="OpenItemBean", mappedName = "OpenItem")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("OpenItems")

public class OpenItemBean implements OpenItemInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _OpenItemGetSpec = null;
  /**
   * Get a unique OpenItem..
   * Convenience method using default BSDMSessionContext.
   * @param OIIGetIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemObjectData get (OpenItemObjectKeyData OIIGetIn) throws BSDMResourceException
  {
    return get (null, OIIGetIn);
  }
  /**
   * Get a unique OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIGetIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public OpenItemObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam OpenItemObjectKeyData OIIGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIGetIn != null) OpenItemObjectKeyHelper.toMap (OIIGetIn, record, "OpenItem");
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
return OpenItemObjectHelper.fromMap (record, "OpenItem");
}

  private BSDMInteractionSpec _OpenItemFindSpec = null;
  /**
   * Find OpenItem rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OIIFindIn Input Filter Object.
   * @return OpenItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemObjectDataList find (OpenItemObjectFilter OIIFindIn) throws BSDMResourceException
  {
    return find (null, OIIFindIn);
  }
  /**
   * Find OpenItem rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIFindIn Input Filter Object.
   * @return OpenItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,OpenItemObjectFilter OIIFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIFindIn != null) OpenItemObjectHelper.toMap (OIIFindIn, record, "OpenItem");
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
return OpenItemObjectHelper.fromMapList (record, "OpenItemList");
}

  private BSDMInteractionSpec _OpenItemUpdateSpec = null;
  /**
   * Update the non-key fields of an OpenItem row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIUpdateIn Input  Object.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemObjectData update (OpenItemObjectData OIIUpdateIn) throws BSDMResourceException
  {
    return update (null, OIIUpdateIn);
  }
  /**
   * Update the non-key fields of an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIUpdateIn Input  Object.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemObjectData update (@HeaderParam ("context")BSDMSessionContext context,OpenItemObjectData OIIUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIUpdateIn != null) OpenItemObjectHelper.toMap (OIIUpdateIn, record, "OpenItem");
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
return OpenItemObjectHelper.fromMap (record, "OpenItem");
}

  private BSDMInteractionSpec _OpenItemDeleteSpec = null;
  /**
   * Delete an OpenItem row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIDeleteIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemObjectData delete (OpenItemObjectKeyData OIIDeleteIn) throws BSDMResourceException
  {
    return delete (null, OIIDeleteIn);
  }
  /**
   * Delete an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIDeleteIn Input Object Key.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemObjectData delete (@HeaderParam ("context")BSDMSessionContext context,OpenItemObjectKeyData OIIDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIDeleteIn != null) OpenItemObjectKeyHelper.toMap (OIIDeleteIn, record, "OpenItem");
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
return OpenItemObjectHelper.fromMap (record, "OpenItem");
}

  private BSDMInteractionSpec _OpenItemCreateSpec = null;
  /**
   * Create a new OpenItem..
   * Convenience method using default BSDMSessionContext.
   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemObjectData create (OpenItemObjectData OIICreateIn) throws BSDMResourceException
  {
    return create (null, OIICreateIn);
  }
  /**
   * Create a new OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemObjectData create (@HeaderParam ("context")BSDMSessionContext context,OpenItemObjectData OIICreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIICreateIn != null) OpenItemObjectHelper.toMap (OIICreateIn, record, "OpenItem");
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
return OpenItemObjectHelper.fromMap (record, "OpenItem");
}

  /**

   * Get a unique OpenItem..

   * Convenience method using default BSDMSessionContext.

   * @param OIIGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemObjectData get (OpenItemObjectKeyData OIIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, OIIGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemObjectData get (BSDMSessionContext context, OpenItemObjectKeyData OIIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIGetIn, defaultAction);
       
     cManager.checkConstraints(OIIGetIn, constraintAction);
       return get (context, OIIGetIn);
  }

  /**

   * Find OpenItem rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param OIIFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemObjectDataList find (OpenItemObjectFilter OIIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, OIIFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find OpenItem rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemObjectDataList find (BSDMSessionContext context, OpenItemObjectFilter OIIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIFindIn, defaultAction);
       
     cManager.checkConstraints(OIIFindIn, constraintAction);
       return find (context, OIIFindIn);
  }

  /**

   * Update the non-key fields of an OpenItem row..

   * Convenience method using default BSDMSessionContext.

   * @param OIIUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemObjectData update (OpenItemObjectData OIIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, OIIUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemObjectData update (BSDMSessionContext context, OpenItemObjectData OIIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIUpdateIn, defaultAction);
       
     cManager.checkConstraints(OIIUpdateIn, constraintAction);
       return update (context, OIIUpdateIn);
  }

  /**

   * Delete an OpenItem row..

   * Convenience method using default BSDMSessionContext.

   * @param OIIDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemObjectData delete (OpenItemObjectKeyData OIIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, OIIDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete an OpenItem row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemObjectData delete (BSDMSessionContext context, OpenItemObjectKeyData OIIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIDeleteIn, defaultAction);
       
     cManager.checkConstraints(OIIDeleteIn, constraintAction);
       return delete (context, OIIDeleteIn);
  }

  /**

   * Create a new OpenItem..

   * Convenience method using default BSDMSessionContext.

   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemObjectData create (OpenItemObjectData OIICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, OIICreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new OpenItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal, OpenItemIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemObjectData create (BSDMSessionContext context, OpenItemObjectData OIICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIICreateIn, defaultAction);
       
     cManager.checkConstraints(OIICreateIn, constraintAction);
       return create (context, OIICreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public OpenItemBean ()
  {
    try
    {
      _OpenItemGetSpec = new BSDMInteractionSpec("OpenItemGet", ApiMappings.getCallName ("OpenItemGet"), Boolean.TRUE);

      _OpenItemFindSpec = new BSDMInteractionSpec("OpenItemFind", ApiMappings.getCallName ("OpenItemFind"), Boolean.TRUE);

      _OpenItemUpdateSpec = new BSDMInteractionSpec("OpenItemUpdate", ApiMappings.getCallName ("OpenItemUpdate"), Boolean.TRUE);

      _OpenItemDeleteSpec = new BSDMInteractionSpec("OpenItemDelete", ApiMappings.getCallName ("OpenItemDelete"), Boolean.TRUE);

      _OpenItemCreateSpec = new BSDMInteractionSpec("OpenItemCreate", ApiMappings.getCallName ("OpenItemCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public OpenItemBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public OpenItemBean(BSDMSettings settings, BSDMConnectionManager cm)
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
