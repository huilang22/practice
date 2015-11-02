
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BilledUsageBean.java
 * Definition File: Customer/BilledUsage.xml
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
import com.csgsystems.bp.interfaces.BilledUsageInterface;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BilledUsageSessionBean"
 * display-name="BilledUsage Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BilledUsageBean"
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

@Stateless(name="BilledUsageBean", mappedName = "BilledUsage")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BilledUsages")

public class BilledUsageBean implements BilledUsageInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BilledUsageGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagegetIn Input Object Key.
   * @return BilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageObjectData get (BilledUsageObjectKeyData BilledUsagegetIn) throws BSDMResourceException
  {
    return get (null, BilledUsagegetIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagegetIn Input Object Key.
   * @return BilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BilledUsageObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BilledUsageObjectKeyData BilledUsagegetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagegetIn != null) BilledUsageObjectKeyHelper.toMap (BilledUsagegetIn, record, "BilledUsage");
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
return BilledUsageObjectHelper.fromMap (record, "BilledUsage");
}

  private BSDMInteractionSpec _BilledUsageFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindIn Input Filter Object.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageObjectDataList find (BilledUsageObjectFilter BilledUsagefindIn) throws BSDMResourceException
  {
    return find (null, BilledUsagefindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindIn Input Filter Object.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BilledUsageObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BilledUsageObjectFilter BilledUsagefindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagefindIn != null) BilledUsageObjectHelper.toMap (BilledUsagefindIn, record, "BilledUsage");
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
return BilledUsageObjectHelper.fromMapList (record, "BilledUsageList");
}

  private BSDMInteractionSpec _BilledUsageFindCountSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (BilledUsageObjectFilter BilledUsagefindCountIn) throws BSDMResourceException
  {
    return findCount (null, BilledUsagefindCountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,BilledUsageObjectFilter BilledUsagefindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagefindCountIn != null) BilledUsageObjectHelper.toMap (BilledUsagefindCountIn, record, "BilledUsage");
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

  private BSDMInteractionSpec _BilledUsageByAccountFindSpec = null;
  /**
   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageObjectDataList byAccountFind (BilledUsageAccountObjectFilter BilledUsageAccountfindIn, Boolean LatestInvoice) throws BSDMResourceException
  {
    return byAccountFind (null, BilledUsageAccountfindIn, LatestInvoice);
  }
  /**
   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BilledUsageObjectDataList byAccountFind (@HeaderParam ("context")BSDMSessionContext context,BilledUsageAccountObjectFilter BilledUsageAccountfindIn,@FormParam("LatestInvoice")Boolean LatestInvoice) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageByAccountFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsageAccountfindIn != null) BilledUsageAccountObjectHelper.toMap (BilledUsageAccountfindIn, record, "BilledUsage");

      if (LatestInvoice != null) record.put ("LatestInvoice", LatestInvoice);
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
return BilledUsageObjectHelper.fromMapList (record, "BilledUsageList");
}

  private BSDMInteractionSpec _BilledUsageByAccountFindCountSpec = null;
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindAccountCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer byAccountFindCount (BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, Boolean LatestInvoice1) throws BSDMResourceException
  {
    return byAccountFindCount (null, BilledUsagefindAccountCountIn, LatestInvoice1);
  }
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindAccountCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountFindCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer byAccountFindCount (@HeaderParam ("context")BSDMSessionContext context,BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn,@FormParam("LatestInvoice1")Boolean LatestInvoice1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageByAccountFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagefindAccountCountIn != null) BilledUsageAccountObjectHelper.toMap (BilledUsagefindAccountCountIn, record, "BilledUsage");

      if (LatestInvoice1 != null) record.put ("LatestInvoice", LatestInvoice1);
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

  private BSDMInteractionSpec _BilledUsageByServiceFindSpec = null;
  /**
   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageServicefindIn Input Filter Object.
   * @param LatestInvoice2 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageObjectDataList byServiceFind (BilledUsageServiceObjectFilter BilledUsageServicefindIn, Boolean LatestInvoice2) throws BSDMResourceException
  {
    return byServiceFind (null, BilledUsageServicefindIn, LatestInvoice2);
  }
  /**
   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageServicefindIn Input Filter Object.
   * @param LatestInvoice2 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byServiceFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BilledUsageObjectDataList byServiceFind (@HeaderParam ("context")BSDMSessionContext context,BilledUsageServiceObjectFilter BilledUsageServicefindIn,@FormParam("LatestInvoice2")Boolean LatestInvoice2) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageByServiceFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsageServicefindIn != null) BilledUsageServiceObjectHelper.toMap (BilledUsageServicefindIn, record, "BilledUsage");

      if (LatestInvoice2 != null) record.put ("LatestInvoice", LatestInvoice2);
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
return BilledUsageObjectHelper.fromMapList (record, "BilledUsageList");
}

  private BSDMInteractionSpec _BilledUsageByServiceFindCountSpec = null;
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefindServiceCountIn Input Filter Object.
   * @param LatestInvoice3 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer byServiceFindCount (BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, Boolean LatestInvoice3) throws BSDMResourceException
  {
    return byServiceFindCount (null, BilledUsagefindServiceCountIn, LatestInvoice3);
  }
  /**
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindServiceCountIn Input Filter Object.
   * @param LatestInvoice3 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byServiceFindCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer byServiceFindCount (@HeaderParam ("context")BSDMSessionContext context,BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn,@FormParam("LatestInvoice3")Boolean LatestInvoice3) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageByServiceFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagefindServiceCountIn != null) BilledUsageServiceObjectHelper.toMap (BilledUsagefindServiceCountIn, record, "BilledUsage");

      if (LatestInvoice3 != null) record.put ("LatestInvoice", LatestInvoice3);
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

  private BSDMInteractionSpec _BilledUsageByAccountServiceFindSpec = null;
  /**
   * Filters on Invoice, Usage, Service and Account attributes. Ugh..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAcctServicefindIn Input Filter Object.
   * @param LatestInvoice4 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageObjectDataList byAccountServiceFind (BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, Boolean LatestInvoice4) throws BSDMResourceException
  {
    return byAccountServiceFind (null, BilledUsageAcctServicefindIn, LatestInvoice4);
  }
  /**
   * Filters on Invoice, Usage, Service and Account attributes. Ugh..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAcctServicefindIn Input Filter Object.
   * @param LatestInvoice4 (null is allowed) (has a default).
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountServiceFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BilledUsageObjectDataList byAccountServiceFind (@HeaderParam ("context")BSDMSessionContext context,BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn,@FormParam("LatestInvoice4")Boolean LatestInvoice4) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageByAccountServiceFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsageAcctServicefindIn != null) BilledUsageServiceObjectHelper.toMap (BilledUsageAcctServicefindIn, record, "BilledUsage");

      if (LatestInvoice4 != null) record.put ("LatestInvoice4", LatestInvoice4);
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
return BilledUsageObjectHelper.fromMapList (record, "BilledUsageList");
}

  private BSDMInteractionSpec _BilledUsageAdjustSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
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
   
   
  public AdjustmentObjectData adjust (BilledUsageObjectData BilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber) throws BSDMResourceException
  {
    return adjust (null, BilledUsageAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
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
 public AdjustmentObjectData adjust (@HeaderParam ("context")BSDMSessionContext context,BilledUsageObjectData BilledUsageAdjustIn,@FormParam("TransCode")Integer TransCode,@FormParam("AdjReasonCode")Integer AdjReasonCode,@FormParam("RequestStatus")Integer RequestStatus,@FormParam("FraudIndicator")Integer FraudIndicator,@FormParam("Annotation")String Annotation,@FormParam("PrimaryUnitsType")Integer PrimaryUnitsType,@FormParam("PrimaryUnits")BigInteger PrimaryUnits,@FormParam("Amount")BigInteger Amount,@FormParam("BillOrderNumber")String BillOrderNumber) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageAdjustSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsageAdjustIn != null) BilledUsageObjectHelper.toMap (BilledUsageAdjustIn, record, "BilledUsage");

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

  private BSDMInteractionSpec _BilledUsageCalcSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.
   * @return TaxAndDiscountAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public TaxAndDiscountAmountObjectData calc (BilledUsageObjectData BilledUsageCalcIn) throws BSDMResourceException
  {
    return calc (null, BilledUsageCalcIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.
   * @return TaxAndDiscountAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("calc")
@Produces({"application/json","application/xml"})
  public TaxAndDiscountAmountObjectData calc (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BilledUsageObjectData BilledUsageCalcIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageCalcSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsageCalcIn != null) BilledUsageObjectHelper.toMap (BilledUsageCalcIn, record, "BilledUsage");
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
return TaxAndDiscountAmountObjectHelper.fromMap (record, "TaxAndDiscountSummary");
}

  private BSDMInteractionSpec _BilledUsageAmountGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageAmountIn Input Object Key.
   * @return BilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageAmountObjectData amountGet (BilledUsageObjectKeyData BilledUsageAmountIn) throws BSDMResourceException
  {
    return amountGet (null, BilledUsageAmountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAmountIn Input Object Key.
   * @return BilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("amountGet")
@Produces({"application/json","application/xml"})
  public BilledUsageAmountObjectData amountGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BilledUsageObjectKeyData BilledUsageAmountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageAmountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsageAmountIn != null) BilledUsageObjectKeyHelper.toMap (BilledUsageAmountIn, record, "BilledUsage");
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
return BilledUsageAmountObjectHelper.fromMap (record, "BilledUsageAmount");
}

  private BSDMInteractionSpec _BilledUsageFindFastCountSpec = null;
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findFastCount (BilledUsageObjectFilter BilledUsagefcountIn) throws BSDMResourceException
  {
    return findFastCount (null, BilledUsagefcountIn);
  }
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findFastCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findFastCount (@HeaderParam ("context")BSDMSessionContext context,BilledUsageObjectFilter BilledUsagefcountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageFindFastCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagefcountIn != null) BilledUsageObjectHelper.toMap (BilledUsagefcountIn, record, "BilledUsage");
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

  private BSDMInteractionSpec _BilledUsageFindFastSpec = null;
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageObjectDataList findFast (BilledUsageObjectFilter BilledUsageffindIn) throws BSDMResourceException
  {
    return findFast (null, BilledUsageffindIn);
  }
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findFast")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BilledUsageObjectDataList findFast (@HeaderParam ("context")BSDMSessionContext context,BilledUsageObjectFilter BilledUsageffindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageFindFastSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsageffindIn != null) BilledUsageObjectHelper.toMap (BilledUsageffindIn, record, "BilledUsage");
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
return BilledUsageObjectHelper.fromMapList (record, "BilledUsageList");
}

  private BSDMInteractionSpec _BilledUsageFindSummaryCountSpec = null;
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findSummaryCount (BilledUsageObjectFilter BilledUsagescountIn) throws BSDMResourceException
  {
    return findSummaryCount (null, BilledUsagescountIn);
  }
  /**
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findSummaryCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findSummaryCount (@HeaderParam ("context")BSDMSessionContext context,BilledUsageObjectFilter BilledUsagescountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageFindSummaryCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagescountIn != null) BilledUsageObjectHelper.toMap (BilledUsagescountIn, record, "BilledUsage");
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

  private BSDMInteractionSpec _BilledUsageFindSummarySpec = null;
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..
   * Convenience method using default BSDMSessionContext.
   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BilledUsageObjectDataList findSummary (BilledUsageObjectFilter BilledUsagesfindIn) throws BSDMResourceException
  {
    return findSummary (null, BilledUsagesfindIn);
  }
  /**
   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findSummary")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BilledUsageObjectDataList findSummary (@HeaderParam ("context")BSDMSessionContext context,BilledUsageObjectFilter BilledUsagesfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BilledUsageFindSummarySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BilledUsagesfindIn != null) BilledUsageObjectHelper.toMap (BilledUsagesfindIn, record, "BilledUsage");
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
return BilledUsageObjectHelper.fromMapList (record, "BilledUsageList");
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagegetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageObjectData get (BilledUsageObjectKeyData BilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, BilledUsagegetIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagegetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageObjectData get (BSDMSessionContext context, BilledUsageObjectKeyData BilledUsagegetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagegetIn, defaultAction);
       
     cManager.checkConstraints(BilledUsagegetIn, constraintAction);
       return get (context, BilledUsagegetIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagefindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageObjectDataList find (BilledUsageObjectFilter BilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, BilledUsagefindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageObjectDataList find (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagefindIn, defaultAction);
       
     cManager.checkConstraints(BilledUsagefindIn, constraintAction);
       return find (context, BilledUsagefindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagefindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (BilledUsageObjectFilter BilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, BilledUsagefindCountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagefindCountIn, defaultAction);
       
     cManager.checkConstraints(BilledUsagefindCountIn, constraintAction);
       return findCount (context, BilledUsagefindCountIn);
  }

  /**

   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsageAccountfindIn Input Filter Object.

   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageObjectDataList byAccountFind (BilledUsageAccountObjectFilter BilledUsageAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountFind (null, BilledUsageAccountfindIn, LatestInvoice, defaultAction, constraintAction);
  }
  /** 
   * Returns BilledUsage and filter on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAccountfindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageObjectDataList byAccountFind (BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsageAccountfindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsageAccountfindIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BilledUsageAccountfindIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byAccountFind (context, BilledUsageAccountfindIn, LatestInvoice);
  }

  /**

   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagefindAccountCountIn Input Filter Object.

   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer byAccountFindCount (BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountFindCount (null, BilledUsagefindAccountCountIn, LatestInvoice1, defaultAction, constraintAction);
  }
  /** 
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Account attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindAccountCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer byAccountFindCount (BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagefindAccountCountIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BilledUsagefindAccountCountIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byAccountFindCount (context, BilledUsagefindAccountCountIn, LatestInvoice1);
  }

  /**

   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsageServicefindIn Input Filter Object.

   * @param LatestInvoice2 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageObjectDataList byServiceFind (BilledUsageServiceObjectFilter BilledUsageServicefindIn, Boolean LatestInvoice2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byServiceFind (null, BilledUsageServicefindIn, LatestInvoice2, defaultAction, constraintAction);
  }
  /** 
   * Returns BilledUsages data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageServicefindIn Input Filter Object.
   * @param LatestInvoice2 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageObjectDataList byServiceFind (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageServicefindIn, Boolean LatestInvoice2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsageServicefindIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BilledUsageServicefindIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byServiceFind (context, BilledUsageServicefindIn, LatestInvoice2);
  }

  /**

   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagefindServiceCountIn Input Filter Object.

   * @param LatestInvoice3 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer byServiceFindCount (BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, Boolean LatestInvoice3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byServiceFindCount (null, BilledUsagefindServiceCountIn, LatestInvoice3, defaultAction, constraintAction);
  }
  /** 
   * Returns COUNT of BilledUsage data, filters on Invoice, Usage and Service attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefindServiceCountIn Input Filter Object.
   * @param LatestInvoice3 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer byServiceFindCount (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, Boolean LatestInvoice3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagefindServiceCountIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BilledUsagefindServiceCountIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byServiceFindCount (context, BilledUsagefindServiceCountIn, LatestInvoice3);
  }

  /**

   * Filters on Invoice, Usage, Service and Account attributes. Ugh..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsageAcctServicefindIn Input Filter Object.

   * @param LatestInvoice4 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageObjectDataList byAccountServiceFind (BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, Boolean LatestInvoice4, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountServiceFind (null, BilledUsageAcctServicefindIn, LatestInvoice4, defaultAction, constraintAction);
  }
  /** 
   * Filters on Invoice, Usage, Service and Account attributes. Ugh..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAcctServicefindIn Input Filter Object.
   * @param LatestInvoice4 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageObjectDataList byAccountServiceFind (BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, Boolean LatestInvoice4, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsageAcctServicefindIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BilledUsageAcctServicefindIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byAccountServiceFind (context, BilledUsageAcctServicefindIn, LatestInvoice4);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.

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

  public AdjustmentObjectData adjust (BilledUsageObjectData BilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return adjust (null, BilledUsageAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAdjustIn Input  Object.  Read-Only fields: ServerId.
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
   
  public AdjustmentObjectData adjust (BSDMSessionContext context, BilledUsageObjectData BilledUsageAdjustIn, Integer TransCode, Integer AdjReasonCode, Integer RequestStatus, Integer FraudIndicator, String Annotation, Integer PrimaryUnitsType, BigInteger PrimaryUnits, BigInteger Amount, String BillOrderNumber, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsageAdjustIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BilledUsageAdjustIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return adjust (context, BilledUsageAdjustIn, TransCode, AdjReasonCode, RequestStatus, FraudIndicator, Annotation, PrimaryUnitsType, PrimaryUnits, Amount, BillOrderNumber);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return TaxAndDiscountAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public TaxAndDiscountAmountObjectData calc (BilledUsageObjectData BilledUsageCalcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return calc (null, BilledUsageCalcIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageCalcIn Input  Object.  Read-Only fields: ServerId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return TaxAndDiscountAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public TaxAndDiscountAmountObjectData calc (BSDMSessionContext context, BilledUsageObjectData BilledUsageCalcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsageCalcIn, defaultAction);
       
     cManager.checkConstraints(BilledUsageCalcIn, constraintAction);
       return calc (context, BilledUsageCalcIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsageAmountIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageAmountObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageAmountObjectData amountGet (BilledUsageObjectKeyData BilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return amountGet (null, BilledUsageAmountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageAmountIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageAmountObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageAmountObjectData amountGet (BSDMSessionContext context, BilledUsageObjectKeyData BilledUsageAmountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsageAmountIn, defaultAction);
       
     cManager.checkConstraints(BilledUsageAmountIn, constraintAction);
       return amountGet (context, BilledUsageAmountIn);
  }

  /**

   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findFastCount (BilledUsageObjectFilter BilledUsagefcountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findFastCount (null, BilledUsagefcountIn, defaultAction, constraintAction);
  }
  /** 
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFindCount..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagefcountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findFastCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefcountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagefcountIn, defaultAction);
       
     cManager.checkConstraints(BilledUsagefcountIn, constraintAction);
       return findFastCount (context, BilledUsagefcountIn);
  }

  /**

   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageObjectDataList findFast (BilledUsageObjectFilter BilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findFast (null, BilledUsageffindIn, defaultAction, constraintAction);
  }
  /** 
   * Return only CDR_BILLED data and filter only on CDR_BILLED and CDR_DATA data.  A much faster query than the full BilledUsageFind..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsageffindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageObjectDataList findFast (BSDMSessionContext context, BilledUsageObjectFilter BilledUsageffindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsageffindIn, defaultAction);
       
     cManager.checkConstraints(BilledUsageffindIn, constraintAction);
       return findFast (context, BilledUsageffindIn);
  }

  /**

   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findSummaryCount (BilledUsageObjectFilter BilledUsagescountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findSummaryCount (null, BilledUsagescountIn, defaultAction, constraintAction);
  }
  /** 
   * Return COUNT of CDR_BILLED data only and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFindCount.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagescountIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findSummaryCount (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagescountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagescountIn, defaultAction);
       
     cManager.checkConstraints(BilledUsagescountIn, constraintAction);
       return findSummaryCount (context, BilledUsagescountIn);
  }

  /**

   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..

   * Convenience method using default BSDMSessionContext.

   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BilledUsageObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BilledUsageObjectDataList findSummary (BilledUsageObjectFilter BilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findSummary (null, BilledUsagesfindIn, defaultAction, constraintAction);
  }
  /** 
   * Return only CDR_BILLED data and filter only on CDR_BILLED data.  A much faster query than the full BilledUsageFind.  No external ids nor CDR_DATA is available in this query..
   * @param context The session context to use when connecting to the APITS server.
   * @param BilledUsagesfindIn Input Filter Object.  Read-Only fields: LanguageCode, DescriptionGroup, DescriptionText, ShortDescriptionText, AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, Units, RatedAmount, RatedAmountReduction, AccountNo.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BilledUsageObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BilledUsageObjectDataList findSummary (BSDMSessionContext context, BilledUsageObjectFilter BilledUsagesfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BilledUsagesfindIn, defaultAction);
       
     cManager.checkConstraints(BilledUsagesfindIn, constraintAction);
       return findSummary (context, BilledUsagesfindIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BilledUsageBean ()
  {
    try
    {
      _BilledUsageGetSpec = new BSDMInteractionSpec("BilledUsageGet", ApiMappings.getCallName ("BilledUsageGet"), Boolean.TRUE);

      _BilledUsageFindSpec = new BSDMInteractionSpec("BilledUsageFind", ApiMappings.getCallName ("BilledUsageFind"), Boolean.TRUE);

      _BilledUsageFindCountSpec = new BSDMInteractionSpec("BilledUsageFindCount", ApiMappings.getCallName ("BilledUsageFindCount"), Boolean.TRUE);

      _BilledUsageByAccountFindSpec = new BSDMInteractionSpec("BilledUsageByAccountFind", ApiMappings.getCallName ("BilledUsageByAccountFind"), Boolean.TRUE);

      _BilledUsageByAccountFindCountSpec = new BSDMInteractionSpec("BilledUsageByAccountFindCount", ApiMappings.getCallName ("BilledUsageByAccountFindCount"), Boolean.TRUE);

      _BilledUsageByServiceFindSpec = new BSDMInteractionSpec("BilledUsageByServiceFind", ApiMappings.getCallName ("BilledUsageByServiceFind"), Boolean.TRUE);

      _BilledUsageByServiceFindCountSpec = new BSDMInteractionSpec("BilledUsageByServiceFindCount", ApiMappings.getCallName ("BilledUsageByServiceFindCount"), Boolean.TRUE);

      _BilledUsageByAccountServiceFindSpec = new BSDMInteractionSpec("BilledUsageByAccountServiceFind", ApiMappings.getCallName ("BilledUsageByAccountServiceFind"), Boolean.TRUE);

      _BilledUsageAdjustSpec = new BSDMInteractionSpec("BilledUsageAdjust", ApiMappings.getCallName ("BilledUsageAdjust"), Boolean.TRUE);

      _BilledUsageCalcSpec = new BSDMInteractionSpec("BilledUsageCalc", ApiMappings.getCallName ("BilledUsageCalc"), Boolean.TRUE);

      _BilledUsageAmountGetSpec = new BSDMInteractionSpec("BilledUsageAmountGet", ApiMappings.getCallName ("BilledUsageAmountGet"), Boolean.TRUE);

      _BilledUsageFindFastCountSpec = new BSDMInteractionSpec("BilledUsageFindFastCount", ApiMappings.getCallName ("BilledUsageFindFastCount"), Boolean.TRUE);

      _BilledUsageFindFastSpec = new BSDMInteractionSpec("BilledUsageFindFast", ApiMappings.getCallName ("BilledUsageFindFast"), Boolean.TRUE);

      _BilledUsageFindSummaryCountSpec = new BSDMInteractionSpec("BilledUsageFindSummaryCount", ApiMappings.getCallName ("BilledUsageFindSummaryCount"), Boolean.TRUE);

      _BilledUsageFindSummarySpec = new BSDMInteractionSpec("BilledUsageFindSummary", ApiMappings.getCallName ("BilledUsageFindSummary"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BilledUsageBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BilledUsageBean(BSDMSettings settings, BSDMConnectionManager cm)
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
