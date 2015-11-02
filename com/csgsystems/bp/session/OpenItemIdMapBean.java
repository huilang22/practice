
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: OpenItemIdMapBean.java
 * Definition File: Customer/OpenItemIdMap.xml
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
import com.csgsystems.bp.interfaces.OpenItemIdMapInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="OpenItemIdMapSessionBean"
 * display-name="OpenItemIdMap Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/OpenItemIdMapBean"
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

@Stateless(name="OpenItemIdMapBean", mappedName = "OpenItemIdMap")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("OpenItemIdMaps")

public class OpenItemIdMapBean implements OpenItemIdMapInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _OpenItemIdMapCreateSpec = null;
  /**
   * Create a new OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemIdMapObjectData create (OpenItemIdMapObjectData OIIMCreateIn) throws BSDMResourceException
  {
    return create (null, OIIMCreateIn);
  }
  /**
   * Create a new OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemIdMapObjectData create (@HeaderParam ("context")BSDMSessionContext context,OpenItemIdMapObjectData OIIMCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMCreateIn != null) OpenItemIdMapObjectHelper.toMap (OIIMCreateIn, record, "OpenItemIdMap");
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
return OpenItemIdMapObjectHelper.fromMap (record, "OpenItemIdMap");
}

  private BSDMInteractionSpec _OpenItemIdMapGetSpec = null;
  /**
   * Get a unique OpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMGetIn Input Object Key.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemIdMapObjectData get (OpenItemIdMapObjectKeyData OIIMGetIn) throws BSDMResourceException
  {
    return get (null, OIIMGetIn);
  }
  /**
   * Get a unique OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMGetIn Input Object Key.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public OpenItemIdMapObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam OpenItemIdMapObjectKeyData OIIMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMGetIn != null) OpenItemIdMapObjectKeyHelper.toMap (OIIMGetIn, record, "OpenItemIdMap");
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
return OpenItemIdMapObjectHelper.fromMap (record, "OpenItemIdMap");
}

  private BSDMInteractionSpec _OpenItemIdMapFindSpec = null;
  /**
   * Find OpenItemIdMap rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMFindIn Input Filter Object.
   * @return OpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemIdMapObjectDataList find (OpenItemIdMapObjectFilter OIIMFindIn) throws BSDMResourceException
  {
    return find (null, OIIMFindIn);
  }
  /**
   * Find OpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMFindIn Input Filter Object.
   * @return OpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemIdMapObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,OpenItemIdMapObjectFilter OIIMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMFindIn != null) OpenItemIdMapObjectHelper.toMap (OIIMFindIn, record, "OpenItemIdMap");
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
return OpenItemIdMapObjectHelper.fromMapList (record, "OpenItemIdMapList");
}

  private BSDMInteractionSpec _OpenItemIdMapDeleteSpec = null;
  /**
   * Cease an OpenItemIdMap row..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMDeleteIn Input Object Key.
   * @param OIIMDCeaseDate (has a default).
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemIdMapObjectData delete (OpenItemIdMapObjectKeyData OIIMDeleteIn, Date OIIMDCeaseDate) throws BSDMResourceException
  {
    return delete (null, OIIMDeleteIn, OIIMDCeaseDate);
  }
  /**
   * Cease an OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMDeleteIn Input Object Key.
   * @param OIIMDCeaseDate (has a default).
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemIdMapObjectData delete (@HeaderParam ("context")BSDMSessionContext context,OpenItemIdMapObjectKeyData OIIMDeleteIn,@FormParam("OIIMDCeaseDate")Date OIIMDCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMDeleteIn != null) OpenItemIdMapObjectKeyHelper.toMap (OIIMDeleteIn, record, "OpenItemIdMap");

      if (OIIMDCeaseDate != null) record.put ("InactiveDate", OIIMDCeaseDate);
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
return OpenItemIdMapObjectHelper.fromMap (record, "OpenItemIdMap");
}

  private BSDMInteractionSpec _OpenItemIdMapDeleteListSpec = null;
  /**
   * Cease OpenItemIdMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param OIIMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (OpenItemIdMapObjectFilter OpenItemIdMapFilter, Date OIIMDLCeaseDate) throws BSDMResourceException
  {
    deleteList (null, OpenItemIdMapFilter, OIIMDLCeaseDate);
  }
  /**
   * Cease OpenItemIdMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param OIIMDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,OpenItemIdMapObjectFilter OpenItemIdMapFilter,@FormParam("OIIMDLCeaseDate")Date OIIMDLCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OpenItemIdMapFilter != null) OpenItemIdMapObjectHelper.toMap (OpenItemIdMapFilter, record, "OpenItemIdMapFilter");

      if (OIIMDLCeaseDate != null) record.put ("InactiveDate", OIIMDLCeaseDate);
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

  private BSDMInteractionSpec _OpenItemIdMapUpdateSpec = null;
  /**
   * Update the non-key fields of an OpenItemIdMap object..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemIdMapObjectData update (OpenItemIdMapObjectData OIIMUpdateIn) throws BSDMResourceException
  {
    return update (null, OIIMUpdateIn);
  }
  /**
   * Update the non-key fields of an OpenItemIdMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemIdMapObjectData update (@HeaderParam ("context")BSDMSessionContext context,OpenItemIdMapObjectData OIIMUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMUpdateIn != null) OpenItemIdMapObjectHelper.toMap (OIIMUpdateIn, record, "OpenItemIdMap");
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
return OpenItemIdMapObjectHelper.fromMap (record, "OpenItemIdMap");
}

  private BSDMInteractionSpec _OpenItemIdMapCancelSpec = null;
  /**
   * Cancel OpenItemIdMap given ServiceInternalId/Resets..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void cancel (OpenItemIdMapObjectData OIIMCancelIn) throws BSDMResourceException
  {
    cancel (null, OIIMCancelIn);
  }
  /**
   * Cancel OpenItemIdMap given ServiceInternalId/Resets..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("cancel")
@Consumes({"application/json","application/xml"})

 public void cancel (@HeaderParam ("context")BSDMSessionContext context,OpenItemIdMapObjectData OIIMCancelIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapCancelSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMCancelIn != null) OpenItemIdMapObjectHelper.toMap (OIIMCancelIn, record, "OpenItemIdMap");
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

  private BSDMInteractionSpec _OpenItemIdMapPriorityUpdateSpec = null;
  /**
   * Update the priority of an OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemIdMapObjectData priorityUpdate (OpenItemIdMapObjectData OIIMPrioUpdIn) throws BSDMResourceException
  {
    return priorityUpdate (null, OIIMPrioUpdIn);
  }
  /**
   * Update the priority of an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("priorityUpdate")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public OpenItemIdMapObjectData priorityUpdate (@HeaderParam ("context")BSDMSessionContext context,OpenItemIdMapObjectData OIIMPrioUpdIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapPriorityUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMPrioUpdIn != null) OpenItemIdMapObjectHelper.toMap (OIIMPrioUpdIn, record, "OpenItemIdMap");
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
return OpenItemIdMapObjectHelper.fromMap (record, "OpenItemIdMap");
}

  private BSDMInteractionSpec _OpenItemIdMapBestMatchSpec = null;
  /**
   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..
   * Convenience method using default BSDMSessionContext.
   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public OpenItemIdMapObjectData bestMatch (OpenItemIdMapObjectData OIIMBestIn) throws BSDMResourceException
  {
    return bestMatch (null, OIIMBestIn);
  }
  /**
   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("bestMatch")
@Produces({"application/json","application/xml"})
  public OpenItemIdMapObjectData bestMatch (@HeaderParam ("context")BSDMSessionContext context,@BeanParam OpenItemIdMapObjectData OIIMBestIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OpenItemIdMapBestMatchSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OIIMBestIn != null) OpenItemIdMapObjectHelper.toMap (OIIMBestIn, record, "OpenItemIdMap");
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
return OpenItemIdMapObjectHelper.fromMap (record, "OpenItemIdMap");
}

  private BSDMInteractionSpec _OrderLevelDeriveSpec = null;
  /**
   * Derive the OrderLevel for an OpenItemIdMap..
   * Convenience method using default BSDMSessionContext.
   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer orderLevelDerive (OpenItemIdMapObjectData OrderLevelDeriveIn) throws BSDMResourceException
  {
    return orderLevelDerive (null, OrderLevelDeriveIn);
  }
  /**
   * Derive the OrderLevel for an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("orderLevelDerive")
@Produces({"application/json","application/xml"})
  public Integer orderLevelDerive (@HeaderParam ("context")BSDMSessionContext context,@BeanParam OpenItemIdMapObjectData OrderLevelDeriveIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_OrderLevelDeriveSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (OrderLevelDeriveIn != null) OpenItemIdMapObjectHelper.toMap (OrderLevelDeriveIn, record, "OpenItemIdMap");
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
Object _tmp = record.get ("OrderLevel");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  /**

   * Create a new OpenItemIdMap..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemIdMapObjectData create (OpenItemIdMapObjectData OIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, OIIMCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCreateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Defaulted Fields: ServiceInternalId, ServiceInternalIdResets, ChargeElementType, ChargeElementValue, ActiveDt, Ineligible.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemIdMapObjectData create (BSDMSessionContext context, OpenItemIdMapObjectData OIIMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMCreateIn, defaultAction);
       
     cManager.checkConstraints(OIIMCreateIn, constraintAction);
       return create (context, OIIMCreateIn);
  }

  /**

   * Get a unique OpenItemIdMap row..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemIdMapObjectData get (OpenItemIdMapObjectKeyData OIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, OIIMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemIdMapObjectData get (BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMGetIn, defaultAction);
       
     cManager.checkConstraints(OIIMGetIn, constraintAction);
       return get (context, OIIMGetIn);
  }

  /**

   * Find OpenItemIdMap rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemIdMapObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemIdMapObjectDataList find (OpenItemIdMapObjectFilter OIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, OIIMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find OpenItemIdMap rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemIdMapObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemIdMapObjectDataList find (BSDMSessionContext context, OpenItemIdMapObjectFilter OIIMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMFindIn, defaultAction);
       
     cManager.checkConstraints(OIIMFindIn, constraintAction);
       return find (context, OIIMFindIn);
  }

  /**

   * Cease an OpenItemIdMap row..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMDeleteIn Input Object Key.

   * @param OIIMDCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemIdMapObjectData delete (OpenItemIdMapObjectKeyData OIIMDeleteIn, Date OIIMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, OIIMDeleteIn, OIIMDCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease an OpenItemIdMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMDeleteIn Input Object Key.
   * @param OIIMDCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemIdMapObjectData delete (BSDMSessionContext context, OpenItemIdMapObjectKeyData OIIMDeleteIn, Date OIIMDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(OIIMDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, OIIMDeleteIn, OIIMDCeaseDate);
  }

  /**

   * Cease OpenItemIdMap's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.

   * @param OIIMDLCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (OpenItemIdMapObjectFilter OpenItemIdMapFilter, Date OIIMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, OpenItemIdMapFilter, OIIMDLCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease OpenItemIdMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param OpenItemIdMapFilter Input Filter Object.  Read-Only fields: BalanceAccountExternalId, BalanceAccountExternalIdType.
   * @param OIIMDLCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, OpenItemIdMapObjectFilter OpenItemIdMapFilter, Date OIIMDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OpenItemIdMapFilter, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(OpenItemIdMapFilter, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, OpenItemIdMapFilter, OIIMDLCeaseDate);
  }

  /**

   * Update the non-key fields of an OpenItemIdMap object..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemIdMapObjectData update (OpenItemIdMapObjectData OIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, OIIMUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an OpenItemIdMap object..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMUpdateIn Input  Object.  Read-Only fields: ChgDt, ChgWho.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemIdMapObjectData update (BSDMSessionContext context, OpenItemIdMapObjectData OIIMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMUpdateIn, defaultAction);
       
     cManager.checkConstraints(OIIMUpdateIn, constraintAction);
       return update (context, OIIMUpdateIn);
  }

  /**

   * Cancel OpenItemIdMap given ServiceInternalId/Resets..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void cancel (OpenItemIdMapObjectData OIIMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    cancel (null, OIIMCancelIn, defaultAction, constraintAction);
  }
  /** 
   * Cancel OpenItemIdMap given ServiceInternalId/Resets..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ.  Defaulted Fields: InactiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void cancel (BSDMSessionContext context, OpenItemIdMapObjectData OIIMCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMCancelIn, defaultAction);
       
     cManager.checkConstraints(OIIMCancelIn, constraintAction);
       cancel (context, OIIMCancelIn);
  }

  /**

   * Update the priority of an OpenItemIdMap..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemIdMapObjectData priorityUpdate (OpenItemIdMapObjectData OIIMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return priorityUpdate (null, OIIMPrioUpdIn, defaultAction, constraintAction);
  }
  /** 
   * Update the priority of an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMPrioUpdIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, BalanceAccountInternalId, ChargeElementType, ChargeElementValue, OpenItemId, RatePeriod, ActiveDt, InactiveDt, ChgDt, ChgWho, Ineligible, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: ActiveDt, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemIdMapObjectData priorityUpdate (BSDMSessionContext context, OpenItemIdMapObjectData OIIMPrioUpdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMPrioUpdIn, defaultAction);
       
     cManager.checkConstraints(OIIMPrioUpdIn, constraintAction);
       return priorityUpdate (context, OIIMPrioUpdIn);
  }

  /**

   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..

   * Convenience method using default BSDMSessionContext.

   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return OpenItemIdMapObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public OpenItemIdMapObjectData bestMatch (OpenItemIdMapObjectData OIIMBestIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return bestMatch (null, OIIMBestIn, defaultAction, constraintAction);
  }
  /** 
   * Find the OpenItemId that best matches the Account/Service/Charge information passed in..
   * @param context The session context to use when connecting to the APITS server.
   * @param OIIMBestIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, OrderLevel, RatePeriod, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Defaulted Fields: ActiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return OpenItemIdMapObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public OpenItemIdMapObjectData bestMatch (BSDMSessionContext context, OpenItemIdMapObjectData OIIMBestIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OIIMBestIn, defaultAction);
       
     cManager.checkConstraints(OIIMBestIn, constraintAction);
       return bestMatch (context, OIIMBestIn);
  }

  /**

   * Derive the OrderLevel for an OpenItemIdMap..

   * Convenience method using default BSDMSessionContext.

   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer orderLevelDerive (OpenItemIdMapObjectData OrderLevelDeriveIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return orderLevelDerive (null, OrderLevelDeriveIn, defaultAction, constraintAction);
  }
  /** 
   * Derive the OrderLevel for an OpenItemIdMap..
   * @param context The session context to use when connecting to the APITS server.
   * @param OrderLevelDeriveIn Input  Object.  Read-Only fields: AccountInternalId, ServiceInternalIdResets, TrackingId, TrackingIdServ, OrderLevel, OpenItemId, BalanceAccountInternalId, ChgDt, ChgWho, InactiveDt, BalanceAccountExternalId, BalanceAccountExternalIdType.  Derived Fields: OrderLevel.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer orderLevelDerive (BSDMSessionContext context, OpenItemIdMapObjectData OrderLevelDeriveIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(OrderLevelDeriveIn, defaultAction);
       
     cManager.checkConstraints(OrderLevelDeriveIn, constraintAction);
       return orderLevelDerive (context, OrderLevelDeriveIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public OpenItemIdMapBean ()
  {
    try
    {
      _OpenItemIdMapCreateSpec = new BSDMInteractionSpec("OpenItemIdMapCreate", ApiMappings.getCallName ("OpenItemIdMapCreate"), Boolean.TRUE);

      _OpenItemIdMapGetSpec = new BSDMInteractionSpec("OpenItemIdMapGet", ApiMappings.getCallName ("OpenItemIdMapGet"), Boolean.TRUE);

      _OpenItemIdMapFindSpec = new BSDMInteractionSpec("OpenItemIdMapFind", ApiMappings.getCallName ("OpenItemIdMapFind"), Boolean.TRUE);

      _OpenItemIdMapDeleteSpec = new BSDMInteractionSpec("OpenItemIdMapDelete", ApiMappings.getCallName ("OpenItemIdMapDelete"), Boolean.TRUE);

      _OpenItemIdMapDeleteListSpec = new BSDMInteractionSpec("OpenItemIdMapDeleteList", ApiMappings.getCallName ("OpenItemIdMapDeleteList"), Boolean.TRUE);

      _OpenItemIdMapUpdateSpec = new BSDMInteractionSpec("OpenItemIdMapUpdate", ApiMappings.getCallName ("OpenItemIdMapUpdate"), Boolean.TRUE);

      _OpenItemIdMapCancelSpec = new BSDMInteractionSpec("OpenItemIdMapCancel", ApiMappings.getCallName ("OpenItemIdMapCancel"), Boolean.TRUE);

      _OpenItemIdMapPriorityUpdateSpec = new BSDMInteractionSpec("OpenItemIdMapPriorityUpdate", ApiMappings.getCallName ("OpenItemIdMapPriorityUpdate"), Boolean.TRUE);

      _OpenItemIdMapBestMatchSpec = new BSDMInteractionSpec("OpenItemIdMapBestMatch", ApiMappings.getCallName ("OpenItemIdMapBestMatch"), Boolean.TRUE);

      _OrderLevelDeriveSpec = new BSDMInteractionSpec("OrderLevelDerive", ApiMappings.getCallName ("OrderLevelDerive"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public OpenItemIdMapBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public OpenItemIdMapBean(BSDMSettings settings, BSDMConnectionManager cm)
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
