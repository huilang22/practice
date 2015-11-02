
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: TaxExemptionBean.java
 * Definition File: Customer/TaxExemption.xml
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
import com.csgsystems.bp.interfaces.TaxExemptionInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="TaxExemptionSessionBean"
 * display-name="TaxExemption Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/TaxExemptionBean"
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

@Stateless(name="TaxExemptionBean", mappedName = "TaxExemption")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("TaxExemptions")

public class TaxExemptionBean implements TaxExemptionInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _TaxExemptionGetSpec = null;
  /**
   * Get a unique TaxExemption row..
   * Convenience method using default BSDMSessionContext.
   * @param TEgetIn Input Object Key.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxExemptionObjectData get (TaxExemptionObjectKeyData TEgetIn) throws BSDMResourceException
  {
    return get (null, TEgetIn);
  }
  /**
   * Get a unique TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEgetIn Input Object Key.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public TaxExemptionObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam TaxExemptionObjectKeyData TEgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxExemptionGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TEgetIn != null) TaxExemptionObjectKeyHelper.toMap (TEgetIn, record, "TaxExemption");
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
return TaxExemptionObjectHelper.fromMap (record, "TaxExemption");
}

  private BSDMInteractionSpec _TaxExemptionFindSpec = null;
  /**
   * Find TaxExemption rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TEfindIn Input Filter Object.
   * @return TaxExemptionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxExemptionObjectDataList find (TaxExemptionObjectFilter TEfindIn) throws BSDMResourceException
  {
    return find (null, TEfindIn);
  }
  /**
   * Find TaxExemption rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEfindIn Input Filter Object.
   * @return TaxExemptionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TaxExemptionObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,TaxExemptionObjectFilter TEfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxExemptionFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TEfindIn != null) TaxExemptionObjectHelper.toMap (TEfindIn, record, "TaxExemption");
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
return TaxExemptionObjectHelper.fromMapList (record, "TaxExemptionList");
}

  private BSDMInteractionSpec _TaxExemptionCreateSpec = null;
  /**
   * Create a new TaxExemption row for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxExemptionObjectData create (TaxExemptionObjectData TEcreateIn) throws BSDMResourceException
  {
    return create (null, TEcreateIn);
  }
  /**
   * Create a new TaxExemption row for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TaxExemptionObjectData create (@HeaderParam ("context")BSDMSessionContext context,TaxExemptionObjectData TEcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxExemptionCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TEcreateIn != null) TaxExemptionObjectHelper.toMap (TEcreateIn, record, "TaxExemption");
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
return TaxExemptionObjectHelper.fromMap (record, "TaxExemption");
}

  private BSDMInteractionSpec _TaxExemptionUpdateSpec = null;
  /**
   * Update the non key fields of a TaxExemption..
   * Convenience method using default BSDMSessionContext.
   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxExemptionObjectData update (TaxExemptionObjectData TEupdateIn) throws BSDMResourceException
  {
    return update (null, TEupdateIn);
  }
  /**
   * Update the non key fields of a TaxExemption..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TaxExemptionObjectData update (@HeaderParam ("context")BSDMSessionContext context,TaxExemptionObjectData TEupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxExemptionUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TEupdateIn != null) TaxExemptionObjectHelper.toMap (TEupdateIn, record, "TaxExemption");
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
return TaxExemptionObjectHelper.fromMap (record, "TaxExemption");
}

  private BSDMInteractionSpec _TaxExemptionDeleteSpec = null;
  /**
   * Cease a TaxExemption row..
   * Convenience method using default BSDMSessionContext.
   * @param TEdelIn Input Object Key.
   * @param TEInactiveDate (has a default).
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxExemptionObjectData delete (TaxExemptionObjectKeyData TEdelIn, Date TEInactiveDate) throws BSDMResourceException
  {
    return delete (null, TEdelIn, TEInactiveDate);
  }
  /**
   * Cease a TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEdelIn Input Object Key.
   * @param TEInactiveDate (has a default).
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public TaxExemptionObjectData delete (@HeaderParam ("context")BSDMSessionContext context,TaxExemptionObjectKeyData TEdelIn,@FormParam("TEInactiveDate")Date TEInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxExemptionDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TEdelIn != null) TaxExemptionObjectKeyHelper.toMap (TEdelIn, record, "TaxExemption");

      if (TEInactiveDate != null) record.put ("InactiveDate", TEInactiveDate);
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
return TaxExemptionObjectHelper.fromMap (record, "TaxExemption");
}

  private BSDMInteractionSpec _TaxExemptionDeleteListSpec = null;
  /**
   * Cease the TaxExemptions that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param TELInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (TaxExemptionObjectFilter TELdelIn, Date TELInactiveDate) throws BSDMResourceException
  {
    deleteList (null, TELdelIn, TELInactiveDate);
  }
  /**
   * Cease the TaxExemptions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param TELInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,TaxExemptionObjectFilter TELdelIn,@FormParam("TELInactiveDate")Date TELInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_TaxExemptionDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (TELdelIn != null) TaxExemptionObjectHelper.toMap (TELdelIn, record, "TaxExemption");

      if (TELInactiveDate != null) record.put ("InactiveDate", TELInactiveDate);
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

  /**

   * Get a unique TaxExemption row..

   * Convenience method using default BSDMSessionContext.

   * @param TEgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxExemptionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxExemptionObjectData get (TaxExemptionObjectKeyData TEgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, TEgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxExemptionObjectData get (BSDMSessionContext context, TaxExemptionObjectKeyData TEgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TEgetIn, defaultAction);
       
     cManager.checkConstraints(TEgetIn, constraintAction);
       return get (context, TEgetIn);
  }

  /**

   * Find TaxExemption rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param TEfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxExemptionObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxExemptionObjectDataList find (TaxExemptionObjectFilter TEfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, TEfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find TaxExemption rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxExemptionObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxExemptionObjectDataList find (BSDMSessionContext context, TaxExemptionObjectFilter TEfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TEfindIn, defaultAction);
       
     cManager.checkConstraints(TEfindIn, constraintAction);
       return find (context, TEfindIn);
  }

  /**

   * Create a new TaxExemption row for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxExemptionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxExemptionObjectData create (TaxExemptionObjectData TEcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, TEcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new TaxExemption row for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, TrackingId, TrackingIdServ.  Defaulted Fields: TaxPkgInstId, TaxStatus, ActiveDate, ExemptFederal, ExemptState, ExemptCounty, ExemptCity, ExemptOther, TaxTypeCode, CountryCode, FranchiseCode, StateCode, CountyCode, CityCode.  Derived Fields: TrackingId, TrackingIdServ, DateExpiration.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxExemptionObjectData create (BSDMSessionContext context, TaxExemptionObjectData TEcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TEcreateIn, defaultAction);
       
     cManager.checkConstraints(TEcreateIn, constraintAction);
       return create (context, TEcreateIn);
  }

  /**

   * Update the non key fields of a TaxExemption..

   * Convenience method using default BSDMSessionContext.

   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxExemptionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxExemptionObjectData update (TaxExemptionObjectData TEupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, TEupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non key fields of a TaxExemption..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Derived Fields: DateExpiration.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxExemptionObjectData update (BSDMSessionContext context, TaxExemptionObjectData TEupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TEupdateIn, defaultAction);
       
     cManager.checkConstraints(TEupdateIn, constraintAction);
       return update (context, TEupdateIn);
  }

  /**

   * Cease a TaxExemption row..

   * Convenience method using default BSDMSessionContext.

   * @param TEdelIn Input Object Key.

   * @param TEInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxExemptionObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxExemptionObjectData delete (TaxExemptionObjectKeyData TEdelIn, Date TEInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, TEdelIn, TEInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease a TaxExemption row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TEdelIn Input Object Key.
   * @param TEInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxExemptionObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxExemptionObjectData delete (BSDMSessionContext context, TaxExemptionObjectKeyData TEdelIn, Date TEInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TEdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(TEdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, TEdelIn, TEInactiveDate);
  }

  /**

   * Cease the TaxExemptions that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param TELInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (TaxExemptionObjectFilter TELdelIn, Date TELInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, TELdelIn, TELInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease the TaxExemptions that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param TELdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param TELInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, TaxExemptionObjectFilter TELdelIn, Date TELInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(TELdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(TELdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, TELdelIn, TELInactiveDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public TaxExemptionBean ()
  {
    try
    {
      _TaxExemptionGetSpec = new BSDMInteractionSpec("TaxExemptionGet", ApiMappings.getCallName ("TaxExemptionGet"), Boolean.TRUE);

      _TaxExemptionFindSpec = new BSDMInteractionSpec("TaxExemptionFind", ApiMappings.getCallName ("TaxExemptionFind"), Boolean.TRUE);

      _TaxExemptionCreateSpec = new BSDMInteractionSpec("TaxExemptionCreate", ApiMappings.getCallName ("TaxExemptionCreate"), Boolean.TRUE);

      _TaxExemptionUpdateSpec = new BSDMInteractionSpec("TaxExemptionUpdate", ApiMappings.getCallName ("TaxExemptionUpdate"), Boolean.TRUE);

      _TaxExemptionDeleteSpec = new BSDMInteractionSpec("TaxExemptionDelete", ApiMappings.getCallName ("TaxExemptionDelete"), Boolean.TRUE);

      _TaxExemptionDeleteListSpec = new BSDMInteractionSpec("TaxExemptionDeleteList", ApiMappings.getCallName ("TaxExemptionDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public TaxExemptionBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public TaxExemptionBean(BSDMSettings settings, BSDMConnectionManager cm)
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
