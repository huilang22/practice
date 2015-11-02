
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PrivacyLevelBean.java
 * Definition File: Admin/PrivacyLevel.xml
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
import com.csgsystems.bp.interfaces.PrivacyLevelInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PrivacyLevelSessionBean"
 * display-name="PrivacyLevel Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PrivacyLevelBean"
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

@Stateless(name="PrivacyLevelBean", mappedName = "PrivacyLevel")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("PrivacyLevels")

public class PrivacyLevelBean implements PrivacyLevelInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PrivacyLevelGetSpec = null;
  /**
   * Get a unique PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLGetIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrivacyLevelObjectData get (PrivacyLevelObjectKeyData PLGetIn) throws BSDMResourceException
  {
    return get (null, PLGetIn);
  }
  /**
   * Get a unique PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLGetIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PrivacyLevelObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PrivacyLevelObjectKeyData PLGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrivacyLevelGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PLGetIn != null) PrivacyLevelObjectKeyHelper.toMap (PLGetIn, record, "PrivacyLevel");
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
return PrivacyLevelObjectHelper.fromMap (record, "PrivacyLevel");
}

  private BSDMInteractionSpec _PrivacyLevelFindSpec = null;
  /**
   * Find PrivacyLevel's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PLFindIn Input Filter Object.
   * @return PrivacyLevelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrivacyLevelObjectDataList find (PrivacyLevelObjectFilter PLFindIn) throws BSDMResourceException
  {
    return find (null, PLFindIn);
  }
  /**
   * Find PrivacyLevel's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLFindIn Input Filter Object.
   * @return PrivacyLevelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PrivacyLevelObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PrivacyLevelObjectFilter PLFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrivacyLevelFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PLFindIn != null) PrivacyLevelObjectHelper.toMap (PLFindIn, record, "PrivacyLevel");
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
return PrivacyLevelObjectHelper.fromMapList (record, "PrivacyLevelList");
}

  private BSDMInteractionSpec _PrivacyLevelUpdateSpec = null;
  /**
   * Update the non-key fields of a PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLUpdateIn Input  Object.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrivacyLevelObjectData update (PrivacyLevelObjectData PLUpdateIn) throws BSDMResourceException
  {
    return update (null, PLUpdateIn);
  }
  /**
   * Update the non-key fields of a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLUpdateIn Input  Object.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PrivacyLevelObjectData update (@HeaderParam ("context")BSDMSessionContext context,PrivacyLevelObjectData PLUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrivacyLevelUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PLUpdateIn != null) PrivacyLevelObjectHelper.toMap (PLUpdateIn, record, "PrivacyLevel");
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
return PrivacyLevelObjectHelper.fromMap (record, "PrivacyLevel");
}

  private BSDMInteractionSpec _PrivacyLevelDeleteSpec = null;
  /**
   * Delete a PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLDeleteIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrivacyLevelObjectData delete (PrivacyLevelObjectKeyData PLDeleteIn) throws BSDMResourceException
  {
    return delete (null, PLDeleteIn);
  }
  /**
   * Delete a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLDeleteIn Input Object Key.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PrivacyLevelObjectData delete (@HeaderParam ("context")BSDMSessionContext context,PrivacyLevelObjectKeyData PLDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrivacyLevelDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PLDeleteIn != null) PrivacyLevelObjectKeyHelper.toMap (PLDeleteIn, record, "PrivacyLevel");
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
return PrivacyLevelObjectHelper.fromMap (record, "PrivacyLevel");
}

  private BSDMInteractionSpec _PrivacyLevelCreateSpec = null;
  /**
   * Create a new PrivacyLevel..
   * Convenience method using default BSDMSessionContext.
   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrivacyLevelObjectData create (PrivacyLevelObjectData PLCreateIn) throws BSDMResourceException
  {
    return create (null, PLCreateIn);
  }
  /**
   * Create a new PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PrivacyLevelObjectData create (@HeaderParam ("context")BSDMSessionContext context,PrivacyLevelObjectData PLCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrivacyLevelCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PLCreateIn != null) PrivacyLevelObjectHelper.toMap (PLCreateIn, record, "PrivacyLevel");
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
return PrivacyLevelObjectHelper.fromMap (record, "PrivacyLevel");
}

  /**

   * Get a unique PrivacyLevel..

   * Convenience method using default BSDMSessionContext.

   * @param PLGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrivacyLevelObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrivacyLevelObjectData get (PrivacyLevelObjectKeyData PLGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PLGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrivacyLevelObjectData get (BSDMSessionContext context, PrivacyLevelObjectKeyData PLGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PLGetIn, defaultAction);
       
     cManager.checkConstraints(PLGetIn, constraintAction);
       return get (context, PLGetIn);
  }

  /**

   * Find PrivacyLevel's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param PLFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrivacyLevelObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrivacyLevelObjectDataList find (PrivacyLevelObjectFilter PLFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PLFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find PrivacyLevel's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrivacyLevelObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrivacyLevelObjectDataList find (BSDMSessionContext context, PrivacyLevelObjectFilter PLFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PLFindIn, defaultAction);
       
     cManager.checkConstraints(PLFindIn, constraintAction);
       return find (context, PLFindIn);
  }

  /**

   * Update the non-key fields of a PrivacyLevel..

   * Convenience method using default BSDMSessionContext.

   * @param PLUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrivacyLevelObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrivacyLevelObjectData update (PrivacyLevelObjectData PLUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PLUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrivacyLevelObjectData update (BSDMSessionContext context, PrivacyLevelObjectData PLUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PLUpdateIn, defaultAction);
       
     cManager.checkConstraints(PLUpdateIn, constraintAction);
       return update (context, PLUpdateIn);
  }

  /**

   * Delete a PrivacyLevel..

   * Convenience method using default BSDMSessionContext.

   * @param PLDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrivacyLevelObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrivacyLevelObjectData delete (PrivacyLevelObjectKeyData PLDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, PLDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrivacyLevelObjectData delete (BSDMSessionContext context, PrivacyLevelObjectKeyData PLDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PLDeleteIn, defaultAction);
       
     cManager.checkConstraints(PLDeleteIn, constraintAction);
       return delete (context, PLDeleteIn);
  }

  /**

   * Create a new PrivacyLevel..

   * Convenience method using default BSDMSessionContext.

   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrivacyLevelObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrivacyLevelObjectData create (PrivacyLevelObjectData PLCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, PLCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new PrivacyLevel..
   * @param context The session context to use when connecting to the APITS server.
   * @param PLCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrivacyLevelObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrivacyLevelObjectData create (BSDMSessionContext context, PrivacyLevelObjectData PLCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PLCreateIn, defaultAction);
       
     cManager.checkConstraints(PLCreateIn, constraintAction);
       return create (context, PLCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PrivacyLevelBean ()
  {
    try
    {
      _PrivacyLevelGetSpec = new BSDMInteractionSpec("PrivacyLevelGet", ApiMappings.getCallName ("PrivacyLevelGet"), Boolean.TRUE);

      _PrivacyLevelFindSpec = new BSDMInteractionSpec("PrivacyLevelFind", ApiMappings.getCallName ("PrivacyLevelFind"), Boolean.TRUE);

      _PrivacyLevelUpdateSpec = new BSDMInteractionSpec("PrivacyLevelUpdate", ApiMappings.getCallName ("PrivacyLevelUpdate"), Boolean.TRUE);

      _PrivacyLevelDeleteSpec = new BSDMInteractionSpec("PrivacyLevelDelete", ApiMappings.getCallName ("PrivacyLevelDelete"), Boolean.TRUE);

      _PrivacyLevelCreateSpec = new BSDMInteractionSpec("PrivacyLevelCreate", ApiMappings.getCallName ("PrivacyLevelCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PrivacyLevelBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PrivacyLevelBean(BSDMSettings settings, BSDMConnectionManager cm)
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
