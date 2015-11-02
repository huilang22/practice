
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PrepaymentBean.java
 * Definition File: Customer/Prepayment.xml
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
import com.csgsystems.bp.interfaces.PrepaymentInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PrepaymentSessionBean"
 * display-name="Prepayment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PrepaymentBean"
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

@Stateless(name="PrepaymentBean", mappedName = "Prepayment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Prepayments")

public class PrepaymentBean implements PrepaymentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PrepaymentGetSpec = null;
  /**
   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrepaymentObjectData get (PrepaymentObjectKeyData getIn) throws BSDMResourceException
  {
    return get (null, getIn);
  }
  /**
   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PrepaymentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PrepaymentObjectKeyData getIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrepaymentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (getIn != null) PrepaymentObjectKeyHelper.toMap (getIn, record, "Prepayment");
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
return PrepaymentObjectHelper.fromMap (record, "Prepayment");
}

  private BSDMInteractionSpec _PrepaymentFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return PrepaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrepaymentObjectDataList find (PrepaymentObjectFilter findIn) throws BSDMResourceException
  {
    return find (null, findIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return PrepaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PrepaymentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PrepaymentObjectFilter findIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrepaymentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findIn != null) PrepaymentObjectHelper.toMap (findIn, record, "Prepayment");
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
return PrepaymentObjectHelper.fromMapList (record, "PrepaymentList");
}

  private BSDMInteractionSpec _PrepaymentCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentCreateIn Input  Object.
   * @param WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrepaymentObjectData create (PrepaymentObjectData prepaymentCreateIn, Integer WaiveEpg) throws BSDMResourceException
  {
    return create (null, prepaymentCreateIn, WaiveEpg);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentCreateIn Input  Object.
   * @param WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PrepaymentObjectData create (@HeaderParam ("context")BSDMSessionContext context,PrepaymentObjectData prepaymentCreateIn,@FormParam("WaiveEpg")Integer WaiveEpg) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrepaymentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (prepaymentCreateIn != null) PrepaymentObjectHelper.toMap (prepaymentCreateIn, record, "Prepayment");

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
return PrepaymentObjectHelper.fromMap (record, "Prepayment");
}

  private BSDMInteractionSpec _PrepaymentUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrepaymentObjectData update (PrepaymentObjectData prepaymentUpdateIn1, Integer _WaiveEpg) throws BSDMResourceException
  {
    return update (null, prepaymentUpdateIn1, _WaiveEpg);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PrepaymentObjectData update (@HeaderParam ("context")BSDMSessionContext context,PrepaymentObjectData prepaymentUpdateIn1,@FormParam("_WaiveEpg")Integer _WaiveEpg) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrepaymentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (prepaymentUpdateIn1 != null) PrepaymentObjectHelper.toMap (prepaymentUpdateIn1, record, "Prepayment");

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
return PrepaymentObjectHelper.fromMap (record, "Prepayment");
}

  private BSDMInteractionSpec _PrepaymentDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param prepaymentDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void delete (PrepaymentObjectKeyData prepaymentDeleteIn) throws BSDMResourceException
  {
    delete (null, prepaymentDeleteIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentDeleteIn Input Object Key.
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})

 public void delete (@HeaderParam ("context")BSDMSessionContext context,PrepaymentObjectKeyData prepaymentDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrepaymentDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (prepaymentDeleteIn != null) PrepaymentObjectKeyHelper.toMap (prepaymentDeleteIn, record, "Prepayment");
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

  private BSDMInteractionSpec _PrepaymentGetOldSpec = null;
  /**
   * Gets a Prepayment.  Can't guarantee uniqueness though..
   * Convenience method using default BSDMSessionContext.
   * @param getOldIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PrepaymentObjectData getOld (PrepaymentObjectKeyData getOldIn) throws BSDMResourceException
  {
    return getOld (null, getOldIn);
  }
  /**
   * Gets a Prepayment.  Can't guarantee uniqueness though..
   * @param context The session context to use when connecting to the APITS server.
   * @param getOldIn Input Object Key.
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("getOld")
@Produces({"application/json","application/xml"})
  public PrepaymentObjectData getOld (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PrepaymentObjectKeyData getOldIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PrepaymentGetOldSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (getOldIn != null) PrepaymentObjectKeyHelper.toMap (getOldIn, record, "Prepayment");
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
return PrepaymentObjectHelper.fromMap (record, "Prepayment");
}

  /**

   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..

   * Convenience method using default BSDMSessionContext.

   * @param getIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrepaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrepaymentObjectData get (PrepaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, getIn, defaultAction, constraintAction);
  }
  /** 
   * Gets an Active Prepayment (NoBill=0).  Can not get an Inactive Prepayment because there is no unique key for an Inactive Prepayment..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrepaymentObjectData get (BSDMSessionContext context, PrepaymentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
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

   * @return PrepaymentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrepaymentObjectDataList find (PrepaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, findIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrepaymentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrepaymentObjectDataList find (BSDMSessionContext context, PrepaymentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findIn, defaultAction);
       
     cManager.checkConstraints(findIn, constraintAction);
       return find (context, findIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param prepaymentCreateIn Input  Object.

   * @param WaiveEpg (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrepaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrepaymentObjectData create (PrepaymentObjectData prepaymentCreateIn, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, prepaymentCreateIn, WaiveEpg, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentCreateIn Input  Object.
   * @param WaiveEpg (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrepaymentObjectData create (BSDMSessionContext context, PrepaymentObjectData prepaymentCreateIn, Integer WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(prepaymentCreateIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(prepaymentCreateIn, constraintAction);
       
    //Constraints not supported on Input-Column
return create (context, prepaymentCreateIn, WaiveEpg);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param prepaymentUpdateIn1 Input  Object.

   * @param _WaiveEpg (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrepaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrepaymentObjectData update (PrepaymentObjectData prepaymentUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, prepaymentUpdateIn1, _WaiveEpg, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentUpdateIn1 Input  Object.
   * @param _WaiveEpg (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrepaymentObjectData update (BSDMSessionContext context, PrepaymentObjectData prepaymentUpdateIn1, Integer _WaiveEpg, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(prepaymentUpdateIn1, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(prepaymentUpdateIn1, constraintAction);
       
    //Constraints not supported on Input-Column
return update (context, prepaymentUpdateIn1, _WaiveEpg);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param prepaymentDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void delete (PrepaymentObjectKeyData prepaymentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    delete (null, prepaymentDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param prepaymentDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void delete (BSDMSessionContext context, PrepaymentObjectKeyData prepaymentDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(prepaymentDeleteIn, defaultAction);
       
     cManager.checkConstraints(prepaymentDeleteIn, constraintAction);
       delete (context, prepaymentDeleteIn);
  }

  /**

   * Gets a Prepayment.  Can't guarantee uniqueness though..

   * Convenience method using default BSDMSessionContext.

   * @param getOldIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PrepaymentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PrepaymentObjectData getOld (PrepaymentObjectKeyData getOldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return getOld (null, getOldIn, defaultAction, constraintAction);
  }
  /** 
   * Gets a Prepayment.  Can't guarantee uniqueness though..
   * @param context The session context to use when connecting to the APITS server.
   * @param getOldIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PrepaymentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PrepaymentObjectData getOld (BSDMSessionContext context, PrepaymentObjectKeyData getOldIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(getOldIn, defaultAction);
       
     cManager.checkConstraints(getOldIn, constraintAction);
       return getOld (context, getOldIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PrepaymentBean ()
  {
    try
    {
      _PrepaymentGetSpec = new BSDMInteractionSpec("PrepaymentGet", ApiMappings.getCallName ("PrepaymentGet"), Boolean.TRUE);

      _PrepaymentFindSpec = new BSDMInteractionSpec("PrepaymentFind", ApiMappings.getCallName ("PrepaymentFind"), Boolean.TRUE);

      _PrepaymentCreateSpec = new BSDMInteractionSpec("PrepaymentCreate", ApiMappings.getCallName ("PrepaymentCreate"), Boolean.TRUE);

      _PrepaymentUpdateSpec = new BSDMInteractionSpec("PrepaymentUpdate", ApiMappings.getCallName ("PrepaymentUpdate"), Boolean.TRUE);

      _PrepaymentDeleteSpec = new BSDMInteractionSpec("PrepaymentDelete", ApiMappings.getCallName ("PrepaymentDelete"), Boolean.TRUE);

      _PrepaymentGetOldSpec = new BSDMInteractionSpec("PrepaymentGetOld", ApiMappings.getCallName ("PrepaymentGetOld"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PrepaymentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PrepaymentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
