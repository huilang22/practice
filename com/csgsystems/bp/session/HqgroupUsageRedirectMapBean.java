
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HqgroupUsageRedirectMapBean.java
 * Definition File: Catalog/HqgroupUsageRedirectMap.xml
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
import com.csgsystems.bp.interfaces.HqgroupUsageRedirectMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HqgroupUsageRedirectMapSessionBean"
 * display-name="HqgroupUsageRedirectMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HqgroupUsageRedirectMapBean"
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

@Stateless(name="HqgroupUsageRedirectMapBean", mappedName = "HqgroupUsageRedirectMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HqgroupUsageRedirectMaps")

public class HqgroupUsageRedirectMapBean implements HqgroupUsageRedirectMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HqgroupUsageRedirectMapCreateSpec = null;
  /**
   * Insert a new HqGroupUsageRedirectMap.
   * Convenience method using default BSDMSessionContext.
   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupUsageRedirectMapObjectData create (HqGroupUsageRedirectMapObjectData HGURMInsertIn) throws BSDMResourceException
  {
    return create (null, HGURMInsertIn);
  }
  /**
   * Insert a new HqGroupUsageRedirectMap.
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupUsageRedirectMapObjectData create (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectData HGURMInsertIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGURMInsertIn != null) HqGroupUsageRedirectMapObjectHelper.toMap (HGURMInsertIn, record, "HqgroupUsageRedirectMap");
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
return HqGroupUsageRedirectMapObjectHelper.fromMap (record, "HqgroupUsageRedirectMap");
}

  private BSDMInteractionSpec _HqgroupUsageRedirectMapGetSpec = null;
  /**
   * Get a unique HqGroupUsageRedirectMap row..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMGetIn Input Object Key.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupUsageRedirectMapObjectData get (HqGroupUsageRedirectMapObjectKeyData HGURMGetIn) throws BSDMResourceException
  {
    return get (null, HGURMGetIn);
  }
  /**
   * Get a unique HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMGetIn Input Object Key.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HqGroupUsageRedirectMapObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HqGroupUsageRedirectMapObjectKeyData HGURMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGURMGetIn != null) HqGroupUsageRedirectMapObjectKeyHelper.toMap (HGURMGetIn, record, "HqgroupUsageRedirectMap");
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
return HqGroupUsageRedirectMapObjectHelper.fromMap (record, "HqgroupUsageRedirectMap");
}

  private BSDMInteractionSpec _HqgroupUsageRedirectMapFindSpec = null;
  /**
   * Find HqGroupUsageRedirectMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMFindIn Input Filter Object.
   * @return HqGroupUsageRedirectMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupUsageRedirectMapObjectDataList find (HqGroupUsageRedirectMapObjectFilter HGURMFindIn) throws BSDMResourceException
  {
    return find (null, HGURMFindIn);
  }
  /**
   * Find HqGroupUsageRedirectMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMFindIn Input Filter Object.
   * @return HqGroupUsageRedirectMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupUsageRedirectMapObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectFilter HGURMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGURMFindIn != null) HqGroupUsageRedirectMapObjectHelper.toMap (HGURMFindIn, record, "HqgroupUsageRedirectMap");
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
return HqGroupUsageRedirectMapObjectHelper.fromMapList (record, "HqgroupUsageRedirectMapList");
}

  private BSDMInteractionSpec _HqgroupUsageRedirectMapDeleteSpec = null;
  /**
   * Cease an HqGroupUsageRedirectMap row..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMDeleteIn Input Object Key.
   * @param HGURMDCeaseDate (has a default).
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupUsageRedirectMapObjectData delete (HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, Date HGURMDCeaseDate) throws BSDMResourceException
  {
    return delete (null, HGURMDeleteIn, HGURMDCeaseDate);
  }
  /**
   * Cease an HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMDeleteIn Input Object Key.
   * @param HGURMDCeaseDate (has a default).
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupUsageRedirectMapObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn,@FormParam("HGURMDCeaseDate")Date HGURMDCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGURMDeleteIn != null) HqGroupUsageRedirectMapObjectKeyHelper.toMap (HGURMDeleteIn, record, "HqgroupUsageRedirectMap");

      if (HGURMDCeaseDate != null) record.put ("HGURMDCeaseDate", HGURMDCeaseDate);
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
return HqGroupUsageRedirectMapObjectHelper.fromMap (record, "HqgroupUsageRedirectMap");
}

  private BSDMInteractionSpec _HqgroupUsageRedirectMapDeleteListSpec = null;
  /**
   * Cease HqGroupUsageRedirectMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param HGURMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, Date HGURMDLCeaseDate) throws BSDMResourceException
  {
    deleteList (null, HqGroupUsageRedirectMapFilter, HGURMDLCeaseDate);
  }
  /**
   * Cease HqGroupUsageRedirectMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param HGURMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter,@FormParam("HGURMDLCeaseDate")Date HGURMDLCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HqGroupUsageRedirectMapFilter != null) HqGroupUsageRedirectMapObjectHelper.toMap (HqGroupUsageRedirectMapFilter, record, "HqGroupUsageRedirectMapFilter");

      if (HGURMDLCeaseDate != null) record.put ("HGURMDLCeaseDate", HGURMDLCeaseDate);
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

  private BSDMInteractionSpec _HqgroupUsageRedirectMapUpdateSpec = null;
  /**
   * Update the non-key fields of an HqGroupUsageRedirectMap object..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupUsageRedirectMapObjectData update (HqGroupUsageRedirectMapObjectData HGURMUpdateIn) throws BSDMResourceException
  {
    return update (null, HGURMUpdateIn);
  }
  /**
   * Update the non-key fields of an HqGroupUsageRedirectMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupUsageRedirectMapObjectData update (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectData HGURMUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGURMUpdateIn != null) HqGroupUsageRedirectMapObjectHelper.toMap (HGURMUpdateIn, record, "HqgroupUsageRedirectMap");
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
return HqGroupUsageRedirectMapObjectHelper.fromMap (record, "HqgroupUsageRedirectMap");
}

  private BSDMInteractionSpec _HqgroupUsageRedirectMapCancelSpec = null;
  /**
   * Cancel HqGroupUsageRedirectMap given group_id/serv..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void cancel (HqGroupUsageRedirectMapObjectData HGURMCancelIn) throws BSDMResourceException
  {
    cancel (null, HGURMCancelIn);
  }
  /**
   * Cancel HqGroupUsageRedirectMap given group_id/serv..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("cancel")
@Consumes({"application/json","application/xml"})

 public void cancel (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectData HGURMCancelIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapCancelSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGURMCancelIn != null) HqGroupUsageRedirectMapObjectHelper.toMap (HGURMCancelIn, record, "HqgroupUsageRedirectMap");
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

  private BSDMInteractionSpec _HqgroupUsageRedirectMapPriorityUpdateSpec = null;
  /**
   * Update the priority of an HqGroupUsageRedirectMap..
   * Convenience method using default BSDMSessionContext.
   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupUsageRedirectMapObjectData priorityUpdate (HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn) throws BSDMResourceException
  {
    return priorityUpdate (null, HGURMPrioUpdIn);
  }
  /**
   * Update the priority of an HqGroupUsageRedirectMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("priorityUpdate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupUsageRedirectMapObjectData priorityUpdate (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapPriorityUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGURMPrioUpdIn != null) HqGroupUsageRedirectMapObjectHelper.toMap (HGURMPrioUpdIn, record, "HqgroupUsageRedirectMap");
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
return HqGroupUsageRedirectMapObjectHelper.fromMap (record, "HqgroupUsageRedirectMap");
}

  private BSDMInteractionSpec _HqgroupUsageRedirectMapDisconnectListSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void disconnectList (HqGroupUsageRedirectMapObjectData discIn) throws BSDMResourceException
  {
    disconnectList (null, discIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("disconnectList")
@Consumes({"application/json","application/xml"})

 public void disconnectList (@HeaderParam ("context")BSDMSessionContext context,HqGroupUsageRedirectMapObjectData discIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqgroupUsageRedirectMapDisconnectListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (discIn != null) HqGroupUsageRedirectMapObjectHelper.toMap (discIn, record, "HqgroupUsageRedirectMap");
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

   * Insert a new HqGroupUsageRedirectMap.

   * Convenience method using default BSDMSessionContext.

   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupUsageRedirectMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupUsageRedirectMapObjectData create (HqGroupUsageRedirectMapObjectData HGURMInsertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HGURMInsertIn, defaultAction, constraintAction);
  }
  /** 
   * Insert a new HqGroupUsageRedirectMap.
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMInsertIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: ActiveDt.  Derived Fields: TrackingId, TrackingIdServ.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupUsageRedirectMapObjectData create (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMInsertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGURMInsertIn, defaultAction);
       
     cManager.checkConstraints(HGURMInsertIn, constraintAction);
       return create (context, HGURMInsertIn);
  }

  /**

   * Get a unique HqGroupUsageRedirectMap row..

   * Convenience method using default BSDMSessionContext.

   * @param HGURMGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupUsageRedirectMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupUsageRedirectMapObjectData get (HqGroupUsageRedirectMapObjectKeyData HGURMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HGURMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupUsageRedirectMapObjectData get (BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGURMGetIn, defaultAction);
       
     cManager.checkConstraints(HGURMGetIn, constraintAction);
       return get (context, HGURMGetIn);
  }

  /**

   * Find HqGroupUsageRedirectMap rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HGURMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupUsageRedirectMapObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupUsageRedirectMapObjectDataList find (HqGroupUsageRedirectMapObjectFilter HGURMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HGURMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find HqGroupUsageRedirectMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupUsageRedirectMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupUsageRedirectMapObjectDataList find (BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HGURMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGURMFindIn, defaultAction);
       
     cManager.checkConstraints(HGURMFindIn, constraintAction);
       return find (context, HGURMFindIn);
  }

  /**

   * Cease an HqGroupUsageRedirectMap row..

   * Convenience method using default BSDMSessionContext.

   * @param HGURMDeleteIn Input Object Key.

   * @param HGURMDCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupUsageRedirectMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupUsageRedirectMapObjectData delete (HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, Date HGURMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, HGURMDeleteIn, HGURMDCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease an HqGroupUsageRedirectMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMDeleteIn Input Object Key.
   * @param HGURMDCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupUsageRedirectMapObjectData delete (BSDMSessionContext context, HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, Date HGURMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGURMDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(HGURMDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, HGURMDeleteIn, HGURMDCeaseDate);
  }

  /**

   * Cease HqGroupUsageRedirectMap's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.

   * @param HGURMDLCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, Date HGURMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, HqGroupUsageRedirectMapFilter, HGURMDLCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease HqGroupUsageRedirectMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupUsageRedirectMapFilter Input Filter Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param HGURMDLCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, Date HGURMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HqGroupUsageRedirectMapFilter, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(HqGroupUsageRedirectMapFilter, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, HqGroupUsageRedirectMapFilter, HGURMDLCeaseDate);
  }

  /**

   * Update the non-key fields of an HqGroupUsageRedirectMap object..

   * Convenience method using default BSDMSessionContext.

   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupUsageRedirectMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupUsageRedirectMapObjectData update (HqGroupUsageRedirectMapObjectData HGURMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HGURMUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an HqGroupUsageRedirectMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMUpdateIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupUsageRedirectMapObjectData update (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGURMUpdateIn, defaultAction);
       
     cManager.checkConstraints(HGURMUpdateIn, constraintAction);
       return update (context, HGURMUpdateIn);
  }

  /**

   * Cancel HqGroupUsageRedirectMap given group_id/serv..

   * Convenience method using default BSDMSessionContext.

   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void cancel (HqGroupUsageRedirectMapObjectData HGURMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    cancel (null, HGURMCancelIn, defaultAction, constraintAction);
  }
  /** 
   * Cancel HqGroupUsageRedirectMap given group_id/serv..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ExternalId, ExternalIdType.  Defaulted Fields: InactiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void cancel (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGURMCancelIn, defaultAction);
       
     cManager.checkConstraints(HGURMCancelIn, constraintAction);
       cancel (context, HGURMCancelIn);
  }

  /**

   * Update the priority of an HqGroupUsageRedirectMap..

   * Convenience method using default BSDMSessionContext.

   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupUsageRedirectMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupUsageRedirectMapObjectData priorityUpdate (HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return priorityUpdate (null, HGURMPrioUpdIn, defaultAction, constraintAction);
  }
  /** 
   * Update the priority of an HqGroupUsageRedirectMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGURMPrioUpdIn Input  Object.  Read-Only fields: GroupId, GroupIdServ, UsageRedirectGroup, BalanceAccountInternalId, ActiveDt, InactiveDt, ExternalId, ExternalIdType.  Derived Fields: ActiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupUsageRedirectMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupUsageRedirectMapObjectData priorityUpdate (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGURMPrioUpdIn, defaultAction);
       
     cManager.checkConstraints(HGURMPrioUpdIn, constraintAction);
       return priorityUpdate (context, HGURMPrioUpdIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void disconnectList (HqGroupUsageRedirectMapObjectData discIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    disconnectList (null, discIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param discIn Input  Object.  Read-Only fields: ExternalId, ExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void disconnectList (BSDMSessionContext context, HqGroupUsageRedirectMapObjectData discIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(discIn, defaultAction);
       
     cManager.checkConstraints(discIn, constraintAction);
       disconnectList (context, discIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HqgroupUsageRedirectMapBean ()
  {
    try
    {
      _HqgroupUsageRedirectMapCreateSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapCreate", ApiMappings.getCallName ("HqgroupUsageRedirectMapCreate"), Boolean.TRUE);

      _HqgroupUsageRedirectMapGetSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapGet", ApiMappings.getCallName ("HqgroupUsageRedirectMapGet"), Boolean.TRUE);

      _HqgroupUsageRedirectMapFindSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapFind", ApiMappings.getCallName ("HqgroupUsageRedirectMapFind"), Boolean.TRUE);

      _HqgroupUsageRedirectMapDeleteSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapDelete", ApiMappings.getCallName ("HqgroupUsageRedirectMapDelete"), Boolean.TRUE);

      _HqgroupUsageRedirectMapDeleteListSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapDeleteList", ApiMappings.getCallName ("HqgroupUsageRedirectMapDeleteList"), Boolean.TRUE);

      _HqgroupUsageRedirectMapUpdateSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapUpdate", ApiMappings.getCallName ("HqgroupUsageRedirectMapUpdate"), Boolean.TRUE);

      _HqgroupUsageRedirectMapCancelSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapCancel", ApiMappings.getCallName ("HqgroupUsageRedirectMapCancel"), Boolean.TRUE);

      _HqgroupUsageRedirectMapPriorityUpdateSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapPriorityUpdate", ApiMappings.getCallName ("HqgroupUsageRedirectMapPriorityUpdate"), Boolean.TRUE);

      _HqgroupUsageRedirectMapDisconnectListSpec = new BSDMInteractionSpec("HqgroupUsageRedirectMapDisconnectList", ApiMappings.getCallName ("HqgroupUsageRedirectMapDisconnectList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HqgroupUsageRedirectMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HqgroupUsageRedirectMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
