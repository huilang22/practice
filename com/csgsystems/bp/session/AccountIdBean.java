
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountIdBean.java
 * Definition File: Customer/AccountId.xml
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
import com.csgsystems.bp.interfaces.AccountIdInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountIdSessionBean"
 * display-name="AccountId Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountIdBean"
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

@Stateless(name="AccountIdBean", mappedName = "AccountId")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountIds")

public class AccountIdBean implements AccountIdInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountIdGetSpec = null;
  /**
   * Retrieve one unique Account ExternalId..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountIdObjectData get (AccountIdObjectKeyData getIn) throws BSDMResourceException
  {
    return get (null, getIn);
  }
  /**
   * Retrieve one unique Account ExternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountIdObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountIdObjectKeyData getIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountIdGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (getIn != null) AccountIdObjectKeyHelper.toMap (getIn, record, "AccountId");
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
return AccountIdObjectHelper.fromMap (record, "AccountId");
}

  private BSDMInteractionSpec _AccountIdDeleteSpec = null;
  /**
   * Cease an AccountId..
   * Convenience method using default BSDMSessionContext.
   * @param axIn Input Object Key.
   * @param AIDCeaseDate (has a default).
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountIdObjectData delete (AccountIdObjectKeyData axIn, Date AIDCeaseDate) throws BSDMResourceException
  {
    return delete (null, axIn, AIDCeaseDate);
  }
  /**
   * Cease an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param axIn Input Object Key.
   * @param AIDCeaseDate (has a default).
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountIdObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountIdObjectKeyData axIn,@FormParam("AIDCeaseDate")Date AIDCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountIdDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (axIn != null) AccountIdObjectKeyHelper.toMap (axIn, record, "AccountId");

      if (AIDCeaseDate != null) record.put ("InactiveDate", AIDCeaseDate);
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
return AccountIdObjectHelper.fromMap (record, "AccountId");
}

  private BSDMInteractionSpec _AccountIdDeleteListSpec = null;
  /**
   * Cease AccountId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param xlFilter Input Filter Object.
   * @param AIDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (AccountIdObjectFilter xlFilter, Date AIDLCeaseDate) throws BSDMResourceException
  {
    deleteList (null, xlFilter, AIDLCeaseDate);
  }
  /**
   * Cease AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param xlFilter Input Filter Object.
   * @param AIDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,AccountIdObjectFilter xlFilter,@FormParam("AIDLCeaseDate")Date AIDLCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountIdDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (xlFilter != null) AccountIdObjectHelper.toMap (xlFilter, record, "AccountId");

      if (AIDLCeaseDate != null) record.put ("InactiveDate", AIDLCeaseDate);
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

  private BSDMInteractionSpec _AccountIdFindSpec = null;
  /**
   * Find AccountId's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return AccountIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountIdObjectDataList find (AccountIdObjectFilter findIn) throws BSDMResourceException
  {
    return find (null, findIn);
  }
  /**
   * Find AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return AccountIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountIdObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountIdObjectFilter findIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountIdFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findIn != null) AccountIdObjectHelper.toMap (findIn, record, "AccountId");
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
return AccountIdObjectHelper.fromMapList (record, "AccountIdList");
}

  private BSDMInteractionSpec _AccountIdUpdateSpec = null;
  /**
   * Update non-key fields of an AccountId..
   * Convenience method using default BSDMSessionContext.
   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountIdObjectData update (AccountIdObjectData updateIn) throws BSDMResourceException
  {
    return update (null, updateIn);
  }
  /**
   * Update non-key fields of an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountIdObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountIdObjectData updateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountIdUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (updateIn != null) AccountIdObjectHelper.toMap (updateIn, record, "AccountId");
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
return AccountIdObjectHelper.fromMap (record, "AccountId");
}

  private BSDMInteractionSpec _AccountIdCreateSpec = null;
  /**
   * Create a new Account External Id for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountIdObjectData create (AccountIdObjectData createIn) throws BSDMResourceException
  {
    return create (null, createIn);
  }
  /**
   * Create a new Account External Id for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountIdObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountIdObjectData createIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountIdCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (createIn != null) AccountIdObjectHelper.toMap (createIn, record, "AccountId");
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
return AccountIdObjectHelper.fromMap (record, "AccountId");
}

  /**

   * Retrieve one unique Account ExternalId..

   * Convenience method using default BSDMSessionContext.

   * @param getIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountIdObjectData get (AccountIdObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, getIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve one unique Account ExternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountIdObjectData get (BSDMSessionContext context, AccountIdObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(getIn, defaultAction);
       
     cManager.checkConstraints(getIn, constraintAction);
       return get (context, getIn);
  }

  /**

   * Cease an AccountId..

   * Convenience method using default BSDMSessionContext.

   * @param axIn Input Object Key.

   * @param AIDCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountIdObjectData delete (AccountIdObjectKeyData axIn, Date AIDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, axIn, AIDCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param axIn Input Object Key.
   * @param AIDCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountIdObjectData delete (BSDMSessionContext context, AccountIdObjectKeyData axIn, Date AIDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(axIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(axIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, axIn, AIDCeaseDate);
  }

  /**

   * Cease AccountId's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param xlFilter Input Filter Object.

   * @param AIDLCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (AccountIdObjectFilter xlFilter, Date AIDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, xlFilter, AIDLCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param xlFilter Input Filter Object.
   * @param AIDLCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, AccountIdObjectFilter xlFilter, Date AIDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(xlFilter, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(xlFilter, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, xlFilter, AIDLCeaseDate);
  }

  /**

   * Find AccountId's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param findIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountIdObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountIdObjectDataList find (AccountIdObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, findIn, defaultAction, constraintAction);
  }
  /** 
   * Find AccountId's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountIdObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountIdObjectDataList find (BSDMSessionContext context, AccountIdObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findIn, defaultAction);
       
     cManager.checkConstraints(findIn, constraintAction);
       return find (context, findIn);
  }

  /**

   * Update non-key fields of an AccountId..

   * Convenience method using default BSDMSessionContext.

   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountIdObjectData update (AccountIdObjectData updateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, updateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of an AccountId..
   * @param context The session context to use when connecting to the APITS server.
   * @param updateIn Input  Object.  Read-Only fields: InactiveDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountIdObjectData update (BSDMSessionContext context, AccountIdObjectData updateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(updateIn, defaultAction);
       
     cManager.checkConstraints(updateIn, constraintAction);
       return update (context, updateIn);
  }

  /**

   * Create a new Account External Id for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountIdObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountIdObjectData create (AccountIdObjectData createIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, createIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Account External Id for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param createIn Input  Object.  Defaulted Fields: AccountExternalIdType, ActiveDate, IsCurrent.  Derived Fields: ActiveDate, InactiveDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountIdObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountIdObjectData create (BSDMSessionContext context, AccountIdObjectData createIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(createIn, defaultAction);
       
     cManager.checkConstraints(createIn, constraintAction);
       return create (context, createIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountIdBean ()
  {
    try
    {
      _AccountIdGetSpec = new BSDMInteractionSpec("AccountIdGet", ApiMappings.getCallName ("AccountIdGet"), Boolean.TRUE);

      _AccountIdDeleteSpec = new BSDMInteractionSpec("AccountIdDelete", ApiMappings.getCallName ("AccountIdDelete"), Boolean.TRUE);

      _AccountIdDeleteListSpec = new BSDMInteractionSpec("AccountIdDeleteList", ApiMappings.getCallName ("AccountIdDeleteList"), Boolean.TRUE);

      _AccountIdFindSpec = new BSDMInteractionSpec("AccountIdFind", ApiMappings.getCallName ("AccountIdFind"), Boolean.TRUE);

      _AccountIdUpdateSpec = new BSDMInteractionSpec("AccountIdUpdate", ApiMappings.getCallName ("AccountIdUpdate"), Boolean.TRUE);

      _AccountIdCreateSpec = new BSDMInteractionSpec("AccountIdCreate", ApiMappings.getCallName ("AccountIdCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountIdBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountIdBean(BSDMSettings settings, BSDMConnectionManager cm)
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
