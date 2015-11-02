
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AdjustmentTypeBean.java
 * Definition File: Admin/AdjustmentType.xml
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
import com.csgsystems.bp.interfaces.AdjustmentTypeInterface;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AdjustmentTypeSessionBean"
 * display-name="AdjustmentType Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AdjustmentTypeBean"
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

@Stateless(name="AdjustmentTypeBean", mappedName = "AdjustmentType")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AdjustmentTypes")

public class AdjustmentTypeBean implements AdjustmentTypeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AdjustmentTypeGetSpec = null;
  /**
   * Get an AdjustmentType..
   * Convenience method using default BSDMSessionContext.
   * @param atdGetIn Input Object Key.
   * @return AdjustmentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentTypeObjectData get (AdjustmentTypeObjectKeyData atdGetIn) throws BSDMResourceException
  {
    return get (null, atdGetIn);
  }
  /**
   * Get an AdjustmentType..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdGetIn Input Object Key.
   * @return AdjustmentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AdjustmentTypeObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AdjustmentTypeObjectKeyData atdGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentTypeGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (atdGetIn != null) AdjustmentTypeObjectKeyHelper.toMap (atdGetIn, record, "AdjustmentType");
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
return AdjustmentTypeObjectHelper.fromMap (record, "AdjustmentType");
}

  private BSDMInteractionSpec _AdjustmentTypeFindSpec = null;
  /**
   * Find AdjustmentTypes..
   * Convenience method using default BSDMSessionContext.
   * @param atdFindIn Input Filter Object.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentTypeObjectDataList find (AdjustmentTypeObjectFilter atdFindIn) throws BSDMResourceException
  {
    return find (null, atdFindIn);
  }
  /**
   * Find AdjustmentTypes..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdFindIn Input Filter Object.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentTypeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AdjustmentTypeObjectFilter atdFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentTypeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (atdFindIn != null) AdjustmentTypeObjectHelper.toMap (atdFindIn, record, "AdjustmentType");
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
return AdjustmentTypeObjectHelper.fromMapList (record, "AdjustmentTypeList");
}

  private BSDMInteractionSpec _AdjustmentTypeEligibleFindSpec = null;
  /**
   * Find eligible AdjustmentTypes for the specified item..
   * Convenience method using default BSDMSessionContext.
   * @param unbilled_usage Input  Object.
   * @param billed_usage Input  Object.
   * @param invoice_detail Input  Object.
   * @param balance_line_item Input  Object.
   * @param invoice Input  Object.
   * @param language_code (null is allowed).
   * @param trans_sign (null is allowed).
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentTypeObjectDataList eligibleFind (UnbilledUsageObjectData unbilled_usage, BilledUsageObjectData billed_usage, InvoiceDetailObjectData invoice_detail, BalanceLineItemObjectData balance_line_item, InvoiceObjectData invoice, Integer language_code, Integer trans_sign) throws BSDMResourceException
  {
    return eligibleFind (null, unbilled_usage, billed_usage, invoice_detail, balance_line_item, invoice, language_code, trans_sign);
  }
  /**
   * Find eligible AdjustmentTypes for the specified item..
   * @param context The session context to use when connecting to the APITS server.
   * @param unbilled_usage Input  Object.
   * @param billed_usage Input  Object.
   * @param invoice_detail Input  Object.
   * @param balance_line_item Input  Object.
   * @param invoice Input  Object.
   * @param language_code (null is allowed).
   * @param trans_sign (null is allowed).
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("eligibleFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentTypeObjectDataList eligibleFind (@HeaderParam ("context")BSDMSessionContext context,UnbilledUsageObjectData unbilled_usage,@FormParam("BilledUsageObject")BilledUsageObjectData billed_usage,@FormParam("InvoiceDetailObject")InvoiceDetailObjectData invoice_detail,@FormParam("BalanceLineItemObject")BalanceLineItemObjectData balance_line_item,@FormParam("InvoiceObject")InvoiceObjectData invoice,@FormParam("language_code")Integer language_code,@FormParam("trans_sign")Integer trans_sign) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentTypeEligibleFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (unbilled_usage != null) UnbilledUsageObjectHelper.toMap (unbilled_usage, record, "UnbilledUsage");
      if (billed_usage != null) BilledUsageObjectHelper.toMap (billed_usage, record, "BilledUsage");
      if (invoice_detail != null) InvoiceDetailObjectHelper.toMap (invoice_detail, record, "InvoiceDetail");
      if (balance_line_item != null) BalanceLineItemObjectHelper.toMap (balance_line_item, record, "BalanceLineItem");
      if (invoice != null) InvoiceObjectHelper.toMap (invoice, record, "Invoice");

      if (language_code != null) record.put ("LanguageCode", language_code);

      if (trans_sign != null) record.put ("TransSign", trans_sign);
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
return AdjustmentTypeObjectHelper.fromMapList (record, "AdjustmentTypeList");
}

  private BSDMInteractionSpec _AdjustmentTypeByGroupFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param LanguageCode.
   * @param adj_trans_group.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentTypeObjectDataList byGroupFind (Integer LanguageCode, Integer adj_trans_group) throws BSDMResourceException
  {
    return byGroupFind (null, LanguageCode, adj_trans_group);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param adj_trans_group.
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byGroupFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentTypeObjectDataList byGroupFind (@HeaderParam ("context")BSDMSessionContext context,Integer LanguageCode,@FormParam("adj_trans_group")Integer adj_trans_group) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentTypeByGroupFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (LanguageCode != null) record.put ("LanguageCode", LanguageCode);

      if (adj_trans_group != null) record.put ("AdjTransGroup", adj_trans_group);
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
return AdjustmentTypeObjectHelper.fromMapList (record, "AdjustmentTypeList");
}

  /**

   * Get an AdjustmentType..

   * Convenience method using default BSDMSessionContext.

   * @param atdGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentTypeObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentTypeObjectData get (AdjustmentTypeObjectKeyData atdGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, atdGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get an AdjustmentType..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentTypeObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentTypeObjectData get (BSDMSessionContext context, AdjustmentTypeObjectKeyData atdGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(atdGetIn, defaultAction);
       
     cManager.checkConstraints(atdGetIn, constraintAction);
       return get (context, atdGetIn);
  }

  /**

   * Find AdjustmentTypes..

   * Convenience method using default BSDMSessionContext.

   * @param atdFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentTypeObjectDataList find (AdjustmentTypeObjectFilter atdFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, atdFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find AdjustmentTypes..
   * @param context The session context to use when connecting to the APITS server.
   * @param atdFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentTypeObjectDataList find (BSDMSessionContext context, AdjustmentTypeObjectFilter atdFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(atdFindIn, defaultAction);
       
     cManager.checkConstraints(atdFindIn, constraintAction);
       return find (context, atdFindIn);
  }

  /**

   * Find eligible AdjustmentTypes for the specified item..

   * Convenience method using default BSDMSessionContext.

   * @param unbilled_usage Input  Object.

   * @param billed_usage Input  Object.

   * @param invoice_detail Input  Object.

   * @param balance_line_item Input  Object.

   * @param invoice Input  Object.

   * @param language_code (null is allowed).

   * @param trans_sign (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentTypeObjectDataList eligibleFind (UnbilledUsageObjectData unbilled_usage, BilledUsageObjectData billed_usage, InvoiceDetailObjectData invoice_detail, BalanceLineItemObjectData balance_line_item, InvoiceObjectData invoice, Integer language_code, Integer trans_sign, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return eligibleFind (null, unbilled_usage, billed_usage, invoice_detail, balance_line_item, invoice, language_code, trans_sign, defaultAction, constraintAction);
  }
  /** 
   * Find eligible AdjustmentTypes for the specified item..
   * @param context The session context to use when connecting to the APITS server.
   * @param unbilled_usage Input  Object.
   * @param billed_usage Input  Object.
   * @param invoice_detail Input  Object.
   * @param balance_line_item Input  Object.
   * @param invoice Input  Object.
   * @param language_code (null is allowed).
   * @param trans_sign (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentTypeObjectDataList eligibleFind (BSDMSessionContext context, UnbilledUsageObjectData unbilled_usage, BilledUsageObjectData billed_usage, InvoiceDetailObjectData invoice_detail, BalanceLineItemObjectData balance_line_item, InvoiceObjectData invoice, Integer language_code, Integer trans_sign, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(unbilled_usage, defaultAction);
       
     dManager.setObjectDefaults(billed_usage, defaultAction);
       
     dManager.setObjectDefaults(invoice_detail, defaultAction);
       
     dManager.setObjectDefaults(balance_line_item, defaultAction);
       
     dManager.setObjectDefaults(invoice, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(unbilled_usage, constraintAction);
       
     cManager.checkConstraints(billed_usage, constraintAction);
       
     cManager.checkConstraints(invoice_detail, constraintAction);
       
     cManager.checkConstraints(balance_line_item, constraintAction);
       
     cManager.checkConstraints(invoice, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return eligibleFind (context, unbilled_usage, billed_usage, invoice_detail, balance_line_item, invoice, language_code, trans_sign);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param LanguageCode.

   * @param adj_trans_group.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentTypeObjectDataList byGroupFind (Integer LanguageCode, Integer adj_trans_group, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byGroupFind (null, LanguageCode, adj_trans_group, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param LanguageCode.
   * @param adj_trans_group.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentTypeObjectDataList byGroupFind (BSDMSessionContext context, Integer LanguageCode, Integer adj_trans_group, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return byGroupFind (context, LanguageCode, adj_trans_group);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AdjustmentTypeBean ()
  {
    try
    {
      _AdjustmentTypeGetSpec = new BSDMInteractionSpec("AdjustmentTypeGet", ApiMappings.getCallName ("AdjustmentTypeGet"), Boolean.TRUE);

      _AdjustmentTypeFindSpec = new BSDMInteractionSpec("AdjustmentTypeFind", ApiMappings.getCallName ("AdjustmentTypeFind"), Boolean.TRUE);

      _AdjustmentTypeEligibleFindSpec = new BSDMInteractionSpec("AdjustmentTypeEligibleFind", ApiMappings.getCallName ("AdjustmentTypeEligibleFind"), Boolean.TRUE);

      _AdjustmentTypeByGroupFindSpec = new BSDMInteractionSpec("AdjustmentTypeByGroupFind", ApiMappings.getCallName ("AdjustmentTypeByGroupFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AdjustmentTypeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AdjustmentTypeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
