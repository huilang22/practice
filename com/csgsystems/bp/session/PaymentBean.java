
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PaymentBean.java
 * Definition File: Customer/Payment.xml
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
import com.csgsystems.bp.interfaces.PaymentInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PaymentSessionBean"
 * display-name="Payment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PaymentBean"
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

@Stateless(name="PaymentBean", mappedName = "Payment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Payments")

public class PaymentBean implements PaymentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PaymentGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectData get (PaymentObjectKeyData getIn) throws BSDMResourceException
  {
    return get (null, getIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PaymentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PaymentObjectKeyData getIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (getIn != null) PaymentObjectKeyHelper.toMap (getIn, record, "Payment");
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
return PaymentObjectHelper.fromMap (record, "Payment");
}

  private BSDMInteractionSpec _PaymentFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectDataList find (PaymentObjectFilter findIn) throws BSDMResourceException
  {
    return find (null, findIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectFilter findIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findIn != null) PaymentObjectHelper.toMap (findIn, record, "Payment");
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
return PaymentObjectHelper.fromMapList (record, "PaymentList");
}

  private BSDMInteractionSpec _PaymentNoBackoutFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectDataList noBackoutFind (PaymentObjectFilter nbfindIn) throws BSDMResourceException
  {
    return noBackoutFind (null, nbfindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("noBackoutFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentObjectDataList noBackoutFind (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectFilter nbfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentNoBackoutFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (nbfindIn != null) PaymentObjectHelper.toMap (nbfindIn, record, "Payment");
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
return PaymentObjectHelper.fromMapList (record, "PaymentList");
}

  private BSDMInteractionSpec _PaymentFindCountSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (PaymentObjectFilter findCountIn) throws BSDMResourceException
  {
    return findCount (null, findCountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectFilter findCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findCountIn != null) PaymentObjectHelper.toMap (findCountIn, record, "Payment");
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

  private BSDMInteractionSpec _PaymentCreateSpec = null;
  /**
   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..
   * Convenience method using default BSDMSessionContext.
   * @param payCreateIn1 Input  Object.
   * @param WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectData create (PaymentObjectData payCreateIn1, Integer WaiveEpg) throws BSDMResourceException
  {
    return create (null, payCreateIn1, WaiveEpg);
  }
  /**
   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreateIn1 Input  Object.
   * @param WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentObjectData create (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData payCreateIn1,@FormParam("WaiveEpg")Integer WaiveEpg) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payCreateIn1 != null) PaymentObjectHelper.toMap (payCreateIn1, record, "Payment");

      if (WaiveEpg != null) record.put ("WaiveEpg", WaiveEpg);
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
return PaymentObjectHelper.fromMap (record, "Payment");
}

  private BSDMInteractionSpec _PaymentUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectData update (PaymentObjectData payUpdateIn1, Integer _WaiveEpg) throws BSDMResourceException
  {
    return update (null, payUpdateIn1, _WaiveEpg);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentObjectData update (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData payUpdateIn1,@FormParam("_WaiveEpg")Integer _WaiveEpg) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payUpdateIn1 != null) PaymentObjectHelper.toMap (payUpdateIn1, record, "Payment");

      if (_WaiveEpg != null) record.put ("WaiveEpg", _WaiveEpg);
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
return PaymentObjectHelper.fromMap (record, "Payment");
}

  private BSDMInteractionSpec _PaymentTransferSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payXferIn Input Object Key.
   * @param account_external_id.
   * @param account_external_id_type.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectData transfer (PaymentObjectKeyData payXferIn, String account_external_id, Integer account_external_id_type, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException
  {
    return transfer (null, payXferIn, account_external_id, account_external_id_type, bill_ref_no, bill_ref_resets, open_item_id);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payXferIn Input Object Key.
   * @param account_external_id.
   * @param account_external_id_type.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("transfer")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentObjectData transfer (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectKeyData payXferIn,@FormParam("account_external_id")String account_external_id,@FormParam("account_external_id_type")Integer account_external_id_type,@FormParam("bill_ref_no")Integer bill_ref_no,@FormParam("bill_ref_resets")Integer bill_ref_resets,@FormParam("open_item_id")Integer open_item_id) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentTransferSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payXferIn != null) PaymentObjectKeyHelper.toMap (payXferIn, record, "Payment");

      if (account_external_id != null) record.put ("AccountExternalId", account_external_id);

      if (account_external_id_type != null) record.put ("AccountExternalIdType", account_external_id_type);

      if (bill_ref_no != null) record.put ("BillRefNo", bill_ref_no);

      if (bill_ref_resets != null) record.put ("BillRefResets", bill_ref_resets);

      if (open_item_id != null) record.put ("OpenItemId", open_item_id);
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
return PaymentObjectHelper.fromMap (record, "Payment");
}

  private BSDMInteractionSpec _PaymentReverseSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payReverseIn Input  Object.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectData reverse (PaymentObjectData payReverseIn) throws BSDMResourceException
  {
    return reverse (null, payReverseIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payReverseIn Input  Object.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("reverse")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentObjectData reverse (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData payReverseIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentReverseSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payReverseIn != null) PaymentObjectHelper.toMap (payReverseIn, record, "Payment");
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
return PaymentObjectHelper.fromMap (record, "Payment");
}

  private BSDMInteractionSpec _PaymentDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void delete (PaymentObjectKeyData payDeleteIn) throws BSDMResourceException
  {
    delete (null, payDeleteIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})

 public void delete (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectKeyData payDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payDeleteIn != null) PaymentObjectKeyHelper.toMap (payDeleteIn, record, "Payment");
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

  private BSDMInteractionSpec _PaymentCountSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payCountIn Input  Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer count (PaymentObjectData payCountIn) throws BSDMResourceException
  {
    return count (null, payCountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payCountIn Input  Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("count")
@Produces({"application/json","application/xml"})
  public Integer count (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PaymentObjectData payCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payCountIn != null) PaymentObjectHelper.toMap (payCountIn, record, "Payment");
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
Object _tmp = record.get ("NsfCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _PaymentAllocateSpec = null;
  /**
   * Allocate a Payment from the Suspense Account..
   * Convenience method using default BSDMSessionContext.
   * @param payAllocateIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void allocate (PaymentObjectData payAllocateIn) throws BSDMResourceException
  {
    allocate (null, payAllocateIn);
  }
  /**
   * Allocate a Payment from the Suspense Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param payAllocateIn Input  Object.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("allocate")
@Consumes({"application/json","application/xml"})

 public void allocate (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData payAllocateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentAllocateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payAllocateIn != null) PaymentObjectHelper.toMap (payAllocateIn, record, "Payment");
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

  private BSDMInteractionSpec _PaymentAmountConvertSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param charge_type.
   * @param conversion_date (null is allowed).
   * @param currency_code.
   * @param exrate_class.
   * @param external_amount.
   * @param external_currency.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger amountConvert (Integer charge_type, Date conversion_date, Integer currency_code, Integer exrate_class, BigInteger external_amount, Integer external_currency) throws BSDMResourceException
  {
    return amountConvert (null, charge_type, conversion_date, currency_code, exrate_class, external_amount, external_currency);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param charge_type.
   * @param conversion_date (null is allowed).
   * @param currency_code.
   * @param exrate_class.
   * @param external_amount.
   * @param external_currency.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("amountConvert")
@Produces({"application/json","application/xml"})
  public BigInteger amountConvert (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("charge_type")Integer charge_type,@QueryParam("conversion_date")Date conversion_date,@QueryParam("currency_code")Integer currency_code,@QueryParam("exrate_class")Integer exrate_class,@QueryParam("external_amount")BigInteger external_amount,@QueryParam("external_currency")Integer external_currency) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentAmountConvertSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (charge_type != null) record.put ("ChargeType", charge_type);

      if (conversion_date != null) record.put ("ConversionDate", conversion_date);

      if (currency_code != null) record.put ("CurrencyCode", currency_code);

      if (exrate_class != null) record.put ("ExrateClass", exrate_class);

      if (external_amount != null) record.put ("ExternalAmount", external_amount);

      if (external_currency != null) record.put ("ExternalCurrency", external_currency);
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
Object _tmp = record.get ("TransAmount");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _PaymentDebitAssumedSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payDebitAssumedIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectData debitAssumed (PaymentObjectData payDebitAssumedIn1) throws BSDMResourceException
  {
    return debitAssumed (null, payDebitAssumedIn1);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payDebitAssumedIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("debitAssumed")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentTransObjectData debitAssumed (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData payDebitAssumedIn1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentDebitAssumedSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payDebitAssumedIn1 != null) PaymentObjectHelper.toMap (payDebitAssumedIn1, record, "Payment");
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
return PaymentTransObjectHelper.fromMap (record, "PaymentTrans");
}

  private BSDMInteractionSpec _PaymentCreditSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payCreditIn1 Input  Object.
   * @param _payment_Trans Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectData credit (PaymentObjectData payCreditIn1, PaymentTransObjectData _payment_Trans) throws BSDMResourceException
  {
    return credit (null, payCreditIn1, _payment_Trans);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreditIn1 Input  Object.
   * @param _payment_Trans Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("credit")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentTransObjectData credit (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData payCreditIn1,@FormParam("PaymentTransObject")PaymentTransObjectData _payment_Trans) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentCreditSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payCreditIn1 != null) PaymentObjectHelper.toMap (payCreditIn1, record, "Payment");
      if (_payment_Trans != null) PaymentTransObjectHelper.toMap (_payment_Trans, record, "PaymentTrans");
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
return PaymentTransObjectHelper.fromMap (record, "PaymentTrans");
}

  private BSDMInteractionSpec _PaymentValidateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param payValidateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectData validate (PaymentObjectData payValidateIn1) throws BSDMResourceException
  {
    return validate (null, payValidateIn1);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param payValidateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("validate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentTransObjectData validate (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData payValidateIn1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentValidateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (payValidateIn1 != null) PaymentObjectHelper.toMap (payValidateIn1, record, "Payment");
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
return PaymentTransObjectHelper.fromMap (record, "PaymentTrans");
}

  private BSDMInteractionSpec _PaymentCreatePendingSpec = null;
  /**
   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .
   * Convenience method using default BSDMSessionContext.
   * @param paypendingCreateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectData createPending (PaymentObjectData paypendingCreateIn1) throws BSDMResourceException
  {
    return createPending (null, paypendingCreateIn1);
  }
  /**
   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypendingCreateIn1 Input  Object.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("createPending")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentTransObjectData createPending (@HeaderParam ("context")BSDMSessionContext context,PaymentObjectData paypendingCreateIn1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentCreatePendingSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (paypendingCreateIn1 != null) PaymentObjectHelper.toMap (paypendingCreateIn1, record, "Payment");
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
return PaymentTransObjectHelper.fromMap (record, "PaymentTrans");
}

  private BSDMInteractionSpec _PaymentCompletePendingSpec = null;
  /**
   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .
   * Convenience method using default BSDMSessionContext.
   * @param paypndcmp_tracking_id.
   * @param paypndcmp_tracking_id_serv.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentObjectData completePending (Integer paypndcmp_tracking_id, Integer paypndcmp_tracking_id_serv) throws BSDMResourceException
  {
    return completePending (null, paypndcmp_tracking_id, paypndcmp_tracking_id_serv);
  }
  /**
   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcmp_tracking_id.
   * @param paypndcmp_tracking_id_serv.
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("completePending")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentObjectData completePending (@HeaderParam ("context")BSDMSessionContext context,Integer paypndcmp_tracking_id,@FormParam("paypndcmp_tracking_id_serv")Integer paypndcmp_tracking_id_serv) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentCompletePendingSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (paypndcmp_tracking_id != null) record.put ("PaypndcmpTrackingId", paypndcmp_tracking_id);

      if (paypndcmp_tracking_id_serv != null) record.put ("PaypndcmpTrackingIdServ", paypndcmp_tracking_id_serv);
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
return PaymentObjectHelper.fromMap (record, "Payment");
}

  private BSDMInteractionSpec _PaymentCancelPendingSpec = null;
  /**
   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .
   * Convenience method using default BSDMSessionContext.
   * @param paypndcnl_tracking_id.
   * @param paypndcnl_tracking_id_serv.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentTransObjectData cancelPending (Integer paypndcnl_tracking_id, Integer paypndcnl_tracking_id_serv) throws BSDMResourceException
  {
    return cancelPending (null, paypndcnl_tracking_id, paypndcnl_tracking_id_serv);
  }
  /**
   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcnl_tracking_id.
   * @param paypndcnl_tracking_id_serv.
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("cancelPending")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentTransObjectData cancelPending (@HeaderParam ("context")BSDMSessionContext context,Integer paypndcnl_tracking_id,@FormParam("paypndcnl_tracking_id_serv")Integer paypndcnl_tracking_id_serv) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentCancelPendingSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (paypndcnl_tracking_id != null) record.put ("PaypndcnlTrackingId", paypndcnl_tracking_id);

      if (paypndcnl_tracking_id_serv != null) record.put ("PaypndcnlTrackingIdServ", paypndcnl_tracking_id_serv);
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
return PaymentTransObjectHelper.fromMap (record, "PaymentTrans");
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param getIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectData get (PaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, getIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectData get (BSDMSessionContext context, PaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(getIn, defaultAction);
       
     cManager.checkConstraints(getIn, constraintAction);
       return get (context, getIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param findIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectDataList find (PaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, findIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectDataList find (BSDMSessionContext context, PaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findIn, defaultAction);
       
     cManager.checkConstraints(findIn, constraintAction);
       return find (context, findIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param nbfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectDataList noBackoutFind (PaymentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return noBackoutFind (null, nbfindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectDataList noBackoutFind (BSDMSessionContext context, PaymentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(nbfindIn, defaultAction);
       
     cManager.checkConstraints(nbfindIn, constraintAction);
       return noBackoutFind (context, nbfindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param findCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (PaymentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, findCountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, PaymentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findCountIn, defaultAction);
       
     cManager.checkConstraints(findCountIn, constraintAction);
       return findCount (context, findCountIn);
  }

  /**

   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..

   * Convenience method using default BSDMSessionContext.

   * @param payCreateIn1 Input  Object.

   * @param WaiveEpg (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectData create (PaymentObjectData payCreateIn1, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, payCreateIn1, WaiveEpg, defaultAction, constraintAction);
  }
  /** 
   * PaymentCreate creates a new Payment.  New version will no longer create an entry in PAYMENT_PROFILE.  You must first call PaymentProfileCreate, if necessary..
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreateIn1 Input  Object.
   * @param WaiveEpg (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectData create (BSDMSessionContext context, PaymentObjectData payCreateIn1, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payCreateIn1, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(payCreateIn1, constraintAction);
       
    //Constraints not supported on Input-Column
return create (context, payCreateIn1, WaiveEpg);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payUpdateIn1 Input  Object.

   * @param _WaiveEpg (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectData update (PaymentObjectData payUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, payUpdateIn1, _WaiveEpg, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectData update (BSDMSessionContext context, PaymentObjectData payUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payUpdateIn1, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(payUpdateIn1, constraintAction);
       
    //Constraints not supported on Input-Column
return update (context, payUpdateIn1, _WaiveEpg);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payXferIn Input Object Key.

   * @param account_external_id.

   * @param account_external_id_type.

   * @param bill_ref_no.

   * @param bill_ref_resets.

   * @param open_item_id.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectData transfer (PaymentObjectKeyData payXferIn, String account_external_id, Integer account_external_id_type, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return transfer (null, payXferIn, account_external_id, account_external_id_type, bill_ref_no, bill_ref_resets, open_item_id, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payXferIn Input Object Key.
   * @param account_external_id.
   * @param account_external_id_type.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectData transfer (BSDMSessionContext context, PaymentObjectKeyData payXferIn, String account_external_id, Integer account_external_id_type, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payXferIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(payXferIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return transfer (context, payXferIn, account_external_id, account_external_id_type, bill_ref_no, bill_ref_resets, open_item_id);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payReverseIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectData reverse (PaymentObjectData payReverseIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return reverse (null, payReverseIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payReverseIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectData reverse (BSDMSessionContext context, PaymentObjectData payReverseIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payReverseIn, defaultAction);
       
     cManager.checkConstraints(payReverseIn, constraintAction);
       return reverse (context, payReverseIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void delete (PaymentObjectKeyData payDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    delete (null, payDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void delete (BSDMSessionContext context, PaymentObjectKeyData payDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payDeleteIn, defaultAction);
       
     cManager.checkConstraints(payDeleteIn, constraintAction);
       delete (context, payDeleteIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payCountIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer count (PaymentObjectData payCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return count (null, payCountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payCountIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer count (BSDMSessionContext context, PaymentObjectData payCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payCountIn, defaultAction);
       
     cManager.checkConstraints(payCountIn, constraintAction);
       return count (context, payCountIn);
  }

  /**

   * Allocate a Payment from the Suspense Account..

   * Convenience method using default BSDMSessionContext.

   * @param payAllocateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void allocate (PaymentObjectData payAllocateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    allocate (null, payAllocateIn, defaultAction, constraintAction);
  }
  /** 
   * Allocate a Payment from the Suspense Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param payAllocateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void allocate (BSDMSessionContext context, PaymentObjectData payAllocateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payAllocateIn, defaultAction);
       
     cManager.checkConstraints(payAllocateIn, constraintAction);
       allocate (context, payAllocateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param charge_type.

   * @param conversion_date (null is allowed).

   * @param currency_code.

   * @param exrate_class.

   * @param external_amount.

   * @param external_currency.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger amountConvert (Integer charge_type, Date conversion_date, Integer currency_code, Integer exrate_class, BigInteger external_amount, Integer external_currency, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return amountConvert (null, charge_type, conversion_date, currency_code, exrate_class, external_amount, external_currency, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param charge_type.
   * @param conversion_date (null is allowed).
   * @param currency_code.
   * @param exrate_class.
   * @param external_amount.
   * @param external_currency.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger amountConvert (BSDMSessionContext context, Integer charge_type, Date conversion_date, Integer currency_code, Integer exrate_class, BigInteger external_amount, Integer external_currency, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return amountConvert (context, charge_type, conversion_date, currency_code, exrate_class, external_amount, external_currency);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payDebitAssumedIn1 Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectData debitAssumed (PaymentObjectData payDebitAssumedIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return debitAssumed (null, payDebitAssumedIn1, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payDebitAssumedIn1 Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectData debitAssumed (BSDMSessionContext context, PaymentObjectData payDebitAssumedIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payDebitAssumedIn1, defaultAction);
       
     cManager.checkConstraints(payDebitAssumedIn1, constraintAction);
       return debitAssumed (context, payDebitAssumedIn1);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payCreditIn1 Input  Object.

   * @param _payment_Trans Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectData credit (PaymentObjectData payCreditIn1, PaymentTransObjectData _payment_Trans, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return credit (null, payCreditIn1, _payment_Trans, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payCreditIn1 Input  Object.
   * @param _payment_Trans Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectData credit (BSDMSessionContext context, PaymentObjectData payCreditIn1, PaymentTransObjectData _payment_Trans, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payCreditIn1, defaultAction);
       
     dManager.setObjectDefaults(_payment_Trans, defaultAction);
       
     cManager.checkConstraints(payCreditIn1, constraintAction);
       
     cManager.checkConstraints(_payment_Trans, constraintAction);
       return credit (context, payCreditIn1, _payment_Trans);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param payValidateIn1 Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectData validate (PaymentObjectData payValidateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return validate (null, payValidateIn1, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param payValidateIn1 Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectData validate (BSDMSessionContext context, PaymentObjectData payValidateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(payValidateIn1, defaultAction);
       
     cManager.checkConstraints(payValidateIn1, constraintAction);
       return validate (context, payValidateIn1);
  }

  /**

   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .

   * Convenience method using default BSDMSessionContext.

   * @param paypendingCreateIn1 Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectData createPending (PaymentObjectData paypendingCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return createPending (null, paypendingCreateIn1, defaultAction, constraintAction);
  }
  /** 
   * PaymentCreatePending creates an authorization of a pending Payment. It creates a row in PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypendingCreateIn1 Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectData createPending (BSDMSessionContext context, PaymentObjectData paypendingCreateIn1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(paypendingCreateIn1, defaultAction);
       
     cManager.checkConstraints(paypendingCreateIn1, constraintAction);
       return createPending (context, paypendingCreateIn1);
  }

  /**

   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .

   * Convenience method using default BSDMSessionContext.

   * @param paypndcmp_tracking_id.

   * @param paypndcmp_tracking_id_serv.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentObjectData completePending (Integer paypndcmp_tracking_id, Integer paypndcmp_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return completePending (null, paypndcmp_tracking_id, paypndcmp_tracking_id_serv, defaultAction, constraintAction);
  }
  /** 
   * PaymentCompletePending completes a pending Payment. It creates a row in BMF. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcmp_tracking_id.
   * @param paypndcmp_tracking_id_serv.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentObjectData completePending (BSDMSessionContext context, Integer paypndcmp_tracking_id, Integer paypndcmp_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return completePending (context, paypndcmp_tracking_id, paypndcmp_tracking_id_serv);
  }

  /**

   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .

   * Convenience method using default BSDMSessionContext.

   * @param paypndcnl_tracking_id.

   * @param paypndcnl_tracking_id_serv.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentTransObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentTransObjectData cancelPending (Integer paypndcnl_tracking_id, Integer paypndcnl_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return cancelPending (null, paypndcnl_tracking_id, paypndcnl_tracking_id_serv, defaultAction, constraintAction);
  }
  /** 
   * PaymentCancelPending cancels a pending Payment, updates PAYMENT_TRANS. .
   * @param context The session context to use when connecting to the APITS server.
   * @param paypndcnl_tracking_id.
   * @param paypndcnl_tracking_id_serv.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentTransObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentTransObjectData cancelPending (BSDMSessionContext context, Integer paypndcnl_tracking_id, Integer paypndcnl_tracking_id_serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return cancelPending (context, paypndcnl_tracking_id, paypndcnl_tracking_id_serv);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PaymentBean ()
  {
    try
    {
      _PaymentGetSpec = new BSDMInteractionSpec("PaymentGet", ApiMappings.getCallName ("PaymentGet"), Boolean.TRUE);

      _PaymentFindSpec = new BSDMInteractionSpec("PaymentFind", ApiMappings.getCallName ("PaymentFind"), Boolean.TRUE);

      _PaymentNoBackoutFindSpec = new BSDMInteractionSpec("PaymentNoBackoutFind", ApiMappings.getCallName ("PaymentNoBackoutFind"), Boolean.TRUE);

      _PaymentFindCountSpec = new BSDMInteractionSpec("PaymentFindCount", ApiMappings.getCallName ("PaymentFindCount"), Boolean.TRUE);

      _PaymentCreateSpec = new BSDMInteractionSpec("PaymentCreate", ApiMappings.getCallName ("PaymentCreate"), Boolean.TRUE);

      _PaymentUpdateSpec = new BSDMInteractionSpec("PaymentUpdate", ApiMappings.getCallName ("PaymentUpdate"), Boolean.TRUE);

      _PaymentTransferSpec = new BSDMInteractionSpec("PaymentTransfer", ApiMappings.getCallName ("PaymentTransfer"), Boolean.TRUE);

      _PaymentReverseSpec = new BSDMInteractionSpec("PaymentReverse", ApiMappings.getCallName ("PaymentReverse"), Boolean.TRUE);

      _PaymentDeleteSpec = new BSDMInteractionSpec("PaymentDelete", ApiMappings.getCallName ("PaymentDelete"), Boolean.TRUE);

      _PaymentCountSpec = new BSDMInteractionSpec("PaymentCount", ApiMappings.getCallName ("PaymentCount"), Boolean.TRUE);

      _PaymentAllocateSpec = new BSDMInteractionSpec("PaymentAllocate", ApiMappings.getCallName ("PaymentAllocate"), Boolean.TRUE);

      _PaymentAmountConvertSpec = new BSDMInteractionSpec("PaymentAmountConvert", ApiMappings.getCallName ("PaymentAmountConvert"), Boolean.TRUE);

      _PaymentDebitAssumedSpec = new BSDMInteractionSpec("PaymentDebitAssumed", ApiMappings.getCallName ("PaymentDebitAssumed"), Boolean.TRUE);

      _PaymentCreditSpec = new BSDMInteractionSpec("PaymentCredit", ApiMappings.getCallName ("PaymentCredit"), Boolean.TRUE);

      _PaymentValidateSpec = new BSDMInteractionSpec("PaymentValidate", ApiMappings.getCallName ("PaymentValidate"), Boolean.TRUE);

      _PaymentCreatePendingSpec = new BSDMInteractionSpec("PaymentCreatePending", ApiMappings.getCallName ("PaymentCreatePending"), Boolean.TRUE);

      _PaymentCompletePendingSpec = new BSDMInteractionSpec("PaymentCompletePending", ApiMappings.getCallName ("PaymentCompletePending"), Boolean.TRUE);

      _PaymentCancelPendingSpec = new BSDMInteractionSpec("PaymentCancelPending", ApiMappings.getCallName ("PaymentCancelPending"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PaymentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PaymentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
