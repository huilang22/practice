
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GroupMemberBean.java
 * Definition File: Customer/GroupMember.xml
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
import com.csgsystems.bp.interfaces.GroupMemberInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GroupMemberSessionBean"
 * display-name="GroupMember Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GroupMemberBean"
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

@Stateless(name="GroupMemberBean", mappedName = "GroupMember")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("GroupMembers")

public class GroupMemberBean implements GroupMemberInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GroupMemberGetSpec = null;
  /**
   * Retrieve a unique GroupMember..
   * Convenience method using default BSDMSessionContext.
   * @param GMgetIn Input Object Key.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupMemberObjectData get (GroupMemberObjectKeyData GMgetIn) throws BSDMResourceException
  {
    return get (null, GMgetIn);
  }
  /**
   * Retrieve a unique GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMgetIn Input Object Key.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GroupMemberObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GroupMemberObjectKeyData GMgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupMemberGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GMgetIn != null) GroupMemberObjectKeyHelper.toMap (GMgetIn, record, "GroupMember");
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
return GroupMemberObjectHelper.fromMap (record, "GroupMember");
}

  private BSDMInteractionSpec _GroupMemberFindSpec = null;
  /**
   * Find GroupMember's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupMemberObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupMemberObjectDataList find (GroupMemberObjectFilter GMfindIn) throws BSDMResourceException
  {
    return find (null, GMfindIn);
  }
  /**
   * Find GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @return GroupMemberObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GroupMemberObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GroupMemberObjectFilter GMfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupMemberFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GMfindIn != null) GroupMemberObjectHelper.toMap (GMfindIn, record, "GroupMember");
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
return GroupMemberObjectHelper.fromMapList (record, "GroupMemberList");
}

  private BSDMInteractionSpec _GroupMemberCreateSpec = null;
  /**
   * Create a new GroupMember row..
   * Convenience method using default BSDMSessionContext.
   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupMemberObjectData create (GroupMemberObjectData GMcreateIn) throws BSDMResourceException
  {
    return create (null, GMcreateIn);
  }
  /**
   * Create a new GroupMember row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GroupMemberObjectData create (@HeaderParam ("context")BSDMSessionContext context,GroupMemberObjectData GMcreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupMemberCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GMcreateIn != null) GroupMemberObjectHelper.toMap (GMcreateIn, record, "GroupMember");
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
return GroupMemberObjectHelper.fromMap (record, "GroupMember");
}

  private BSDMInteractionSpec _GroupMemberUpdateSpec = null;
  /**
   * Update non key information in a GroupMember object..
   * Convenience method using default BSDMSessionContext.
   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupMemberObjectData update (GroupMemberObjectData GMupdateIn) throws BSDMResourceException
  {
    return update (null, GMupdateIn);
  }
  /**
   * Update non key information in a GroupMember object..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GroupMemberObjectData update (@HeaderParam ("context")BSDMSessionContext context,GroupMemberObjectData GMupdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupMemberUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GMupdateIn != null) GroupMemberObjectHelper.toMap (GMupdateIn, record, "GroupMember");
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
return GroupMemberObjectHelper.fromMap (record, "GroupMember");
}

  private BSDMInteractionSpec _GroupMemberDeleteSpec = null;
  /**
   * Cease a GroupMember..
   * Convenience method using default BSDMSessionContext.
   * @param GMdeleteIn Input Object Key.
   * @param GMInactiveDate (has a default).
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GroupMemberObjectData delete (GroupMemberObjectKeyData GMdeleteIn, Date GMInactiveDate) throws BSDMResourceException
  {
    return delete (null, GMdeleteIn, GMInactiveDate);
  }
  /**
   * Cease a GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMdeleteIn Input Object Key.
   * @param GMInactiveDate (has a default).
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GroupMemberObjectData delete (@HeaderParam ("context")BSDMSessionContext context,GroupMemberObjectKeyData GMdeleteIn,@FormParam("GMInactiveDate")Date GMInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupMemberDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GMdeleteIn != null) GroupMemberObjectKeyHelper.toMap (GMdeleteIn, record, "GroupMember");

      if (GMInactiveDate != null) record.put ("InactiveDate", GMInactiveDate);
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
return GroupMemberObjectHelper.fromMap (record, "GroupMember");
}

  private BSDMInteractionSpec _GroupMemberDeleteListSpec = null;
  /**
   * Cease GroupMember's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.
   * @param GMLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (GroupMemberObjectFilter GMLdeleteIn, Date GMLInactiveDate) throws BSDMResourceException
  {
    deleteList (null, GMLdeleteIn, GMLInactiveDate);
  }
  /**
   * Cease GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.
   * @param GMLInactiveDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,GroupMemberObjectFilter GMLdeleteIn,@FormParam("GMLInactiveDate")Date GMLInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GroupMemberDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GMLdeleteIn != null) GroupMemberObjectHelper.toMap (GMLdeleteIn, record, "GroupMember");

      if (GMLInactiveDate != null) record.put ("InactiveDate", GMLInactiveDate);
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

   * Retrieve a unique GroupMember..

   * Convenience method using default BSDMSessionContext.

   * @param GMgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupMemberObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupMemberObjectData get (GroupMemberObjectKeyData GMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GMgetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupMemberObjectData get (BSDMSessionContext context, GroupMemberObjectKeyData GMgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GMgetIn, defaultAction);
       
     cManager.checkConstraints(GMgetIn, constraintAction);
       return get (context, GMgetIn);
  }

  /**

   * Find GroupMember's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupMemberObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupMemberObjectDataList find (GroupMemberObjectFilter GMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GMfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMfindIn Input Filter Object.  Derived Fields: AccountExternalIdType.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupMemberObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupMemberObjectDataList find (BSDMSessionContext context, GroupMemberObjectFilter GMfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GMfindIn, defaultAction);
       
     cManager.checkConstraints(GMfindIn, constraintAction);
       return find (context, GMfindIn);
  }

  /**

   * Create a new GroupMember row..

   * Convenience method using default BSDMSessionContext.

   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupMemberObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupMemberObjectData create (GroupMemberObjectData GMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GMcreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new GroupMember row..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMcreateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Defaulted Fields: AccountInternalId, ServiceInternalId, ServiceInternalIdResets, ActiveDt, IsDesignated.  Derived Fields: ActiveDt, AccountExternalIdType, ChgDt, ChgWho, CreateDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupMemberObjectData create (BSDMSessionContext context, GroupMemberObjectData GMcreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GMcreateIn, defaultAction);
       
     cManager.checkConstraints(GMcreateIn, constraintAction);
       return create (context, GMcreateIn);
  }

  /**

   * Update non key information in a GroupMember object..

   * Convenience method using default BSDMSessionContext.

   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupMemberObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupMemberObjectData update (GroupMemberObjectData GMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GMupdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non key information in a GroupMember object..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMupdateIn Input  Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, GroupExternalId, GroupExternalIdType, ServiceExternalId, ServiceExternalIdType, ChgDt, ChgWho, CreateDt.  Derived Fields: AccountExternalIdType, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupMemberObjectData update (BSDMSessionContext context, GroupMemberObjectData GMupdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GMupdateIn, defaultAction);
       
     cManager.checkConstraints(GMupdateIn, constraintAction);
       return update (context, GMupdateIn);
  }

  /**

   * Cease a GroupMember..

   * Convenience method using default BSDMSessionContext.

   * @param GMdeleteIn Input Object Key.

   * @param GMInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GroupMemberObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GroupMemberObjectData delete (GroupMemberObjectKeyData GMdeleteIn, Date GMInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GMdeleteIn, GMInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease a GroupMember..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMdeleteIn Input Object Key.
   * @param GMInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GroupMemberObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GroupMemberObjectData delete (BSDMSessionContext context, GroupMemberObjectKeyData GMdeleteIn, Date GMInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GMdeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(GMdeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
return delete (context, GMdeleteIn, GMInactiveDate);
  }

  /**

   * Cease GroupMember's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.

   * @param GMLInactiveDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (GroupMemberObjectFilter GMLdeleteIn, Date GMLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, GMLdeleteIn, GMLInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease GroupMember's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param GMLdeleteIn Input Filter Object.  Read-Only fields: AccountExternalId, AccountExternalIdType, ServiceExternalId, ServiceExternalIdType, GroupExternalId, GroupExternalIdType.
   * @param GMLInactiveDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, GroupMemberObjectFilter GMLdeleteIn, Date GMLInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GMLdeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(GMLdeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, GMLdeleteIn, GMLInactiveDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GroupMemberBean ()
  {
    try
    {
      _GroupMemberGetSpec = new BSDMInteractionSpec("GroupMemberGet", ApiMappings.getCallName ("GroupMemberGet"), Boolean.TRUE);

      _GroupMemberFindSpec = new BSDMInteractionSpec("GroupMemberFind", ApiMappings.getCallName ("GroupMemberFind"), Boolean.TRUE);

      _GroupMemberCreateSpec = new BSDMInteractionSpec("GroupMemberCreate", ApiMappings.getCallName ("GroupMemberCreate"), Boolean.TRUE);

      _GroupMemberUpdateSpec = new BSDMInteractionSpec("GroupMemberUpdate", ApiMappings.getCallName ("GroupMemberUpdate"), Boolean.TRUE);

      _GroupMemberDeleteSpec = new BSDMInteractionSpec("GroupMemberDelete", ApiMappings.getCallName ("GroupMemberDelete"), Boolean.TRUE);

      _GroupMemberDeleteListSpec = new BSDMInteractionSpec("GroupMemberDeleteList", ApiMappings.getCallName ("GroupMemberDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GroupMemberBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GroupMemberBean(BSDMSettings settings, BSDMConnectionManager cm)
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
