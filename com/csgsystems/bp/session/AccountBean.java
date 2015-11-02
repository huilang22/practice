
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountBean.java
 * Definition File: Customer/Account.xml
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
import com.csgsystems.bp.interfaces.AccountInterface;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountSessionBean"
 * display-name="Account Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountBean"
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

@Stateless(name="AccountBean", mappedName = "Account")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Accounts")

public class AccountBean implements AccountInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountSequenceGetSpec = null;
  /**
   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..
   * Convenience method using default BSDMSessionContext.
   * @return AccountObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountObjectKeyData sequenceGet () throws BSDMResourceException
  {
    return sequenceGet (null);
  }
  /**
   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..
   * @param context The session context to use when connecting to the APITS server.
   * @return AccountObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
 
public AccountObjectKeyData sequenceGet (BSDMSessionContext context) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountSequenceGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
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
return AccountObjectKeyHelper.fromMap (record, "Account");
}

  private BSDMInteractionSpec _AccountCreateSpec = null;
  /**
   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..
   * Convenience method using default BSDMSessionContext.
   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.
   * @param _____PaymentProfile Input  Object.
   * @param billingSC.
   * @param remitSC.
   * @param inquirySC.
   * @param collectionSC.
   * @param printSC.
   * @param server_category (null is allowed).
   * @return AccountCreateOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountCreateOutputData create (AccountXIDObjectData acIn, PaymentProfileObjectData _____PaymentProfile, Integer billingSC, Integer remitSC, Integer inquirySC, Integer collectionSC, Integer printSC, Integer server_category) throws BSDMResourceException
  {
    return create (null, acIn, _____PaymentProfile, billingSC, remitSC, inquirySC, collectionSC, printSC, server_category);
  }
  /**
   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..
   * @param context The session context to use when connecting to the APITS server.
   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.
   * @param _____PaymentProfile Input  Object.
   * @param billingSC.
   * @param remitSC.
   * @param inquirySC.
   * @param collectionSC.
   * @param printSC.
   * @param server_category (null is allowed).
   * @return AccountCreateOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountCreateOutputData create (@HeaderParam ("context")BSDMSessionContext context,AccountXIDObjectData acIn,@FormParam("PaymentProfileObject")PaymentProfileObjectData _____PaymentProfile,@FormParam("billingSC")Integer billingSC,@FormParam("remitSC")Integer remitSC,@FormParam("inquirySC")Integer inquirySC,@FormParam("collectionSC")Integer collectionSC,@FormParam("printSC")Integer printSC,@FormParam("server_category")Integer server_category) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (acIn != null) AccountXIDObjectHelper.toMap (acIn, record, "Account");
      if (_____PaymentProfile != null) PaymentProfileObjectHelper.toMap (_____PaymentProfile, record, "PaymentProfile");

      if (billingSC != null) record.put ("BillingServiceCenterId", billingSC);

      if (remitSC != null) record.put ("RemitServiceCenterId", remitSC);

      if (inquirySC != null) record.put ("InquiryServiceCenterId", inquirySC);

      if (collectionSC != null) record.put ("CollectionServiceCenterId", collectionSC);

      if (printSC != null) record.put ("PrintServiceCenterId", printSC);

      if (server_category != null) record.put ("ServerCategory", server_category);
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
return AccountCreateOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _AccountGetSpec = null;
  /**
   * Retrieves an Account object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param agIn Input Object Key.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountXIDObjectData get (AccountObjectKeyData agIn) throws BSDMResourceException
  {
    return get (null, agIn);
  }
  /**
   * Retrieves an Account object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param agIn Input Object Key.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountXIDObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountObjectKeyData agIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (agIn != null) AccountObjectKeyHelper.toMap (agIn, record, "Account");
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
return AccountXIDObjectHelper.fromMap (record, "Account");
}

  private BSDMInteractionSpec _AccountExtendedDataFindSpec = null;
  /**
   * Finds the Extended Data associated to a single account..
   * Convenience method using default BSDMSessionContext.
   * @param aedfIn Input Object Key.
   * @return AccountEDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountEDObjectDataList extendedDataFind (AccountObjectKeyData aedfIn) throws BSDMResourceException
  {
    return extendedDataFind (null, aedfIn);
  }
  /**
   * Finds the Extended Data associated to a single account..
   * @param context The session context to use when connecting to the APITS server.
   * @param aedfIn Input Object Key.
   * @return AccountEDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("extendedDataFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountEDObjectDataList extendedDataFind (@HeaderParam ("context")BSDMSessionContext context,AccountObjectKeyData aedfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountExtendedDataFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (aedfIn != null) AccountObjectKeyHelper.toMap (aedfIn, record, "Account");
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
return AccountEDObjectHelper.fromMapList (record, "AccountExtendedDataList");
}

  private BSDMInteractionSpec _AccountChildCountSpec = null;
  /**
   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..
   * Convenience method using default BSDMSessionContext.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer childCount (AccountObjectKeyData accIn) throws BSDMResourceException
  {
    return childCount (null, accIn);
  }
  /**
   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("childCount")
@Produces({"application/json","application/xml"})
  public Integer childCount (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountObjectKeyData accIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountChildCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (accIn != null) AccountObjectKeyHelper.toMap (accIn, record, "Account");
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
Object _tmp = record.get ("Count");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _AccountFindSpec = null;
  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountXIDObjectDataList find (AccountXIDObjectFilter afIn) throws BSDMResourceException
  {
    return find (null, afIn);
  }
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountXIDObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountXIDObjectFilter afIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (afIn != null) AccountXIDObjectHelper.toMap (afIn, record, "Account");
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
return AccountXIDObjectHelper.fromMapList (record, "AccountList");
}

  private BSDMInteractionSpec _AccountFindByOrderNumberSpec = null;
  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param aofIn Input Filter Object.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountXIDObjectDataList findByOrderNumber (AccountXIDOrderObjectFilter aofIn) throws BSDMResourceException
  {
    return findByOrderNumber (null, aofIn);
  }
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param aofIn Input Filter Object.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByOrderNumber")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountXIDObjectDataList findByOrderNumber (@HeaderParam ("context")BSDMSessionContext context,AccountXIDOrderObjectFilter aofIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountFindByOrderNumberSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (aofIn != null) AccountXIDOrderObjectHelper.toMap (aofIn, record, "Account");
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
return AccountXIDObjectHelper.fromMapList (record, "AccountList");
}

  private BSDMInteractionSpec _AccountFindCountSpec = null;
  /**
   * Finds # of Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (AccountXIDObjectFilter afcIn) throws BSDMResourceException
  {
    return findCount (null, afcIn);
  }
  /**
   * Finds # of Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,AccountXIDObjectFilter afcIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (afcIn != null) AccountXIDObjectHelper.toMap (afcIn, record, "Account");
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
Object _tmp = record.get ("TotalCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _AccountUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountXIDObjectData update (AccountObjectData au2In) throws BSDMResourceException
  {
    return update (null, au2In);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountXIDObjectData update (@HeaderParam ("context")BSDMSessionContext context,AccountObjectData au2In) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (au2In != null) AccountObjectHelper.toMap (au2In, record, "Account");
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
return AccountXIDObjectHelper.fromMap (record, "Account");
}

  private BSDMInteractionSpec _AccountActivateSpec = null;
  /**
   * Activates a pending Account (an Account that was created with a pending status..
   * Convenience method using default BSDMSessionContext.
   * @param aaIn Input Object Key.
   * @param actDate (has a default).
   * @param actReason (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountXIDObjectData activate (AccountObjectKeyData aaIn, Date actDate, Integer actReason) throws BSDMResourceException
  {
    return activate (null, aaIn, actDate, actReason);
  }
  /**
   * Activates a pending Account (an Account that was created with a pending status..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaIn Input Object Key.
   * @param actDate (has a default).
   * @param actReason (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("activate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountXIDObjectData activate (@HeaderParam ("context")BSDMSessionContext context,AccountObjectKeyData aaIn,@FormParam("actDate")Date actDate,@FormParam("actReason")Integer actReason) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountActivateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (aaIn != null) AccountObjectKeyHelper.toMap (aaIn, record, "Account");

      if (actDate != null) record.put ("ActiveDate", actDate);

      if (actReason != null) record.put ("ReasonCode", actReason);
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
return AccountXIDObjectHelper.fromMap (record, "Account");
}

  private BSDMInteractionSpec _AccountReactivateSpec = null;
  /**
   * Re-Activate a Suspended Account..
   * Convenience method using default BSDMSessionContext.
   * @param araIn Input Object Key.
   * @param ractReason (has a default).
   * @param ractDate (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountXIDObjectData reactivate (AccountObjectKeyData araIn, Integer ractReason, Date ractDate) throws BSDMResourceException
  {
    return reactivate (null, araIn, ractReason, ractDate);
  }
  /**
   * Re-Activate a Suspended Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param araIn Input Object Key.
   * @param ractReason (has a default).
   * @param ractDate (has a default).
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("reactivate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountXIDObjectData reactivate (@HeaderParam ("context")BSDMSessionContext context,AccountObjectKeyData araIn,@FormParam("ractReason")Integer ractReason,@FormParam("ractDate")Date ractDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountReactivateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (araIn != null) AccountObjectKeyHelper.toMap (araIn, record, "Account");

      if (ractReason != null) record.put ("RactReason", ractReason);

      if (ractDate != null) record.put ("RactDate", ractDate);
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
return AccountXIDObjectHelper.fromMap (record, "Account");
}

  private BSDMInteractionSpec _AccountBalanceSummarySpec = null;
  /**
   * Returns the BalanceSummary for an Account..
   * Convenience method using default BSDMSessionContext.
   * @param agbsIn Input Object Key.
   * @return AccountBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountBalanceSummaryOutputData balanceSummary (AccountObjectKeyData agbsIn) throws BSDMResourceException
  {
    return balanceSummary (null, agbsIn);
  }
  /**
   * Returns the BalanceSummary for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param agbsIn Input Object Key.
   * @return AccountBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("balanceSummary")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountBalanceSummaryOutputData balanceSummary (@HeaderParam ("context")BSDMSessionContext context,AccountObjectKeyData agbsIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountBalanceSummarySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (agbsIn != null) AccountObjectKeyHelper.toMap (agbsIn, record, "Account");
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
return AccountBalanceSummaryOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _NetworkStatusSpec = null;
  /**
   * Returns the Status of the Account on the Network..
   * Convenience method using default BSDMSessionContext.
   * @param agnsIn Input Object Key.
   * @param effectiveDate (null is allowed) (has a default).
   * @return NetworkStatusOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public NetworkStatusOutputData networkStatus (AccountObjectKeyData agnsIn, Date effectiveDate) throws BSDMResourceException
  {
    return networkStatus (null, agnsIn, effectiveDate);
  }
  /**
   * Returns the Status of the Account on the Network..
   * @param context The session context to use when connecting to the APITS server.
   * @param agnsIn Input Object Key.
   * @param effectiveDate (null is allowed) (has a default).
   * @return NetworkStatusOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("networkStatus")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public NetworkStatusOutputData networkStatus (@HeaderParam ("context")BSDMSessionContext context,AccountObjectKeyData agnsIn,@FormParam("effectiveDate")Date effectiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_NetworkStatusSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (agnsIn != null) AccountObjectKeyHelper.toMap (agnsIn, record, "Account");

      if (effectiveDate != null) record.put ("EffectiveDate", effectiveDate);
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
return NetworkStatusOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _AccountActiveChildCountSpec = null;
  /**
   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..
   * Convenience method using default BSDMSessionContext.
   * @param aaccKeyIn Input Object Key.
   * @param effective_date (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer activeChildCount (AccountObjectKeyData aaccKeyIn, Date effective_date) throws BSDMResourceException
  {
    return activeChildCount (null, aaccKeyIn, effective_date);
  }
  /**
   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaccKeyIn Input Object Key.
   * @param effective_date (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("activeChildCount")
@Produces({"application/json","application/xml"})
  public Integer activeChildCount (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountObjectKeyData aaccKeyIn,@QueryParam("effective_date")Date effective_date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountActiveChildCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (aaccKeyIn != null) AccountObjectKeyHelper.toMap (aaccKeyIn, record, "Account");

      if (effective_date != null) record.put ("EffectiveDate", effective_date);
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
Object _tmp = record.get ("ActiveChildCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _AccountFindWithExtendedDataSpec = null;
  /**
   * Finds Accounts based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountXIDObjectDataList findWithExtendedData (AccountXIDObjectFilter afedIn) throws BSDMResourceException
  {
    return findWithExtendedData (null, afedIn);
  }
  /**
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findWithExtendedData")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountXIDObjectDataList findWithExtendedData (@HeaderParam ("context")BSDMSessionContext context,AccountXIDObjectFilter afedIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountFindWithExtendedDataSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (afedIn != null) AccountXIDObjectHelper.toMap (afedIn, record, "Account");
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
return AccountXIDObjectHelper.fromMapList (record, "AccountList");
}

  /**

   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..

   * Convenience method using default BSDMSessionContext.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountObjectKeyData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountObjectKeyData sequenceGet (String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return sequenceGet (null, defaultAction, constraintAction);
  }
  /** 
   * Generates a new AccountInternalId for a new Account.  Used to pass to AccountCreate later..
   * @param context The session context to use when connecting to the APITS server.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountObjectKeyData sequenceGet (BSDMSessionContext context, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    return sequenceGet (context);
  }

  /**

   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..

   * Convenience method using default BSDMSessionContext.

   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.

   * @param _____PaymentProfile Input  Object.

   * @param billingSC.

   * @param remitSC.

   * @param inquirySC.

   * @param collectionSC.

   * @param printSC.

   * @param server_category (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountCreateOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountCreateOutputData create (AccountXIDObjectData acIn, PaymentProfileObjectData _____PaymentProfile, Integer billingSC, Integer remitSC, Integer inquirySC, Integer collectionSC, Integer printSC, Integer server_category, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, acIn, _____PaymentProfile, billingSC, remitSC, inquirySC, collectionSC, printSC, server_category, defaultAction, constraintAction);
  }
  /** 
   * Creates a new Account. An optional PaymentProfile object should be passed if payment method is via Credit Card. This method is automatically routed to the least used customer server when called in an MSA environment..
   * @param context The session context to use when connecting to the APITS server.
   * @param acIn Input  Object.  Read-Only fields: PaymentProfileId, AccountExternalIdType, ParentAccountExternalIdType, ParentAccountExternalId, ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ActiveDate, InactiveDate, ServerId.
   * @param _____PaymentProfile Input  Object.
   * @param billingSC.
   * @param remitSC.
   * @param inquirySC.
   * @param collectionSC.
   * @param printSC.
   * @param server_category (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountCreateOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountCreateOutputData create (BSDMSessionContext context, AccountXIDObjectData acIn, PaymentProfileObjectData _____PaymentProfile, Integer billingSC, Integer remitSC, Integer inquirySC, Integer collectionSC, Integer printSC, Integer server_category, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(acIn, defaultAction);
       
     dManager.setObjectDefaults(_____PaymentProfile, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(acIn, constraintAction);
       
     cManager.checkConstraints(_____PaymentProfile, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return create (context, acIn, _____PaymentProfile, billingSC, remitSC, inquirySC, collectionSC, printSC, server_category);
  }

  /**

   * Retrieves an Account object based on its key..

   * Convenience method using default BSDMSessionContext.

   * @param agIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountXIDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountXIDObjectData get (AccountObjectKeyData agIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, agIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieves an Account object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param agIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountXIDObjectData get (BSDMSessionContext context, AccountObjectKeyData agIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(agIn, defaultAction);
       
     cManager.checkConstraints(agIn, constraintAction);
       return get (context, agIn);
  }

  /**

   * Finds the Extended Data associated to a single account..

   * Convenience method using default BSDMSessionContext.

   * @param aedfIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountEDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountEDObjectDataList extendedDataFind (AccountObjectKeyData aedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return extendedDataFind (null, aedfIn, defaultAction, constraintAction);
  }
  /** 
   * Finds the Extended Data associated to a single account..
   * @param context The session context to use when connecting to the APITS server.
   * @param aedfIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountEDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountEDObjectDataList extendedDataFind (BSDMSessionContext context, AccountObjectKeyData aedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(aedfIn, defaultAction);
       
     cManager.checkConstraints(aedfIn, constraintAction);
       return extendedDataFind (context, aedfIn);
  }

  /**

   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..

   * Convenience method using default BSDMSessionContext.

   * @param accIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer childCount (AccountObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return childCount (null, accIn, defaultAction, constraintAction);
  }
  /** 
   * Finds the # of direct children of this Account.  Equivalent to the Account.ChildCount field..
   * @param context The session context to use when connecting to the APITS server.
   * @param accIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer childCount (BSDMSessionContext context, AccountObjectKeyData accIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(accIn, defaultAction);
       
     cManager.checkConstraints(accIn, constraintAction);
       return childCount (context, accIn);
  }

  /**

   * Finds Accounts based upon the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountXIDObjectDataList find (AccountXIDObjectFilter afIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, afIn, defaultAction, constraintAction);
  }
  /** 
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountXIDObjectDataList find (BSDMSessionContext context, AccountXIDObjectFilter afIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(afIn, defaultAction);
       
     cManager.checkConstraints(afIn, constraintAction);
       return find (context, afIn);
  }

  /**

   * Finds Accounts based upon the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param aofIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountXIDObjectDataList findByOrderNumber (AccountXIDOrderObjectFilter aofIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByOrderNumber (null, aofIn, defaultAction, constraintAction);
  }
  /** 
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param aofIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountXIDObjectDataList findByOrderNumber (BSDMSessionContext context, AccountXIDOrderObjectFilter aofIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(aofIn, defaultAction);
       
     cManager.checkConstraints(aofIn, constraintAction);
       return findByOrderNumber (context, aofIn);
  }

  /**

   * Finds # of Accounts based upon the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (AccountXIDObjectFilter afcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, afcIn, defaultAction, constraintAction);
  }
  /** 
   * Finds # of Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afcIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, AccountXIDObjectFilter afcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(afcIn, defaultAction);
       
     cManager.checkConstraints(afcIn, constraintAction);
       return findCount (context, afcIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountXIDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountXIDObjectData update (AccountObjectData au2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, au2In, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param au2In Input  Object.  Read-Only fields: ChildCount, ChgWho, ChgDate, DateCreated, HierarchyId, ServerId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountXIDObjectData update (BSDMSessionContext context, AccountObjectData au2In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(au2In, defaultAction);
       
     cManager.checkConstraints(au2In, constraintAction);
       return update (context, au2In);
  }

  /**

   * Activates a pending Account (an Account that was created with a pending status..

   * Convenience method using default BSDMSessionContext.

   * @param aaIn Input Object Key.

   * @param actDate (has a default).

   * @param actReason (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountXIDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountXIDObjectData activate (AccountObjectKeyData aaIn, Date actDate, Integer actReason, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return activate (null, aaIn, actDate, actReason, defaultAction, constraintAction);
  }
  /** 
   * Activates a pending Account (an Account that was created with a pending status..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaIn Input Object Key.
   * @param actDate (has a default).
   * @param actReason (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountXIDObjectData activate (BSDMSessionContext context, AccountObjectKeyData aaIn, Date actDate, Integer actReason, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(aaIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(aaIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return activate (context, aaIn, actDate, actReason);
  }

  /**

   * Re-Activate a Suspended Account..

   * Convenience method using default BSDMSessionContext.

   * @param araIn Input Object Key.

   * @param ractReason (has a default).

   * @param ractDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountXIDObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountXIDObjectData reactivate (AccountObjectKeyData araIn, Integer ractReason, Date ractDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return reactivate (null, araIn, ractReason, ractDate, defaultAction, constraintAction);
  }
  /** 
   * Re-Activate a Suspended Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param araIn Input Object Key.
   * @param ractReason (has a default).
   * @param ractDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountXIDObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountXIDObjectData reactivate (BSDMSessionContext context, AccountObjectKeyData araIn, Integer ractReason, Date ractDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(araIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(araIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return reactivate (context, araIn, ractReason, ractDate);
  }

  /**

   * Returns the BalanceSummary for an Account..

   * Convenience method using default BSDMSessionContext.

   * @param agbsIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountBalanceSummaryOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountBalanceSummaryOutputData balanceSummary (AccountObjectKeyData agbsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return balanceSummary (null, agbsIn, defaultAction, constraintAction);
  }
  /** 
   * Returns the BalanceSummary for an Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param agbsIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountBalanceSummaryOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountBalanceSummaryOutputData balanceSummary (BSDMSessionContext context, AccountObjectKeyData agbsIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(agbsIn, defaultAction);
       
     cManager.checkConstraints(agbsIn, constraintAction);
       return balanceSummary (context, agbsIn);
  }

  /**

   * Returns the Status of the Account on the Network..

   * Convenience method using default BSDMSessionContext.

   * @param agnsIn Input Object Key.

   * @param effectiveDate (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return NetworkStatusOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public NetworkStatusOutputData networkStatus (AccountObjectKeyData agnsIn, Date effectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return networkStatus (null, agnsIn, effectiveDate, defaultAction, constraintAction);
  }
  /** 
   * Returns the Status of the Account on the Network..
   * @param context The session context to use when connecting to the APITS server.
   * @param agnsIn Input Object Key.
   * @param effectiveDate (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return NetworkStatusOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public NetworkStatusOutputData networkStatus (BSDMSessionContext context, AccountObjectKeyData agnsIn, Date effectiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(agnsIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(agnsIn, constraintAction);
       
    //Constraints not supported on Input-Column
return networkStatus (context, agnsIn, effectiveDate);
  }

  /**

   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..

   * Convenience method using default BSDMSessionContext.

   * @param aaccKeyIn Input Object Key.

   * @param effective_date (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer activeChildCount (AccountObjectKeyData aaccKeyIn, Date effective_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return activeChildCount (null, aaccKeyIn, effective_date, defaultAction, constraintAction);
  }
  /** 
   * Returns the number of Child Account's this Account has that are active on the EffectiveDate and do not have DisconnectOrder's against them due to complete prior to EffectiveDate.  Used to see whether a parent account can be Disconnected..
   * @param context The session context to use when connecting to the APITS server.
   * @param aaccKeyIn Input Object Key.
   * @param effective_date (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer activeChildCount (BSDMSessionContext context, AccountObjectKeyData aaccKeyIn, Date effective_date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(aaccKeyIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(aaccKeyIn, constraintAction);
       
    //Constraints not supported on Input-Column
return activeChildCount (context, aaccKeyIn, effective_date);
  }

  /**

   * Finds Accounts based upon the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountXIDObjectDataList findWithExtendedData (AccountXIDObjectFilter afedIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findWithExtendedData (null, afedIn, defaultAction, constraintAction);
  }
  /** 
   * Finds Accounts based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param afedIn Input Filter Object.  Derived Fields: ParentAccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountXIDObjectDataList findWithExtendedData (BSDMSessionContext context, AccountXIDObjectFilter afedIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(afedIn, defaultAction);
       
     cManager.checkConstraints(afedIn, constraintAction);
       return findWithExtendedData (context, afedIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountBean ()
  {
    try
    {
      _AccountSequenceGetSpec = new BSDMInteractionSpec("AccountSequenceGet", ApiMappings.getCallName ("AccountSequenceGet"), Boolean.FALSE);

      _AccountCreateSpec = new BSDMInteractionSpec("AccountCreate", ApiMappings.getCallName ("AccountCreate"), Boolean.TRUE);

      _AccountGetSpec = new BSDMInteractionSpec("AccountGet", ApiMappings.getCallName ("AccountGet"), Boolean.TRUE);

      _AccountExtendedDataFindSpec = new BSDMInteractionSpec("AccountExtendedDataFind", ApiMappings.getCallName ("AccountExtendedDataFind"), Boolean.TRUE);

      _AccountChildCountSpec = new BSDMInteractionSpec("AccountChildCount", ApiMappings.getCallName ("AccountChildCount"), Boolean.TRUE);

      _AccountFindSpec = new BSDMInteractionSpec("AccountFind", ApiMappings.getCallName ("AccountFind"), Boolean.TRUE);

      _AccountFindByOrderNumberSpec = new BSDMInteractionSpec("AccountFindByOrderNumber", ApiMappings.getCallName ("AccountFindByOrderNumber"), Boolean.TRUE);

      _AccountFindCountSpec = new BSDMInteractionSpec("AccountFindCount", ApiMappings.getCallName ("AccountFindCount"), Boolean.TRUE);

      _AccountUpdateSpec = new BSDMInteractionSpec("AccountUpdate", ApiMappings.getCallName ("AccountUpdate"), Boolean.TRUE);

      _AccountActivateSpec = new BSDMInteractionSpec("AccountActivate", ApiMappings.getCallName ("AccountActivate"), Boolean.TRUE);

      _AccountReactivateSpec = new BSDMInteractionSpec("AccountReactivate", ApiMappings.getCallName ("AccountReactivate"), Boolean.TRUE);

      _AccountBalanceSummarySpec = new BSDMInteractionSpec("AccountBalanceSummary", ApiMappings.getCallName ("AccountBalanceSummary"), Boolean.TRUE);

      _NetworkStatusSpec = new BSDMInteractionSpec("NetworkStatus", ApiMappings.getCallName ("NetworkStatus"), Boolean.TRUE);

      _AccountActiveChildCountSpec = new BSDMInteractionSpec("AccountActiveChildCount", ApiMappings.getCallName ("AccountActiveChildCount"), Boolean.TRUE);

      _AccountFindWithExtendedDataSpec = new BSDMInteractionSpec("AccountFindWithExtendedData", ApiMappings.getCallName ("AccountFindWithExtendedData"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountBean(BSDMSettings settings, BSDMConnectionManager cm)
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
