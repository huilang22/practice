
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: LateFeeRateOverridesBean.java
 * Definition File: Customer/LateFeeRateOverrides.xml
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
import com.csgsystems.bp.interfaces.LateFeeRateOverridesInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="LateFeeRateOverridesSessionBean"
 * display-name="LateFeeRateOverrides Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/LateFeeRateOverridesBean"
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

@Stateless(name="LateFeeRateOverridesBean", mappedName = "LateFeeRateOverrides")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("LateFeeRateOverrides")

public class LateFeeRateOverridesBean implements LateFeeRateOverridesInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _LateFeeRateOverridesCreateSpec = null;
  /**
   * Create a LateFeeRateOverrides based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public LateFeeRateOverridesObjectData create (LateFeeRateOverridesObjectData LFROcIn) throws BSDMResourceException
  {
    return create (null, LFROcIn);
  }
  /**
   * Create a LateFeeRateOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public LateFeeRateOverridesObjectData create (@HeaderParam ("context")BSDMSessionContext context,LateFeeRateOverridesObjectData LFROcIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_LateFeeRateOverridesCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (LFROcIn != null) LateFeeRateOverridesObjectHelper.toMap (LFROcIn, record, "LateFeeRateOverrides");
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
return LateFeeRateOverridesObjectHelper.fromMap (record, "LateFeeRateOverrides");
}

  private BSDMInteractionSpec _LateFeeRateOverridesUpdateSpec = null;
  /**
   * Update non-key fields for a row in LateFeeRateOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param LFROuIn Input  Object.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public LateFeeRateOverridesObjectData update (LateFeeRateOverridesObjectData LFROuIn) throws BSDMResourceException
  {
    return update (null, LFROuIn);
  }
  /**
   * Update non-key fields for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROuIn Input  Object.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public LateFeeRateOverridesObjectData update (@HeaderParam ("context")BSDMSessionContext context,LateFeeRateOverridesObjectData LFROuIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_LateFeeRateOverridesUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (LFROuIn != null) LateFeeRateOverridesObjectHelper.toMap (LFROuIn, record, "LateFeeRateOverrides");
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
return LateFeeRateOverridesObjectHelper.fromMap (record, "LateFeeRateOverrides");
}

  private BSDMInteractionSpec _LateFeeRateOverridesDeleteSpec = null;
  /**
   * Update Inactive date  for a row in LateFeeRateOverrides.
   * Convenience method using default BSDMSessionContext.
   * @param LFROdIn Input Object Key.
   * @param LFROCeaseDate (has a default).
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public LateFeeRateOverridesObjectData delete (LateFeeRateOverridesObjectKeyData LFROdIn, Date LFROCeaseDate) throws BSDMResourceException
  {
    return delete (null, LFROdIn, LFROCeaseDate);
  }
  /**
   * Update Inactive date  for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROdIn Input Object Key.
   * @param LFROCeaseDate (has a default).
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public LateFeeRateOverridesObjectData delete (@HeaderParam ("context")BSDMSessionContext context,LateFeeRateOverridesObjectKeyData LFROdIn,@FormParam("LFROCeaseDate")Date LFROCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_LateFeeRateOverridesDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (LFROdIn != null) LateFeeRateOverridesObjectKeyHelper.toMap (LFROdIn, record, "LateFeeRateOverrides");

      if (LFROCeaseDate != null) record.put ("LFROCeaseDate", LFROCeaseDate);
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
return LateFeeRateOverridesObjectHelper.fromMap (record, "LateFeeRateOverrides");
}

  private BSDMInteractionSpec _LateFeeRateOverridesGetSpec = null;
  /**
   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param LFROgIn Input Object Key.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public LateFeeRateOverridesObjectData get (LateFeeRateOverridesObjectKeyData LFROgIn) throws BSDMResourceException
  {
    return get (null, LFROgIn);
  }
  /**
   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROgIn Input Object Key.
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public LateFeeRateOverridesObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam LateFeeRateOverridesObjectKeyData LFROgIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_LateFeeRateOverridesGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (LFROgIn != null) LateFeeRateOverridesObjectKeyHelper.toMap (LFROgIn, record, "LateFeeRateOverrides");
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
return LateFeeRateOverridesObjectHelper.fromMap (record, "LateFeeRateOverrides");
}

  private BSDMInteractionSpec _LateFeeRateOverridesFindSpec = null;
  /**
   * Find LateFeeRateOverrides rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param LFROfIn Input Filter Object.
   * @return LateFeeRateOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public LateFeeRateOverridesObjectDataList find (LateFeeRateOverridesObjectFilter LFROfIn) throws BSDMResourceException
  {
    return find (null, LFROfIn);
  }
  /**
   * Find LateFeeRateOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROfIn Input Filter Object.
   * @return LateFeeRateOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public LateFeeRateOverridesObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,LateFeeRateOverridesObjectFilter LFROfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_LateFeeRateOverridesFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (LFROfIn != null) LateFeeRateOverridesObjectHelper.toMap (LFROfIn, record, "LateFeeRateOverrides");
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
return LateFeeRateOverridesObjectHelper.fromMapList (record, "LateFeeRateOverridesList");
}

  /**

   * Create a LateFeeRateOverrides based upon its input values..

   * Convenience method using default BSDMSessionContext.

   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return LateFeeRateOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public LateFeeRateOverridesObjectData create (LateFeeRateOverridesObjectData LFROcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, LFROcIn, defaultAction, constraintAction);
  }
  /** 
   * Create a LateFeeRateOverrides based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROcIn Input  Object.  Defaulted Fields: GracePeriod, MinBalThresh.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public LateFeeRateOverridesObjectData create (BSDMSessionContext context, LateFeeRateOverridesObjectData LFROcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(LFROcIn, defaultAction);
       
     cManager.checkConstraints(LFROcIn, constraintAction);
       return create (context, LFROcIn);
  }

  /**

   * Update non-key fields for a row in LateFeeRateOverrides.

   * Convenience method using default BSDMSessionContext.

   * @param LFROuIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return LateFeeRateOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public LateFeeRateOverridesObjectData update (LateFeeRateOverridesObjectData LFROuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, LFROuIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROuIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public LateFeeRateOverridesObjectData update (BSDMSessionContext context, LateFeeRateOverridesObjectData LFROuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(LFROuIn, defaultAction);
       
     cManager.checkConstraints(LFROuIn, constraintAction);
       return update (context, LFROuIn);
  }

  /**

   * Update Inactive date  for a row in LateFeeRateOverrides.

   * Convenience method using default BSDMSessionContext.

   * @param LFROdIn Input Object Key.

   * @param LFROCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return LateFeeRateOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public LateFeeRateOverridesObjectData delete (LateFeeRateOverridesObjectKeyData LFROdIn, Date LFROCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, LFROdIn, LFROCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Update Inactive date  for a row in LateFeeRateOverrides.
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROdIn Input Object Key.
   * @param LFROCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public LateFeeRateOverridesObjectData delete (BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROdIn, Date LFROCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(LFROdIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(LFROdIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, LFROdIn, LFROCeaseDate);
  }

  /**

   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param LFROgIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return LateFeeRateOverridesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public LateFeeRateOverridesObjectData get (LateFeeRateOverridesObjectKeyData LFROgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, LFROgIn, defaultAction, constraintAction);
  }
  /** 
   * Get the unique LateFeeRateOverrides row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROgIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return LateFeeRateOverridesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public LateFeeRateOverridesObjectData get (BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(LFROgIn, defaultAction);
       
     cManager.checkConstraints(LFROgIn, constraintAction);
       return get (context, LFROgIn);
  }

  /**

   * Find LateFeeRateOverrides rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param LFROfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return LateFeeRateOverridesObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public LateFeeRateOverridesObjectDataList find (LateFeeRateOverridesObjectFilter LFROfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, LFROfIn, defaultAction, constraintAction);
  }
  /** 
   * Find LateFeeRateOverrides rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param LFROfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return LateFeeRateOverridesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public LateFeeRateOverridesObjectDataList find (BSDMSessionContext context, LateFeeRateOverridesObjectFilter LFROfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(LFROfIn, defaultAction);
       
     cManager.checkConstraints(LFROfIn, constraintAction);
       return find (context, LFROfIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public LateFeeRateOverridesBean ()
  {
    try
    {
      _LateFeeRateOverridesCreateSpec = new BSDMInteractionSpec("LateFeeRateOverridesCreate", ApiMappings.getCallName ("LateFeeRateOverridesCreate"), Boolean.TRUE);

      _LateFeeRateOverridesUpdateSpec = new BSDMInteractionSpec("LateFeeRateOverridesUpdate", ApiMappings.getCallName ("LateFeeRateOverridesUpdate"), Boolean.TRUE);

      _LateFeeRateOverridesDeleteSpec = new BSDMInteractionSpec("LateFeeRateOverridesDelete", ApiMappings.getCallName ("LateFeeRateOverridesDelete"), Boolean.TRUE);

      _LateFeeRateOverridesGetSpec = new BSDMInteractionSpec("LateFeeRateOverridesGet", ApiMappings.getCallName ("LateFeeRateOverridesGet"), Boolean.TRUE);

      _LateFeeRateOverridesFindSpec = new BSDMInteractionSpec("LateFeeRateOverridesFind", ApiMappings.getCallName ("LateFeeRateOverridesFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public LateFeeRateOverridesBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public LateFeeRateOverridesBean(BSDMSettings settings, BSDMConnectionManager cm)
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
