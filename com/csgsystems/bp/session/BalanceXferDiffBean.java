
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BalanceXferDiffBean.java
 * Definition File: Admin/BalanceXferDiff.xml
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
import com.csgsystems.bp.interfaces.BalanceXferDiffInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BalanceXferDiffSessionBean"
 * display-name="BalanceXferDiff Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BalanceXferDiffBean"
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

@Stateless(name="BalanceXferDiffBean", mappedName = "BalanceXferDiff")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BalanceXferDiffs")

public class BalanceXferDiffBean implements BalanceXferDiffInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BalanceXferDiffGetSpec = null;
  /**
   * Retrieve a unique BalanceXferDiff row..
   * Convenience method using default BSDMSessionContext.
   * @param BXDGetIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BXDObjectData get (BXDObjectKeyData BXDGetIn) throws BSDMResourceException
  {
    return get (null, BXDGetIn);
  }
  /**
   * Retrieve a unique BalanceXferDiff row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDGetIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BXDObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BXDObjectKeyData BXDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceXferDiffGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BXDGetIn != null) BXDObjectKeyHelper.toMap (BXDGetIn, record, "BalanceXferDiff");
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
return BXDObjectHelper.fromMap (record, "BalanceXferDiff");
}

  private BSDMInteractionSpec _BalanceXferDiffFindSpec = null;
  /**
   * Find BalanceXferDiff's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BXDFindIn Input Filter Object.
   * @return BXDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BXDObjectDataList find (BXDObjectFilter BXDFindIn) throws BSDMResourceException
  {
    return find (null, BXDFindIn);
  }
  /**
   * Find BalanceXferDiff's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDFindIn Input Filter Object.
   * @return BXDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BXDObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BXDObjectFilter BXDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceXferDiffFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BXDFindIn != null) BXDObjectHelper.toMap (BXDFindIn, record, "BalanceXferDiff");
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
return BXDObjectHelper.fromMapList (record, "BalanceXferDiffList");
}

  private BSDMInteractionSpec _BalanceXferDiffUpdateSpec = null;
  /**
   * Update non-key fields of a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDUpdateIn Input  Object.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BXDObjectData update (BXDObjectData BXDUpdateIn) throws BSDMResourceException
  {
    return update (null, BXDUpdateIn);
  }
  /**
   * Update non-key fields of a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDUpdateIn Input  Object.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BXDObjectData update (@HeaderParam ("context")BSDMSessionContext context,BXDObjectData BXDUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceXferDiffUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BXDUpdateIn != null) BXDObjectHelper.toMap (BXDUpdateIn, record, "BalanceXferDiff");
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
return BXDObjectHelper.fromMap (record, "BalanceXferDiff");
}

  private BSDMInteractionSpec _BalanceXferDiffDeleteSpec = null;
  /**
   * Delete a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDDeleteIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BXDObjectData delete (BXDObjectKeyData BXDDeleteIn) throws BSDMResourceException
  {
    return delete (null, BXDDeleteIn);
  }
  /**
   * Delete a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDDeleteIn Input Object Key.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BXDObjectData delete (@HeaderParam ("context")BSDMSessionContext context,BXDObjectKeyData BXDDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceXferDiffDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BXDDeleteIn != null) BXDObjectKeyHelper.toMap (BXDDeleteIn, record, "BalanceXferDiff");
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
return BXDObjectHelper.fromMap (record, "BalanceXferDiff");
}

  private BSDMInteractionSpec _BalanceXferDiffCreateSpec = null;
  /**
   * Create a BalanceXferDiff..
   * Convenience method using default BSDMSessionContext.
   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BXDObjectData create (BXDObjectData BXDCreateIn) throws BSDMResourceException
  {
    return create (null, BXDCreateIn);
  }
  /**
   * Create a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BXDObjectData create (@HeaderParam ("context")BSDMSessionContext context,BXDObjectData BXDCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceXferDiffCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BXDCreateIn != null) BXDObjectHelper.toMap (BXDCreateIn, record, "BalanceXferDiff");
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
return BXDObjectHelper.fromMap (record, "BalanceXferDiff");
}

  /**

   * Retrieve a unique BalanceXferDiff row..

   * Convenience method using default BSDMSessionContext.

   * @param BXDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BXDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BXDObjectData get (BXDObjectKeyData BXDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, BXDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique BalanceXferDiff row..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BXDObjectData get (BSDMSessionContext context, BXDObjectKeyData BXDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BXDGetIn, defaultAction);
       
     cManager.checkConstraints(BXDGetIn, constraintAction);
       return get (context, BXDGetIn);
  }

  /**

   * Find BalanceXferDiff's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param BXDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BXDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BXDObjectDataList find (BXDObjectFilter BXDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, BXDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BalanceXferDiff's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BXDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BXDObjectDataList find (BSDMSessionContext context, BXDObjectFilter BXDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BXDFindIn, defaultAction);
       
     cManager.checkConstraints(BXDFindIn, constraintAction);
       return find (context, BXDFindIn);
  }

  /**

   * Update non-key fields of a BalanceXferDiff..

   * Convenience method using default BSDMSessionContext.

   * @param BXDUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BXDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BXDObjectData update (BXDObjectData BXDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, BXDUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BXDObjectData update (BSDMSessionContext context, BXDObjectData BXDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BXDUpdateIn, defaultAction);
       
     cManager.checkConstraints(BXDUpdateIn, constraintAction);
       return update (context, BXDUpdateIn);
  }

  /**

   * Delete a BalanceXferDiff..

   * Convenience method using default BSDMSessionContext.

   * @param BXDDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BXDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BXDObjectData delete (BXDObjectKeyData BXDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, BXDDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BXDObjectData delete (BSDMSessionContext context, BXDObjectKeyData BXDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BXDDeleteIn, defaultAction);
       
     cManager.checkConstraints(BXDDeleteIn, constraintAction);
       return delete (context, BXDDeleteIn);
  }

  /**

   * Create a BalanceXferDiff..

   * Convenience method using default BSDMSessionContext.

   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BXDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BXDObjectData create (BXDObjectData BXDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, BXDCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a BalanceXferDiff..
   * @param context The session context to use when connecting to the APITS server.
   * @param BXDCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BXDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BXDObjectData create (BSDMSessionContext context, BXDObjectData BXDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BXDCreateIn, defaultAction);
       
     cManager.checkConstraints(BXDCreateIn, constraintAction);
       return create (context, BXDCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BalanceXferDiffBean ()
  {
    try
    {
      _BalanceXferDiffGetSpec = new BSDMInteractionSpec("BalanceXferDiffGet", ApiMappings.getCallName ("BalanceXferDiffGet"), Boolean.TRUE);

      _BalanceXferDiffFindSpec = new BSDMInteractionSpec("BalanceXferDiffFind", ApiMappings.getCallName ("BalanceXferDiffFind"), Boolean.TRUE);

      _BalanceXferDiffUpdateSpec = new BSDMInteractionSpec("BalanceXferDiffUpdate", ApiMappings.getCallName ("BalanceXferDiffUpdate"), Boolean.TRUE);

      _BalanceXferDiffDeleteSpec = new BSDMInteractionSpec("BalanceXferDiffDelete", ApiMappings.getCallName ("BalanceXferDiffDelete"), Boolean.TRUE);

      _BalanceXferDiffCreateSpec = new BSDMInteractionSpec("BalanceXferDiffCreate", ApiMappings.getCallName ("BalanceXferDiffCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BalanceXferDiffBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BalanceXferDiffBean(BSDMSettings settings, BSDMConnectionManager cm)
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
