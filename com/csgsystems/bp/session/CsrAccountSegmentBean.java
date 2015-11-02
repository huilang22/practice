
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CsrAccountSegmentBean.java
 * Definition File: Admin/CsrAccountSegment.xml
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
import com.csgsystems.bp.interfaces.CsrAccountSegmentInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CsrAccountSegmentSessionBean"
 * display-name="CsrAccountSegment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CsrAccountSegmentBean"
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

@Stateless(name="CsrAccountSegmentBean", mappedName = "CsrAccountSegment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CsrAccountSegments")

public class CsrAccountSegmentBean implements CsrAccountSegmentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CsrAccountSegmentGetSpec = null;
  /**
   * Retrieve a unique CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASGetIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrAccountSegmentObjectData get (CsrAccountSegmentObjectKeyData CASGetIn) throws BSDMResourceException
  {
    return get (null, CASGetIn);
  }
  /**
   * Retrieve a unique CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASGetIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CsrAccountSegmentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CsrAccountSegmentObjectKeyData CASGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrAccountSegmentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CASGetIn != null) CsrAccountSegmentObjectKeyHelper.toMap (CASGetIn, record, "CsrAccountSegment");
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
return CsrAccountSegmentObjectHelper.fromMap (record, "CsrAccountSegment");
}

  private BSDMInteractionSpec _CsrAccountSegmentFindSpec = null;
  /**
   * Find CsrAccountSegment rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CASFindIn Input Filter Object.
   * @return CsrAccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrAccountSegmentObjectDataList find (CsrAccountSegmentObjectFilter CASFindIn) throws BSDMResourceException
  {
    return find (null, CASFindIn);
  }
  /**
   * Find CsrAccountSegment rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASFindIn Input Filter Object.
   * @return CsrAccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrAccountSegmentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CsrAccountSegmentObjectFilter CASFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrAccountSegmentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CASFindIn != null) CsrAccountSegmentObjectHelper.toMap (CASFindIn, record, "CsrAccountSegment");
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
return CsrAccountSegmentObjectHelper.fromMapList (record, "CsrAccountSegmentList");
}

  private BSDMInteractionSpec _CsrAccountSegmentUpdateSpec = null;
  /**
   * Update non-key fields of a CsrAccountSegment..
   * Convenience method using default BSDMSessionContext.
   * @param CASUpdateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrAccountSegmentObjectData update (CsrAccountSegmentObjectData CASUpdateIn) throws BSDMResourceException
  {
    return update (null, CASUpdateIn);
  }
  /**
   * Update non-key fields of a CsrAccountSegment..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASUpdateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrAccountSegmentObjectData update (@HeaderParam ("context")BSDMSessionContext context,CsrAccountSegmentObjectData CASUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrAccountSegmentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CASUpdateIn != null) CsrAccountSegmentObjectHelper.toMap (CASUpdateIn, record, "CsrAccountSegment");
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
return CsrAccountSegmentObjectHelper.fromMap (record, "CsrAccountSegment");
}

  private BSDMInteractionSpec _CsrAccountSegmentDeleteSpec = null;
  /**
   * Delete a CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASDeleteIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrAccountSegmentObjectData delete (CsrAccountSegmentObjectKeyData CASDeleteIn) throws BSDMResourceException
  {
    return delete (null, CASDeleteIn);
  }
  /**
   * Delete a CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASDeleteIn Input Object Key.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrAccountSegmentObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CsrAccountSegmentObjectKeyData CASDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrAccountSegmentDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CASDeleteIn != null) CsrAccountSegmentObjectKeyHelper.toMap (CASDeleteIn, record, "CsrAccountSegment");
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
return CsrAccountSegmentObjectHelper.fromMap (record, "CsrAccountSegment");
}

  private BSDMInteractionSpec _CsrAccountSegmentCreateSpec = null;
  /**
   * Create a new CsrAccountSegment row..
   * Convenience method using default BSDMSessionContext.
   * @param CASCreateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CsrAccountSegmentObjectData create (CsrAccountSegmentObjectData CASCreateIn) throws BSDMResourceException
  {
    return create (null, CASCreateIn);
  }
  /**
   * Create a new CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASCreateIn Input  Object.
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CsrAccountSegmentObjectData create (@HeaderParam ("context")BSDMSessionContext context,CsrAccountSegmentObjectData CASCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CsrAccountSegmentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CASCreateIn != null) CsrAccountSegmentObjectHelper.toMap (CASCreateIn, record, "CsrAccountSegment");
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
return CsrAccountSegmentObjectHelper.fromMap (record, "CsrAccountSegment");
}

  /**

   * Retrieve a unique CsrAccountSegment row..

   * Convenience method using default BSDMSessionContext.

   * @param CASGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrAccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrAccountSegmentObjectData get (CsrAccountSegmentObjectKeyData CASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CASGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrAccountSegmentObjectData get (BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CASGetIn, defaultAction);
       
     cManager.checkConstraints(CASGetIn, constraintAction);
       return get (context, CASGetIn);
  }

  /**

   * Find CsrAccountSegment rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CASFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrAccountSegmentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrAccountSegmentObjectDataList find (CsrAccountSegmentObjectFilter CASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CASFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CsrAccountSegment rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrAccountSegmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrAccountSegmentObjectDataList find (BSDMSessionContext context, CsrAccountSegmentObjectFilter CASFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CASFindIn, defaultAction);
       
     cManager.checkConstraints(CASFindIn, constraintAction);
       return find (context, CASFindIn);
  }

  /**

   * Update non-key fields of a CsrAccountSegment..

   * Convenience method using default BSDMSessionContext.

   * @param CASUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrAccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrAccountSegmentObjectData update (CsrAccountSegmentObjectData CASUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CASUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CsrAccountSegment..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrAccountSegmentObjectData update (BSDMSessionContext context, CsrAccountSegmentObjectData CASUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CASUpdateIn, defaultAction);
       
     cManager.checkConstraints(CASUpdateIn, constraintAction);
       return update (context, CASUpdateIn);
  }

  /**

   * Delete a CsrAccountSegment row..

   * Convenience method using default BSDMSessionContext.

   * @param CASDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrAccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrAccountSegmentObjectData delete (CsrAccountSegmentObjectKeyData CASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CASDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrAccountSegmentObjectData delete (BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CASDeleteIn, defaultAction);
       
     cManager.checkConstraints(CASDeleteIn, constraintAction);
       return delete (context, CASDeleteIn);
  }

  /**

   * Create a new CsrAccountSegment row..

   * Convenience method using default BSDMSessionContext.

   * @param CASCreateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CsrAccountSegmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CsrAccountSegmentObjectData create (CsrAccountSegmentObjectData CASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CASCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CsrAccountSegment row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CASCreateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CsrAccountSegmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CsrAccountSegmentObjectData create (BSDMSessionContext context, CsrAccountSegmentObjectData CASCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CASCreateIn, defaultAction);
       
     cManager.checkConstraints(CASCreateIn, constraintAction);
       return create (context, CASCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CsrAccountSegmentBean ()
  {
    try
    {
      _CsrAccountSegmentGetSpec = new BSDMInteractionSpec("CsrAccountSegmentGet", ApiMappings.getCallName ("CsrAccountSegmentGet"), Boolean.TRUE);

      _CsrAccountSegmentFindSpec = new BSDMInteractionSpec("CsrAccountSegmentFind", ApiMappings.getCallName ("CsrAccountSegmentFind"), Boolean.TRUE);

      _CsrAccountSegmentUpdateSpec = new BSDMInteractionSpec("CsrAccountSegmentUpdate", ApiMappings.getCallName ("CsrAccountSegmentUpdate"), Boolean.TRUE);

      _CsrAccountSegmentDeleteSpec = new BSDMInteractionSpec("CsrAccountSegmentDelete", ApiMappings.getCallName ("CsrAccountSegmentDelete"), Boolean.TRUE);

      _CsrAccountSegmentCreateSpec = new BSDMInteractionSpec("CsrAccountSegmentCreate", ApiMappings.getCallName ("CsrAccountSegmentCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CsrAccountSegmentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CsrAccountSegmentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
