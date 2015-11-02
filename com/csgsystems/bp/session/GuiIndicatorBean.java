
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GuiIndicatorBean.java
 * Definition File: Admin/GuiIndicator.xml
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
import com.csgsystems.bp.interfaces.GuiIndicatorInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GuiIndicatorSessionBean"
 * display-name="GuiIndicator Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GuiIndicatorBean"
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

@Stateless(name="GuiIndicatorBean", mappedName = "GuiIndicator")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("GuiIndicators")

public class GuiIndicatorBean implements GuiIndicatorInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GuiIndicatorGetSpec = null;
  /**
   * Get a unique GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIGetIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GuiIndicatorObjectData get (GuiIndicatorObjectKeyData GIGetIn) throws BSDMResourceException
  {
    return get (null, GIGetIn);
  }
  /**
   * Get a unique GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIGetIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GuiIndicatorObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GuiIndicatorObjectKeyData GIGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GuiIndicatorGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GIGetIn != null) GuiIndicatorObjectKeyHelper.toMap (GIGetIn, record, "GuiIndicator");
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
return GuiIndicatorObjectHelper.fromMap (record, "GuiIndicator");
}

  private BSDMInteractionSpec _GuiIndicatorFindSpec = null;
  /**
   * Find GuiIndicator's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GIFindIn Input Filter Object.
   * @return GuiIndicatorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GuiIndicatorObjectDataList find (GuiIndicatorObjectFilter GIFindIn) throws BSDMResourceException
  {
    return find (null, GIFindIn);
  }
  /**
   * Find GuiIndicator's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIFindIn Input Filter Object.
   * @return GuiIndicatorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GuiIndicatorObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GuiIndicatorObjectFilter GIFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GuiIndicatorFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GIFindIn != null) GuiIndicatorObjectHelper.toMap (GIFindIn, record, "GuiIndicator");
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
return GuiIndicatorObjectHelper.fromMapList (record, "GuiIndicatorList");
}

  private BSDMInteractionSpec _GuiIndicatorUpdateSpec = null;
  /**
   * Update the non-key fields of a GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIUpdateIn Input  Object.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GuiIndicatorObjectData update (GuiIndicatorObjectData GIUpdateIn) throws BSDMResourceException
  {
    return update (null, GIUpdateIn);
  }
  /**
   * Update the non-key fields of a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIUpdateIn Input  Object.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GuiIndicatorObjectData update (@HeaderParam ("context")BSDMSessionContext context,GuiIndicatorObjectData GIUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GuiIndicatorUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GIUpdateIn != null) GuiIndicatorObjectHelper.toMap (GIUpdateIn, record, "GuiIndicator");
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
return GuiIndicatorObjectHelper.fromMap (record, "GuiIndicator");
}

  private BSDMInteractionSpec _GuiIndicatorDeleteSpec = null;
  /**
   * Delete a GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GIDeleteIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GuiIndicatorObjectData delete (GuiIndicatorObjectKeyData GIDeleteIn) throws BSDMResourceException
  {
    return delete (null, GIDeleteIn);
  }
  /**
   * Delete a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIDeleteIn Input Object Key.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GuiIndicatorObjectData delete (@HeaderParam ("context")BSDMSessionContext context,GuiIndicatorObjectKeyData GIDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GuiIndicatorDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GIDeleteIn != null) GuiIndicatorObjectKeyHelper.toMap (GIDeleteIn, record, "GuiIndicator");
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
return GuiIndicatorObjectHelper.fromMap (record, "GuiIndicator");
}

  private BSDMInteractionSpec _GuiIndicatorCreateSpec = null;
  /**
   * Create a new GuiIndicator..
   * Convenience method using default BSDMSessionContext.
   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GuiIndicatorObjectData create (GuiIndicatorObjectData GICreateIn) throws BSDMResourceException
  {
    return create (null, GICreateIn);
  }
  /**
   * Create a new GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GuiIndicatorObjectData create (@HeaderParam ("context")BSDMSessionContext context,GuiIndicatorObjectData GICreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GuiIndicatorCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GICreateIn != null) GuiIndicatorObjectHelper.toMap (GICreateIn, record, "GuiIndicator");
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
return GuiIndicatorObjectHelper.fromMap (record, "GuiIndicator");
}

  /**

   * Get a unique GuiIndicator..

   * Convenience method using default BSDMSessionContext.

   * @param GIGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GuiIndicatorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GuiIndicatorObjectData get (GuiIndicatorObjectKeyData GIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GIGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GuiIndicatorObjectData get (BSDMSessionContext context, GuiIndicatorObjectKeyData GIGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GIGetIn, defaultAction);
       
     cManager.checkConstraints(GIGetIn, constraintAction);
       return get (context, GIGetIn);
  }

  /**

   * Find GuiIndicator's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GIFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GuiIndicatorObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GuiIndicatorObjectDataList find (GuiIndicatorObjectFilter GIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GIFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find GuiIndicator's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GuiIndicatorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GuiIndicatorObjectDataList find (BSDMSessionContext context, GuiIndicatorObjectFilter GIFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GIFindIn, defaultAction);
       
     cManager.checkConstraints(GIFindIn, constraintAction);
       return find (context, GIFindIn);
  }

  /**

   * Update the non-key fields of a GuiIndicator..

   * Convenience method using default BSDMSessionContext.

   * @param GIUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GuiIndicatorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GuiIndicatorObjectData update (GuiIndicatorObjectData GIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GIUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GuiIndicatorObjectData update (BSDMSessionContext context, GuiIndicatorObjectData GIUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GIUpdateIn, defaultAction);
       
     cManager.checkConstraints(GIUpdateIn, constraintAction);
       return update (context, GIUpdateIn);
  }

  /**

   * Delete a GuiIndicator..

   * Convenience method using default BSDMSessionContext.

   * @param GIDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GuiIndicatorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GuiIndicatorObjectData delete (GuiIndicatorObjectKeyData GIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GIDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GIDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GuiIndicatorObjectData delete (BSDMSessionContext context, GuiIndicatorObjectKeyData GIDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GIDeleteIn, defaultAction);
       
     cManager.checkConstraints(GIDeleteIn, constraintAction);
       return delete (context, GIDeleteIn);
  }

  /**

   * Create a new GuiIndicator..

   * Convenience method using default BSDMSessionContext.

   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GuiIndicatorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GuiIndicatorObjectData create (GuiIndicatorObjectData GICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GICreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new GuiIndicator..
   * @param context The session context to use when connecting to the APITS server.
   * @param GICreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GuiIndicatorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GuiIndicatorObjectData create (BSDMSessionContext context, GuiIndicatorObjectData GICreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GICreateIn, defaultAction);
       
     cManager.checkConstraints(GICreateIn, constraintAction);
       return create (context, GICreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GuiIndicatorBean ()
  {
    try
    {
      _GuiIndicatorGetSpec = new BSDMInteractionSpec("GuiIndicatorGet", ApiMappings.getCallName ("GuiIndicatorGet"), Boolean.TRUE);

      _GuiIndicatorFindSpec = new BSDMInteractionSpec("GuiIndicatorFind", ApiMappings.getCallName ("GuiIndicatorFind"), Boolean.TRUE);

      _GuiIndicatorUpdateSpec = new BSDMInteractionSpec("GuiIndicatorUpdate", ApiMappings.getCallName ("GuiIndicatorUpdate"), Boolean.TRUE);

      _GuiIndicatorDeleteSpec = new BSDMInteractionSpec("GuiIndicatorDelete", ApiMappings.getCallName ("GuiIndicatorDelete"), Boolean.TRUE);

      _GuiIndicatorCreateSpec = new BSDMInteractionSpec("GuiIndicatorCreate", ApiMappings.getCallName ("GuiIndicatorCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GuiIndicatorBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GuiIndicatorBean(BSDMSettings settings, BSDMConnectionManager cm)
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
