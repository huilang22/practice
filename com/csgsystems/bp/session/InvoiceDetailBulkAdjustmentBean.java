
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: InvoiceDetailBulkAdjustmentBean.java
 * Definition File: Catalog/InvoiceDetailBulkAdjustment.xml
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
import com.csgsystems.bp.interfaces.InvoiceDetailBulkAdjustmentInterface;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bat.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="InvoiceDetailBulkAdjustmentSessionBean"
 * display-name="InvoiceDetailBulkAdjustment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/InvoiceDetailBulkAdjustmentBean"
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

@Stateless(name="InvoiceDetailBulkAdjustmentBean", mappedName = "InvoiceDetailBulkAdjustment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("InvoiceDetailBulkAdjustments")

public class InvoiceDetailBulkAdjustmentBean implements InvoiceDetailBulkAdjustmentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _InvoiceDetailBulkAdjustmentCreateSpec = null;
  /**
   * Creates a new batch to create Invoice Detail Adjusments.
   * Convenience method using default BSDMSessionContext.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param ____InvoiceDetail Input List Object.
   * @param _InvoiceDetailQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BatchRequestObjectData create (BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, InvoiceDetailObjectData[] ____InvoiceDetail, InvoiceDetailQueryObjectData _InvoiceDetailQuery, String XMLFileName, String CDFFileName) throws BSDMResourceException
  {
    return create (null, _BulkAdjustment, _BatchRequest, ____InvoiceDetail, _InvoiceDetailQuery, XMLFileName, CDFFileName);
  }
  /**
   * Creates a new batch to create Invoice Detail Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param ____InvoiceDetail Input List Object.
   * @param _InvoiceDetailQuery Input  Object.
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
 public BatchRequestObjectData create (@HeaderParam ("context")BSDMSessionContext context,BulkAdjustmentObjectData _BulkAdjustment,@FormParam("BatchRequestObject")BatchRequestObjectData _BatchRequest,@FormParam("InvoiceDetailObject")InvoiceDetailObjectData[] ____InvoiceDetail,@FormParam("InvoiceDetailQueryObject")InvoiceDetailQueryObjectData _InvoiceDetailQuery,@FormParam("XMLFileName")String XMLFileName,@FormParam("CDFFileName")String CDFFileName) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailBulkAdjustmentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (_BulkAdjustment != null) BulkAdjustmentObjectHelper.toMap (_BulkAdjustment, record, "BulkAdjustment");
      if (_BatchRequest != null) BatchRequestObjectHelper.toMap (_BatchRequest, record, "BatchRequest");
      if (____InvoiceDetail != null)
    {
      Object[] list = new Object[____InvoiceDetail.length];
      for (int i = 0; i < ____InvoiceDetail.length; i++)
      {
        list[i] = null;
        list[i] = InvoiceDetailObjectHelper.getMap (____InvoiceDetail[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvoiceDetail");
      }
      record.put ("InvoiceDetailList", list);
    }

      if (XMLFileName != null) record.put ("XMLFileName", XMLFileName);

      if (CDFFileName != null) record.put ("CDFFileName", CDFFileName);
      if (_InvoiceDetailQuery != null) InvoiceDetailQueryObjectHelper.toMap (_InvoiceDetailQuery, record, "InvoiceDetailQuery");
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

  private BSDMInteractionSpec _InvoiceDetailBulkAdjustmentGetSpec = null;
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BatchRequest Input Object Key.
   * @return InvoiceDetailBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvoiceDetailBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData ___BatchRequest) throws BSDMResourceException
  {
    return get (null, ___BatchRequest);
  }
  /**
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input Object Key.
   * @return InvoiceDetailBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public InvoiceDetailBulkAdjustmentGetOutputData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BatchRequestObjectKeyData ___BatchRequest) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailBulkAdjustmentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (___BatchRequest != null) BatchRequestObjectKeyHelper.toMap (___BatchRequest, record, "BatchRequest");
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
return InvoiceDetailBulkAdjustmentGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _InvoiceDetailBulkAdjustmentUpdateSpec = null;
  /**
   * Updates Batch Request with Template and Particiapant information.
   * Convenience method using default BSDMSessionContext.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______InvoiceDetail Input List Object.
   * @param ___InvoiceDetailQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, InvoiceDetailObjectData[] _______InvoiceDetail, InvoiceDetailQueryObjectData ___InvoiceDetailQuery, String __XMLFileName, String __CDFFileName) throws BSDMResourceException
  {
    return update (null, ___BulkAdjustment, _____BatchRequest, _______InvoiceDetail, ___InvoiceDetailQuery, __XMLFileName, __CDFFileName);
  }
  /**
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______InvoiceDetail Input List Object.
   * @param ___InvoiceDetailQuery Input  Object.
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
 public BatchRequestObjectData update (@HeaderParam ("context")BSDMSessionContext context,BulkAdjustmentObjectData ___BulkAdjustment,@FormParam("BatchRequestObject")BatchRequestObjectData _____BatchRequest,@FormParam("InvoiceDetailObject")InvoiceDetailObjectData[] _______InvoiceDetail,@FormParam("InvoiceDetailQueryObject")InvoiceDetailQueryObjectData ___InvoiceDetailQuery,@FormParam("__XMLFileName")String __XMLFileName,@FormParam("__CDFFileName")String __CDFFileName) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceDetailBulkAdjustmentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (___BulkAdjustment != null) BulkAdjustmentObjectHelper.toMap (___BulkAdjustment, record, "BulkAdjustment");
      if (_____BatchRequest != null) BatchRequestObjectHelper.toMap (_____BatchRequest, record, "BatchRequest");
      if (_______InvoiceDetail != null)
    {
      Object[] list = new Object[_______InvoiceDetail.length];
      for (int i = 0; i < _______InvoiceDetail.length; i++)
      {
        list[i] = null;
        list[i] = InvoiceDetailObjectHelper.getMap (_______InvoiceDetail[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvoiceDetail");
      }
      record.put ("InvoiceDetailList", list);
    }

      if (__XMLFileName != null) record.put ("XMLFileName", __XMLFileName);

      if (__CDFFileName != null) record.put ("CDFFileName", __CDFFileName);
      if (___InvoiceDetailQuery != null) InvoiceDetailQueryObjectHelper.toMap (___InvoiceDetailQuery, record, "InvoiceDetailQuery");
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

   * Creates a new batch to create Invoice Detail Adjusments.

   * Convenience method using default BSDMSessionContext.

   * @param _BulkAdjustment Input  Object.

   * @param _BatchRequest Input  Object.

   * @param ____InvoiceDetail Input List Object.

   * @param _InvoiceDetailQuery Input  Object.

   * @param XMLFileName (null is allowed).

   * @param CDFFileName (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BatchRequestObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BatchRequestObjectData create (BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, InvoiceDetailObjectData[] ____InvoiceDetail, InvoiceDetailQueryObjectData _InvoiceDetailQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, _BulkAdjustment, _BatchRequest, ____InvoiceDetail, _InvoiceDetailQuery, XMLFileName, CDFFileName, defaultAction, constraintAction);
  }
  /** 
   * Creates a new batch to create Invoice Detail Adjusments.
   * @param context The session context to use when connecting to the APITS server.
   * @param _BulkAdjustment Input  Object.
   * @param _BatchRequest Input  Object.
   * @param ____InvoiceDetail Input List Object.
   * @param _InvoiceDetailQuery Input  Object.
   * @param XMLFileName (null is allowed).
   * @param CDFFileName (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BatchRequestObjectData create (BSDMSessionContext context, BulkAdjustmentObjectData _BulkAdjustment, BatchRequestObjectData _BatchRequest, InvoiceDetailObjectData[] ____InvoiceDetail, InvoiceDetailQueryObjectData _InvoiceDetailQuery, String XMLFileName, String CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(_BulkAdjustment, defaultAction);
       
     dManager.setObjectDefaults(_BatchRequest, defaultAction);
       
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(_InvoiceDetailQuery, defaultAction);
       
     cManager.checkConstraints(_BulkAdjustment, constraintAction);
       
     cManager.checkConstraints(_BatchRequest, constraintAction);
       
     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     cManager.checkConstraints(_InvoiceDetailQuery, constraintAction);
       return create (context, _BulkAdjustment, _BatchRequest, ____InvoiceDetail, _InvoiceDetailQuery, XMLFileName, CDFFileName);
  }

  /**

   * retrieves Batch Request with Template and Particiapant information.

   * Convenience method using default BSDMSessionContext.

   * @param ___BatchRequest Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvoiceDetailBulkAdjustmentGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvoiceDetailBulkAdjustmentGetOutputData get (BatchRequestObjectKeyData ___BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ___BatchRequest, defaultAction, constraintAction);
  }
  /** 
   * retrieves Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BatchRequest Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvoiceDetailBulkAdjustmentGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvoiceDetailBulkAdjustmentGetOutputData get (BSDMSessionContext context, BatchRequestObjectKeyData ___BatchRequest, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(___BatchRequest, defaultAction);
       
     cManager.checkConstraints(___BatchRequest, constraintAction);
       return get (context, ___BatchRequest);
  }

  /**

   * Updates Batch Request with Template and Particiapant information.

   * Convenience method using default BSDMSessionContext.

   * @param ___BulkAdjustment Input  Object.

   * @param _____BatchRequest Input  Object.

   * @param _______InvoiceDetail Input List Object.

   * @param ___InvoiceDetailQuery Input  Object.

   * @param __XMLFileName (null is allowed).

   * @param __CDFFileName (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BatchRequestObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BatchRequestObjectData update (BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, InvoiceDetailObjectData[] _______InvoiceDetail, InvoiceDetailQueryObjectData ___InvoiceDetailQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ___BulkAdjustment, _____BatchRequest, _______InvoiceDetail, ___InvoiceDetailQuery, __XMLFileName, __CDFFileName, defaultAction, constraintAction);
  }
  /** 
   * Updates Batch Request with Template and Particiapant information.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___BulkAdjustment Input  Object.
   * @param _____BatchRequest Input  Object.
   * @param _______InvoiceDetail Input List Object.
   * @param ___InvoiceDetailQuery Input  Object.
   * @param __XMLFileName (null is allowed).
   * @param __CDFFileName (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BatchRequestObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BatchRequestObjectData update (BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustment, BatchRequestObjectData _____BatchRequest, InvoiceDetailObjectData[] _______InvoiceDetail, InvoiceDetailQueryObjectData ___InvoiceDetailQuery, String __XMLFileName, String __CDFFileName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(___BulkAdjustment, defaultAction);
       
     dManager.setObjectDefaults(_____BatchRequest, defaultAction);
       
     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(___InvoiceDetailQuery, defaultAction);
       
     cManager.checkConstraints(___BulkAdjustment, constraintAction);
       
     cManager.checkConstraints(_____BatchRequest, constraintAction);
       
     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     cManager.checkConstraints(___InvoiceDetailQuery, constraintAction);
       return update (context, ___BulkAdjustment, _____BatchRequest, _______InvoiceDetail, ___InvoiceDetailQuery, __XMLFileName, __CDFFileName);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public InvoiceDetailBulkAdjustmentBean ()
  {
    try
    {
      _InvoiceDetailBulkAdjustmentCreateSpec = new BSDMInteractionSpec("InvoiceDetailBulkAdjustmentCreate", ApiMappings.getCallName ("InvoiceDetailBulkAdjustmentCreate"), Boolean.TRUE);

      _InvoiceDetailBulkAdjustmentGetSpec = new BSDMInteractionSpec("InvoiceDetailBulkAdjustmentGet", ApiMappings.getCallName ("InvoiceDetailBulkAdjustmentGet"), Boolean.TRUE);

      _InvoiceDetailBulkAdjustmentUpdateSpec = new BSDMInteractionSpec("InvoiceDetailBulkAdjustmentUpdate", ApiMappings.getCallName ("InvoiceDetailBulkAdjustmentUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public InvoiceDetailBulkAdjustmentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public InvoiceDetailBulkAdjustmentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
