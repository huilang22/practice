
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: RevRcvCostCenterBean.java
 * Definition File: Admin/RevRcvCostCenter.xml
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
import com.csgsystems.bp.interfaces.RevRcvCostCenterInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="RevRcvCostCenterSessionBean"
 * display-name="RevRcvCostCenter Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/RevRcvCostCenterBean"
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

@Stateless(name="RevRcvCostCenterBean", mappedName = "RevRcvCostCenter")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("RevRcvCostCenters")

public class RevRcvCostCenterBean implements RevRcvCostCenterInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _RevRcvCostCenterGetSpec = null;
  /**
   * Retrieve a unique RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCGetIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RevRcvCostCenterObjectData get (RevRcvCostCenterObjectKeyData RRCCGetIn) throws BSDMResourceException
  {
    return get (null, RRCCGetIn);
  }
  /**
   * Retrieve a unique RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCGetIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public RevRcvCostCenterObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam RevRcvCostCenterObjectKeyData RRCCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RevRcvCostCenterGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRCCGetIn != null) RevRcvCostCenterObjectKeyHelper.toMap (RRCCGetIn, record, "RevRcvCostCenter");
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
return RevRcvCostCenterObjectHelper.fromMap (record, "RevRcvCostCenter");
}

  private BSDMInteractionSpec _RevRcvCostCenterFindSpec = null;
  /**
   * Find RevRcvCostCenter's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCFindIn Input Filter Object.
   * @return RevRcvCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RevRcvCostCenterObjectDataList find (RevRcvCostCenterObjectFilter RRCCFindIn) throws BSDMResourceException
  {
    return find (null, RRCCFindIn);
  }
  /**
   * Find RevRcvCostCenter's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCFindIn Input Filter Object.
   * @return RevRcvCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RevRcvCostCenterObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,RevRcvCostCenterObjectFilter RRCCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RevRcvCostCenterFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRCCFindIn != null) RevRcvCostCenterObjectHelper.toMap (RRCCFindIn, record, "RevRcvCostCenter");
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
return RevRcvCostCenterObjectHelper.fromMapList (record, "RevRcvCostCenterList");
}

  private BSDMInteractionSpec _RevRcvCostCenterUpdateSpec = null;
  /**
   * Update non-key fields for a RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCUpdateIn Input  Object.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RevRcvCostCenterObjectData update (RevRcvCostCenterObjectData RRCCUpdateIn) throws BSDMResourceException
  {
    return update (null, RRCCUpdateIn);
  }
  /**
   * Update non-key fields for a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCUpdateIn Input  Object.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RevRcvCostCenterObjectData update (@HeaderParam ("context")BSDMSessionContext context,RevRcvCostCenterObjectData RRCCUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RevRcvCostCenterUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRCCUpdateIn != null) RevRcvCostCenterObjectHelper.toMap (RRCCUpdateIn, record, "RevRcvCostCenter");
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
return RevRcvCostCenterObjectHelper.fromMap (record, "RevRcvCostCenter");
}

  private BSDMInteractionSpec _RevRcvCostCenterDeleteSpec = null;
  /**
   * Delete a RevRcvCostCenter row..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCDeleteIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RevRcvCostCenterObjectData delete (RevRcvCostCenterObjectKeyData RRCCDeleteIn) throws BSDMResourceException
  {
    return delete (null, RRCCDeleteIn);
  }
  /**
   * Delete a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCDeleteIn Input Object Key.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RevRcvCostCenterObjectData delete (@HeaderParam ("context")BSDMSessionContext context,RevRcvCostCenterObjectKeyData RRCCDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RevRcvCostCenterDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRCCDeleteIn != null) RevRcvCostCenterObjectKeyHelper.toMap (RRCCDeleteIn, record, "RevRcvCostCenter");
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
return RevRcvCostCenterObjectHelper.fromMap (record, "RevRcvCostCenter");
}

  private BSDMInteractionSpec _RevRcvCostCenterCreateSpec = null;
  /**
   * Create a new RevRcvCostCenter..
   * Convenience method using default BSDMSessionContext.
   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public RevRcvCostCenterObjectData create (RevRcvCostCenterObjectData RRCCCreateIn) throws BSDMResourceException
  {
    return create (null, RRCCCreateIn);
  }
  /**
   * Create a new RevRcvCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public RevRcvCostCenterObjectData create (@HeaderParam ("context")BSDMSessionContext context,RevRcvCostCenterObjectData RRCCCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_RevRcvCostCenterCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (RRCCCreateIn != null) RevRcvCostCenterObjectHelper.toMap (RRCCCreateIn, record, "RevRcvCostCenter");
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
return RevRcvCostCenterObjectHelper.fromMap (record, "RevRcvCostCenter");
}

  /**

   * Retrieve a unique RevRcvCostCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param RRCCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RevRcvCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RevRcvCostCenterObjectData get (RevRcvCostCenterObjectKeyData RRCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, RRCCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RevRcvCostCenterObjectData get (BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRCCGetIn, defaultAction);
       
     cManager.checkConstraints(RRCCGetIn, constraintAction);
       return get (context, RRCCGetIn);
  }

  /**

   * Find RevRcvCostCenter's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param RRCCFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RevRcvCostCenterObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RevRcvCostCenterObjectDataList find (RevRcvCostCenterObjectFilter RRCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, RRCCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find RevRcvCostCenter's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RevRcvCostCenterObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RevRcvCostCenterObjectDataList find (BSDMSessionContext context, RevRcvCostCenterObjectFilter RRCCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRCCFindIn, defaultAction);
       
     cManager.checkConstraints(RRCCFindIn, constraintAction);
       return find (context, RRCCFindIn);
  }

  /**

   * Update non-key fields for a RevRcvCostCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param RRCCUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RevRcvCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RevRcvCostCenterObjectData update (RevRcvCostCenterObjectData RRCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, RRCCUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RevRcvCostCenterObjectData update (BSDMSessionContext context, RevRcvCostCenterObjectData RRCCUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRCCUpdateIn, defaultAction);
       
     cManager.checkConstraints(RRCCUpdateIn, constraintAction);
       return update (context, RRCCUpdateIn);
  }

  /**

   * Delete a RevRcvCostCenter row..

   * Convenience method using default BSDMSessionContext.

   * @param RRCCDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RevRcvCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RevRcvCostCenterObjectData delete (RevRcvCostCenterObjectKeyData RRCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, RRCCDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a RevRcvCostCenter row..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RevRcvCostCenterObjectData delete (BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRCCDeleteIn, defaultAction);
       
     cManager.checkConstraints(RRCCDeleteIn, constraintAction);
       return delete (context, RRCCDeleteIn);
  }

  /**

   * Create a new RevRcvCostCenter..

   * Convenience method using default BSDMSessionContext.

   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return RevRcvCostCenterObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public RevRcvCostCenterObjectData create (RevRcvCostCenterObjectData RRCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, RRCCCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new RevRcvCostCenter..
   * @param context The session context to use when connecting to the APITS server.
   * @param RRCCCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return RevRcvCostCenterObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public RevRcvCostCenterObjectData create (BSDMSessionContext context, RevRcvCostCenterObjectData RRCCCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(RRCCCreateIn, defaultAction);
       
     cManager.checkConstraints(RRCCCreateIn, constraintAction);
       return create (context, RRCCCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public RevRcvCostCenterBean ()
  {
    try
    {
      _RevRcvCostCenterGetSpec = new BSDMInteractionSpec("RevRcvCostCenterGet", ApiMappings.getCallName ("RevRcvCostCenterGet"), Boolean.TRUE);

      _RevRcvCostCenterFindSpec = new BSDMInteractionSpec("RevRcvCostCenterFind", ApiMappings.getCallName ("RevRcvCostCenterFind"), Boolean.TRUE);

      _RevRcvCostCenterUpdateSpec = new BSDMInteractionSpec("RevRcvCostCenterUpdate", ApiMappings.getCallName ("RevRcvCostCenterUpdate"), Boolean.TRUE);

      _RevRcvCostCenterDeleteSpec = new BSDMInteractionSpec("RevRcvCostCenterDelete", ApiMappings.getCallName ("RevRcvCostCenterDelete"), Boolean.TRUE);

      _RevRcvCostCenterCreateSpec = new BSDMInteractionSpec("RevRcvCostCenterCreate", ApiMappings.getCallName ("RevRcvCostCenterCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public RevRcvCostCenterBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public RevRcvCostCenterBean(BSDMSettings settings, BSDMConnectionManager cm)
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
