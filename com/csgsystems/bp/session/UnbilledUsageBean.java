
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: UnbilledUsageBean.java
 * Definition File: Customer/UnbilledUsage.xml
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
import com.csgsystems.bp.interfaces.UnbilledUsageInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="UnbilledUsageSessionBean"
 * display-name="UnbilledUsage Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/UnbilledUsageBean"
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

@Stateless(name="UnbilledUsageBean", mappedName = "UnbilledUsage")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("UnbilledUsages")

public class UnbilledUsageBean implements UnbilledUsageInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _UnbilledUsageGetSpec = null;
  /**
   * Get a unique UnbilledUsage row..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagegetIn Input Object Key.
   * @return UnbilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnbilledUsageObjectData get (UnbilledUsageObjectKeyData UnbilledUsagegetIn) throws BSDMResourceException
  {
    return get (null, UnbilledUsagegetIn);
  }
  /**
   * Get a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagegetIn Input Object Key.
   * @return UnbilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public UnbilledUsageObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam UnbilledUsageObjectKeyData UnbilledUsagegetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsagegetIn != null) UnbilledUsageObjectKeyHelper.toMap (UnbilledUsagegetIn, record, "UnbilledUsage");
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
return UnbilledUsageObjectHelper.fromMap (record, "UnbilledUsage");
}

  private BSDMInteractionSpec _UnbilledUsageFindSpec = null;
  /**
   * Find UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnbilledUsageObjectDataList find (UnbilledUsageObjectFilter UnbilledUsagefindIn) throws BSDMResourceException
  {
    return find (null, UnbilledUsagefindIn);
  }
  /**
   * Find UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public UnbilledUsageObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectFilter UnbilledUsagefindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsagefindIn != null) UnbilledUsageObjectHelper.toMap (UnbilledUsagefindIn, record, "UnbilledUsage");
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
return UnbilledUsageObjectHelper.fromMapList (record, "UnbilledUsageList");
}

  private BSDMInteractionSpec _UnbilledUsageFindCountSpec = null;
  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (UnbilledUsageObjectFilter UnbilledUsagefindCountIn) throws BSDMResourceException
  {
    return findCount (null, UnbilledUsagefindCountIn);
  }
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectFilter UnbilledUsagefindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsagefindCountIn != null) UnbilledUsageObjectHelper.toMap (UnbilledUsagefindCountIn, record, "UnbilledUsage");
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

  private BSDMInteractionSpec _UnbilledUsageByAccountFindSpec = null;
  /**
   * Find UnbilledUsage by Account..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAcctfindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnbilledUsageObjectDataList byAccountFind (UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn) throws BSDMResourceException
  {
    return byAccountFind (null, UnbilledUsageAcctfindIn);
  }
  /**
   * Find UnbilledUsage by Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAcctfindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public UnbilledUsageObjectDataList byAccountFind (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageByAccountFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageAcctfindIn != null) UnbilledUsageAccountObjectHelper.toMap (UnbilledUsageAcctfindIn, record, "UnbilledUsage");
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
return UnbilledUsageObjectHelper.fromMapList (record, "UnbilledUsageList");
}

  private BSDMInteractionSpec _UnbilledUsageByAccountFindCountSpec = null;
  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAccountfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer byAccountFindCount (UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn) throws BSDMResourceException
  {
    return byAccountFindCount (null, UnbilledUsageAccountfindCountIn);
  }
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAccountfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountFindCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer byAccountFindCount (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageByAccountFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageAccountfindCountIn != null) UnbilledUsageAccountObjectHelper.toMap (UnbilledUsageAccountfindCountIn, record, "UnbilledUsage");
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

  private BSDMInteractionSpec _UnbilledUsageByServiceFindSpec = null;
  /**
   * Find UnbilledUsage by Service..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageServicefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnbilledUsageObjectDataList byServiceFind (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn) throws BSDMResourceException
  {
    return byServiceFind (null, UnbilledUsageServicefindIn);
  }
  /**
   * Find UnbilledUsage by Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindIn Input Filter Object.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byServiceFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public UnbilledUsageObjectDataList byServiceFind (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageByServiceFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageServicefindIn != null) UnbilledUsageServiceObjectHelper.toMap (UnbilledUsageServicefindIn, record, "UnbilledUsage");
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
return UnbilledUsageObjectHelper.fromMapList (record, "UnbilledUsageList");
}

  private BSDMInteractionSpec _UnbilledUsageByServiceFindCountSpec = null;
  /**
   * Find Count of UnbilledUsage..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageServicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer byServiceFindCount (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn) throws BSDMResourceException
  {
    return byServiceFindCount (null, UnbilledUsageServicefindCountIn);
  }
  /**
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byServiceFindCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer byServiceFindCount (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageByServiceFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageServicefindCountIn != null) UnbilledUsageServiceObjectHelper.toMap (UnbilledUsageServicefindCountIn, record, "UnbilledUsage");
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

  private BSDMInteractionSpec _UnbilledUsageAdjustSpec = null;
  /**
   * Adjust a unique UnbilledUsage row..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData adjust (UnbilledUsageObjectData UnbilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber) throws BSDMResourceException
  {
    return adjust (null, UnbilledUsageAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber);
  }
  /**
   * Adjust a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("adjust")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData adjust (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectData UnbilledUsageAdjustIn,@FormParam("TransCode")Integer TransCode,@FormParam("AdjReasonCode")Integer AdjReasonCode,@FormParam("RequestStatus")Integer RequestStatus,@FormParam("FraudIndicator")Integer FraudIndicator,@FormParam("Annotation")String Annotation,@FormParam("PrimaryUnitsType")Integer PrimaryUnitsType,@FormParam("PrimaryUnits")BigInteger PrimaryUnits,@FormParam("Amount")BigInteger Amount,@FormParam("BillOrderNumber")String BillOrderNumber) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageAdjustSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageAdjustIn != null) UnbilledUsageObjectHelper.toMap (UnbilledUsageAdjustIn, record, "UnbilledUsage");

      if (TransCode != null) record.put ("TransCode", TransCode);

      if (AdjReasonCode != null) record.put ("AdjReasonCode", AdjReasonCode);

      if (RequestStatus != null) record.put ("RequestStatus", RequestStatus);

      if (FraudIndicator != null) record.put ("FraudIndicator", FraudIndicator);

      if (Annotation != null) record.put ("Annotation", Annotation);

      if (PrimaryUnitsType != null) record.put ("PrimaryUnitsType", PrimaryUnitsType);

      if (PrimaryUnits != null) record.put ("PrimaryUnits", PrimaryUnits);

      if (Amount != null) record.put ("Amount", Amount);

      if (BillOrderNumber != null) record.put ("BillOrderNumber", BillOrderNumber);
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _UnbilledUsageTotalSpec = null;
  /**
   * Retreive the total unbilled usage for an Account/Service.  .
   * Convenience method using default BSDMSessionContext.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param ServiceExternalId (null is allowed).
   * @param ServiceExternalIdType (null is allowed).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger total (String AccountExternalId, Integer AccountExternalIdType, String ServiceExternalId, Integer ServiceExternalIdType) throws BSDMResourceException
  {
    return total (null, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType);
  }
  /**
   * Retreive the total unbilled usage for an Account/Service.  .
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param ServiceExternalId (null is allowed).
   * @param ServiceExternalIdType (null is allowed).
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("total")
@Produces({"application/json","application/xml"})
  public BigInteger total (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("AccountExternalId")String AccountExternalId,@QueryParam("AccountExternalIdType")Integer AccountExternalIdType,@QueryParam("ServiceExternalId")String ServiceExternalId,@QueryParam("ServiceExternalIdType")Integer ServiceExternalIdType) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageTotalSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (AccountExternalId != null) record.put ("AccountExternalId", AccountExternalId);

      if (AccountExternalIdType != null) record.put ("AccountExternalIdType", AccountExternalIdType);

      if (ServiceExternalId != null) record.put ("ServiceExternalId", ServiceExternalId);

      if (ServiceExternalIdType != null) record.put ("ServiceExternalIdType", ServiceExternalIdType);
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
Object _tmp = record.get ("Total");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _UnbilledUsageAmountGetSpec = null;
  /**
   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageAmountIn Input Object Key.
   * @return UnbilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnbilledUsageAmountObjectData amountGet (UnbilledUsageObjectKeyData UnbilledUsageAmountIn) throws BSDMResourceException
  {
    return amountGet (null, UnbilledUsageAmountIn);
  }
  /**
   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAmountIn Input Object Key.
   * @return UnbilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("amountGet")
@Produces({"application/json","application/xml"})
  public UnbilledUsageAmountObjectData amountGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam UnbilledUsageObjectKeyData UnbilledUsageAmountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageAmountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageAmountIn != null) UnbilledUsageObjectKeyHelper.toMap (UnbilledUsageAmountIn, record, "UnbilledUsage");
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
return UnbilledUsageAmountObjectHelper.fromMap (record, "UnbilledUsageAmount");
}

  private BSDMInteractionSpec _UnbilledUsageFindFastSpec = null;
  /**
   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnbilledUsageObjectDataList findFast (UnbilledUsageObjectFilter UnbilledUsageffindIn) throws BSDMResourceException
  {
    return findFast (null, UnbilledUsageffindIn);
  }
  /**
   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findFast")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public UnbilledUsageObjectDataList findFast (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectFilter UnbilledUsageffindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageFindFastSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageffindIn != null) UnbilledUsageObjectHelper.toMap (UnbilledUsageffindIn, record, "UnbilledUsage");
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
return UnbilledUsageObjectHelper.fromMapList (record, "UnbilledUsageList");
}

  private BSDMInteractionSpec _UnbilledUsageFindFastCountSpec = null;
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findFastCount (UnbilledUsageObjectFilter UnbilledUsageffindCountIn) throws BSDMResourceException
  {
    return findFastCount (null, UnbilledUsageffindCountIn);
  }
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findFastCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findFastCount (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectFilter UnbilledUsageffindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageFindFastCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsageffindCountIn != null) UnbilledUsageObjectHelper.toMap (UnbilledUsageffindCountIn, record, "UnbilledUsage");
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

  private BSDMInteractionSpec _UnbilledUsageFindSummarySpec = null;
  /**
   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public UnbilledUsageObjectDataList findSummary (UnbilledUsageObjectFilter UnbilledUsagesfindIn) throws BSDMResourceException
  {
    return findSummary (null, UnbilledUsagesfindIn);
  }
  /**
   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findSummary")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public UnbilledUsageObjectDataList findSummary (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectFilter UnbilledUsagesfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageFindSummarySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsagesfindIn != null) UnbilledUsageObjectHelper.toMap (UnbilledUsagesfindIn, record, "UnbilledUsage");
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
return UnbilledUsageObjectHelper.fromMapList (record, "UnbilledUsageList");
}

  private BSDMInteractionSpec _UnbilledUsageFindSummaryCountSpec = null;
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..
   * Convenience method using default BSDMSessionContext.
   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findSummaryCount (UnbilledUsageObjectFilter UnbilledUsagesfindCountIn) throws BSDMResourceException
  {
    return findSummaryCount (null, UnbilledUsagesfindCountIn);
  }
  /**
   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findSummaryCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findSummaryCount (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectFilter UnbilledUsagesfindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_UnbilledUsageFindSummaryCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (UnbilledUsagesfindCountIn != null) UnbilledUsageObjectHelper.toMap (UnbilledUsagesfindCountIn, record, "UnbilledUsage");
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

  /**

   * Get a unique UnbilledUsage row..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsagegetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnbilledUsageObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnbilledUsageObjectData get (UnbilledUsageObjectKeyData UnbilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, UnbilledUsagegetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagegetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnbilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnbilledUsageObjectData get (BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsagegetIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsagegetIn, constraintAction);
       return get (context, UnbilledUsagegetIn);
  }

  /**

   * Find UnbilledUsage..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsagefindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnbilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnbilledUsageObjectDataList find (UnbilledUsageObjectFilter UnbilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, UnbilledUsagefindIn, defaultAction, constraintAction);
  }
  /** 
   * Find UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnbilledUsageObjectDataList find (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsagefindIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsagefindIn, constraintAction);
       return find (context, UnbilledUsagefindIn);
  }

  /**

   * Find Count of UnbilledUsage..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsagefindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (UnbilledUsageObjectFilter UnbilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, UnbilledUsagefindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagefindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsagefindCountIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsagefindCountIn, constraintAction);
       return findCount (context, UnbilledUsagefindCountIn);
  }

  /**

   * Find UnbilledUsage by Account..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageAcctfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnbilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnbilledUsageObjectDataList byAccountFind (UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountFind (null, UnbilledUsageAcctfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find UnbilledUsage by Account..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAcctfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnbilledUsageObjectDataList byAccountFind (BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageAcctfindIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsageAcctfindIn, constraintAction);
       return byAccountFind (context, UnbilledUsageAcctfindIn);
  }

  /**

   * Find Count of UnbilledUsage..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageAccountfindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer byAccountFindCount (UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountFindCount (null, UnbilledUsageAccountfindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAccountfindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer byAccountFindCount (BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageAccountfindCountIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsageAccountfindCountIn, constraintAction);
       return byAccountFindCount (context, UnbilledUsageAccountfindCountIn);
  }

  /**

   * Find UnbilledUsage by Service..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageServicefindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnbilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnbilledUsageObjectDataList byServiceFind (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byServiceFind (null, UnbilledUsageServicefindIn, defaultAction, constraintAction);
  }
  /** 
   * Find UnbilledUsage by Service..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnbilledUsageObjectDataList byServiceFind (BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageServicefindIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsageServicefindIn, constraintAction);
       return byServiceFind (context, UnbilledUsageServicefindIn);
  }

  /**

   * Find Count of UnbilledUsage..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageServicefindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer byServiceFindCount (UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byServiceFindCount (null, UnbilledUsageServicefindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find Count of UnbilledUsage..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageServicefindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer byServiceFindCount (BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageServicefindCountIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsageServicefindCountIn, constraintAction);
       return byServiceFindCount (context, UnbilledUsageServicefindCountIn);
  }

  /**

   * Adjust a unique UnbilledUsage row..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.

   * @param TransCode.

   * @param AdjReasonCode.

   * @param RequestStatus.

   * @param FraudIndicator.

   * @param Annotation (null is allowed).

   * @param PrimaryUnitsType.

   * @param PrimaryUnits.

   * @param Amount.

   * @param BillOrderNumber (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData adjust (UnbilledUsageObjectData UnbilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return adjust (null, UnbilledUsageAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber, defaultAction, constraintAction);
  }
  /** 
   * Adjust a unique UnbilledUsage row..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
   * @param TransCode.
   * @param AdjReasonCode.
   * @param RequestStatus.
   * @param FraudIndicator.
   * @param Annotation (null is allowed).
   * @param PrimaryUnitsType.
   * @param PrimaryUnits.
   * @param Amount.
   * @param BillOrderNumber (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData adjust (BSDMSessionContext context, UnbilledUsageObjectData UnbilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageAdjustIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(UnbilledUsageAdjustIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return adjust (context, UnbilledUsageAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber);
  }

  /**

   * Retreive the total unbilled usage for an Account/Service.  .

   * Convenience method using default BSDMSessionContext.

   * @param AccountExternalId.

   * @param AccountExternalIdType.

   * @param ServiceExternalId (null is allowed).

   * @param ServiceExternalIdType (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger total (String AccountExternalId, Integer AccountExternalIdType, String ServiceExternalId, Integer ServiceExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return total (null, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, defaultAction, constraintAction);
  }
  /** 
   * Retreive the total unbilled usage for an Account/Service.  .
   * @param context The session context to use when connecting to the APITS server.
   * @param AccountExternalId.
   * @param AccountExternalIdType.
   * @param ServiceExternalId (null is allowed).
   * @param ServiceExternalIdType (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger total (BSDMSessionContext context, String AccountExternalId, Integer AccountExternalIdType, String ServiceExternalId, Integer ServiceExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return total (context, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType);
  }

  /**

   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageAmountIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnbilledUsageAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnbilledUsageAmountObjectData amountGet (UnbilledUsageObjectKeyData UnbilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return amountGet (null, UnbilledUsageAmountIn, defaultAction, constraintAction);
  }
  /** 
   * Given an UnbilledUsage key the AdjustmentEligibleAmount and Tax are calculated and returned. The following two objects are used to calculate the AdjustmentEligibleAmount and Tax: UnbilledUsage and Adjustment. .
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageAmountIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnbilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnbilledUsageAmountObjectData amountGet (BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageAmountIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsageAmountIn, constraintAction);
       return amountGet (context, UnbilledUsageAmountIn);
  }

  /**

   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnbilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnbilledUsageObjectDataList findFast (UnbilledUsageObjectFilter UnbilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findFast (null, UnbilledUsageffindIn, defaultAction, constraintAction);
  }
  /** 
   * Find UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFind, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnbilledUsageObjectDataList findFast (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageffindIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsageffindIn, constraintAction);
       return findFast (context, UnbilledUsageffindIn);
  }

  /**

   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findFastCount (UnbilledUsageObjectFilter UnbilledUsageffindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findFastCount (null, UnbilledUsageffindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find Count of UnbilledUsages using only CDR_UNBILLED and CDR_DATA tables.  This is faster than UnbilledUsageFindCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsageffindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findFastCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsageffindCountIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsageffindCountIn, constraintAction);
       return findFastCount (context, UnbilledUsageffindCountIn);
  }

  /**

   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return UnbilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public UnbilledUsageObjectDataList findSummary (UnbilledUsageObjectFilter UnbilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findSummary (null, UnbilledUsagesfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFast, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return UnbilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public UnbilledUsageObjectDataList findSummary (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsagesfindIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsagesfindIn, constraintAction);
       return findSummary (context, UnbilledUsagesfindIn);
  }

  /**

   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..

   * Convenience method using default BSDMSessionContext.

   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findSummaryCount (UnbilledUsageObjectFilter UnbilledUsagesfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findSummaryCount (null, UnbilledUsagesfindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find Count of UnbilledUsages using only CDR_UNBILLED table.  This is faster than UnbilledUsageFindFastCount, but does not return nor filter on as many fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param UnbilledUsagesfindCountIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, PointOrigin, PointTarget, RatedUnits, Amount, AmountReduction.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findSummaryCount (BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(UnbilledUsagesfindCountIn, defaultAction);
       
     cManager.checkConstraints(UnbilledUsagesfindCountIn, constraintAction);
       return findSummaryCount (context, UnbilledUsagesfindCountIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public UnbilledUsageBean ()
  {
    try
    {
      _UnbilledUsageGetSpec = new BSDMInteractionSpec("UnbilledUsageGet", ApiMappings.getCallName ("UnbilledUsageGet"), Boolean.TRUE);

      _UnbilledUsageFindSpec = new BSDMInteractionSpec("UnbilledUsageFind", ApiMappings.getCallName ("UnbilledUsageFind"), Boolean.TRUE);

      _UnbilledUsageFindCountSpec = new BSDMInteractionSpec("UnbilledUsageFindCount", ApiMappings.getCallName ("UnbilledUsageFindCount"), Boolean.TRUE);

      _UnbilledUsageByAccountFindSpec = new BSDMInteractionSpec("UnbilledUsageByAccountFind", ApiMappings.getCallName ("UnbilledUsageByAccountFind"), Boolean.TRUE);

      _UnbilledUsageByAccountFindCountSpec = new BSDMInteractionSpec("UnbilledUsageByAccountFindCount", ApiMappings.getCallName ("UnbilledUsageByAccountFindCount"), Boolean.TRUE);

      _UnbilledUsageByServiceFindSpec = new BSDMInteractionSpec("UnbilledUsageByServiceFind", ApiMappings.getCallName ("UnbilledUsageByServiceFind"), Boolean.TRUE);

      _UnbilledUsageByServiceFindCountSpec = new BSDMInteractionSpec("UnbilledUsageByServiceFindCount", ApiMappings.getCallName ("UnbilledUsageByServiceFindCount"), Boolean.TRUE);

      _UnbilledUsageAdjustSpec = new BSDMInteractionSpec("UnbilledUsageAdjust", ApiMappings.getCallName ("UnbilledUsageAdjust"), Boolean.TRUE);

      _UnbilledUsageTotalSpec = new BSDMInteractionSpec("UnbilledUsageTotal", ApiMappings.getCallName ("UnbilledUsageTotal"), Boolean.TRUE);

      _UnbilledUsageAmountGetSpec = new BSDMInteractionSpec("UnbilledUsageAmountGet", ApiMappings.getCallName ("UnbilledUsageAmountGet"), Boolean.TRUE);

      _UnbilledUsageFindFastSpec = new BSDMInteractionSpec("UnbilledUsageFindFast", ApiMappings.getCallName ("UnbilledUsageFindFast"), Boolean.TRUE);

      _UnbilledUsageFindFastCountSpec = new BSDMInteractionSpec("UnbilledUsageFindFastCount", ApiMappings.getCallName ("UnbilledUsageFindFastCount"), Boolean.TRUE);

      _UnbilledUsageFindSummarySpec = new BSDMInteractionSpec("UnbilledUsageFindSummary", ApiMappings.getCallName ("UnbilledUsageFindSummary"), Boolean.TRUE);

      _UnbilledUsageFindSummaryCountSpec = new BSDMInteractionSpec("UnbilledUsageFindSummaryCount", ApiMappings.getCallName ("UnbilledUsageFindSummaryCount"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public UnbilledUsageBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public UnbilledUsageBean(BSDMSettings settings, BSDMConnectionManager cm)
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
