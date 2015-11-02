
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ServiceZoneBean.java
 * Definition File: Customer/ServiceZone.xml
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
import com.csgsystems.bp.interfaces.ServiceZoneInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ServiceZoneSessionBean"
 * display-name="ServiceZone Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ServiceZoneBean"
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

@Stateless(name="ServiceZoneBean", mappedName = "ServiceZone")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ServiceZones")

public class ServiceZoneBean implements ServiceZoneInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ServiceZoneGetSpec = null;
  /**
   * Get a unique ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZGetIn Input Object Key.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceZoneObjectData get (ServiceZoneObjectKeyData SZGetIn) throws BSDMResourceException
  {
    return get (null, SZGetIn);
  }
  /**
   * Get a unique ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZGetIn Input Object Key.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ServiceZoneObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ServiceZoneObjectKeyData SZGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceZoneGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SZGetIn != null) ServiceZoneObjectKeyHelper.toMap (SZGetIn, record, "ServiceZone");
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
return ServiceZoneObjectHelper.fromMap (record, "ServiceZone");
}

  private BSDMInteractionSpec _ServiceZoneCreateSpec = null;
  /**
   * Create a new ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceZoneObjectData create (ServiceZoneObjectData SZCreateIn) throws BSDMResourceException
  {
    return create (null, SZCreateIn);
  }
  /**
   * Create a new ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceZoneObjectData create (@HeaderParam ("context")BSDMSessionContext context,ServiceZoneObjectData SZCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceZoneCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SZCreateIn != null) ServiceZoneObjectHelper.toMap (SZCreateIn, record, "ServiceZone");
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
return ServiceZoneObjectHelper.fromMap (record, "ServiceZone");
}

  private BSDMInteractionSpec _ServiceZoneUpdateSpec = null;
  /**
   * Update the non-key fields of a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZUpdateIn Input  Object.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceZoneObjectData update (ServiceZoneObjectData SZUpdateIn) throws BSDMResourceException
  {
    return update (null, SZUpdateIn);
  }
  /**
   * Update the non-key fields of a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZUpdateIn Input  Object.
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceZoneObjectData update (@HeaderParam ("context")BSDMSessionContext context,ServiceZoneObjectData SZUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceZoneUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SZUpdateIn != null) ServiceZoneObjectHelper.toMap (SZUpdateIn, record, "ServiceZone");
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
return ServiceZoneObjectHelper.fromMap (record, "ServiceZone");
}

  private BSDMInteractionSpec _ServiceZoneFindSpec = null;
  /**
   * Find ServiceZone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param SZFindIn Input Filter Object.
   * @return ServiceZoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceZoneObjectDataList find (ServiceZoneObjectFilter SZFindIn) throws BSDMResourceException
  {
    return find (null, SZFindIn);
  }
  /**
   * Find ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZFindIn Input Filter Object.
   * @return ServiceZoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceZoneObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ServiceZoneObjectFilter SZFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceZoneFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SZFindIn != null) ServiceZoneObjectHelper.toMap (SZFindIn, record, "ServiceZone");
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
return ServiceZoneObjectHelper.fromMapList (record, "ServiceZoneList");
}

  private BSDMInteractionSpec _ServiceZoneDeleteSpec = null;
  /**
   * Cease a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZDeleteIn Input Object Key.
   * @param SZDCeaseDate (has a default).
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceZoneObjectData delete (ServiceZoneObjectKeyData SZDeleteIn, Date SZDCeaseDate) throws BSDMResourceException
  {
    return delete (null, SZDeleteIn, SZDCeaseDate);
  }
  /**
   * Cease a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZDeleteIn Input Object Key.
   * @param SZDCeaseDate (has a default).
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceZoneObjectData delete (@HeaderParam ("context")BSDMSessionContext context,ServiceZoneObjectKeyData SZDeleteIn,@FormParam("SZDCeaseDate")Date SZDCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceZoneDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SZDeleteIn != null) ServiceZoneObjectKeyHelper.toMap (SZDeleteIn, record, "ServiceZone");

      if (SZDCeaseDate != null) record.put ("InactiveDate", SZDCeaseDate);
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
return ServiceZoneObjectHelper.fromMap (record, "ServiceZone");
}

  private BSDMInteractionSpec _ServiceZoneDeleteListSpec = null;
  /**
   * Cease the ServiceZone's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.
   * @param SZDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (ServiceZoneObjectFilter ServiceZoneFilter, Date SZDLCeaseDate) throws BSDMResourceException
  {
    deleteList (null, ServiceZoneFilter, SZDLCeaseDate);
  }
  /**
   * Cease the ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.
   * @param SZDLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,ServiceZoneObjectFilter ServiceZoneFilter,@FormParam("SZDLCeaseDate")Date SZDLCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceZoneDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (SZDLCeaseDate != null) record.put ("InactiveDate", SZDLCeaseDate);
      if (ServiceZoneFilter != null) ServiceZoneObjectHelper.toMap (ServiceZoneFilter, record, "ServiceZoneFilter");
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

  private BSDMInteractionSpec _ServiceZoneCancelSpec = null;
  /**
   * Cancel a ServiceZone..
   * Convenience method using default BSDMSessionContext.
   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.
   * @param SZCCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void cancel (ServiceZoneObjectData SZCancelIn, Date SZCCeaseDate) throws BSDMResourceException
  {
    cancel (null, SZCancelIn, SZCCeaseDate);
  }
  /**
   * Cancel a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.
   * @param SZCCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("cancel")
@Consumes({"application/json","application/xml"})

 public void cancel (@HeaderParam ("context")BSDMSessionContext context,ServiceZoneObjectData SZCancelIn,@FormParam("SZCCeaseDate")Date SZCCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServiceZoneCancelSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SZCancelIn != null) ServiceZoneObjectHelper.toMap (SZCancelIn, record, "ServiceZone");

      if (SZCCeaseDate != null) record.put ("CancelDate", SZCCeaseDate);
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

   * Get a unique ServiceZone..

   * Convenience method using default BSDMSessionContext.

   * @param SZGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceZoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceZoneObjectData get (ServiceZoneObjectKeyData SZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, SZGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceZoneObjectData get (BSDMSessionContext context, ServiceZoneObjectKeyData SZGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SZGetIn, defaultAction);
       
     cManager.checkConstraints(SZGetIn, constraintAction);
       return get (context, SZGetIn);
  }

  /**

   * Create a new ServiceZone..

   * Convenience method using default BSDMSessionContext.

   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceZoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceZoneObjectData create (ServiceZoneObjectData SZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, SZCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceZoneObjectData create (BSDMSessionContext context, ServiceZoneObjectData SZCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SZCreateIn, defaultAction);
       
     cManager.checkConstraints(SZCreateIn, constraintAction);
       return create (context, SZCreateIn);
  }

  /**

   * Update the non-key fields of a ServiceZone..

   * Convenience method using default BSDMSessionContext.

   * @param SZUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceZoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceZoneObjectData update (ServiceZoneObjectData SZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, SZUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceZoneObjectData update (BSDMSessionContext context, ServiceZoneObjectData SZUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SZUpdateIn, defaultAction);
       
     cManager.checkConstraints(SZUpdateIn, constraintAction);
       return update (context, SZUpdateIn);
  }

  /**

   * Find ServiceZone's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param SZFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceZoneObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceZoneObjectDataList find (ServiceZoneObjectFilter SZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, SZFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceZoneObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceZoneObjectDataList find (BSDMSessionContext context, ServiceZoneObjectFilter SZFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SZFindIn, defaultAction);
       
     cManager.checkConstraints(SZFindIn, constraintAction);
       return find (context, SZFindIn);
  }

  /**

   * Cease a ServiceZone..

   * Convenience method using default BSDMSessionContext.

   * @param SZDeleteIn Input Object Key.

   * @param SZDCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceZoneObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceZoneObjectData delete (ServiceZoneObjectKeyData SZDeleteIn, Date SZDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, SZDeleteIn, SZDCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZDeleteIn Input Object Key.
   * @param SZDCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceZoneObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceZoneObjectData delete (BSDMSessionContext context, ServiceZoneObjectKeyData SZDeleteIn, Date SZDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SZDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(SZDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, SZDeleteIn, SZDCeaseDate);
  }

  /**

   * Cease the ServiceZone's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.

   * @param SZDLCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (ServiceZoneObjectFilter ServiceZoneFilter, Date SZDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, ServiceZoneFilter, SZDLCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease the ServiceZone's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ServiceZoneFilter Input Filter Object.  Read-Only fields: ServiceExternalId, ServiceExternalIdType.
   * @param SZDLCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, ServiceZoneObjectFilter ServiceZoneFilter, Date SZDLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(ServiceZoneFilter, defaultAction);
       
    //Constraints not supported on Input-Column

     cManager.checkConstraints(ServiceZoneFilter, constraintAction);
       deleteList (context, ServiceZoneFilter, SZDLCeaseDate);
  }

  /**

   * Cancel a ServiceZone..

   * Convenience method using default BSDMSessionContext.

   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.

   * @param SZCCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void cancel (ServiceZoneObjectData SZCancelIn, Date SZCCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    cancel (null, SZCancelIn, SZCCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cancel a ServiceZone..
   * @param context The session context to use when connecting to the APITS server.
   * @param SZCancelIn Input  Object.  Read-Only fields: TrackingId, TrackingIdServ, ActiveDt, InactiveDt, ZoneId, ElementId, ServiceExternalId, ServiceExternalIdType.
   * @param SZCCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void cancel (BSDMSessionContext context, ServiceZoneObjectData SZCancelIn, Date SZCCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SZCancelIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(SZCancelIn, constraintAction);
       
    //Constraints not supported on Input-Column
cancel (context, SZCancelIn, SZCCeaseDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ServiceZoneBean ()
  {
    try
    {
      _ServiceZoneGetSpec = new BSDMInteractionSpec("ServiceZoneGet", ApiMappings.getCallName ("ServiceZoneGet"), Boolean.TRUE);

      _ServiceZoneCreateSpec = new BSDMInteractionSpec("ServiceZoneCreate", ApiMappings.getCallName ("ServiceZoneCreate"), Boolean.TRUE);

      _ServiceZoneUpdateSpec = new BSDMInteractionSpec("ServiceZoneUpdate", ApiMappings.getCallName ("ServiceZoneUpdate"), Boolean.TRUE);

      _ServiceZoneFindSpec = new BSDMInteractionSpec("ServiceZoneFind", ApiMappings.getCallName ("ServiceZoneFind"), Boolean.TRUE);

      _ServiceZoneDeleteSpec = new BSDMInteractionSpec("ServiceZoneDelete", ApiMappings.getCallName ("ServiceZoneDelete"), Boolean.TRUE);

      _ServiceZoneDeleteListSpec = new BSDMInteractionSpec("ServiceZoneDeleteList", ApiMappings.getCallName ("ServiceZoneDeleteList"), Boolean.TRUE);

      _ServiceZoneCancelSpec = new BSDMInteractionSpec("ServiceZoneCancel", ApiMappings.getCallName ("ServiceZoneCancel"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ServiceZoneBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ServiceZoneBean(BSDMSettings settings, BSDMConnectionManager cm)
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
