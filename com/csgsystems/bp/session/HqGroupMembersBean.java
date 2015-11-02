
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HqGroupMembersBean.java
 * Definition File: Catalog/HqGroupMembers.xml
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
import com.csgsystems.bp.interfaces.HqGroupMembersInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HqGroupMembersSessionBean"
 * display-name="HqGroupMembers Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HqGroupMembersBean"
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

@Stateless(name="HqGroupMembersBean", mappedName = "HqGroupMembers")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HqGroupMembers")

public class HqGroupMembersBean implements HqGroupMembersInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HqGroupMembersCreateSpec = null;
  /**
   * Creates a new HqGroupMembers..
   * Convenience method using default BSDMSessionContext.
   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupMembersObjectData create (HqGroupMembersObjectData HGMCreateIn) throws BSDMResourceException
  {
    return create (null, HGMCreateIn);
  }
  /**
   * Creates a new HqGroupMembers..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupMembersObjectData create (@HeaderParam ("context")BSDMSessionContext context,HqGroupMembersObjectData HGMCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupMembersCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGMCreateIn != null) HqGroupMembersObjectHelper.toMap (HGMCreateIn, record, "HqGroupMembers");
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
return HqGroupMembersObjectHelper.fromMap (record, "HqGroupMembers");
}

  private BSDMInteractionSpec _HqGroupMembersUpdateSpec = null;
  /**
   * Update non-key fields in an group members..
   * Convenience method using default BSDMSessionContext.
   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupMembersObjectData update (HqGroupMembersObjectData HGMUpdateIn) throws BSDMResourceException
  {
    return update (null, HGMUpdateIn);
  }
  /**
   * Update non-key fields in an group members..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupMembersObjectData update (@HeaderParam ("context")BSDMSessionContext context,HqGroupMembersObjectData HGMUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupMembersUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGMUpdateIn != null) HqGroupMembersObjectHelper.toMap (HGMUpdateIn, record, "HqGroupMembers");
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
return HqGroupMembersObjectHelper.fromMap (record, "HqGroupMembers");
}

  private BSDMInteractionSpec _HqGroupMembersFindSpec = null;
  /**
   * Finds Group members based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGMFindIn Input Filter Object.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupMembersObjectDataList find (HqGroupMembersObjectFilter HGMFindIn) throws BSDMResourceException
  {
    return find (null, HGMFindIn);
  }
  /**
   * Finds Group members based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMFindIn Input Filter Object.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupMembersObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HqGroupMembersObjectFilter HGMFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupMembersFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGMFindIn != null) HqGroupMembersObjectHelper.toMap (HGMFindIn, record, "HqGroupMembers");
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
return HqGroupMembersObjectHelper.fromMapList (record, "HqGroupMembersList");
}

  private BSDMInteractionSpec _HqGroupMembersGetSpec = null;
  /**
   * Retrieves a Group Members object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param HGMGetIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupMembersObjectData get (HqGroupMembersObjectData HGMGetIn) throws BSDMResourceException
  {
    return get (null, HGMGetIn);
  }
  /**
   * Retrieves a Group Members object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMGetIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HqGroupMembersObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HqGroupMembersObjectData HGMGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupMembersGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGMGetIn != null) HqGroupMembersObjectHelper.toMap (HGMGetIn, record, "HqGroupMembers");
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
return HqGroupMembersObjectHelper.fromMap (record, "HqGroupMembers");
}

  private BSDMInteractionSpec _HqGroupMembersDeleteSpec = null;
  /**
   * Cease a Group Member..
   * Convenience method using default BSDMSessionContext.
   * @param HGMDeleteIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupMembersObjectData delete (HqGroupMembersObjectData HGMDeleteIn) throws BSDMResourceException
  {
    return delete (null, HGMDeleteIn);
  }
  /**
   * Cease a Group Member..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDeleteIn Input  Object.
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupMembersObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HqGroupMembersObjectData HGMDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupMembersDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGMDeleteIn != null) HqGroupMembersObjectHelper.toMap (HGMDeleteIn, record, "HqGroupMembers");
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
return HqGroupMembersObjectHelper.fromMap (record, "HqGroupMembers");
}

  private BSDMInteractionSpec _HqGroupMembersDeleteListSpec = null;
  /**
   * Cease group Members that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HGMDlIn Input Filter Object.
   * @param HGMDlInactiveDate (has a default).
   * @param HGMDlDiscRe.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupMembersObjectDataList deleteList (HqGroupMembersObjectFilter HGMDlIn, Date HGMDlInactiveDate, Integer HGMDlDiscRe) throws BSDMResourceException
  {
    return deleteList (null, HGMDlIn, HGMDlInactiveDate, HGMDlDiscRe);
  }
  /**
   * Cease group Members that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDlIn Input Filter Object.
   * @param HGMDlInactiveDate (has a default).
   * @param HGMDlDiscRe.
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupMembersObjectDataList deleteList (@HeaderParam ("context")BSDMSessionContext context,HqGroupMembersObjectFilter HGMDlIn,@FormParam("HGMDlInactiveDate")Date HGMDlInactiveDate,@FormParam("HGMDlDiscRe")Integer HGMDlDiscRe) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupMembersDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (HGMDlIn != null) HqGroupMembersObjectHelper.toMap (HGMDlIn, record, "HqGroupMembers");

      if (HGMDlInactiveDate != null) record.put ("HGMDlInactiveDate", HGMDlInactiveDate);

      if (HGMDlDiscRe != null) record.put ("HGMDlDiscRe", HGMDlDiscRe);
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
return HqGroupMembersObjectHelper.fromMapList (record, "HqGroupMembersList");
}

  /**

   * Creates a new HqGroupMembers..

   * Convenience method using default BSDMSessionContext.

   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupMembersObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupMembersObjectData create (HqGroupMembersObjectData HGMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, HGMCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Creates a new HqGroupMembers..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMCreateIn Input  Object.  Derived Fields: TrackingId, TrackingIdServ, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupMembersObjectData create (BSDMSessionContext context, HqGroupMembersObjectData HGMCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGMCreateIn, defaultAction);
       
     cManager.checkConstraints(HGMCreateIn, constraintAction);
       return create (context, HGMCreateIn);
  }

  /**

   * Update non-key fields in an group members..

   * Convenience method using default BSDMSessionContext.

   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupMembersObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupMembersObjectData update (HqGroupMembersObjectData HGMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, HGMUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields in an group members..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMUpdateIn Input  Object.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupMembersObjectData update (BSDMSessionContext context, HqGroupMembersObjectData HGMUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGMUpdateIn, defaultAction);
       
     cManager.checkConstraints(HGMUpdateIn, constraintAction);
       return update (context, HGMUpdateIn);
  }

  /**

   * Finds Group members based upon the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HGMFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupMembersObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupMembersObjectDataList find (HqGroupMembersObjectFilter HGMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, HGMFindIn, defaultAction, constraintAction);
  }
  /** 
   * Finds Group members based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupMembersObjectDataList find (BSDMSessionContext context, HqGroupMembersObjectFilter HGMFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGMFindIn, defaultAction);
       
     cManager.checkConstraints(HGMFindIn, constraintAction);
       return find (context, HGMFindIn);
  }

  /**

   * Retrieves a Group Members object based on its key..

   * Convenience method using default BSDMSessionContext.

   * @param HGMGetIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupMembersObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupMembersObjectData get (HqGroupMembersObjectData HGMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, HGMGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieves a Group Members object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMGetIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupMembersObjectData get (BSDMSessionContext context, HqGroupMembersObjectData HGMGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGMGetIn, defaultAction);
       
     cManager.checkConstraints(HGMGetIn, constraintAction);
       return get (context, HGMGetIn);
  }

  /**

   * Cease a Group Member..

   * Convenience method using default BSDMSessionContext.

   * @param HGMDeleteIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupMembersObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupMembersObjectData delete (HqGroupMembersObjectData HGMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, HGMDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Cease a Group Member..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDeleteIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupMembersObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupMembersObjectData delete (BSDMSessionContext context, HqGroupMembersObjectData HGMDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGMDeleteIn, defaultAction);
       
     cManager.checkConstraints(HGMDeleteIn, constraintAction);
       return delete (context, HGMDeleteIn);
  }

  /**

   * Cease group Members that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param HGMDlIn Input Filter Object.

   * @param HGMDlInactiveDate (has a default).

   * @param HGMDlDiscRe.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupMembersObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupMembersObjectDataList deleteList (HqGroupMembersObjectFilter HGMDlIn, Date HGMDlInactiveDate, Integer HGMDlDiscRe, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return deleteList (null, HGMDlIn, HGMDlInactiveDate, HGMDlDiscRe, defaultAction, constraintAction);
  }
  /** 
   * Cease group Members that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HGMDlIn Input Filter Object.
   * @param HGMDlInactiveDate (has a default).
   * @param HGMDlDiscRe.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupMembersObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupMembersObjectDataList deleteList (BSDMSessionContext context, HqGroupMembersObjectFilter HGMDlIn, Date HGMDlInactiveDate, Integer HGMDlDiscRe, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(HGMDlIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(HGMDlIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return deleteList (context, HGMDlIn, HGMDlInactiveDate, HGMDlDiscRe);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HqGroupMembersBean ()
  {
    try
    {
      _HqGroupMembersCreateSpec = new BSDMInteractionSpec("HqGroupMembersCreate", ApiMappings.getCallName ("HqGroupMembersCreate"), Boolean.TRUE);

      _HqGroupMembersUpdateSpec = new BSDMInteractionSpec("HqGroupMembersUpdate", ApiMappings.getCallName ("HqGroupMembersUpdate"), Boolean.TRUE);

      _HqGroupMembersFindSpec = new BSDMInteractionSpec("HqGroupMembersFind", ApiMappings.getCallName ("HqGroupMembersFind"), Boolean.TRUE);

      _HqGroupMembersGetSpec = new BSDMInteractionSpec("HqGroupMembersGet", ApiMappings.getCallName ("HqGroupMembersGet"), Boolean.TRUE);

      _HqGroupMembersDeleteSpec = new BSDMInteractionSpec("HqGroupMembersDelete", ApiMappings.getCallName ("HqGroupMembersDelete"), Boolean.TRUE);

      _HqGroupMembersDeleteListSpec = new BSDMInteractionSpec("HqGroupMembersDeleteList", ApiMappings.getCallName ("HqGroupMembersDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HqGroupMembersBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HqGroupMembersBean(BSDMSettings settings, BSDMConnectionManager cm)
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
