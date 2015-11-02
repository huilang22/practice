
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BalanceLineItemBulkAdjustmentBean.java
 * Definition File: Catalog/BalanceLineItemBulkAdjustment.xml
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
import com.csgsystems.bp.interfaces.BalanceLineItemBulkAdjustmentInterface;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bat.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BalanceLineItemBulkAdjustmentSessionBean"
 * display-name="BalanceLineItemBulkAdjustment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BalanceLineItemBulkAdjustmentBean"
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

@Stateless(name="BalanceLineItemBulkAdjustmentBean", mappedName = "BalanceLineItemBulkAdjustment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BalanceLineItemBulkAdjustments")

public class BalanceLineItemBulkAdjustmentBean implements BalanceLineItemBulkAdjustmentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BalanceLineItemBulkAdjustmentCreateSpec = null;
  /**
   * Creates a new batch to create Balance Line Item usage Adjusments.
   * Convenience method using default BSDMSessionContext.
   * @param ____BulkAdjustment Input  Object.
   * @param ____BatchRequest Input  Object.
   * @param _____BalanceLineItem Input List Object.
   * @param ____BalanceLineItemQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BatchRequestObjectData create (BulkAdjustmentObjectData ____BulkAdjustment, BatchRequestObjectData ____BatchRequest, BalanceLineItemObjectData[] _____BalanceLineItem, BalanceLineItemQueryObjectData ____BalanceLineItemQuery, String XMLFileName, String CDFFileName) throws BSDMResourceException
  {
    return create (null, ____BulkAdjustment, ____BatchRequest, _____BalanceLineItem, ____BalanceLineItemQuery, XMLFileName, CDFFileName);
  }
  /**
   * Creates a new batch to create Balance Line Item usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____BulkAdjustment Input  Object.
   * @param ____BatchRequest Input  Object.
   * @param _____BalanceLineItem Input List Object.
   * @param ____BalanceLineItemQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BatchRequestObjectData create (@HeaderParam ("context")BSDMSessionContext context,BulkAdjustmentObjectData ____BulkAdjustment,@FormParam("BatchRequestObject")BatchRequestObjectData ____BatchRequest,@FormParam("BalanceLineItemObject")BalanceLineItemObjectData[] _____BalanceLineItem,@FormParam("BalanceLineItemQueryObject")BalanceLineItemQueryObjectData ____BalanceLineItemQuery,@FormParam("XMLFileName")String XMLFileName,@FormParam("CDFFileName")String CDFFileName) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemBulkAdjustmentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (____BulkAdjustment != null) BulkAdjustmentObjectHelper.toMap (____BulkAdjustment, record, "BulkAdjustment");
      if (____BatchRequest != null) BatchRequestObjectHelper.toMap (____BatchRequest, record, "BatchRequest");
      if (_____BalanceLineItem != null)
    {
      Object[] list = new Object[_____BalanceLineItem.length];
      for (int i = 0; i < _____BalanceLineItem.length; i++)
      {
        list[i] = null;
        list[i] = BalanceLineItemObjectHelper.getMap (_____BalanceLineItem[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BalanceLineItem");
      }
      record.put ("BalanceLineItemList", list);
    }

      if (XMLFileName != null) record.put ("XMLFileName", XMLFileName);

      if (CDFFileName != null) record.put ("CDFFileName", CDFFileName);
      if (____BalanceLineItemQuery != null) BalanceLineItemQueryObjectHelper.toMap (____BalanceLineItemQuery, record, "BalanceLineItemQuery");
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
return BatchRequestObjectHelper.fromMap (record, "BatchRequest");
}

  private BSDMInteractionSpec _BalanceLineItemBulkAdjustmentGetSpec = null;
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param __BatchRequest Input Object Key.
   * @return BalanceLineItemBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BalanceLineItemBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData __BatchRequest) throws BSDMResourceException
  {
    return get (null, __BatchRequest);
  }
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param __BatchRequest Input Object Key.
   * @return BalanceLineItemBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BalanceLineItemBulkAdjustmentGetOutputData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BatchRequestObjectKeyData __BatchRequest) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemBulkAdjustmentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (__BatchRequest != null) BatchRequestObjectKeyHelper.toMap (__BatchRequest, record, "BatchRequest");
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
return BalanceLineItemBulkAdjustmentGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _BalanceLineItemBulkAdjustmentUpdateSpec = null;
  /**
   * Updates Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BulkAdjustment Input  Object.
   * @param ______BatchRequest Input  Object.
   * @param ________BalanceLineItem Input List Object.
   * @param __BalanceLineItemQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData ______BatchRequest, BalanceLineItemObjectData[] ________BalanceLineItem, BalanceLineItemQueryObjectData __BalanceLineItemQuery, String __XMLFileName, String __CDFFileName) throws BSDMResourceException
  {
    return update (null, ___BulkAdjustment, ______BatchRequest, ________BalanceLineItem, __BalanceLineItemQuery, __XMLFileName, __CDFFileName);
  }
  /**
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param ______BatchRequest Input  Object.
   * @param ________BalanceLineItem Input List Object.
   * @param __BalanceLineItemQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BatchRequestObjectData update (@HeaderParam ("context")BSDMSessionContext context,BulkAdjustmentObjectData ___BulkAdjustment,@FormParam("BatchRequestObject")BatchRequestObjectData ______BatchRequest,@FormParam("BalanceLineItemObject")BalanceLineItemObjectData[] ________BalanceLineItem,@FormParam("BalanceLineItemQueryObject")BalanceLineItemQueryObjectData __BalanceLineItemQuery,@FormParam("__XMLFileName")String __XMLFileName,@FormParam("__CDFFileName")String __CDFFileName) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemBulkAdjustmentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (___BulkAdjustment != null) BulkAdjustmentObjectHelper.toMap (___BulkAdjustment, record, "BulkAdjustment");
      if (______BatchRequest != null) BatchRequestObjectHelper.toMap (______BatchRequest, record, "BatchRequest");
      if (________BalanceLineItem != null)
    {
      Object[] list = new Object[________BalanceLineItem.length];
      for (int i = 0; i < ________BalanceLineItem.length; i++)
      {
        list[i] = null;
        list[i] = BalanceLineItemObjectHelper.getMap (________BalanceLineItem[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BalanceLineItem");
      }
      record.put ("BalanceLineItemList", list);
    }

      if (__XMLFileName != null) record.put ("XMLFileName", __XMLFileName);

      if (__CDFFileName != null) record.put ("CDFFileName", __CDFFileName);
      if (__BalanceLineItemQuery != null) BalanceLineItemQueryObjectHelper.toMap (__BalanceLineItemQuery, record, "BalanceLineItemQuery");
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
return BatchRequestObjectHelper.fromMap (record, "BatchRequest");
}

  /**

   * Creates a new batch to create Balance Line Item usage Adjusments.

   * Convenience method using default BSDMSessionContext.

   * @param ____BulkAdjustment Input  Object.

   * @param ____BatchRequest Input  Object.

   * @param _____BalanceLineItem Input List Object.

   * @param ____BalanceLineItemQuery Input  Object.

   * @param XMLFileName (null is allowed).

   * @param CDFFileName (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BatchRequestObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BatchRequestObjectData create (BulkAdjustmentObjectData ____BulkAdjustment, BatchRequestObjectData ____BatchRequest, BalanceLineItemObjectData[] _____BalanceLineItem, BalanceLineItemQueryObjectData ____BalanceLineItemQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ____BulkAdjustment, ____BatchRequest, _____BalanceLineItem, ____BalanceLineItemQuery, XMLFileName, CDFFileName, defaultAction, constraintAction);
  }
  /** 
   * Creates a new batch to create Balance Line Item usage Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____BulkAdjustment Input  Object.
   * @param ____BatchRequest Input  Object.
   * @param _____BalanceLineItem Input List Object.
   * @param ____BalanceLineItemQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BatchRequestObjectData create (BSDMSessionContext context, BulkAdjustmentObjectData ____BulkAdjustment, BatchRequestObjectData ____BatchRequest, BalanceLineItemObjectData[] _____BalanceLineItem, BalanceLineItemQueryObjectData ____BalanceLineItemQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(____BulkAdjustment, defaultAction);
       
     dManager.setObjectDefaults(____BatchRequest, defaultAction);
       
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(____BalanceLineItemQuery, defaultAction);
       
     cManager.checkConstraints(____BulkAdjustment, constraintAction);
       
     cManager.checkConstraints(____BatchRequest, constraintAction);
       
     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     cManager.checkConstraints(____BalanceLineItemQuery, constraintAction);
       return create (context, ____BulkAdjustment, ____BatchRequest, _____BalanceLineItem, ____BalanceLineItemQuery, XMLFileName, CDFFileName);
  }

  /**

   * retrieves Batch Request with Template and Particiapant information.

   * Convenience method using default BSDMSessionContext.

   * @param __BatchRequest Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BalanceLineItemBulkAdjustmentGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BalanceLineItemBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData __BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, __BatchRequest, defaultAction, constraintAction);
  }
  /** 
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param __BatchRequest Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BalanceLineItemBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BalanceLineItemBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData __BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(__BatchRequest, defaultAction);
       
     cManager.checkConstraints(__BatchRequest, constraintAction);
       return get (context, __BatchRequest);
  }

  /**

   * Updates Batch Request with Template and Particiapant information.

   * Convenience method using default BSDMSessionContext.

   * @param ___BulkAdjustment Input  Object.

   * @param ______BatchRequest Input  Object.

   * @param ________BalanceLineItem Input List Object.

   * @param __BalanceLineItemQuery Input  Object.

   * @param __XMLFileName (null is allowed).

   * @param __CDFFileName (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BatchRequestObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData ______BatchRequest, BalanceLineItemObjectData[] ________BalanceLineItem, BalanceLineItemQueryObjectData __BalanceLineItemQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ___BulkAdjustment, ______BatchRequest, ________BalanceLineItem, __BalanceLineItemQuery, __XMLFileName, __CDFFileName, defaultAction, constraintAction);
  }
  /** 
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param ______BatchRequest Input  Object.
   * @param ________BalanceLineItem Input List Object.
   * @param __BalanceLineItemQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BatchRequestObjectData update (BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData ______BatchRequest, BalanceLineItemObjectData[] ________BalanceLineItem, BalanceLineItemQueryObjectData __BalanceLineItemQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(___BulkAdjustment, defaultAction);
       
     dManager.setObjectDefaults(______BatchRequest, defaultAction);
       
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(__BalanceLineItemQuery, defaultAction);
       
     cManager.checkConstraints(___BulkAdjustment, constraintAction);
       
     cManager.checkConstraints(______BatchRequest, constraintAction);
       
     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     cManager.checkConstraints(__BalanceLineItemQuery, constraintAction);
       return update (context, ___BulkAdjustment, ______BatchRequest, ________BalanceLineItem, __BalanceLineItemQuery, __XMLFileName, __CDFFileName);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BalanceLineItemBulkAdjustmentBean ()
  {
    try
    {
      _BalanceLineItemBulkAdjustmentCreateSpec = new BSDMInteractionSpec("BalanceLineItemBulkAdjustmentCreate", ApiMappings.getCallName ("BalanceLineItemBulkAdjustmentCreate"), Boolean.TRUE);

      _BalanceLineItemBulkAdjustmentGetSpec = new BSDMInteractionSpec("BalanceLineItemBulkAdjustmentGet", ApiMappings.getCallName ("BalanceLineItemBulkAdjustmentGet"), Boolean.TRUE);

      _BalanceLineItemBulkAdjustmentUpdateSpec = new BSDMInteractionSpec("BalanceLineItemBulkAdjustmentUpdate", ApiMappings.getCallName ("BalanceLineItemBulkAdjustmentUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BalanceLineItemBulkAdjustmentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BalanceLineItemBulkAdjustmentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
