
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: CmfRewardBalanceDetailBean.java
 * Definition File: Customer/CmfRewardBalanceDetail.xml
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
import com.csgsystems.bp.interfaces.CmfRewardBalanceDetailInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="CmfRewardBalanceDetailSessionBean"
 * display-name="CmfRewardBalanceDetail Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/CmfRewardBalanceDetailBean"
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

@Stateless(name="CmfRewardBalanceDetailBean", mappedName = "CmfRewardBalanceDetail")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("CmfRewardBalanceDetails")

public class CmfRewardBalanceDetailBean implements CmfRewardBalanceDetailInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _CmfRewardBalanceDetailGetSpec = null;
  /**
   * Get a unique CmfRewardBalanceDetail..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDGetIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfRewardBalanceDetailObjectData get (CmfRewardBalanceDetailObjectKeyData CRBDGetIn) throws BSDMResourceException
  {
    return get (null, CRBDGetIn);
  }
  /**
   * Get a unique CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public CmfRewardBalanceDetailObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam CmfRewardBalanceDetailObjectKeyData CRBDGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfRewardBalanceDetailGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDGetIn != null) CmfRewardBalanceDetailObjectKeyHelper.toMap (CRBDGetIn, record, "CmfRewardBalanceDetail");
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
return CmfRewardBalanceDetailObjectHelper.fromMap (record, "CmfRewardBalanceDetail");
}

  private BSDMInteractionSpec _CmfRewardBalanceDetailFindSpec = null;
  /**
   * Find CmfRewardBalanceDetail rows that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfRewardBalanceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfRewardBalanceDetailObjectDataList find (CmfRewardBalanceDetailObjectFilter CRBDFindIn) throws BSDMResourceException
  {
    return find (null, CRBDFindIn);
  }
  /**
   * Find CmfRewardBalanceDetail rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.
   * @return CmfRewardBalanceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfRewardBalanceDetailObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,CmfRewardBalanceDetailObjectFilter CRBDFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfRewardBalanceDetailFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDFindIn != null) CmfRewardBalanceDetailObjectHelper.toMap (CRBDFindIn, record, "CmfRewardBalanceDetail");
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
return CmfRewardBalanceDetailObjectHelper.fromMapList (record, "CmfRewardBalanceDetailList");
}

  private BSDMInteractionSpec _CmfRewardBalanceDetailUpdateSpec = null;
  /**
   * Update the non-key fields of an CmfRewardBalanceDetail row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfRewardBalanceDetailObjectData update (CmfRewardBalanceDetailObjectData CRBDUpdateIn) throws BSDMResourceException
  {
    return update (null, CRBDUpdateIn);
  }
  /**
   * Update the non-key fields of an CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfRewardBalanceDetailObjectData update (@HeaderParam ("context")BSDMSessionContext context,CmfRewardBalanceDetailObjectData CRBDUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfRewardBalanceDetailUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDUpdateIn != null) CmfRewardBalanceDetailObjectHelper.toMap (CRBDUpdateIn, record, "CmfRewardBalanceDetail");
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
return CmfRewardBalanceDetailObjectHelper.fromMap (record, "CmfRewardBalanceDetail");
}

  private BSDMInteractionSpec _CmfRewardBalanceDetailDeleteSpec = null;
  /**
   * Delete a CmfRewardBalanceDetail row..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDDeleteIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfRewardBalanceDetailObjectData delete (CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn) throws BSDMResourceException
  {
    return delete (null, CRBDDeleteIn);
  }
  /**
   * Delete a CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDDeleteIn Input Object Key.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfRewardBalanceDetailObjectData delete (@HeaderParam ("context")BSDMSessionContext context,CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfRewardBalanceDetailDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDDeleteIn != null) CmfRewardBalanceDetailObjectKeyHelper.toMap (CRBDDeleteIn, record, "CmfRewardBalanceDetail");
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
return CmfRewardBalanceDetailObjectHelper.fromMap (record, "CmfRewardBalanceDetail");
}

  private BSDMInteractionSpec _CmfRewardBalanceDetailCreateSpec = null;
  /**
   * Create a new CmfRewardBalanceDetail..
   * Convenience method using default BSDMSessionContext.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public CmfRewardBalanceDetailObjectData create (CmfRewardBalanceDetailObjectData CRBDCreateIn) throws BSDMResourceException
  {
    return create (null, CRBDCreateIn);
  }
  /**
   * Create a new CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public CmfRewardBalanceDetailObjectData create (@HeaderParam ("context")BSDMSessionContext context,CmfRewardBalanceDetailObjectData CRBDCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_CmfRewardBalanceDetailCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (CRBDCreateIn != null) CmfRewardBalanceDetailObjectHelper.toMap (CRBDCreateIn, record, "CmfRewardBalanceDetail");
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
return CmfRewardBalanceDetailObjectHelper.fromMap (record, "CmfRewardBalanceDetail");
}

  /**

   * Get a unique CmfRewardBalanceDetail..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfRewardBalanceDetailObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfRewardBalanceDetailObjectData get (CmfRewardBalanceDetailObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, CRBDGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a unique CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfRewardBalanceDetailObjectData get (BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDGetIn, defaultAction);
       
     cManager.checkConstraints(CRBDGetIn, constraintAction);
       return get (context, CRBDGetIn);
  }

  /**

   * Find CmfRewardBalanceDetail rows that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfRewardBalanceDetailObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfRewardBalanceDetailObjectDataList find (CmfRewardBalanceDetailObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, CRBDFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find CmfRewardBalanceDetail rows that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfRewardBalanceDetailObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfRewardBalanceDetailObjectDataList find (BSDMSessionContext context, CmfRewardBalanceDetailObjectFilter CRBDFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDFindIn, defaultAction);
       
     cManager.checkConstraints(CRBDFindIn, constraintAction);
       return find (context, CRBDFindIn);
  }

  /**

   * Update the non-key fields of an CmfRewardBalanceDetail row..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfRewardBalanceDetailObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfRewardBalanceDetailObjectData update (CmfRewardBalanceDetailObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, CRBDUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of an CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfRewardBalanceDetailObjectData update (BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDUpdateIn, defaultAction);
       
     cManager.checkConstraints(CRBDUpdateIn, constraintAction);
       return update (context, CRBDUpdateIn);
  }

  /**

   * Delete a CmfRewardBalanceDetail row..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfRewardBalanceDetailObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfRewardBalanceDetailObjectData delete (CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, CRBDDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Delete a CmfRewardBalanceDetail row..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfRewardBalanceDetailObjectData delete (BSDMSessionContext context, CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDDeleteIn, defaultAction);
       
     cManager.checkConstraints(CRBDDeleteIn, constraintAction);
       return delete (context, CRBDDeleteIn);
  }

  /**

   * Create a new CmfRewardBalanceDetail..

   * Convenience method using default BSDMSessionContext.

   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return CmfRewardBalanceDetailObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public CmfRewardBalanceDetailObjectData create (CmfRewardBalanceDetailObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, CRBDCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new CmfRewardBalanceDetail..
   * @param context The session context to use when connecting to the APITS server.
   * @param CRBDCreateIn Input  Object.  Defaulted Fields: TotalAdj, TotalSpend.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return CmfRewardBalanceDetailObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public CmfRewardBalanceDetailObjectData create (BSDMSessionContext context, CmfRewardBalanceDetailObjectData CRBDCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(CRBDCreateIn, defaultAction);
       
     cManager.checkConstraints(CRBDCreateIn, constraintAction);
       return create (context, CRBDCreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public CmfRewardBalanceDetailBean ()
  {
    try
    {
      _CmfRewardBalanceDetailGetSpec = new BSDMInteractionSpec("CmfRewardBalanceDetailGet", ApiMappings.getCallName ("CmfRewardBalanceDetailGet"), Boolean.TRUE);

      _CmfRewardBalanceDetailFindSpec = new BSDMInteractionSpec("CmfRewardBalanceDetailFind", ApiMappings.getCallName ("CmfRewardBalanceDetailFind"), Boolean.TRUE);

      _CmfRewardBalanceDetailUpdateSpec = new BSDMInteractionSpec("CmfRewardBalanceDetailUpdate", ApiMappings.getCallName ("CmfRewardBalanceDetailUpdate"), Boolean.TRUE);

      _CmfRewardBalanceDetailDeleteSpec = new BSDMInteractionSpec("CmfRewardBalanceDetailDelete", ApiMappings.getCallName ("CmfRewardBalanceDetailDelete"), Boolean.TRUE);

      _CmfRewardBalanceDetailCreateSpec = new BSDMInteractionSpec("CmfRewardBalanceDetailCreate", ApiMappings.getCallName ("CmfRewardBalanceDetailCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public CmfRewardBalanceDetailBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public CmfRewardBalanceDetailBean(BSDMSettings settings, BSDMConnectionManager cm)
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
