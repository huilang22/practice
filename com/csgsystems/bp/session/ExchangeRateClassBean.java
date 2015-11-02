
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ExchangeRateClassBean.java
 * Definition File: Admin/ExchangeRateClass.xml
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
import com.csgsystems.bp.interfaces.ExchangeRateClassInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ExchangeRateClassSessionBean"
 * display-name="ExchangeRateClass Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ExchangeRateClassBean"
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

@Stateless(name="ExchangeRateClassBean", mappedName = "ExchangeRateClass")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ExchangeRateClass")

public class ExchangeRateClassBean implements ExchangeRateClassInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ExchangeRateClassGetSpec = null;
  /**
   * Get a unique ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCGetIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExchangeRateClassObjectData get (ExchangeRateClassObjectKeyData EXRCGetIn) throws BSDMResourceException
  {
    return get (null, EXRCGetIn);
  }
  /**
   * Get a unique ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCGetIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ExchangeRateClassObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ExchangeRateClassObjectKeyData EXRCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExchangeRateClassGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EXRCGetIn != null) ExchangeRateClassObjectKeyHelper.toMap (EXRCGetIn, record, "ExchangeRateClass");
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
return ExchangeRateClassObjectHelper.fromMap (record, "ExchangeRateClass");
}

  private BSDMInteractionSpec _ExchangeRateClassFindSpec = null;
  /**
   * Find ExchangeRateClass rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCFindIn Input Filter Object.
   * @return ExchangeRateClassObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExchangeRateClassObjectDataList find (ExchangeRateClassObjectFilter EXRCFindIn) throws BSDMResourceException
  {
    return find (null, EXRCFindIn);
  }
  /**
   * Find ExchangeRateClass rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCFindIn Input Filter Object.
   * @return ExchangeRateClassObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExchangeRateClassObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ExchangeRateClassObjectFilter EXRCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExchangeRateClassFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EXRCFindIn != null) ExchangeRateClassObjectHelper.toMap (EXRCFindIn, record, "ExchangeRateClass");
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
return ExchangeRateClassObjectHelper.fromMapList (record, "ExchangeRateClassList");
}

  private BSDMInteractionSpec _ExchangeRateClassUpdateSpec = null;
  /**
   * Update the non-key fields of an ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCUpdateIn Input  Object.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExchangeRateClassObjectData update (ExchangeRateClassObjectData EXRCUpdateIn) throws BSDMResourceException
  {
    return update (null, EXRCUpdateIn);
  }
  /**
   * Update the non-key fields of an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCUpdateIn Input  Object.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExchangeRateClassObjectData update (@HeaderParam ("context")BSDMSessionContext context,ExchangeRateClassObjectData EXRCUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExchangeRateClassUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EXRCUpdateIn != null) ExchangeRateClassObjectHelper.toMap (EXRCUpdateIn, record, "ExchangeRateClass");
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
return ExchangeRateClassObjectHelper.fromMap (record, "ExchangeRateClass");
}

  private BSDMInteractionSpec _ExchangeRateClassDeleteSpec = null;
  /**
   * Delete an ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCDeleteIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExchangeRateClassObjectData delete (ExchangeRateClassObjectKeyData EXRCDeleteIn) throws BSDMResourceException
  {
    return delete (null, EXRCDeleteIn);
  }
  /**
   * Delete an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCDeleteIn Input Object Key.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExchangeRateClassObjectData delete (@HeaderParam ("context")BSDMSessionContext context,ExchangeRateClassObjectKeyData EXRCDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExchangeRateClassDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EXRCDeleteIn != null) ExchangeRateClassObjectKeyHelper.toMap (EXRCDeleteIn, record, "ExchangeRateClass");
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
return ExchangeRateClassObjectHelper.fromMap (record, "ExchangeRateClass");
}

  private BSDMInteractionSpec _ExchangeRateClassCreateSpec = null;
  /**
   * Create a new ExchangeRateClass row..
   * Convenience method using default BSDMSessionContext.
   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExchangeRateClassObjectData create (ExchangeRateClassObjectData EXRCCreateIn) throws BSDMResourceException
  {
    return create (null, EXRCCreateIn);
  }
  /**
   * Create a new ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExchangeRateClassObjectData create (@HeaderParam ("context")BSDMSessionContext context,ExchangeRateClassObjectData EXRCCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExchangeRateClassCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (EXRCCreateIn != null) ExchangeRateClassObjectHelper.toMap (EXRCCreateIn, record, "ExchangeRateClass");
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
return ExchangeRateClassObjectHelper.fromMap (record, "ExchangeRateClass");
}

  /**

   * Get a unique ExchangeRateClass row..

   * Convenience method using default BSDMSessionContext.

   * @param EXRCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExchangeRateClassObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExchangeRateClassObjectData get (ExchangeRateClassObjectKeyData EXRCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, EXRCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExchangeRateClassObjectData get (BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EXRCGetIn, defaultAction);
       
     cManager.checkConstraints(EXRCGetIn, constraintAction);
       return get (context, EXRCGetIn);
  }

  /**

   * Find ExchangeRateClass rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param EXRCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExchangeRateClassObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExchangeRateClassObjectDataList find (ExchangeRateClassObjectFilter EXRCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, EXRCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ExchangeRateClass rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExchangeRateClassObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExchangeRateClassObjectDataList find (BSDMSessionContext context, ExchangeRateClassObjectFilter EXRCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EXRCFindIn, defaultAction);
       
     cManager.checkConstraints(EXRCFindIn, constraintAction);
       return find (context, EXRCFindIn);
  }

  /**

   * Update the non-key fields of an ExchangeRateClass row..

   * Convenience method using default BSDMSessionContext.

   * @param EXRCUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExchangeRateClassObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExchangeRateClassObjectData update (ExchangeRateClassObjectData EXRCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, EXRCUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExchangeRateClassObjectData update (BSDMSessionContext context, ExchangeRateClassObjectData EXRCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EXRCUpdateIn, defaultAction);
       
     cManager.checkConstraints(EXRCUpdateIn, constraintAction);
       return update (context, EXRCUpdateIn);
  }

  /**

   * Delete an ExchangeRateClass row..

   * Convenience method using default BSDMSessionContext.

   * @param EXRCDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExchangeRateClassObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExchangeRateClassObjectData delete (ExchangeRateClassObjectKeyData EXRCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, EXRCDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete an ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExchangeRateClassObjectData delete (BSDMSessionContext context, ExchangeRateClassObjectKeyData EXRCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EXRCDeleteIn, defaultAction);
       
     cManager.checkConstraints(EXRCDeleteIn, constraintAction);
       return delete (context, EXRCDeleteIn);
  }

  /**

   * Create a new ExchangeRateClass row..

   * Convenience method using default BSDMSessionContext.

   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExchangeRateClassObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExchangeRateClassObjectData create (ExchangeRateClassObjectData EXRCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, EXRCCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ExchangeRateClass row..
   * @param context The session context to use when connecting to the APITS server.
   * @param EXRCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExchangeRateClassObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExchangeRateClassObjectData create (BSDMSessionContext context, ExchangeRateClassObjectData EXRCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(EXRCCreateIn, defaultAction);
       
     cManager.checkConstraints(EXRCCreateIn, constraintAction);
       return create (context, EXRCCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ExchangeRateClassBean ()
  {
    try
    {
      _ExchangeRateClassGetSpec = new BSDMInteractionSpec("ExchangeRateClassGet", ApiMappings.getCallName ("ExchangeRateClassGet"), Boolean.TRUE);

      _ExchangeRateClassFindSpec = new BSDMInteractionSpec("ExchangeRateClassFind", ApiMappings.getCallName ("ExchangeRateClassFind"), Boolean.TRUE);

      _ExchangeRateClassUpdateSpec = new BSDMInteractionSpec("ExchangeRateClassUpdate", ApiMappings.getCallName ("ExchangeRateClassUpdate"), Boolean.TRUE);

      _ExchangeRateClassDeleteSpec = new BSDMInteractionSpec("ExchangeRateClassDelete", ApiMappings.getCallName ("ExchangeRateClassDelete"), Boolean.TRUE);

      _ExchangeRateClassCreateSpec = new BSDMInteractionSpec("ExchangeRateClassCreate", ApiMappings.getCallName ("ExchangeRateClassCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ExchangeRateClassBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ExchangeRateClassBean(BSDMSettings settings, BSDMConnectionManager cm)
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
