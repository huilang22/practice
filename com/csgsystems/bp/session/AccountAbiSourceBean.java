
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountAbiSourceBean.java
 * Definition File: Customer/AccountAbiSource.xml
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
import com.csgsystems.bp.interfaces.AccountAbiSourceInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountAbiSourceSessionBean"
 * display-name="AccountAbiSource Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountAbiSourceBean"
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

@Stateless(name="AccountAbiSourceBean", mappedName = "AccountAbiSource")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountAbiSources")

public class AccountAbiSourceBean implements AccountAbiSourceInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountAbiSourceGetSpec = null;
  /**
   * Get an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIgetIn Input Object Key.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountAbiSourceObjectData get (AccountAbiSourceObjectKeyData ABIgetIn) throws BSDMResourceException
  {
    return get (null, ABIgetIn);
  }
  /**
   * Get an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIgetIn Input Object Key.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountAbiSourceObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountAbiSourceObjectKeyData ABIgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountAbiSourceGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABIgetIn != null) AccountAbiSourceObjectKeyHelper.toMap (ABIgetIn, record, "AccountAbiSource");
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
return AccountAbiSourceObjectHelper.fromMap (record, "AccountAbiSource");
}

  private BSDMInteractionSpec _AccountAbiSourceFindSpec = null;
  /**
   * Find AccountAbiSource's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABIfindIn Input Filter Object.
   * @return AccountAbiSourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountAbiSourceObjectDataList find (AccountAbiSourceObjectFilter ABIfindIn) throws BSDMResourceException
  {
    return find (null, ABIfindIn);
  }
  /**
   * Find AccountAbiSource's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIfindIn Input Filter Object.
   * @return AccountAbiSourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountAbiSourceObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountAbiSourceObjectFilter ABIfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountAbiSourceFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABIfindIn != null) AccountAbiSourceObjectHelper.toMap (ABIfindIn, record, "AccountAbiSource");
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
return AccountAbiSourceObjectHelper.fromMapList (record, "AccountAbiSourceList");
}

  private BSDMInteractionSpec _AccountAbiSourceCreateSpec = null;
  /**
   * Create a new AccountAbiSource..
   * Convenience method using default BSDMSessionContext.
   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountAbiSourceObjectData create (AccountAbiSourceObjectData ABIcreateIn) throws BSDMResourceException
  {
    return create (null, ABIcreateIn);
  }
  /**
   * Create a new AccountAbiSource..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountAbiSourceObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountAbiSourceObjectData ABIcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountAbiSourceCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABIcreateIn != null) AccountAbiSourceObjectHelper.toMap (ABIcreateIn, record, "AccountAbiSource");
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
return AccountAbiSourceObjectHelper.fromMap (record, "AccountAbiSource");
}

  private BSDMInteractionSpec _AccountAbiSourceUpdateSpec = null;
  /**
   * Update non-key fields of an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountAbiSourceObjectData update (AccountAbiSourceObjectData ABIupdateIn) throws BSDMResourceException
  {
    return update (null, ABIupdateIn);
  }
  /**
   * Update non-key fields of an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountAbiSourceObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountAbiSourceObjectData ABIupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountAbiSourceUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABIupdateIn != null) AccountAbiSourceObjectHelper.toMap (ABIupdateIn, record, "AccountAbiSource");
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
return AccountAbiSourceObjectHelper.fromMap (record, "AccountAbiSource");
}

  private BSDMInteractionSpec _AccountAbiSourceDeleteSpec = null;
  /**
   * Cease an AccountAbiSource row..
   * Convenience method using default BSDMSessionContext.
   * @param ABIdelIn Input Object Key.
   * @param inactive_date (has a default).
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountAbiSourceObjectData delete (AccountAbiSourceObjectKeyData ABIdelIn, Date inactive_date) throws BSDMResourceException
  {
    return delete (null, ABIdelIn, inactive_date);
  }
  /**
   * Cease an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIdelIn Input Object Key.
   * @param inactive_date (has a default).
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountAbiSourceObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountAbiSourceObjectKeyData ABIdelIn,@FormParam("inactive_date")Date inactive_date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountAbiSourceDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABIdelIn != null) AccountAbiSourceObjectKeyHelper.toMap (ABIdelIn, record, "AccountAbiSource");

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
return AccountAbiSourceObjectHelper.fromMap (record, "AccountAbiSource");
}

  private BSDMInteractionSpec _AccountAbiSourceDeleteListSpec = null;
  /**
   * Cease AccountAbiSources that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (AccountAbiSourceObjectFilter ABILdelIn, Date InactiveDate) throws BSDMResourceException
  {
    deleteList (null, ABILdelIn, InactiveDate);
  }
  /**
   * Cease AccountAbiSources that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param InactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,AccountAbiSourceObjectFilter ABILdelIn,@FormParam("InactiveDate")Date InactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountAbiSourceDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABILdelIn != null) AccountAbiSourceObjectHelper.toMap (ABILdelIn, record, "AccountAbiSource");

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

  /**

   * Get an AccountAbiSource row..

   * Convenience method using default BSDMSessionContext.

   * @param ABIgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountAbiSourceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountAbiSourceObjectData get (AccountAbiSourceObjectKeyData ABIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ABIgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountAbiSourceObjectData get (BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABIgetIn, defaultAction);
       
     cManager.checkConstraints(ABIgetIn, constraintAction);
       return get (context, ABIgetIn);
  }

  /**

   * Find AccountAbiSource's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ABIfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountAbiSourceObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountAbiSourceObjectDataList find (AccountAbiSourceObjectFilter ABIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ABIfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountAbiSource's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountAbiSourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountAbiSourceObjectDataList find (BSDMSessionContext context, AccountAbiSourceObjectFilter ABIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABIfindIn, defaultAction);
       
     cManager.checkConstraints(ABIfindIn, constraintAction);
       return find (context, ABIfindIn);
  }

  /**

   * Create a new AccountAbiSource..

   * Convenience method using default BSDMSessionContext.

   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountAbiSourceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountAbiSourceObjectData create (AccountAbiSourceObjectData ABIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ABIcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountAbiSource..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountAbiSourceObjectData create (BSDMSessionContext context, AccountAbiSourceObjectData ABIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABIcreateIn, defaultAction);
       
     cManager.checkConstraints(ABIcreateIn, constraintAction);
       return create (context, ABIcreateIn);
  }

  /**

   * Update non-key fields of an AccountAbiSource row..

   * Convenience method using default BSDMSessionContext.

   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountAbiSourceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountAbiSourceObjectData update (AccountAbiSourceObjectData ABIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ABIupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountAbiSourceObjectData update (BSDMSessionContext context, AccountAbiSourceObjectData ABIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABIupdateIn, defaultAction);
       
     cManager.checkConstraints(ABIupdateIn, constraintAction);
       return update (context, ABIupdateIn);
  }

  /**

   * Cease an AccountAbiSource row..

   * Convenience method using default BSDMSessionContext.

   * @param ABIdelIn Input Object Key.

   * @param inactive_date (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountAbiSourceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountAbiSourceObjectData delete (AccountAbiSourceObjectKeyData ABIdelIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, ABIdelIn, inactive_date, defaultAction, constraintAction);
  }
  /** 
   * Cease an AccountAbiSource row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABIdelIn Input Object Key.
   * @param inactive_date (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountAbiSourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountAbiSourceObjectData delete (BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIdelIn, Date inactive_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABIdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ABIdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, ABIdelIn, inactive_date);
  }

  /**

   * Cease AccountAbiSources that match a supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param InactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (AccountAbiSourceObjectFilter ABILdelIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, ABILdelIn, InactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease AccountAbiSources that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param InactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, AccountAbiSourceObjectFilter ABILdelIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABILdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ABILdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, ABILdelIn, InactiveDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountAbiSourceBean ()
  {
    try
    {
      _AccountAbiSourceGetSpec = new BSDMInteractionSpec("AccountAbiSourceGet", ApiMappings.getCallName ("AccountAbiSourceGet"), Boolean.TRUE);

      _AccountAbiSourceFindSpec = new BSDMInteractionSpec("AccountAbiSourceFind", ApiMappings.getCallName ("AccountAbiSourceFind"), Boolean.TRUE);

      _AccountAbiSourceCreateSpec = new BSDMInteractionSpec("AccountAbiSourceCreate", ApiMappings.getCallName ("AccountAbiSourceCreate"), Boolean.TRUE);

      _AccountAbiSourceUpdateSpec = new BSDMInteractionSpec("AccountAbiSourceUpdate", ApiMappings.getCallName ("AccountAbiSourceUpdate"), Boolean.TRUE);

      _AccountAbiSourceDeleteSpec = new BSDMInteractionSpec("AccountAbiSourceDelete", ApiMappings.getCallName ("AccountAbiSourceDelete"), Boolean.TRUE);

      _AccountAbiSourceDeleteListSpec = new BSDMInteractionSpec("AccountAbiSourceDeleteList", ApiMappings.getCallName ("AccountAbiSourceDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountAbiSourceBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountAbiSourceBean(BSDMSettings settings, BSDMConnectionManager cm)
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
