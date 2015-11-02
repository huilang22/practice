
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountMessageBean.java
 * Definition File: Customer/AccountMessage.xml
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
import com.csgsystems.bp.interfaces.AccountMessageInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountMessageSessionBean"
 * display-name="AccountMessage Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountMessageBean"
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

@Stateless(name="AccountMessageBean", mappedName = "AccountMessage")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountMessages")

public class AccountMessageBean implements AccountMessageInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountMessageGetSpec = null;
  /**
   * Get an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMgetIn Input Object Key.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountMessageObjectData get (AccountMessageObjectKeyData AMgetIn) throws BSDMResourceException
  {
    return get (null, AMgetIn);
  }
  /**
   * Get an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMgetIn Input Object Key.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountMessageObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountMessageObjectKeyData AMgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountMessageGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AMgetIn != null) AccountMessageObjectKeyHelper.toMap (AMgetIn, record, "AccountMessage");
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
return AccountMessageObjectHelper.fromMap (record, "AccountMessage");
}

  private BSDMInteractionSpec _AccountMessageFindSpec = null;
  /**
   * Find AccountMessage's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AMfindIn Input Filter Object.
   * @return AccountMessageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountMessageObjectDataList find (AccountMessageObjectFilter AMfindIn) throws BSDMResourceException
  {
    return find (null, AMfindIn);
  }
  /**
   * Find AccountMessage's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMfindIn Input Filter Object.
   * @return AccountMessageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountMessageObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountMessageObjectFilter AMfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountMessageFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AMfindIn != null) AccountMessageObjectHelper.toMap (AMfindIn, record, "AccountMessage");
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
return AccountMessageObjectHelper.fromMapList (record, "AccountMessageList");
}

  private BSDMInteractionSpec _AccountMessageCreateSpec = null;
  /**
   * Create a new AccountMessage..
   * Convenience method using default BSDMSessionContext.
   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountMessageObjectData create (AccountMessageObjectData AMcreateIn) throws BSDMResourceException
  {
    return create (null, AMcreateIn);
  }
  /**
   * Create a new AccountMessage..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountMessageObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountMessageObjectData AMcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountMessageCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AMcreateIn != null) AccountMessageObjectHelper.toMap (AMcreateIn, record, "AccountMessage");
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
return AccountMessageObjectHelper.fromMap (record, "AccountMessage");
}

  private BSDMInteractionSpec _AccountMessageUpdateSpec = null;
  /**
   * Update non-key fields of an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountMessageObjectData update (AccountMessageObjectData AMupdateIn) throws BSDMResourceException
  {
    return update (null, AMupdateIn);
  }
  /**
   * Update non-key fields of an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountMessageObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountMessageObjectData AMupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountMessageUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AMupdateIn != null) AccountMessageObjectHelper.toMap (AMupdateIn, record, "AccountMessage");
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
return AccountMessageObjectHelper.fromMap (record, "AccountMessage");
}

  private BSDMInteractionSpec _AccountMessageDeleteSpec = null;
  /**
   * Cease an AccountMessage row..
   * Convenience method using default BSDMSessionContext.
   * @param AMdelIn Input Object Key.
   * @param AMDInactiveDate (has a default).
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountMessageObjectData delete (AccountMessageObjectKeyData AMdelIn, Date AMDInactiveDate) throws BSDMResourceException
  {
    return delete (null, AMdelIn, AMDInactiveDate);
  }
  /**
   * Cease an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMdelIn Input Object Key.
   * @param AMDInactiveDate (has a default).
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountMessageObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountMessageObjectKeyData AMdelIn,@FormParam("AMDInactiveDate")Date AMDInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountMessageDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AMdelIn != null) AccountMessageObjectKeyHelper.toMap (AMdelIn, record, "AccountMessage");

      if (AMDInactiveDate != null) record.put ("InactiveDate", AMDInactiveDate);
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
return AccountMessageObjectHelper.fromMap (record, "AccountMessage");
}

  private BSDMInteractionSpec _AccountMessageDeleteListSpec = null;
  /**
   * Cease AccountMessages that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AMDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (AccountMessageObjectFilter AMLdelIn, Date AMDLInactiveDate) throws BSDMResourceException
  {
    deleteList (null, AMLdelIn, AMDLInactiveDate);
  }
  /**
   * Cease AccountMessages that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AMDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,AccountMessageObjectFilter AMLdelIn,@FormParam("AMDLInactiveDate")Date AMDLInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountMessageDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AMLdelIn != null) AccountMessageObjectHelper.toMap (AMLdelIn, record, "AccountMessage");

      if (AMDLInactiveDate != null) record.put ("InactiveDate", AMDLInactiveDate);
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

   * Get an AccountMessage row..

   * Convenience method using default BSDMSessionContext.

   * @param AMgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountMessageObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountMessageObjectData get (AccountMessageObjectKeyData AMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, AMgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountMessageObjectData get (BSDMSessionContext context, AccountMessageObjectKeyData AMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AMgetIn, defaultAction);
       
     cManager.checkConstraints(AMgetIn, constraintAction);
       return get (context, AMgetIn);
  }

  /**

   * Find AccountMessage's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param AMfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountMessageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountMessageObjectDataList find (AccountMessageObjectFilter AMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, AMfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountMessage's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountMessageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountMessageObjectDataList find (BSDMSessionContext context, AccountMessageObjectFilter AMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AMfindIn, defaultAction);
       
     cManager.checkConstraints(AMfindIn, constraintAction);
       return find (context, AMfindIn);
  }

  /**

   * Create a new AccountMessage..

   * Convenience method using default BSDMSessionContext.

   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountMessageObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountMessageObjectData create (AccountMessageObjectData AMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, AMcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountMessage..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountMessageObjectData create (BSDMSessionContext context, AccountMessageObjectData AMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AMcreateIn, defaultAction);
       
     cManager.checkConstraints(AMcreateIn, constraintAction);
       return create (context, AMcreateIn);
  }

  /**

   * Update non-key fields of an AccountMessage row..

   * Convenience method using default BSDMSessionContext.

   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountMessageObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountMessageObjectData update (AccountMessageObjectData AMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, AMupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountMessageObjectData update (BSDMSessionContext context, AccountMessageObjectData AMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AMupdateIn, defaultAction);
       
     cManager.checkConstraints(AMupdateIn, constraintAction);
       return update (context, AMupdateIn);
  }

  /**

   * Cease an AccountMessage row..

   * Convenience method using default BSDMSessionContext.

   * @param AMdelIn Input Object Key.

   * @param AMDInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountMessageObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountMessageObjectData delete (AccountMessageObjectKeyData AMdelIn, Date AMDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, AMdelIn, AMDInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease an AccountMessage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMdelIn Input Object Key.
   * @param AMDInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountMessageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountMessageObjectData delete (BSDMSessionContext context, AccountMessageObjectKeyData AMdelIn, Date AMDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AMdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(AMdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, AMdelIn, AMDInactiveDate);
  }

  /**

   * Cease AccountMessages that match a supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param AMDLInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (AccountMessageObjectFilter AMLdelIn, Date AMDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, AMLdelIn, AMDLInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease AccountMessages that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AMLdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AMDLInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, AccountMessageObjectFilter AMLdelIn, Date AMDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AMLdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(AMLdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, AMLdelIn, AMDLInactiveDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountMessageBean ()
  {
    try
    {
      _AccountMessageGetSpec = new BSDMInteractionSpec("AccountMessageGet", ApiMappings.getCallName ("AccountMessageGet"), Boolean.TRUE);

      _AccountMessageFindSpec = new BSDMInteractionSpec("AccountMessageFind", ApiMappings.getCallName ("AccountMessageFind"), Boolean.TRUE);

      _AccountMessageCreateSpec = new BSDMInteractionSpec("AccountMessageCreate", ApiMappings.getCallName ("AccountMessageCreate"), Boolean.TRUE);

      _AccountMessageUpdateSpec = new BSDMInteractionSpec("AccountMessageUpdate", ApiMappings.getCallName ("AccountMessageUpdate"), Boolean.TRUE);

      _AccountMessageDeleteSpec = new BSDMInteractionSpec("AccountMessageDelete", ApiMappings.getCallName ("AccountMessageDelete"), Boolean.TRUE);

      _AccountMessageDeleteListSpec = new BSDMInteractionSpec("AccountMessageDeleteList", ApiMappings.getCallName ("AccountMessageDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountMessageBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountMessageBean(BSDMSettings settings, BSDMConnectionManager cm)
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
