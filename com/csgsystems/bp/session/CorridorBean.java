
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CorridorBean.java
 * Definition File: Customer/Corridor.xml
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
import com.csgsystems.bp.interfaces.CorridorInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CorridorSessionBean"
 * display-name="Corridor Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CorridorBean"
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

@Stateless(name="CorridorBean", mappedName = "Corridor")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Corridors")

public class CorridorBean implements CorridorInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CorridorGetSpec = null;
  /**
   * Get a Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CCGetIn Input Object Key.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CorridorObjectData get (CorridorObjectKeyData CCGetIn) throws BSDMResourceException
  {
    return get (null, CCGetIn);
  }
  /**
   * Get a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCGetIn Input Object Key.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CorridorObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CorridorObjectKeyData CCGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CCGetIn != null) CorridorObjectKeyHelper.toMap (CCGetIn, record, "Corridor");
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
return CorridorObjectHelper.fromMap (record, "Corridor");
}

  private BSDMInteractionSpec _CorridorFindSpec = null;
  /**
   * Find Corridors..
   * Convenience method using default BSDMSessionContext.
   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CorridorObjectDataList find (CorridorObjectFilter CCFindIn) throws BSDMResourceException
  {
    return find (null, CCFindIn);
  }
  /**
   * Find Corridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CorridorObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CorridorObjectFilter CCFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CCFindIn != null) CorridorObjectHelper.toMap (CCFindIn, record, "Corridor");
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
return CorridorObjectHelper.fromMapList (record, "CorridorList");
}

  private BSDMInteractionSpec _CorridorDeleteSpec = null;
  /**
   * Cease a Corridor row..
   * Convenience method using default BSDMSessionContext.
   * @param CCDeleteIn Input Object Key.
   * @param CDCeaseDate (has a default).
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CorridorObjectData delete (CorridorObjectKeyData CCDeleteIn, Date CDCeaseDate) throws BSDMResourceException
  {
    return delete (null, CCDeleteIn, CDCeaseDate);
  }
  /**
   * Cease a Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCDeleteIn Input Object Key.
   * @param CDCeaseDate (has a default).
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CorridorObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CorridorObjectKeyData CCDeleteIn,@FormParam("CDCeaseDate")Date CDCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CCDeleteIn != null) CorridorObjectKeyHelper.toMap (CCDeleteIn, record, "Corridor");

      if (CDCeaseDate != null) record.put ("CDCeaseDate", CDCeaseDate);
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
return CorridorObjectHelper.fromMap (record, "Corridor");
}

  private BSDMInteractionSpec _CorridorDeleteListSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param CorridorDeleteListIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CorridorObjectDataList deleteList (CorridorObjectFilter CorridorDeleteListIn, Date InactiveDate) throws BSDMResourceException
  {
    return deleteList (null, CorridorDeleteListIn, InactiveDate);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param CorridorDeleteListIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CorridorObjectDataList deleteList (@HeaderParam ("context")BSDMSessionContext context,CorridorObjectFilter CorridorDeleteListIn,@FormParam("InactiveDate")Date InactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CorridorDeleteListIn != null) CorridorObjectHelper.toMap (CorridorDeleteListIn, record, "Corridor");

      if (InactiveDate != null) record.put ("InactiveDate", InactiveDate);
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
return CorridorObjectHelper.fromMapList (record, "CorridorList");
}

  private BSDMInteractionSpec _CorridorCreateSpec = null;
  /**
   * Create a new Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CorridorObjectData create (CorridorObjectData CorrCreateIn) throws BSDMResourceException
  {
    return create (null, CorrCreateIn);
  }
  /**
   * Create a new Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CorridorObjectData create (@HeaderParam ("context")BSDMSessionContext context,CorridorObjectData CorrCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CorrCreateIn != null) CorridorObjectHelper.toMap (CorrCreateIn, record, "Corridor");
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
return CorridorObjectHelper.fromMap (record, "Corridor");
}

  private BSDMInteractionSpec _CorridorUpdateSpec = null;
  /**
   * Update non-key fields of a Corridor..
   * Convenience method using default BSDMSessionContext.
   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CorridorObjectData update (CorridorObjectData CorrUpdateIn) throws BSDMResourceException
  {
    return update (null, CorrUpdateIn);
  }
  /**
   * Update non-key fields of a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CorridorObjectData update (@HeaderParam ("context")BSDMSessionContext context,CorridorObjectData CorrUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CorrUpdateIn != null) CorridorObjectHelper.toMap (CorrUpdateIn, record, "Corridor");
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
return CorridorObjectHelper.fromMap (record, "Corridor");
}

  private BSDMInteractionSpec _CorridorConvertSpec = null;
  /**
   * Convert a Corridor to an ICB..
   * Convenience method using default BSDMSessionContext.
   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CorridorObjectData convert (CorridorObjectData CorrConvertIn) throws BSDMResourceException
  {
    return convert (null, CorrConvertIn);
  }
  /**
   * Convert a Corridor to an ICB..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("convert")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CorridorObjectData convert (@HeaderParam ("context")BSDMSessionContext context,CorridorObjectData CorrConvertIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CorridorConvertSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CorrConvertIn != null) CorridorObjectHelper.toMap (CorrConvertIn, record, "Corridor");
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
return CorridorObjectHelper.fromMap (record, "Corridor");
}

  /**

   * Get a Corridor..

   * Convenience method using default BSDMSessionContext.

   * @param CCGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CorridorObjectData get (CorridorObjectKeyData CCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CCGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CorridorObjectData get (BSDMSessionContext context, CorridorObjectKeyData CCGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CCGetIn, defaultAction);
       
     cManager.checkConstraints(CCGetIn, constraintAction);
       return get (context, CCGetIn);
  }

  /**

   * Find Corridors..

   * Convenience method using default BSDMSessionContext.

   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CorridorObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CorridorObjectDataList find (CorridorObjectFilter CCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CCFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Corridors..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCFindIn Input Filter Object.  Defaulted Fields: OwningAccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CorridorObjectDataList find (BSDMSessionContext context, CorridorObjectFilter CCFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CCFindIn, defaultAction);
       
     cManager.checkConstraints(CCFindIn, constraintAction);
       return find (context, CCFindIn);
  }

  /**

   * Cease a Corridor row..

   * Convenience method using default BSDMSessionContext.

   * @param CCDeleteIn Input Object Key.

   * @param CDCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CorridorObjectData delete (CorridorObjectKeyData CCDeleteIn, Date CDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CCDeleteIn, CDCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease a Corridor row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CCDeleteIn Input Object Key.
   * @param CDCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CorridorObjectData delete (BSDMSessionContext context, CorridorObjectKeyData CCDeleteIn, Date CDCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CCDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(CCDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, CCDeleteIn, CDCeaseDate);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param CorridorDeleteListIn Input Filter Object.

   * @param InactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CorridorObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CorridorObjectDataList deleteList (CorridorObjectFilter CorridorDeleteListIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return deleteList (null, CorridorDeleteListIn, InactiveDate, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param CorridorDeleteListIn Input Filter Object.
   * @param InactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CorridorObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CorridorObjectDataList deleteList (BSDMSessionContext context, CorridorObjectFilter CorridorDeleteListIn, Date InactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CorridorDeleteListIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(CorridorDeleteListIn, constraintAction);
       
    //Constraints not supported on Input-Column
return deleteList (context, CorridorDeleteListIn, InactiveDate);
  }

  /**

   * Create a new Corridor..

   * Convenience method using default BSDMSessionContext.

   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CorridorObjectData create (CorridorObjectData CorrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CorrCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrCreateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode, ActiveDt.  Derived Fields: TrackingId, TrackingIdServ, CreateDt, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CorridorObjectData create (BSDMSessionContext context, CorridorObjectData CorrCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CorrCreateIn, defaultAction);
       
     cManager.checkConstraints(CorrCreateIn, constraintAction);
       return create (context, CorrCreateIn);
  }

  /**

   * Update non-key fields of a Corridor..

   * Convenience method using default BSDMSessionContext.

   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CorridorObjectData update (CorridorObjectData CorrUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CorrUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a Corridor..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrUpdateIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt.  Defaulted Fields: LanguageCode.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CorridorObjectData update (BSDMSessionContext context, CorridorObjectData CorrUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CorrUpdateIn, defaultAction);
       
     cManager.checkConstraints(CorrUpdateIn, constraintAction);
       return update (context, CorrUpdateIn);
  }

  /**

   * Convert a Corridor to an ICB..

   * Convenience method using default BSDMSessionContext.

   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CorridorObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CorridorObjectData convert (CorridorObjectData CorrConvertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return convert (null, CorrConvertIn, defaultAction, constraintAction);
  }
  /** 
   * Convert a Corridor to an ICB..
   * @param context The session context to use when connecting to the APITS server.
   * @param CorrConvertIn Input  Object.  Read-Only fields: PrevEndDt, ChgWho, ChgDt, CreateDt, ActiveDt, InactiveDt, PointOrigin, OriginIsXact, CountryCodeOrigin, PointTarget, TargetIsXact, CountryCodeTarget, CorridorPlanId, AccessRegionOrigin, AccessRegionTarget, PointCategory, ServiceInternalId, ServiceInternalIdResets, OwningAccountInternalId, OwningAccountExternalId, OwningAccountExternalIdType, LanguageCode, ShortDisplay, DisplayValue, IsIcbCorridor, OriginRestriction, TargetRestriction, PlanType, PlanLevel, DiscountId, MaxCorridors, IsDefault, IsInternal.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CorridorObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CorridorObjectData convert (BSDMSessionContext context, CorridorObjectData CorrConvertIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CorrConvertIn, defaultAction);
       
     cManager.checkConstraints(CorrConvertIn, constraintAction);
       return convert (context, CorrConvertIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CorridorBean ()
  {
    try
    {
      _CorridorGetSpec = new BSDMInteractionSpec("CorridorGet", ApiMappings.getCallName ("CorridorGet"), Boolean.TRUE);

      _CorridorFindSpec = new BSDMInteractionSpec("CorridorFind", ApiMappings.getCallName ("CorridorFind"), Boolean.TRUE);

      _CorridorDeleteSpec = new BSDMInteractionSpec("CorridorDelete", ApiMappings.getCallName ("CorridorDelete"), Boolean.TRUE);

      _CorridorDeleteListSpec = new BSDMInteractionSpec("CorridorDeleteList", ApiMappings.getCallName ("CorridorDeleteList"), Boolean.TRUE);

      _CorridorCreateSpec = new BSDMInteractionSpec("CorridorCreate", ApiMappings.getCallName ("CorridorCreate"), Boolean.TRUE);

      _CorridorUpdateSpec = new BSDMInteractionSpec("CorridorUpdate", ApiMappings.getCallName ("CorridorUpdate"), Boolean.TRUE);

      _CorridorConvertSpec = new BSDMInteractionSpec("CorridorConvert", ApiMappings.getCallName ("CorridorConvert"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CorridorBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CorridorBean(BSDMSettings settings, BSDMConnectionManager cm)
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
