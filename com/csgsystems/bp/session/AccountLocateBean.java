
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AccountLocateBean.java
 * Definition File: Catalog/AccountLocate.xml
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
import com.csgsystems.bp.interfaces.AccountLocateInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AccountLocateSessionBean"
 * display-name="AccountLocate Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AccountLocateBean"
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

@Stateless(name="AccountLocateBean", mappedName = "AccountLocate")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AccountLocates")

public class AccountLocateBean implements AccountLocateInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AccountLocateGetSpec = null;
  /**
   * Locate an Account and find which Server it is on..
   * Convenience method using default BSDMSessionContext.
   * @param algIn Input Object Key.
   * @return AccountLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountLocateObjectData get (AccountLocateObjectKeyData algIn) throws BSDMResourceException
  {
    return get (null, algIn);
  }
  /**
   * Locate an Account and find which Server it is on..
   * @param context The session context to use when connecting to the APITS server.
   * @param algIn Input Object Key.
   * @return AccountLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AccountLocateObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AccountLocateObjectKeyData algIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (algIn != null) AccountLocateObjectKeyHelper.toMap (algIn, record, "AccountLocate");
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
return AccountLocateObjectHelper.fromMap (record, "AccountLocate");
}

  private BSDMInteractionSpec _AccountLocateFindSpec = null;
  /**
   * Locate Accounts and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountLocateXIDObjectDataList find (AccountLocateXIDObjectFilter alfIn) throws BSDMResourceException
  {
    return find (null, alfIn);
  }
  /**
   * Locate Accounts and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountLocateXIDObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AccountLocateXIDObjectFilter alfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (alfIn != null) AccountLocateXIDObjectHelper.toMap (alfIn, record, "AccountLocate");
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
return AccountLocateXIDObjectHelper.fromMapList (record, "AccountLocateList");
}

  private BSDMInteractionSpec _AccountLocateFindByServiceIdSpec = null;
  /**
   * Locate Accounts by Service info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alsfIn Input Filter Object.
   * @return ServiceLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServiceLocateXIDObjectDataList findByServiceId (ServiceLocateXIDObjectFilter alsfIn) throws BSDMResourceException
  {
    return findByServiceId (null, alsfIn);
  }
  /**
   * Locate Accounts by Service info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsfIn Input Filter Object.
   * @return ServiceLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByServiceId")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServiceLocateXIDObjectDataList findByServiceId (@HeaderParam ("context")BSDMSessionContext context,ServiceLocateXIDObjectFilter alsfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateFindByServiceIdSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (alsfIn != null) ServiceLocateXIDObjectHelper.toMap (alsfIn, record, "ExternalIdEquipMap");
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
return ServiceLocateXIDObjectHelper.fromMapList (record, "AccountLocateList");
}

  private BSDMInteractionSpec _AccountLocateListByServiceIdSpec = null;
  /**
   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountLocateXIDObjectDataList listByServiceId (ServiceLocateXIDObjectFilter ExternalIdEquipMap) throws BSDMResourceException
  {
    return listByServiceId (null, ExternalIdEquipMap);
  }
  /**
   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("listByServiceId")
@Produces({"application/json","application/xml"})
  public AccountLocateXIDObjectDataList listByServiceId (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ServiceLocateXIDObjectFilter ExternalIdEquipMap) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateListByServiceIdSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ExternalIdEquipMap != null) ServiceLocateXIDObjectHelper.toMap (ExternalIdEquipMap, record, "ExternalIdEquipMap");
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
return AccountLocateXIDObjectHelper.fromMapList (record, "AccountLocateList");
}

  private BSDMInteractionSpec _AccountLocateFindByOrderNumberSpec = null;
  /**
   * Locate Accounts by Order info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alonIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountLocateXIDObjectDataList findByOrderNumber (OrderLocateXIDObjectFilter alonIn) throws BSDMResourceException
  {
    return findByOrderNumber (null, alonIn);
  }
  /**
   * Locate Accounts by Order info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alonIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByOrderNumber")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountLocateXIDObjectDataList findByOrderNumber (@HeaderParam ("context")BSDMSessionContext context,OrderLocateXIDObjectFilter alonIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateFindByOrderNumberSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (alonIn != null) OrderLocateXIDObjectHelper.toMap (alonIn, record, "AccountLocate");
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
return AccountLocateXIDObjectHelper.fromMapList (record, "AccountLocateList");
}

  private BSDMInteractionSpec _AccountLocateFindByAddressIdSpec = null;
  /**
   * Locate Accounts by Address info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alafIn Input Filter Object.
   * @return AddressLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AddressLocateXIDObjectDataList findByAddressId (AddressLocateXIDObjectFilter alafIn) throws BSDMResourceException
  {
    return findByAddressId (null, alafIn);
  }
  /**
   * Locate Accounts by Address info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alafIn Input Filter Object.
   * @return AddressLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByAddressId")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AddressLocateXIDObjectDataList findByAddressId (@HeaderParam ("context")BSDMSessionContext context,AddressLocateXIDObjectFilter alafIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateFindByAddressIdSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (alafIn != null) AddressLocateXIDObjectHelper.toMap (alafIn, record, "AlafIn");
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
return AddressLocateXIDObjectHelper.fromMapList (record, "AccountLocateList");
}

  private BSDMInteractionSpec _AccountLocateFindByAccountExtendeddataSpec = null;
  /**
   * Locate Accounts by Account Extended data info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alaedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountLocateXIDObjectDataList findByAccountExtendeddata (AccountExtendedDataLocateXIDObjectFilter alaedfIn) throws BSDMResourceException
  {
    return findByAccountExtendeddata (null, alaedfIn);
  }
  /**
   * Locate Accounts by Account Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alaedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByAccountExtendeddata")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountLocateXIDObjectDataList findByAccountExtendeddata (@HeaderParam ("context")BSDMSessionContext context,AccountExtendedDataLocateXIDObjectFilter alaedfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateFindByAccountExtendeddataSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (alaedfIn != null) AccountExtendedDataLocateXIDObjectHelper.toMap (alaedfIn, record, "AccountLocate");
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
return AccountLocateXIDObjectHelper.fromMapList (record, "AccountLocateList");
}

  private BSDMInteractionSpec _AccountLocateFindByServiceExtendeddataSpec = null;
  /**
   * Locate Accounts by Service Extended data info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alsedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AccountLocateXIDObjectDataList findByServiceExtendeddata (ServiceExtendedDataLocateXIDObjectFilter alsedfIn) throws BSDMResourceException
  {
    return findByServiceExtendeddata (null, alsedfIn);
  }
  /**
   * Locate Accounts by Service Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findByServiceExtendeddata")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AccountLocateXIDObjectDataList findByServiceExtendeddata (@HeaderParam ("context")BSDMSessionContext context,ServiceExtendedDataLocateXIDObjectFilter alsedfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AccountLocateFindByServiceExtendeddataSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (alsedfIn != null) ServiceExtendedDataLocateXIDObjectHelper.toMap (alsedfIn, record, "AlsedfIn");
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
return AccountLocateXIDObjectHelper.fromMapList (record, "AccountLocateList");
}

  /**

   * Locate an Account and find which Server it is on..

   * Convenience method using default BSDMSessionContext.

   * @param algIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountLocateObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountLocateObjectData get (AccountLocateObjectKeyData algIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, algIn, defaultAction, constraintAction);
  }
  /** 
   * Locate an Account and find which Server it is on..
   * @param context The session context to use when connecting to the APITS server.
   * @param algIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountLocateObjectData get (BSDMSessionContext context, AccountLocateObjectKeyData algIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(algIn, defaultAction);
       
     cManager.checkConstraints(algIn, constraintAction);
       return get (context, algIn);
  }

  /**

   * Locate Accounts and find which Servers they are on..

   * Convenience method using default BSDMSessionContext.

   * @param alfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountLocateXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountLocateXIDObjectDataList find (AccountLocateXIDObjectFilter alfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, alfIn, defaultAction, constraintAction);
  }
  /** 
   * Locate Accounts and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountLocateXIDObjectDataList find (BSDMSessionContext context, AccountLocateXIDObjectFilter alfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(alfIn, defaultAction);
       
     cManager.checkConstraints(alfIn, constraintAction);
       return find (context, alfIn);
  }

  /**

   * Locate Accounts by Service info and find which Servers they are on..

   * Convenience method using default BSDMSessionContext.

   * @param alsfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServiceLocateXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServiceLocateXIDObjectDataList findByServiceId (ServiceLocateXIDObjectFilter alsfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByServiceId (null, alsfIn, defaultAction, constraintAction);
  }
  /** 
   * Locate Accounts by Service info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServiceLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServiceLocateXIDObjectDataList findByServiceId (BSDMSessionContext context, ServiceLocateXIDObjectFilter alsfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(alsfIn, defaultAction);
       
     cManager.checkConstraints(alsfIn, constraintAction);
       return findByServiceId (context, alsfIn);
  }

  /**

   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..

   * Convenience method using default BSDMSessionContext.

   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountLocateXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountLocateXIDObjectDataList listByServiceId (ServiceLocateXIDObjectFilter ExternalIdEquipMap, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return listByServiceId (null, ExternalIdEquipMap, defaultAction, constraintAction);
  }
  /** 
   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountLocateXIDObjectDataList listByServiceId (BSDMSessionContext context, ServiceLocateXIDObjectFilter ExternalIdEquipMap, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ExternalIdEquipMap, defaultAction);
       
     cManager.checkConstraints(ExternalIdEquipMap, constraintAction);
       return listByServiceId (context, ExternalIdEquipMap);
  }

  /**

   * Locate Accounts by Order info and find which Servers they are on..

   * Convenience method using default BSDMSessionContext.

   * @param alonIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountLocateXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountLocateXIDObjectDataList findByOrderNumber (OrderLocateXIDObjectFilter alonIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByOrderNumber (null, alonIn, defaultAction, constraintAction);
  }
  /** 
   * Locate Accounts by Order info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alonIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountLocateXIDObjectDataList findByOrderNumber (BSDMSessionContext context, OrderLocateXIDObjectFilter alonIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(alonIn, defaultAction);
       
     cManager.checkConstraints(alonIn, constraintAction);
       return findByOrderNumber (context, alonIn);
  }

  /**

   * Locate Accounts by Address info and find which Servers they are on..

   * Convenience method using default BSDMSessionContext.

   * @param alafIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AddressLocateXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AddressLocateXIDObjectDataList findByAddressId (AddressLocateXIDObjectFilter alafIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByAddressId (null, alafIn, defaultAction, constraintAction);
  }
  /** 
   * Locate Accounts by Address info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alafIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AddressLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AddressLocateXIDObjectDataList findByAddressId (BSDMSessionContext context, AddressLocateXIDObjectFilter alafIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(alafIn, defaultAction);
       
     cManager.checkConstraints(alafIn, constraintAction);
       return findByAddressId (context, alafIn);
  }

  /**

   * Locate Accounts by Account Extended data info and find which Servers they are on..

   * Convenience method using default BSDMSessionContext.

   * @param alaedfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountLocateXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountLocateXIDObjectDataList findByAccountExtendeddata (AccountExtendedDataLocateXIDObjectFilter alaedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByAccountExtendeddata (null, alaedfIn, defaultAction, constraintAction);
  }
  /** 
   * Locate Accounts by Account Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alaedfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountLocateXIDObjectDataList findByAccountExtendeddata (BSDMSessionContext context, AccountExtendedDataLocateXIDObjectFilter alaedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(alaedfIn, defaultAction);
       
     cManager.checkConstraints(alaedfIn, constraintAction);
       return findByAccountExtendeddata (context, alaedfIn);
  }

  /**

   * Locate Accounts by Service Extended data info and find which Servers they are on..

   * Convenience method using default BSDMSessionContext.

   * @param alsedfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AccountLocateXIDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AccountLocateXIDObjectDataList findByServiceExtendeddata (ServiceExtendedDataLocateXIDObjectFilter alsedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findByServiceExtendeddata (null, alsedfIn, defaultAction, constraintAction);
  }
  /** 
   * Locate Accounts by Service Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsedfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AccountLocateXIDObjectDataList findByServiceExtendeddata (BSDMSessionContext context, ServiceExtendedDataLocateXIDObjectFilter alsedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(alsedfIn, defaultAction);
       
     cManager.checkConstraints(alsedfIn, constraintAction);
       return findByServiceExtendeddata (context, alsedfIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AccountLocateBean ()
  {
    try
    {
      _AccountLocateGetSpec = new BSDMInteractionSpec("AccountLocateGet", ApiMappings.getCallName ("AccountLocateGet"), Boolean.TRUE);

      _AccountLocateFindSpec = new BSDMInteractionSpec("AccountLocateFind", ApiMappings.getCallName ("AccountLocateFind"), Boolean.TRUE);

      _AccountLocateFindByServiceIdSpec = new BSDMInteractionSpec("AccountLocateFindByServiceId", ApiMappings.getCallName ("AccountLocateFindByServiceId"), Boolean.TRUE);

      _AccountLocateListByServiceIdSpec = new BSDMInteractionSpec("AccountLocateListByServiceId", ApiMappings.getCallName ("AccountLocateListByServiceId"), Boolean.TRUE);

      _AccountLocateFindByOrderNumberSpec = new BSDMInteractionSpec("AccountLocateFindByOrderNumber", ApiMappings.getCallName ("AccountLocateFindByOrderNumber"), Boolean.TRUE);

      _AccountLocateFindByAddressIdSpec = new BSDMInteractionSpec("AccountLocateFindByAddressId", ApiMappings.getCallName ("AccountLocateFindByAddressId"), Boolean.TRUE);

      _AccountLocateFindByAccountExtendeddataSpec = new BSDMInteractionSpec("AccountLocateFindByAccountExtendeddata", ApiMappings.getCallName ("AccountLocateFindByAccountExtendeddata"), Boolean.TRUE);

      _AccountLocateFindByServiceExtendeddataSpec = new BSDMInteractionSpec("AccountLocateFindByServiceExtendeddata", ApiMappings.getCallName ("AccountLocateFindByServiceExtendeddata"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AccountLocateBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AccountLocateBean(BSDMSettings settings, BSDMConnectionManager cm)
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
