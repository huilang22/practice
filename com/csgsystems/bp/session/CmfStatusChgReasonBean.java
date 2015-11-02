
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CmfStatusChgReasonBean.java
 * Definition File: Admin/CmfStatusChgReason.xml
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
import com.csgsystems.bp.interfaces.CmfStatusChgReasonInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CmfStatusChgReasonSessionBean"
 * display-name="CmfStatusChgReason Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CmfStatusChgReasonBean"
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

@Stateless(name="CmfStatusChgReasonBean", mappedName = "CmfStatusChgReason")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CmfStatusChgReasons")

public class CmfStatusChgReasonBean implements CmfStatusChgReasonInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CmfStatusChgReasonGetSpec = null;
  /**
   * Get a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRGetIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusChgReasonObjectData get (CmfStatusChgReasonObjectKeyData CSCRGetIn) throws BSDMResourceException
  {
    return get (null, CSCRGetIn);
  }
  /**
   * Get a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRGetIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CmfStatusChgReasonObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CmfStatusChgReasonObjectKeyData CSCRGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusChgReasonGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCRGetIn != null) CmfStatusChgReasonObjectKeyHelper.toMap (CSCRGetIn, record, "CmfStatusChgReason");
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
return CmfStatusChgReasonObjectHelper.fromMap (record, "CmfStatusChgReason");
}

  private BSDMInteractionSpec _CmfStatusChgReasonFindSpec = null;
  /**
   * Find CmfStatusChgReason's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRFindIn Input Filter Object.
   * @return CmfStatusChgReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusChgReasonObjectDataList find (CmfStatusChgReasonObjectFilter CSCRFindIn) throws BSDMResourceException
  {
    return find (null, CSCRFindIn);
  }
  /**
   * Find CmfStatusChgReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRFindIn Input Filter Object.
   * @return CmfStatusChgReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusChgReasonObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CmfStatusChgReasonObjectFilter CSCRFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusChgReasonFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCRFindIn != null) CmfStatusChgReasonObjectHelper.toMap (CSCRFindIn, record, "CmfStatusChgReason");
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
return CmfStatusChgReasonObjectHelper.fromMapList (record, "CmfStatusChgReasonList");
}

  private BSDMInteractionSpec _CmfStatusChgReasonUpdateSpec = null;
  /**
   * Update non-key fields of a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRUpdateIn Input  Object.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusChgReasonObjectData update (CmfStatusChgReasonObjectData CSCRUpdateIn) throws BSDMResourceException
  {
    return update (null, CSCRUpdateIn);
  }
  /**
   * Update non-key fields of a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRUpdateIn Input  Object.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusChgReasonObjectData update (@HeaderParam ("context")BSDMSessionContext context,CmfStatusChgReasonObjectData CSCRUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusChgReasonUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCRUpdateIn != null) CmfStatusChgReasonObjectHelper.toMap (CSCRUpdateIn, record, "CmfStatusChgReason");
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
return CmfStatusChgReasonObjectHelper.fromMap (record, "CmfStatusChgReason");
}

  private BSDMInteractionSpec _CmfStatusChgReasonDeleteSpec = null;
  /**
   * Delete a CmfStatusChgReason row..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRDeleteIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusChgReasonObjectData delete (CmfStatusChgReasonObjectKeyData CSCRDeleteIn) throws BSDMResourceException
  {
    return delete (null, CSCRDeleteIn);
  }
  /**
   * Delete a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRDeleteIn Input Object Key.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusChgReasonObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CmfStatusChgReasonObjectKeyData CSCRDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusChgReasonDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCRDeleteIn != null) CmfStatusChgReasonObjectKeyHelper.toMap (CSCRDeleteIn, record, "CmfStatusChgReason");
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
return CmfStatusChgReasonObjectHelper.fromMap (record, "CmfStatusChgReason");
}

  private BSDMInteractionSpec _CmfStatusChgReasonCreateSpec = null;
  /**
   * Create a new CmfStatusChgReason object..
   * Convenience method using default BSDMSessionContext.
   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfStatusChgReasonObjectData create (CmfStatusChgReasonObjectData CSCRCreateIn) throws BSDMResourceException
  {
    return create (null, CSCRCreateIn);
  }
  /**
   * Create a new CmfStatusChgReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfStatusChgReasonObjectData create (@HeaderParam ("context")BSDMSessionContext context,CmfStatusChgReasonObjectData CSCRCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfStatusChgReasonCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CSCRCreateIn != null) CmfStatusChgReasonObjectHelper.toMap (CSCRCreateIn, record, "CmfStatusChgReason");
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
return CmfStatusChgReasonObjectHelper.fromMap (record, "CmfStatusChgReason");
}

  /**

   * Get a CmfStatusChgReason row..

   * Convenience method using default BSDMSessionContext.

   * @param CSCRGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusChgReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusChgReasonObjectData get (CmfStatusChgReasonObjectKeyData CSCRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CSCRGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusChgReasonObjectData get (BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCRGetIn, defaultAction);
       
     cManager.checkConstraints(CSCRGetIn, constraintAction);
       return get (context, CSCRGetIn);
  }

  /**

   * Find CmfStatusChgReason's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CSCRFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusChgReasonObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusChgReasonObjectDataList find (CmfStatusChgReasonObjectFilter CSCRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CSCRFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CmfStatusChgReason's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusChgReasonObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusChgReasonObjectDataList find (BSDMSessionContext context, CmfStatusChgReasonObjectFilter CSCRFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCRFindIn, defaultAction);
       
     cManager.checkConstraints(CSCRFindIn, constraintAction);
       return find (context, CSCRFindIn);
  }

  /**

   * Update non-key fields of a CmfStatusChgReason row..

   * Convenience method using default BSDMSessionContext.

   * @param CSCRUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusChgReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusChgReasonObjectData update (CmfStatusChgReasonObjectData CSCRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CSCRUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusChgReasonObjectData update (BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCRUpdateIn, defaultAction);
       
     cManager.checkConstraints(CSCRUpdateIn, constraintAction);
       return update (context, CSCRUpdateIn);
  }

  /**

   * Delete a CmfStatusChgReason row..

   * Convenience method using default BSDMSessionContext.

   * @param CSCRDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusChgReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusChgReasonObjectData delete (CmfStatusChgReasonObjectKeyData CSCRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CSCRDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a CmfStatusChgReason row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusChgReasonObjectData delete (BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCRDeleteIn, defaultAction);
       
     cManager.checkConstraints(CSCRDeleteIn, constraintAction);
       return delete (context, CSCRDeleteIn);
  }

  /**

   * Create a new CmfStatusChgReason object..

   * Convenience method using default BSDMSessionContext.

   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfStatusChgReasonObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfStatusChgReasonObjectData create (CmfStatusChgReasonObjectData CSCRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CSCRCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CmfStatusChgReason object..
   * @param context The session context to use when connecting to the APITS server.
   * @param CSCRCreateIn Input  Object.  Defaulted Fields: IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfStatusChgReasonObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfStatusChgReasonObjectData create (BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CSCRCreateIn, defaultAction);
       
     cManager.checkConstraints(CSCRCreateIn, constraintAction);
       return create (context, CSCRCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CmfStatusChgReasonBean ()
  {
    try
    {
      _CmfStatusChgReasonGetSpec = new BSDMInteractionSpec("CmfStatusChgReasonGet", ApiMappings.getCallName ("CmfStatusChgReasonGet"), Boolean.TRUE);

      _CmfStatusChgReasonFindSpec = new BSDMInteractionSpec("CmfStatusChgReasonFind", ApiMappings.getCallName ("CmfStatusChgReasonFind"), Boolean.TRUE);

      _CmfStatusChgReasonUpdateSpec = new BSDMInteractionSpec("CmfStatusChgReasonUpdate", ApiMappings.getCallName ("CmfStatusChgReasonUpdate"), Boolean.TRUE);

      _CmfStatusChgReasonDeleteSpec = new BSDMInteractionSpec("CmfStatusChgReasonDelete", ApiMappings.getCallName ("CmfStatusChgReasonDelete"), Boolean.TRUE);

      _CmfStatusChgReasonCreateSpec = new BSDMInteractionSpec("CmfStatusChgReasonCreate", ApiMappings.getCallName ("CmfStatusChgReasonCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CmfStatusChgReasonBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CmfStatusChgReasonBean(BSDMSettings settings, BSDMConnectionManager cm)
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
