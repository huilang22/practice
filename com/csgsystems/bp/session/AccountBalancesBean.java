
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountBalancesBean.java
 * Definition File: Customer/AccountBalances.xml
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
import com.csgsystems.bp.interfaces.AccountBalancesInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountBalancesSessionBean"
 * display-name="AccountBalances Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountBalancesBean"
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

@Stateless(name="AccountBalancesBean", mappedName = "AccountBalances")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountBalances")

public class AccountBalancesBean implements AccountBalancesInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountBalancesCountSpec = null;
  /**
   * Returns the # of AccountBalances for a given Account..
   * Convenience method using default BSDMSessionContext.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer count (CmfObjectKeyData accIn) throws BSDMResourceException
  {
    return count (null, accIn);
  }
  /**
   * Returns the # of AccountBalances for a given Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("count")
@Produces({"application/json","application/xml"})
  public Integer count (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CmfObjectKeyData accIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (accIn != null) CmfObjectKeyHelper.toMap (accIn, record, "Account");
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
Object _tmp = record.get ("BalanceCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _AccountBalancesCreateSpec = null;
  /**
   * Creates an AccountBalance for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBalancesObjectData create (AccountBalancesObjectData ABCreateIn) throws BSDMResourceException
  {
    return create (null, ABCreateIn);
  }
  /**
   * Creates an AccountBalance for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBalancesObjectData create (@HeaderParam ("context")BSDMSessionContext context,AccountBalancesObjectData ABCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABCreateIn != null) AccountBalancesObjectHelper.toMap (ABCreateIn, record, "AccountBalances");
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
return AccountBalancesObjectHelper.fromMap (record, "AccountBalances");
}

  private BSDMInteractionSpec _AccountBalancesGetSpec = null;
  /**
   * Retrieves one unique AccountBalance row..
   * Convenience method using default BSDMSessionContext.
   * @param ABGetIn Input Object Key.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBalancesObjectData get (AccountBalancesObjectKeyData ABGetIn) throws BSDMResourceException
  {
    return get (null, ABGetIn);
  }
  /**
   * Retrieves one unique AccountBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABGetIn Input Object Key.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountBalancesObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountBalancesObjectKeyData ABGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABGetIn != null) AccountBalancesObjectKeyHelper.toMap (ABGetIn, record, "AccountBalances");
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
return AccountBalancesObjectHelper.fromMap (record, "AccountBalances");
}

  private BSDMInteractionSpec _AccountBalancesAlternateGetSpec = null;
  /**
   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..
   * Convenience method using default BSDMSessionContext.
   * @param ABAlternateGetIn Input  Object.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBalancesObjectData alternateGet (AccountBalancesObjectData ABAlternateGetIn) throws BSDMResourceException
  {
    return alternateGet (null, ABAlternateGetIn);
  }
  /**
   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABAlternateGetIn Input  Object.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("alternateGet")
@Produces({"application/json","application/xml"})
  public AccountBalancesObjectData alternateGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountBalancesObjectData ABAlternateGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesAlternateGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABAlternateGetIn != null) AccountBalancesObjectHelper.toMap (ABAlternateGetIn, record, "AccountBalances");
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
return AccountBalancesObjectHelper.fromMap (record, "AccountBalances");
}

  private BSDMInteractionSpec _AccountBalancesFindSpec = null;
  /**
   * Finds AccountBalances that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ABFindIn Input Filter Object.
   * @return AccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBalancesObjectDataList find (AccountBalancesObjectFilter ABFindIn) throws BSDMResourceException
  {
    return find (null, ABFindIn);
  }
  /**
   * Finds AccountBalances that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABFindIn Input Filter Object.
   * @return AccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBalancesObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountBalancesObjectFilter ABFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABFindIn != null) AccountBalancesObjectHelper.toMap (ABFindIn, record, "AccountBalances");
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
return AccountBalancesObjectHelper.fromMapList (record, "AccountBalancesList");
}

  private BSDMInteractionSpec _AccountBalancesUpdateSpec = null;
  /**
   * Update non-key fields on an AccountBalances row..
   * Convenience method using default BSDMSessionContext.
   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBalancesObjectData update (AccountBalancesObjectData ABUpdateIn) throws BSDMResourceException
  {
    return update (null, ABUpdateIn);
  }
  /**
   * Update non-key fields on an AccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBalancesObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountBalancesObjectData ABUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABUpdateIn != null) AccountBalancesObjectHelper.toMap (ABUpdateIn, record, "AccountBalances");
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
return AccountBalancesObjectHelper.fromMap (record, "AccountBalances");
}

  private BSDMInteractionSpec _AccountBalancesDeleteSpec = null;
  /**
   * Cease an AccountBalance..
   * Convenience method using default BSDMSessionContext.
   * @param ABDeleteIn Input Object Key.
   * @param ABDCeaseDate (has a default).
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBalancesObjectData delete (AccountBalancesObjectKeyData ABDeleteIn, Date ABDCeaseDate) throws BSDMResourceException
  {
    return delete (null, ABDeleteIn, ABDCeaseDate);
  }
  /**
   * Cease an AccountBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABDeleteIn Input Object Key.
   * @param ABDCeaseDate (has a default).
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBalancesObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AccountBalancesObjectKeyData ABDeleteIn,@FormParam("ABDCeaseDate")Date ABDCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ABDeleteIn != null) AccountBalancesObjectKeyHelper.toMap (ABDeleteIn, record, "AccountBalances");

      if (ABDCeaseDate != null) record.put ("InactiveDate", ABDCeaseDate);
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
return AccountBalancesObjectHelper.fromMap (record, "AccountBalances");
}

  private BSDMInteractionSpec _AccountBalancesDeleteListSpec = null;
  /**
   * Cease AccountBalances based upon a filter..
   * Convenience method using default BSDMSessionContext.
   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (AccountBalancesObjectFilter AccountBalancesFilter, Date ABInactiveDate) throws BSDMResourceException
  {
    deleteList (null, AccountBalancesFilter, ABInactiveDate);
  }
  /**
   * Cease AccountBalances based upon a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,AccountBalancesObjectFilter AccountBalancesFilter,@FormParam("ABInactiveDate")Date ABInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (ABInactiveDate != null) record.put ("InactiveDate", ABInactiveDate);
      if (AccountBalancesFilter != null) AccountBalancesObjectHelper.toMap (AccountBalancesFilter, record, "AccountBalancesFilter");
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

  private BSDMInteractionSpec _AccountBalancesDeleteByAccountSpec = null;
  /**
   * Cease AccountBalances for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABAInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteByAccount (AccountBalancesObjectData ABInObject, Date ABAInactiveDate) throws BSDMResourceException
  {
    deleteByAccount (null, ABInObject, ABAInactiveDate);
  }
  /**
   * Cease AccountBalances for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABAInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteByAccount")
@Consumes({"application/json","application/xml"})

 public void deleteByAccount (@HeaderParam ("context")BSDMSessionContext context,AccountBalancesObjectData ABInObject,@FormParam("ABAInactiveDate")Date ABAInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalancesDeleteByAccountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (ABAInactiveDate != null) record.put ("InactiveDate", ABAInactiveDate);
      if (ABInObject != null) AccountBalancesObjectHelper.toMap (ABInObject, record, "AccountBalances");
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

   * Returns the # of AccountBalances for a given Account..

   * Convenience method using default BSDMSessionContext.

   * @param accIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer count (CmfObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return count (null, accIn, defaultAction, constraintAction);
  }
  /** 
   * Returns the # of AccountBalances for a given Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer count (BSDMSessionContext context, CmfObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(accIn, defaultAction);
       
     cManager.checkConstraints(accIn, constraintAction);
       return count (context, accIn);
  }

  /**

   * Creates an AccountBalance for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBalancesObjectData create (AccountBalancesObjectData ABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ABCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Creates an AccountBalance for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABCreateIn Input  Object.  Read-Only fields: BalanceTrackingIdServ, ChgWho, ChgDt, CreateDt.  Defaulted Fields: IsBalancePrepaid, AuthorizationFlag, Priority, ActiveDt.  Derived Fields: BalanceTrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBalancesObjectData create (BSDMSessionContext context, AccountBalancesObjectData ABCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABCreateIn, defaultAction);
       
     cManager.checkConstraints(ABCreateIn, constraintAction);
       return create (context, ABCreateIn);
  }

  /**

   * Retrieves one unique AccountBalance row..

   * Convenience method using default BSDMSessionContext.

   * @param ABGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBalancesObjectData get (AccountBalancesObjectKeyData ABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ABGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieves one unique AccountBalance row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBalancesObjectData get (BSDMSessionContext context, AccountBalancesObjectKeyData ABGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABGetIn, defaultAction);
       
     cManager.checkConstraints(ABGetIn, constraintAction);
       return get (context, ABGetIn);
  }

  /**

   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..

   * Convenience method using default BSDMSessionContext.

   * @param ABAlternateGetIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBalancesObjectData alternateGet (AccountBalancesObjectData ABAlternateGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return alternateGet (null, ABAlternateGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieves one unique AccountBalance row by OpenItemId and BalanceAccountInternalId..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABAlternateGetIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBalancesObjectData alternateGet (BSDMSessionContext context, AccountBalancesObjectData ABAlternateGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABAlternateGetIn, defaultAction);
       
     cManager.checkConstraints(ABAlternateGetIn, constraintAction);
       return alternateGet (context, ABAlternateGetIn);
  }

  /**

   * Finds AccountBalances that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ABFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBalancesObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBalancesObjectDataList find (AccountBalancesObjectFilter ABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ABFindIn, defaultAction, constraintAction);
  }
  /** 
   * Finds AccountBalances that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBalancesObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBalancesObjectDataList find (BSDMSessionContext context, AccountBalancesObjectFilter ABFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABFindIn, defaultAction);
       
     cManager.checkConstraints(ABFindIn, constraintAction);
       return find (context, ABFindIn);
  }

  /**

   * Update non-key fields on an AccountBalances row..

   * Convenience method using default BSDMSessionContext.

   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBalancesObjectData update (AccountBalancesObjectData ABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ABUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields on an AccountBalances row..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBalancesObjectData update (BSDMSessionContext context, AccountBalancesObjectData ABUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABUpdateIn, defaultAction);
       
     cManager.checkConstraints(ABUpdateIn, constraintAction);
       return update (context, ABUpdateIn);
  }

  /**

   * Cease an AccountBalance..

   * Convenience method using default BSDMSessionContext.

   * @param ABDeleteIn Input Object Key.

   * @param ABDCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBalancesObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBalancesObjectData delete (AccountBalancesObjectKeyData ABDeleteIn, Date ABDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, ABDeleteIn, ABDCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease an AccountBalance..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABDeleteIn Input Object Key.
   * @param ABDCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBalancesObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBalancesObjectData delete (BSDMSessionContext context, AccountBalancesObjectKeyData ABDeleteIn, Date ABDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ABDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ABDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, ABDeleteIn, ABDCeaseDate);
  }

  /**

   * Cease AccountBalances based upon a filter..

   * Convenience method using default BSDMSessionContext.

   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.

   * @param ABInactiveDate (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (AccountBalancesObjectFilter AccountBalancesFilter, Date ABInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, AccountBalancesFilter, ABInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease AccountBalances based upon a filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountBalancesFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABInactiveDate (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, AccountBalancesObjectFilter AccountBalancesFilter, Date ABInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(AccountBalancesFilter, defaultAction);
       
    //Constraints not supported on Input-Column

     cManager.checkConstraints(AccountBalancesFilter, constraintAction);
       deleteList (context, AccountBalancesFilter, ABInactiveDate);
  }

  /**

   * Cease AccountBalances for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.

   * @param ABAInactiveDate (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteByAccount (AccountBalancesObjectData ABInObject, Date ABAInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteByAccount (null, ABInObject, ABAInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease AccountBalances for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param ABInObject Input  Object.  Read-Only fields: ChgDt, ChgWho, InactiveDt, ActiveDt, CreateDt, BalanceDesc, BalanceTrackingId, BalanceTrackingIdServ, IsBalancePrepaid, RegulatoryId, AuthorizationFlag, LanguageCode, Priority, BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param ABAInactiveDate (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteByAccount (BSDMSessionContext context, AccountBalancesObjectData ABInObject, Date ABAInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(ABInObject, defaultAction);
       
    //Constraints not supported on Input-Column

     cManager.checkConstraints(ABInObject, constraintAction);
       deleteByAccount (context, ABInObject, ABAInactiveDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountBalancesBean ()
  {
    try
    {
      _AccountBalancesCountSpec = new BSDMInteractionSpec("AccountBalancesCount", ApiMappings.getCallName ("AccountBalancesCount"), Boolean.TRUE);

      _AccountBalancesCreateSpec = new BSDMInteractionSpec("AccountBalancesCreate", ApiMappings.getCallName ("AccountBalancesCreate"), Boolean.TRUE);

      _AccountBalancesGetSpec = new BSDMInteractionSpec("AccountBalancesGet", ApiMappings.getCallName ("AccountBalancesGet"), Boolean.TRUE);

      _AccountBalancesAlternateGetSpec = new BSDMInteractionSpec("AccountBalancesAlternateGet", ApiMappings.getCallName ("AccountBalancesAlternateGet"), Boolean.TRUE);

      _AccountBalancesFindSpec = new BSDMInteractionSpec("AccountBalancesFind", ApiMappings.getCallName ("AccountBalancesFind"), Boolean.TRUE);

      _AccountBalancesUpdateSpec = new BSDMInteractionSpec("AccountBalancesUpdate", ApiMappings.getCallName ("AccountBalancesUpdate"), Boolean.TRUE);

      _AccountBalancesDeleteSpec = new BSDMInteractionSpec("AccountBalancesDelete", ApiMappings.getCallName ("AccountBalancesDelete"), Boolean.TRUE);

      _AccountBalancesDeleteListSpec = new BSDMInteractionSpec("AccountBalancesDeleteList", ApiMappings.getCallName ("AccountBalancesDeleteList"), Boolean.TRUE);

      _AccountBalancesDeleteByAccountSpec = new BSDMInteractionSpec("AccountBalancesDeleteByAccount", ApiMappings.getCallName ("AccountBalancesDeleteByAccount"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountBalancesBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountBalancesBean(BSDMSettings settings, BSDMConnectionManager cm)
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
