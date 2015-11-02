
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HistoricalThresholdsBean.java
 * Definition File: Customer/HistoricalThresholds.xml
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
import com.csgsystems.bp.interfaces.HistoricalThresholdsInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HistoricalThresholdsSessionBean"
 * display-name="HistoricalThresholds Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HistoricalThresholdsBean"
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

@Stateless(name="HistoricalThresholdsBean", mappedName = "HistoricalThresholds")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HistoricalThresholds")

public class HistoricalThresholdsBean implements HistoricalThresholdsInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HistoricalThresholdsGetSpec = null;
  /**
   * Retrieve a unique HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTGetIn Input Object Key.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalThresholdsObjectData get (HistoricalThresholdsObjectKeyData HTGetIn) throws BSDMResourceException
  {
    return get (null, HTGetIn);
  }
  /**
   * Retrieve a unique HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTGetIn Input Object Key.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HistoricalThresholdsObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HistoricalThresholdsObjectKeyData HTGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalThresholdsGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HTGetIn != null) HistoricalThresholdsObjectKeyHelper.toMap (HTGetIn, record, "HistoricalThresholds");
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
return HistoricalThresholdsObjectHelper.fromMap (record, "HistoricalThresholds");
}

  private BSDMInteractionSpec _HistoricalThresholdsFindSpec = null;
  /**
   * Find HistoricalThresholds rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HTFindIn Input Filter Object.
   * @return HistoricalThresholdsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalThresholdsObjectDataList find (HistoricalThresholdsObjectFilter HTFindIn) throws BSDMResourceException
  {
    return find (null, HTFindIn);
  }
  /**
   * Find HistoricalThresholds rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTFindIn Input Filter Object.
   * @return HistoricalThresholdsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalThresholdsObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HistoricalThresholdsObjectFilter HTFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalThresholdsFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HTFindIn != null) HistoricalThresholdsObjectHelper.toMap (HTFindIn, record, "HistoricalThresholds");
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
return HistoricalThresholdsObjectHelper.fromMapList (record, "HistoricalThresholdsList");
}

  private BSDMInteractionSpec _HistoricalThresholdsUpdateSpec = null;
  /**
   * Update non-key fields of a HistoricalThresholds..
   * Convenience method using default BSDMSessionContext.
   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalThresholdsObjectData update (HistoricalThresholdsObjectData HTUpdateIn) throws BSDMResourceException
  {
    return update (null, HTUpdateIn);
  }
  /**
   * Update non-key fields of a HistoricalThresholds..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalThresholdsObjectData update (@HeaderParam ("context")BSDMSessionContext context,HistoricalThresholdsObjectData HTUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalThresholdsUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HTUpdateIn != null) HistoricalThresholdsObjectHelper.toMap (HTUpdateIn, record, "HistoricalThresholds");
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
return HistoricalThresholdsObjectHelper.fromMap (record, "HistoricalThresholds");
}

  private BSDMInteractionSpec _HistoricalThresholdsDeleteSpec = null;
  /**
   * Delete a HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTDeleteIn Input Object Key.
   * @param inactive_date (has a default).
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalThresholdsObjectData delete (HistoricalThresholdsObjectKeyData HTDeleteIn, Date inactive_date) throws BSDMResourceException
  {
    return delete (null, HTDeleteIn, inactive_date);
  }
  /**
   * Delete a HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteIn Input Object Key.
   * @param inactive_date (has a default).
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalThresholdsObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HistoricalThresholdsObjectKeyData HTDeleteIn,@FormParam("inactive_date")Date inactive_date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalThresholdsDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HTDeleteIn != null) HistoricalThresholdsObjectKeyHelper.toMap (HTDeleteIn, record, "HistoricalThresholds");

      if (inactive_date != null) record.put ("InactiveDate", inactive_date);
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
return HistoricalThresholdsObjectHelper.fromMap (record, "HistoricalThresholds");
}

  private BSDMInteractionSpec _HistoricalThresholdsDeleteListSpec = null;
  /**
   * Delete all HistoricalThresholds row that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HTDeleteLIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (HistoricalThresholdsObjectFilter HTDeleteLIn, Date InactiveDate) throws BSDMResourceException
  {
    deleteList (null, HTDeleteLIn, InactiveDate);
  }
  /**
   * Delete all HistoricalThresholds row that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteLIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,HistoricalThresholdsObjectFilter HTDeleteLIn,@FormParam("InactiveDate")Date InactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalThresholdsDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HTDeleteLIn != null) HistoricalThresholdsObjectHelper.toMap (HTDeleteLIn, record, "HistoricalThresholds");

      if (InactiveDate != null) record.put ("InactiveDate", InactiveDate);
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
return;
}

  private BSDMInteractionSpec _HistoricalThresholdsCreateSpec = null;
  /**
   * Create a new HistoricalThresholds row..
   * Convenience method using default BSDMSessionContext.
   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HistoricalThresholdsObjectData create (HistoricalThresholdsObjectData HTCreateIn) throws BSDMResourceException
  {
    return create (null, HTCreateIn);
  }
  /**
   * Create a new HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HistoricalThresholdsObjectData create (@HeaderParam ("context")BSDMSessionContext context,HistoricalThresholdsObjectData HTCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HistoricalThresholdsCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HTCreateIn != null) HistoricalThresholdsObjectHelper.toMap (HTCreateIn, record, "HistoricalThresholds");
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
return HistoricalThresholdsObjectHelper.fromMap (record, "HistoricalThresholds");
}

  /**

   * Retrieve a unique HistoricalThresholds row..

   * Convenience method using default BSDMSessionContext.

   * @param HTGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalThresholdsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalThresholdsObjectData get (HistoricalThresholdsObjectKeyData HTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HTGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalThresholdsObjectData get (BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HTGetIn, defaultAction);
       
     cManager.checkConstraints(HTGetIn, constraintAction);
       return get (context, HTGetIn);
  }

  /**

   * Find HistoricalThresholds rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HTFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalThresholdsObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalThresholdsObjectDataList find (HistoricalThresholdsObjectFilter HTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HTFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find HistoricalThresholds rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalThresholdsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalThresholdsObjectDataList find (BSDMSessionContext context, HistoricalThresholdsObjectFilter HTFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HTFindIn, defaultAction);
       
     cManager.checkConstraints(HTFindIn, constraintAction);
       return find (context, HTFindIn);
  }

  /**

   * Update non-key fields of a HistoricalThresholds..

   * Convenience method using default BSDMSessionContext.

   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalThresholdsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalThresholdsObjectData update (HistoricalThresholdsObjectData HTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HTUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a HistoricalThresholds..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalThresholdsObjectData update (BSDMSessionContext context, HistoricalThresholdsObjectData HTUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HTUpdateIn, defaultAction);
       
     cManager.checkConstraints(HTUpdateIn, constraintAction);
       return update (context, HTUpdateIn);
  }

  /**

   * Delete a HistoricalThresholds row..

   * Convenience method using default BSDMSessionContext.

   * @param HTDeleteIn Input Object Key.

   * @param inactive_date (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalThresholdsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalThresholdsObjectData delete (HistoricalThresholdsObjectKeyData HTDeleteIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, HTDeleteIn, inactive_date, defaultAction, constraintAction);
  }
  /** 
   * Delete a HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteIn Input Object Key.
   * @param inactive_date (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalThresholdsObjectData delete (BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTDeleteIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HTDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(HTDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, HTDeleteIn, inactive_date);
  }

  /**

   * Delete all HistoricalThresholds row that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HTDeleteLIn Input Filter Object.

   * @param InactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (HistoricalThresholdsObjectFilter HTDeleteLIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, HTDeleteLIn, InactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Delete all HistoricalThresholds row that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTDeleteLIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, HistoricalThresholdsObjectFilter HTDeleteLIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HTDeleteLIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(HTDeleteLIn, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, HTDeleteLIn, InactiveDate);
  }

  /**

   * Create a new HistoricalThresholds row..

   * Convenience method using default BSDMSessionContext.

   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HistoricalThresholdsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HistoricalThresholdsObjectData create (HistoricalThresholdsObjectData HTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HTCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new HistoricalThresholds row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HTCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho, ThresholdTrackingId, ThresholdTrackingIdServ.  Defaulted Fields: CurrencyCode.  Derived Fields: ThresholdTrackingId, ThresholdTrackingIdServ, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HistoricalThresholdsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HistoricalThresholdsObjectData create (BSDMSessionContext context, HistoricalThresholdsObjectData HTCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HTCreateIn, defaultAction);
       
     cManager.checkConstraints(HTCreateIn, constraintAction);
       return create (context, HTCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HistoricalThresholdsBean ()
  {
    try
    {
      _HistoricalThresholdsGetSpec = new BSDMInteractionSpec("HistoricalThresholdsGet", ApiMappings.getCallName ("HistoricalThresholdsGet"), Boolean.TRUE);

      _HistoricalThresholdsFindSpec = new BSDMInteractionSpec("HistoricalThresholdsFind", ApiMappings.getCallName ("HistoricalThresholdsFind"), Boolean.TRUE);

      _HistoricalThresholdsUpdateSpec = new BSDMInteractionSpec("HistoricalThresholdsUpdate", ApiMappings.getCallName ("HistoricalThresholdsUpdate"), Boolean.TRUE);

      _HistoricalThresholdsDeleteSpec = new BSDMInteractionSpec("HistoricalThresholdsDelete", ApiMappings.getCallName ("HistoricalThresholdsDelete"), Boolean.TRUE);

      _HistoricalThresholdsDeleteListSpec = new BSDMInteractionSpec("HistoricalThresholdsDeleteList", ApiMappings.getCallName ("HistoricalThresholdsDeleteList"), Boolean.TRUE);

      _HistoricalThresholdsCreateSpec = new BSDMInteractionSpec("HistoricalThresholdsCreate", ApiMappings.getCallName ("HistoricalThresholdsCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HistoricalThresholdsBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HistoricalThresholdsBean(BSDMSettings settings, BSDMConnectionManager cm)
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
