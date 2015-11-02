
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: SecurityResourceBean.java
 * Definition File: Admin/SecurityResource.xml
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
import com.csgsystems.bp.interfaces.SecurityResourceInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="SecurityResourceSessionBean"
 * display-name="SecurityResource Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/SecurityResourceBean"
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

@Stateless(name="SecurityResourceBean", mappedName = "SecurityResource")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("SecurityResources")

public class SecurityResourceBean implements SecurityResourceInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _SecurityResourceCreateSpec = null;
  /**
   * Create a new Security Resource..
   * Convenience method using default BSDMSessionContext.
   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityResourceObjectData create (SecurityResourceObjectData SECreateIn) throws BSDMResourceException
  {
    return create (null, SECreateIn);
  }
  /**
   * Create a new Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SecurityResourceObjectData create (@HeaderParam ("context")BSDMSessionContext context,SecurityResourceObjectData SECreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityResourceCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SECreateIn != null) SecurityResourceObjectHelper.toMap (SECreateIn, record, "SecurityResource");
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
return SecurityResourceObjectHelper.fromMap (record, "SecurityResource");
}

  private BSDMInteractionSpec _SecurityResourceGetSpec = null;
  /**
   * Get Security Resource By Id..
   * Convenience method using default BSDMSessionContext.
   * @param SECGetIn Input  Object.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityResourceObjectData get (SecurityResourceObjectData SECGetIn) throws BSDMResourceException
  {
    return get (null, SECGetIn);
  }
  /**
   * Get Security Resource By Id..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECGetIn Input  Object.
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public SecurityResourceObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam SecurityResourceObjectData SECGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityResourceGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SECGetIn != null) SecurityResourceObjectHelper.toMap (SECGetIn, record, "SecurityResource");
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
return SecurityResourceObjectHelper.fromMap (record, "SecurityResource");
}

  private BSDMInteractionSpec _SecurityResourceFindSpec = null;
  /**
   * Find secuirty resource by filter..
   * Convenience method using default BSDMSessionContext.
   * @param SECFindIn Input Filter Object.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityResourceObjectDataList find (SecurityResourceObjectFilter SECFindIn) throws BSDMResourceException
  {
    return find (null, SECFindIn);
  }
  /**
   * Find secuirty resource by filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECFindIn Input Filter Object.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public SecurityResourceObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,SecurityResourceObjectFilter SECFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityResourceFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SECFindIn != null) SecurityResourceObjectHelper.toMap (SECFindIn, record, "SecurityResource");
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
return SecurityResourceObjectHelper.fromMapList (record, "SecurityResourceList");
}

  private BSDMInteractionSpec _SecurityResourceAssignSpec = null;
  /**
   * Assign Security Resources to A Security Role..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityResourceAssignIn Input List Object.
   * @param a_role_id.
   * @param a_user_name.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityResourceObjectDataList assign (SecurityResourceObjectData[] SecurityResourceAssignIn, BigInteger a_role_id, String a_user_name) throws BSDMResourceException
  {
    return assign (null, SecurityResourceAssignIn, a_role_id, a_user_name);
  }
  /**
   * Assign Security Resources to A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceAssignIn Input List Object.
   * @param a_role_id.
   * @param a_user_name.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("assign")
@Produces({"application/json","application/xml"})
  public SecurityResourceObjectDataList assign (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("SecurityResourceObject")SecurityResourceObjectData[] SecurityResourceAssignIn,@QueryParam("a_role_id")BigInteger a_role_id,@QueryParam("a_user_name")String a_user_name) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityResourceAssignSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SecurityResourceAssignIn != null)
    {
      Object[] list = new Object[SecurityResourceAssignIn.length];
      for (int i = 0; i < SecurityResourceAssignIn.length; i++)
      {
        list[i] = null;
        list[i] = SecurityResourceObjectHelper.getMap (SecurityResourceAssignIn[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityResource");
      }
      record.put ("SecurityResourceList", list);
    }

      if (a_role_id != null) record.put ("ARoleId", a_role_id);

      if (a_user_name != null) record.put ("AUserName", a_user_name);
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
return SecurityResourceObjectHelper.fromMapList (record, "SecurityResourceList");
}

  private BSDMInteractionSpec _SecurityResourceUnassignSpec = null;
  /**
   * Remove the bindings between Security Resources and A Security Role..
   * Convenience method using default BSDMSessionContext.
   * @param SecurityResourceUnassignIn Input List Object.
   * @param b_role_id.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public SecurityResourceObjectDataList unassign (SecurityResourceObjectData[] SecurityResourceUnassignIn, BigInteger b_role_id) throws BSDMResourceException
  {
    return unassign (null, SecurityResourceUnassignIn, b_role_id);
  }
  /**
   * Remove the bindings between Security Resources and A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceUnassignIn Input List Object.
   * @param b_role_id.
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("unassign")
@Produces({"application/json","application/xml"})
  public SecurityResourceObjectDataList unassign (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("SecurityResourceObject")SecurityResourceObjectData[] SecurityResourceUnassignIn,@QueryParam("b_role_id")BigInteger b_role_id) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_SecurityResourceUnassignSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (SecurityResourceUnassignIn != null)
    {
      Object[] list = new Object[SecurityResourceUnassignIn.length];
      for (int i = 0; i < SecurityResourceUnassignIn.length; i++)
      {
        list[i] = null;
        list[i] = SecurityResourceObjectHelper.getMap (SecurityResourceUnassignIn[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityResource");
      }
      record.put ("SecurityResourceList", list);
    }

      if (b_role_id != null) record.put ("BRoleId", b_role_id);
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
return SecurityResourceObjectHelper.fromMapList (record, "SecurityResourceList");
}

  /**

   * Create a new Security Resource..

   * Convenience method using default BSDMSessionContext.

   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityResourceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityResourceObjectData create (SecurityResourceObjectData SECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, SECreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Security Resource..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECreateIn Input  Object.  Defaulted Fields: ResUpdateCount, ResCreateDate, ResModifyDate, SubUpdateCount, SubCreateDate, SubModifyDate, RarUpdateCount, RarCreateDate, RarModifyDate.  Derived Fields: ResId, MrId, SubId, RarId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityResourceObjectData create (BSDMSessionContext context, SecurityResourceObjectData SECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SECreateIn, defaultAction);
       
     cManager.checkConstraints(SECreateIn, constraintAction);
       return create (context, SECreateIn);
  }

  /**

   * Get Security Resource By Id..

   * Convenience method using default BSDMSessionContext.

   * @param SECGetIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityResourceObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityResourceObjectData get (SecurityResourceObjectData SECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, SECGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get Security Resource By Id..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECGetIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityResourceObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityResourceObjectData get (BSDMSessionContext context, SecurityResourceObjectData SECGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SECGetIn, defaultAction);
       
     cManager.checkConstraints(SECGetIn, constraintAction);
       return get (context, SECGetIn);
  }

  /**

   * Find secuirty resource by filter..

   * Convenience method using default BSDMSessionContext.

   * @param SECFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityResourceObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityResourceObjectDataList find (SecurityResourceObjectFilter SECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, SECFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find secuirty resource by filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param SECFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityResourceObjectDataList find (BSDMSessionContext context, SecurityResourceObjectFilter SECFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(SECFindIn, defaultAction);
       
     cManager.checkConstraints(SECFindIn, constraintAction);
       return find (context, SECFindIn);
  }

  /**

   * Assign Security Resources to A Security Role..

   * Convenience method using default BSDMSessionContext.

   * @param SecurityResourceAssignIn Input List Object.

   * @param a_role_id.

   * @param a_user_name.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityResourceObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityResourceObjectDataList assign (SecurityResourceObjectData[] SecurityResourceAssignIn, BigInteger a_role_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return assign (null, SecurityResourceAssignIn, a_role_id, a_user_name, defaultAction, constraintAction);
  }
  /** 
   * Assign Security Resources to A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceAssignIn Input List Object.
   * @param a_role_id.
   * @param a_user_name.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityResourceObjectDataList assign (BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceAssignIn, BigInteger a_role_id, String a_user_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return assign (context, SecurityResourceAssignIn, a_role_id, a_user_name);
  }

  /**

   * Remove the bindings between Security Resources and A Security Role..

   * Convenience method using default BSDMSessionContext.

   * @param SecurityResourceUnassignIn Input List Object.

   * @param b_role_id.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return SecurityResourceObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public SecurityResourceObjectDataList unassign (SecurityResourceObjectData[] SecurityResourceUnassignIn, BigInteger b_role_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return unassign (null, SecurityResourceUnassignIn, b_role_id, defaultAction, constraintAction);
  }
  /** 
   * Remove the bindings between Security Resources and A Security Role..
   * @param context The session context to use when connecting to the APITS server.
   * @param SecurityResourceUnassignIn Input List Object.
   * @param b_role_id.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return SecurityResourceObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public SecurityResourceObjectDataList unassign (BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceUnassignIn, BigInteger b_role_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column
return unassign (context, SecurityResourceUnassignIn, b_role_id);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public SecurityResourceBean ()
  {
    try
    {
      _SecurityResourceCreateSpec = new BSDMInteractionSpec("SecurityResourceCreate", ApiMappings.getCallName ("SecurityResourceCreate"), Boolean.TRUE);

      _SecurityResourceGetSpec = new BSDMInteractionSpec("SecurityResourceGet", ApiMappings.getCallName ("SecurityResourceGet"), Boolean.TRUE);

      _SecurityResourceFindSpec = new BSDMInteractionSpec("SecurityResourceFind", ApiMappings.getCallName ("SecurityResourceFind"), Boolean.TRUE);

      _SecurityResourceAssignSpec = new BSDMInteractionSpec("SecurityResourceAssign", ApiMappings.getCallName ("SecurityResourceAssign"), Boolean.TRUE);

      _SecurityResourceUnassignSpec = new BSDMInteractionSpec("SecurityResourceUnassign", ApiMappings.getCallName ("SecurityResourceUnassign"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public SecurityResourceBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public SecurityResourceBean(BSDMSettings settings, BSDMConnectionManager cm)
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
