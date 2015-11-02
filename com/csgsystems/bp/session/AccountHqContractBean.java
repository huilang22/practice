
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountHqContractBean.java
 * Definition File: Customer/AccountHqContract.xml
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
import com.csgsystems.bp.interfaces.AccountHqContractInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountHqContractSessionBean"
 * display-name="AccountHqContract Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountHqContractBean"
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

@Stateless(name="AccountHqContractBean", mappedName = "AccountHqContract")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountHqContracts")

public class AccountHqContractBean implements AccountHqContractInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountHqContractGetSpec = null;
  /**
   * Retrieve one unique AccountHqContract object..
   * Convenience method using default BSDMSessionContext.
   * @param AHCgetIn Input Object Key.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountHqContractObjectData get (AccountHqContractObjectKeyData AHCgetIn) throws BSDMResourceException
  {
    return get (null, AHCgetIn);
  }
  /**
   * Retrieve one unique AccountHqContract object..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCgetIn Input Object Key.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountHqContractObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountHqContractObjectKeyData AHCgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountHqContractGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AHCgetIn != null) AccountHqContractObjectKeyHelper.toMap (AHCgetIn, record, "AccountHqContract");
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
return AccountHqContractObjectHelper.fromMap (record, "AccountHqContract");
}

  private BSDMInteractionSpec _AccountHqContractCreateSpec = null;
  /**
   * Create a new AccountHqContract..
   * Convenience method using default BSDMSessionContext.
   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountHqContractObjectData create (AccountHqContractObjectData AHCcreateIn) throws BSDMResourceException
  {
    return create (null, AHCcreateIn);
  }
  /**
   * Create a new AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountHqContractObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountHqContractObjectData AHCcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountHqContractCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AHCcreateIn != null) AccountHqContractObjectHelper.toMap (AHCcreateIn, record, "AccountHqContract");
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
return AccountHqContractObjectHelper.fromMap (record, "AccountHqContract");
}

  private BSDMInteractionSpec _AccountHqContractUpdateSpec = null;
  /**
   * Update non-key fields of an AccountHqContract..
   * Convenience method using default BSDMSessionContext.
   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountHqContractObjectData update (AccountHqContractObjectData AHCupdateIn) throws BSDMResourceException
  {
    return update (null, AHCupdateIn);
  }
  /**
   * Update non-key fields of an AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountHqContractObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountHqContractObjectData AHCupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountHqContractUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AHCupdateIn != null) AccountHqContractObjectHelper.toMap (AHCupdateIn, record, "AccountHqContract");
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
return AccountHqContractObjectHelper.fromMap (record, "AccountHqContract");
}

  private BSDMInteractionSpec _AccountHqContractDeleteSpec = null;
  /**
   * Cease an AccountHqContract row..
   * Convenience method using default BSDMSessionContext.
   * @param AHCdeleteIn Input Object Key.
   * @param AHCInactiveDate (has a default).
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountHqContractObjectData delete (AccountHqContractObjectKeyData AHCdeleteIn, Date AHCInactiveDate) throws BSDMResourceException
  {
    return delete (null, AHCdeleteIn, AHCInactiveDate);
  }
  /**
   * Cease an AccountHqContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCdeleteIn Input Object Key.
   * @param AHCInactiveDate (has a default).
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountHqContractObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountHqContractObjectKeyData AHCdeleteIn,@FormParam("AHCInactiveDate")Date AHCInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountHqContractDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AHCdeleteIn != null) AccountHqContractObjectKeyHelper.toMap (AHCdeleteIn, record, "AccountHqContract");

      if (AHCInactiveDate != null) record.put ("AHCInactiveDate", AHCInactiveDate);
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
return AccountHqContractObjectHelper.fromMap (record, "AccountHqContract");
}

  private BSDMInteractionSpec _AccountHqContractDeleteListSpec = null;
  /**
   * Cease AccountHqContract's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AHCLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (AccountHqContractObjectFilter AHCLdeleteIn, Date AHCLInactiveDate) throws BSDMResourceException
  {
    deleteList (null, AHCLdeleteIn, AHCLInactiveDate);
  }
  /**
   * Cease AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AHCLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,AccountHqContractObjectFilter AHCLdeleteIn,@FormParam("AHCLInactiveDate")Date AHCLInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountHqContractDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AHCLdeleteIn != null) AccountHqContractObjectHelper.toMap (AHCLdeleteIn, record, "AccountHqContract");

      if (AHCLInactiveDate != null) record.put ("AHCLInactiveDate", AHCLInactiveDate);
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

  private BSDMInteractionSpec _AccountHqContractFindSpec = null;
  /**
   * Find AccountHqContract's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AHCfindIn Input Filter Object.
   * @return AccountHqContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountHqContractObjectDataList find (AccountHqContractObjectFilter AHCfindIn) throws BSDMResourceException
  {
    return find (null, AHCfindIn);
  }
  /**
   * Find AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCfindIn Input Filter Object.
   * @return AccountHqContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountHqContractObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountHqContractObjectFilter AHCfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountHqContractFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AHCfindIn != null) AccountHqContractObjectHelper.toMap (AHCfindIn, record, "AccountHqContract");
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
return AccountHqContractObjectHelper.fromMapList (record, "AccountHqContractList");
}

  /**

   * Retrieve one unique AccountHqContract object..

   * Convenience method using default BSDMSessionContext.

   * @param AHCgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountHqContractObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountHqContractObjectData get (AccountHqContractObjectKeyData AHCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, AHCgetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve one unique AccountHqContract object..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountHqContractObjectData get (BSDMSessionContext context, AccountHqContractObjectKeyData AHCgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AHCgetIn, defaultAction);
       
     cManager.checkConstraints(AHCgetIn, constraintAction);
       return get (context, AHCgetIn);
  }

  /**

   * Create a new AccountHqContract..

   * Convenience method using default BSDMSessionContext.

   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountHqContractObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountHqContractObjectData create (AccountHqContractObjectData AHCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, AHCcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.  Defaulted Fields: StartDt, Exclude.  Derived Fields: StartDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountHqContractObjectData create (BSDMSessionContext context, AccountHqContractObjectData AHCcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AHCcreateIn, defaultAction);
       
     cManager.checkConstraints(AHCcreateIn, constraintAction);
       return create (context, AHCcreateIn);
  }

  /**

   * Update non-key fields of an AccountHqContract..

   * Convenience method using default BSDMSessionContext.

   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountHqContractObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountHqContractObjectData update (AccountHqContractObjectData AHCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, AHCupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AccountHqContract..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountHqContractObjectData update (BSDMSessionContext context, AccountHqContractObjectData AHCupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AHCupdateIn, defaultAction);
       
     cManager.checkConstraints(AHCupdateIn, constraintAction);
       return update (context, AHCupdateIn);
  }

  /**

   * Cease an AccountHqContract row..

   * Convenience method using default BSDMSessionContext.

   * @param AHCdeleteIn Input Object Key.

   * @param AHCInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountHqContractObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountHqContractObjectData delete (AccountHqContractObjectKeyData AHCdeleteIn, Date AHCInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, AHCdeleteIn, AHCInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease an AccountHqContract row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCdeleteIn Input Object Key.
   * @param AHCInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountHqContractObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountHqContractObjectData delete (BSDMSessionContext context, AccountHqContractObjectKeyData AHCdeleteIn, Date AHCInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AHCdeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(AHCdeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, AHCdeleteIn, AHCInactiveDate);
  }

  /**

   * Cease AccountHqContract's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param AHCLInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (AccountHqContractObjectFilter AHCLdeleteIn, Date AHCLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, AHCLdeleteIn, AHCLInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AHCLInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, AccountHqContractObjectFilter AHCLdeleteIn, Date AHCLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AHCLdeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(AHCLdeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, AHCLdeleteIn, AHCLInactiveDate);
  }

  /**

   * Find AccountHqContract's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param AHCfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountHqContractObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountHqContractObjectDataList find (AccountHqContractObjectFilter AHCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, AHCfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountHqContract's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AHCfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountHqContractObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountHqContractObjectDataList find (BSDMSessionContext context, AccountHqContractObjectFilter AHCfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AHCfindIn, defaultAction);
       
     cManager.checkConstraints(AHCfindIn, constraintAction);
       return find (context, AHCfindIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountHqContractBean ()
  {
    try
    {
      _AccountHqContractGetSpec = new BSDMInteractionSpec("AccountHqContractGet", ApiMappings.getCallName ("AccountHqContractGet"), Boolean.TRUE);

      _AccountHqContractCreateSpec = new BSDMInteractionSpec("AccountHqContractCreate", ApiMappings.getCallName ("AccountHqContractCreate"), Boolean.TRUE);

      _AccountHqContractUpdateSpec = new BSDMInteractionSpec("AccountHqContractUpdate", ApiMappings.getCallName ("AccountHqContractUpdate"), Boolean.TRUE);

      _AccountHqContractDeleteSpec = new BSDMInteractionSpec("AccountHqContractDelete", ApiMappings.getCallName ("AccountHqContractDelete"), Boolean.TRUE);

      _AccountHqContractDeleteListSpec = new BSDMInteractionSpec("AccountHqContractDeleteList", ApiMappings.getCallName ("AccountHqContractDeleteList"), Boolean.TRUE);

      _AccountHqContractFindSpec = new BSDMInteractionSpec("AccountHqContractFind", ApiMappings.getCallName ("AccountHqContractFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountHqContractBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountHqContractBean(BSDMSettings settings, BSDMConnectionManager cm)
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
