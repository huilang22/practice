
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountInsertBean.java
 * Definition File: Customer/AccountInsert.xml
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
import com.csgsystems.bp.interfaces.AccountInsertInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountInsertSessionBean"
 * display-name="AccountInsert Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountInsertBean"
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

@Stateless(name="AccountInsertBean", mappedName = "AccountInsert")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountInserts")

public class AccountInsertBean implements AccountInsertInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountInsertGetSpec = null;
  /**
   * Get an AccountInsert..
   * Convenience method using default BSDMSessionContext.
   * @param AIgetIn Input Object Key.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountInsertObjectData get (AccountInsertObjectKeyData AIgetIn) throws BSDMResourceException
  {
    return get (null, AIgetIn);
  }
  /**
   * Get an AccountInsert..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIgetIn Input Object Key.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountInsertObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountInsertObjectKeyData AIgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountInsertGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AIgetIn != null) AccountInsertObjectKeyHelper.toMap (AIgetIn, record, "AccountInsert");
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
return AccountInsertObjectHelper.fromMap (record, "AccountInsert");
}

  private BSDMInteractionSpec _AccountInsertFindSpec = null;
  /**
   * Find AccountInsert's based on the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AIfindIn Input Filter Object.
   * @return AccountInsertObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountInsertObjectDataList find (AccountInsertObjectFilter AIfindIn) throws BSDMResourceException
  {
    return find (null, AIfindIn);
  }
  /**
   * Find AccountInsert's based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIfindIn Input Filter Object.
   * @return AccountInsertObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountInsertObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountInsertObjectFilter AIfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountInsertFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AIfindIn != null) AccountInsertObjectHelper.toMap (AIfindIn, record, "AccountInsert");
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
return AccountInsertObjectHelper.fromMapList (record, "AccountInsertList");
}

  private BSDMInteractionSpec _AccountInsertCreateSpec = null;
  /**
   * Create a new AccountInsert for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountInsertObjectData create (AccountInsertObjectData AIcreateIn) throws BSDMResourceException
  {
    return create (null, AIcreateIn);
  }
  /**
   * Create a new AccountInsert for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountInsertObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountInsertObjectData AIcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountInsertCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AIcreateIn != null) AccountInsertObjectHelper.toMap (AIcreateIn, record, "AccountInsert");
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
return AccountInsertObjectHelper.fromMap (record, "AccountInsert");
}

  private BSDMInteractionSpec _AccountInsertUpdateSpec = null;
  /**
   * Update non-key fields for an AccountInsert row..
   * Convenience method using default BSDMSessionContext.
   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountInsertObjectData update (AccountInsertObjectData AIupdateIn) throws BSDMResourceException
  {
    return update (null, AIupdateIn);
  }
  /**
   * Update non-key fields for an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountInsertObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountInsertObjectData AIupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountInsertUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AIupdateIn != null) AccountInsertObjectHelper.toMap (AIupdateIn, record, "AccountInsert");
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
return AccountInsertObjectHelper.fromMap (record, "AccountInsert");
}

  private BSDMInteractionSpec _AccountInsertDeleteSpec = null;
  /**
   * Cease an AccountInsert row..
   * Convenience method using default BSDMSessionContext.
   * @param AIdelIn Input Object Key.
   * @param AIDInactiveDate (has a default).
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountInsertObjectData delete (AccountInsertObjectKeyData AIdelIn, Date AIDInactiveDate) throws BSDMResourceException
  {
    return delete (null, AIdelIn, AIDInactiveDate);
  }
  /**
   * Cease an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIdelIn Input Object Key.
   * @param AIDInactiveDate (has a default).
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountInsertObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountInsertObjectKeyData AIdelIn,@FormParam("AIDInactiveDate")Date AIDInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountInsertDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AIdelIn != null) AccountInsertObjectKeyHelper.toMap (AIdelIn, record, "AccountInsert");

      if (AIDInactiveDate != null) record.put ("InactiveDate", AIDInactiveDate);
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
return AccountInsertObjectHelper.fromMap (record, "AccountInsert");
}

  private BSDMInteractionSpec _AccountInsertDeleteListSpec = null;
  /**
   * Cease AccountInserts that match a supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AIDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (AccountInsertObjectFilter AILdelIn, Date AIDLInactiveDate) throws BSDMResourceException
  {
    deleteList (null, AILdelIn, AIDLInactiveDate);
  }
  /**
   * Cease AccountInserts that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AIDLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,AccountInsertObjectFilter AILdelIn,@FormParam("AIDLInactiveDate")Date AIDLInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountInsertDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (AILdelIn != null) AccountInsertObjectHelper.toMap (AILdelIn, record, "AccountInsert");

      if (AIDLInactiveDate != null) record.put ("InactiveDate", AIDLInactiveDate);
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

   * Get an AccountInsert..

   * Convenience method using default BSDMSessionContext.

   * @param AIgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountInsertObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountInsertObjectData get (AccountInsertObjectKeyData AIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, AIgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get an AccountInsert..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountInsertObjectData get (BSDMSessionContext context, AccountInsertObjectKeyData AIgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AIgetIn, defaultAction);
       
     cManager.checkConstraints(AIgetIn, constraintAction);
       return get (context, AIgetIn);
  }

  /**

   * Find AccountInsert's based on the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param AIfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountInsertObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountInsertObjectDataList find (AccountInsertObjectFilter AIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, AIfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountInsert's based on the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountInsertObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountInsertObjectDataList find (BSDMSessionContext context, AccountInsertObjectFilter AIfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AIfindIn, defaultAction);
       
     cManager.checkConstraints(AIfindIn, constraintAction);
       return find (context, AIfindIn);
  }

  /**

   * Create a new AccountInsert for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountInsertObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountInsertObjectData create (AccountInsertObjectData AIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, AIcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new AccountInsert for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountInsertObjectData create (BSDMSessionContext context, AccountInsertObjectData AIcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AIcreateIn, defaultAction);
       
     cManager.checkConstraints(AIcreateIn, constraintAction);
       return create (context, AIcreateIn);
  }

  /**

   * Update non-key fields for an AccountInsert row..

   * Convenience method using default BSDMSessionContext.

   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountInsertObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountInsertObjectData update (AccountInsertObjectData AIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, AIupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields for an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ChgWho.  Derived Fields: ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountInsertObjectData update (BSDMSessionContext context, AccountInsertObjectData AIupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AIupdateIn, defaultAction);
       
     cManager.checkConstraints(AIupdateIn, constraintAction);
       return update (context, AIupdateIn);
  }

  /**

   * Cease an AccountInsert row..

   * Convenience method using default BSDMSessionContext.

   * @param AIdelIn Input Object Key.

   * @param AIDInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountInsertObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountInsertObjectData delete (AccountInsertObjectKeyData AIdelIn, Date AIDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, AIdelIn, AIDInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease an AccountInsert row..
   * @param context The session context to use when connecting to the APITS server.
   * @param AIdelIn Input Object Key.
   * @param AIDInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountInsertObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountInsertObjectData delete (BSDMSessionContext context, AccountInsertObjectKeyData AIdelIn, Date AIDInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AIdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(AIdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, AIdelIn, AIDInactiveDate);
  }

  /**

   * Cease AccountInserts that match a supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.

   * @param AIDLInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (AccountInsertObjectFilter AILdelIn, Date AIDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, AILdelIn, AIDLInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease AccountInserts that match a supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AILdelIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType.
   * @param AIDLInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, AccountInsertObjectFilter AILdelIn, Date AIDLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(AILdelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(AILdelIn, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, AILdelIn, AIDLInactiveDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountInsertBean ()
  {
    try
    {
      _AccountInsertGetSpec = new BSDMInteractionSpec("AccountInsertGet", ApiMappings.getCallName ("AccountInsertGet"), Boolean.TRUE);

      _AccountInsertFindSpec = new BSDMInteractionSpec("AccountInsertFind", ApiMappings.getCallName ("AccountInsertFind"), Boolean.TRUE);

      _AccountInsertCreateSpec = new BSDMInteractionSpec("AccountInsertCreate", ApiMappings.getCallName ("AccountInsertCreate"), Boolean.TRUE);

      _AccountInsertUpdateSpec = new BSDMInteractionSpec("AccountInsertUpdate", ApiMappings.getCallName ("AccountInsertUpdate"), Boolean.TRUE);

      _AccountInsertDeleteSpec = new BSDMInteractionSpec("AccountInsertDelete", ApiMappings.getCallName ("AccountInsertDelete"), Boolean.TRUE);

      _AccountInsertDeleteListSpec = new BSDMInteractionSpec("AccountInsertDeleteList", ApiMappings.getCallName ("AccountInsertDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountInsertBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountInsertBean(BSDMSettings settings, BSDMConnectionManager cm)
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
