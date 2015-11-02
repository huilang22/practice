
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CmfPackageOverridesBean.java
 * Definition File: Customer/CmfPackageOverrides.xml
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
import com.csgsystems.bp.interfaces.CmfPackageOverridesInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CmfPackageOverridesSessionBean"
 * display-name="CmfPackageOverrides Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CmfPackageOverridesBean"
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

@Stateless(name="CmfPackageOverridesBean", mappedName = "CmfPackageOverrides")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CmfPackageOverrides")

public class CmfPackageOverridesBean implements CmfPackageOverridesInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CmfPackageOverridesCreateSpec = null;
  /**
   * Create a CmfPackageOverrides based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PackageOverridesObjectData create (PackageOverridesObjectData CPOcIn) throws BSDMResourceException
  {
    return create (null, CPOcIn);
  }
  /**
   * Create a CmfPackageOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PackageOverridesObjectData create (@HeaderParam ("context")BSDMSessionContext context,PackageOverridesObjectData CPOcIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfPackageOverridesCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CPOcIn != null) PackageOverridesObjectHelper.toMap (CPOcIn, record, "CmfPackageOverrides");
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
return PackageOverridesObjectHelper.fromMap (record, "CmfPackageOverrides");
}

  private BSDMInteractionSpec _CmfPackageOverridesUpdateSpec = null;
  /**
   * Update non-key fields for a row in CmfPackageOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PackageOverridesObjectData update (PackageOverridesObjectData CPOuIn) throws BSDMResourceException
  {
    return update (null, CPOuIn);
  }
  /**
   * Update non-key fields for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PackageOverridesObjectData update (@HeaderParam ("context")BSDMSessionContext context,PackageOverridesObjectData CPOuIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfPackageOverridesUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CPOuIn != null) PackageOverridesObjectHelper.toMap (CPOuIn, record, "CmfPackageOverrides");
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
return PackageOverridesObjectHelper.fromMap (record, "CmfPackageOverrides");
}

  private BSDMInteractionSpec _CmfPackageOverridesDeleteSpec = null;
  /**
   * Update override status to Inactive (0) for a row in CmfPackageOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param CPOdIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PackageOverridesObjectData delete (PackageOverridesObjectKeyData CPOdIn) throws BSDMResourceException
  {
    return delete (null, CPOdIn);
  }
  /**
   * Update override status to Inactive (0) for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOdIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PackageOverridesObjectData delete (@HeaderParam ("context")BSDMSessionContext context,PackageOverridesObjectKeyData CPOdIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfPackageOverridesDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CPOdIn != null) PackageOverridesObjectKeyHelper.toMap (CPOdIn, record, "CmfPackageOverrides");
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
return PackageOverridesObjectHelper.fromMap (record, "CmfPackageOverrides");
}

  private BSDMInteractionSpec _CmfPackageOverridesGetSpec = null;
  /**
   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param CPOgIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PackageOverridesObjectData get (PackageOverridesObjectKeyData CPOgIn) throws BSDMResourceException
  {
    return get (null, CPOgIn);
  }
  /**
   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOgIn Input Object Key.
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PackageOverridesObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PackageOverridesObjectKeyData CPOgIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfPackageOverridesGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CPOgIn != null) PackageOverridesObjectKeyHelper.toMap (CPOgIn, record, "CmfPackageOverrides");
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
return PackageOverridesObjectHelper.fromMap (record, "CmfPackageOverrides");
}

  private BSDMInteractionSpec _CmfPackageOverridesFindSpec = null;
  /**
   * Find CmfPackageOverrides rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CPOfIn Input Filter Object.
   * @return PackageOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PackageOverridesObjectDataList find (PackageOverridesObjectFilter CPOfIn) throws BSDMResourceException
  {
    return find (null, CPOfIn);
  }
  /**
   * Find CmfPackageOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOfIn Input Filter Object.
   * @return PackageOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PackageOverridesObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PackageOverridesObjectFilter CPOfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfPackageOverridesFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CPOfIn != null) PackageOverridesObjectHelper.toMap (CPOfIn, record, "CmfPackageOverrides");
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
return PackageOverridesObjectHelper.fromMapList (record, "CmfPackageOverridesList");
}

  /**

   * Create a CmfPackageOverrides based upon its input values..

   * Convenience method using default BSDMSessionContext.

   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PackageOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PackageOverridesObjectData create (PackageOverridesObjectData CPOcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CPOcIn, defaultAction, constraintAction);
  }
  /** 
   * Create a CmfPackageOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOcIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PackageOverridesObjectData create (BSDMSessionContext context, PackageOverridesObjectData CPOcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CPOcIn, defaultAction);
       
     cManager.checkConstraints(CPOcIn, constraintAction);
       return create (context, CPOcIn);
  }

  /**

   * Update non-key fields for a row in CmfPackageOverrides.

   * Convenience method using default BSDMSessionContext.

   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PackageOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PackageOverridesObjectData update (PackageOverridesObjectData CPOuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CPOuIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOuIn Input  Object.  Derived Fields: ChgWho, ChgDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PackageOverridesObjectData update (BSDMSessionContext context, PackageOverridesObjectData CPOuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CPOuIn, defaultAction);
       
     cManager.checkConstraints(CPOuIn, constraintAction);
       return update (context, CPOuIn);
  }

  /**

   * Update override status to Inactive (0) for a row in CmfPackageOverrides.

   * Convenience method using default BSDMSessionContext.

   * @param CPOdIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PackageOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PackageOverridesObjectData delete (PackageOverridesObjectKeyData CPOdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CPOdIn, defaultAction, constraintAction);
  }
  /** 
   * Update override status to Inactive (0) for a row in CmfPackageOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOdIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PackageOverridesObjectData delete (BSDMSessionContext context, PackageOverridesObjectKeyData CPOdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CPOdIn, defaultAction);
       
     cManager.checkConstraints(CPOdIn, constraintAction);
       return delete (context, CPOdIn);
  }

  /**

   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param CPOgIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PackageOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PackageOverridesObjectData get (PackageOverridesObjectKeyData CPOgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CPOgIn, defaultAction, constraintAction);
  }
  /** 
   * Get the unique CmfPackageOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOgIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PackageOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PackageOverridesObjectData get (BSDMSessionContext context, PackageOverridesObjectKeyData CPOgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CPOgIn, defaultAction);
       
     cManager.checkConstraints(CPOgIn, constraintAction);
       return get (context, CPOgIn);
  }

  /**

   * Find CmfPackageOverrides rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CPOfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PackageOverridesObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PackageOverridesObjectDataList find (PackageOverridesObjectFilter CPOfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CPOfIn, defaultAction, constraintAction);
  }
  /** 
   * Find CmfPackageOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CPOfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PackageOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PackageOverridesObjectDataList find (BSDMSessionContext context, PackageOverridesObjectFilter CPOfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CPOfIn, defaultAction);
       
     cManager.checkConstraints(CPOfIn, constraintAction);
       return find (context, CPOfIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CmfPackageOverridesBean ()
  {
    try
    {
      _CmfPackageOverridesCreateSpec = new BSDMInteractionSpec("CmfPackageOverridesCreate", ApiMappings.getCallName ("CmfPackageOverridesCreate"), Boolean.TRUE);

      _CmfPackageOverridesUpdateSpec = new BSDMInteractionSpec("CmfPackageOverridesUpdate", ApiMappings.getCallName ("CmfPackageOverridesUpdate"), Boolean.TRUE);

      _CmfPackageOverridesDeleteSpec = new BSDMInteractionSpec("CmfPackageOverridesDelete", ApiMappings.getCallName ("CmfPackageOverridesDelete"), Boolean.TRUE);

      _CmfPackageOverridesGetSpec = new BSDMInteractionSpec("CmfPackageOverridesGet", ApiMappings.getCallName ("CmfPackageOverridesGet"), Boolean.TRUE);

      _CmfPackageOverridesFindSpec = new BSDMInteractionSpec("CmfPackageOverridesFind", ApiMappings.getCallName ("CmfPackageOverridesFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CmfPackageOverridesBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CmfPackageOverridesBean(BSDMSettings settings, BSDMConnectionManager cm)
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
