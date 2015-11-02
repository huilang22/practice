
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: PaymentProfileBean.java
 * Definition File: Customer/PaymentProfile.xml
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
import com.csgsystems.bp.interfaces.PaymentProfileInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="PaymentProfileSessionBean"
 * display-name="PaymentProfile Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/PaymentProfileBean"
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

@Stateless(name="PaymentProfileBean", mappedName = "PaymentProfile")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("PaymentProfiles")

public class PaymentProfileBean implements PaymentProfileInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _PaymentProfileCreateSpec = null;
  /**
   * Create a PaymentProfile based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param ppcIn Input  Object.  Defaulted Fields: Status.
   * @param payment_protocol (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentProfileObjectData create (PaymentProfileObjectData ppcIn, Integer payment_protocol) throws BSDMResourceException
  {
    return create (null, ppcIn, payment_protocol);
  }
  /**
   * Create a PaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppcIn Input  Object.  Defaulted Fields: Status.
   * @param payment_protocol (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentProfileObjectData create (@HeaderParam ("context")BSDMSessionContext context,PaymentProfileObjectData ppcIn,@FormParam("payment_protocol")Integer payment_protocol) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentProfileCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ppcIn != null) PaymentProfileObjectHelper.toMap (ppcIn, record, "PaymentProfile");

      if (payment_protocol != null) record.put ("PaymentProtocol", payment_protocol);
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
return PaymentProfileObjectHelper.fromMap (record, "PaymentProfile");
}

  private BSDMInteractionSpec _PaymentProfileUpdateSpec = null;
  /**
   * Update a PaymentProfile.
   * Convenience method using default BSDMSessionContext.
   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param payment_protocol2 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentProfileObjectData update (PaymentProfileObjectData ppuIn, Integer payment_protocol2) throws BSDMResourceException
  {
    return update (null, ppuIn, payment_protocol2);
  }
  /**
   * Update a PaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param payment_protocol2 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentProfileObjectData update (@HeaderParam ("context")BSDMSessionContext context,PaymentProfileObjectData ppuIn,@FormParam("payment_protocol2")Integer payment_protocol2) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentProfileUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ppuIn != null) PaymentProfileObjectHelper.toMap (ppuIn, record, "PaymentProfile");

      if (payment_protocol2 != null) record.put ("PaymentProtocol2", payment_protocol2);
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
return PaymentProfileObjectHelper.fromMap (record, "PaymentProfile");
}

  private BSDMInteractionSpec _PaymentProfileDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param ppdIn Input Object Key.
   * @param profile_status (null is allowed).
   * @param payment_protocol3 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentProfileObjectData delete (PaymentProfileObjectKeyData ppdIn, Integer profile_status, Integer payment_protocol3) throws BSDMResourceException
  {
    return delete (null, ppdIn, profile_status, payment_protocol3);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param ppdIn Input Object Key.
   * @param profile_status (null is allowed).
   * @param payment_protocol3 (null is allowed) (has a default).
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentProfileObjectData delete (@HeaderParam ("context")BSDMSessionContext context,PaymentProfileObjectKeyData ppdIn,@FormParam("profile_status")Integer profile_status,@FormParam("payment_protocol3")Integer payment_protocol3) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentProfileDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ppdIn != null) PaymentProfileObjectKeyHelper.toMap (ppdIn, record, "PaymentProfile");

      if (profile_status != null) record.put ("ProfileStatus", profile_status);

      if (payment_protocol3 != null) record.put ("PaymentProtocol3", payment_protocol3);
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
return PaymentProfileObjectHelper.fromMap (record, "PaymentProfile");
}

  private BSDMInteractionSpec _PaymentProfileGetSpec = null;
  /**
   * Get the PaymentProfile row that corresponds to the supplied key..
   * Convenience method using default BSDMSessionContext.
   * @param ppgIn Input Object Key.
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentProfileObjectData get (PaymentProfileObjectKeyData ppgIn) throws BSDMResourceException
  {
    return get (null, ppgIn);
  }
  /**
   * Get the PaymentProfile row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppgIn Input Object Key.
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public PaymentProfileObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PaymentProfileObjectKeyData ppgIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentProfileGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ppgIn != null) PaymentProfileObjectKeyHelper.toMap (ppgIn, record, "PaymentProfile");
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
return PaymentProfileObjectHelper.fromMap (record, "PaymentProfile");
}

  private BSDMInteractionSpec _PaymentProfileFindSpec = null;
  /**
   * Find PaymentProfiles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ppfIn Input Filter Object.
   * @return PaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PaymentProfileObjectDataList find (PaymentProfileObjectFilter ppfIn) throws BSDMResourceException
  {
    return find (null, ppfIn);
  }
  /**
   * Find PaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppfIn Input Filter Object.
   * @return PaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PaymentProfileObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,PaymentProfileObjectFilter ppfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PaymentProfileFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ppfIn != null) PaymentProfileObjectHelper.toMap (ppfIn, record, "PaymentProfile");
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
return PaymentProfileObjectHelper.fromMapList (record, "PaymentProfileList");
}

  /**

   * Create a PaymentProfile based upon its input values..

   * Convenience method using default BSDMSessionContext.

   * @param ppcIn Input  Object.  Defaulted Fields: Status.

   * @param payment_protocol (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentProfileObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentProfileObjectData create (PaymentProfileObjectData ppcIn, Integer payment_protocol, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ppcIn, payment_protocol, defaultAction, constraintAction);
  }
  /** 
   * Create a PaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppcIn Input  Object.  Defaulted Fields: Status.
   * @param payment_protocol (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentProfileObjectData create (BSDMSessionContext context, PaymentProfileObjectData ppcIn, Integer payment_protocol, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ppcIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ppcIn, constraintAction);
       
    //Constraints not supported on Input-Column
return create (context, ppcIn, payment_protocol);
  }

  /**

   * Update a PaymentProfile.

   * Convenience method using default BSDMSessionContext.

   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.

   * @param payment_protocol2 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentProfileObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentProfileObjectData update (PaymentProfileObjectData ppuIn, Integer payment_protocol2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ppuIn, payment_protocol2, defaultAction, constraintAction);
  }
  /** 
   * Update a PaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param ppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param payment_protocol2 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentProfileObjectData update (BSDMSessionContext context, PaymentProfileObjectData ppuIn, Integer payment_protocol2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ppuIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ppuIn, constraintAction);
       
    //Constraints not supported on Input-Column
return update (context, ppuIn, payment_protocol2);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param ppdIn Input Object Key.

   * @param profile_status (null is allowed).

   * @param payment_protocol3 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentProfileObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentProfileObjectData delete (PaymentProfileObjectKeyData ppdIn, Integer profile_status, Integer payment_protocol3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, ppdIn, profile_status, payment_protocol3, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param ppdIn Input Object Key.
   * @param profile_status (null is allowed).
   * @param payment_protocol3 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentProfileObjectData delete (BSDMSessionContext context, PaymentProfileObjectKeyData ppdIn, Integer profile_status, Integer payment_protocol3, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ppdIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ppdIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return delete (context, ppdIn, profile_status, payment_protocol3);
  }

  /**

   * Get the PaymentProfile row that corresponds to the supplied key..

   * Convenience method using default BSDMSessionContext.

   * @param ppgIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentProfileObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentProfileObjectData get (PaymentProfileObjectKeyData ppgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ppgIn, defaultAction, constraintAction);
  }
  /** 
   * Get the PaymentProfile row that corresponds to the supplied key..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppgIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentProfileObjectData get (BSDMSessionContext context, PaymentProfileObjectKeyData ppgIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ppgIn, defaultAction);
       
     cManager.checkConstraints(ppgIn, constraintAction);
       return get (context, ppgIn);
  }

  /**

   * Find PaymentProfiles that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ppfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PaymentProfileObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PaymentProfileObjectDataList find (PaymentProfileObjectFilter ppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ppfIn, defaultAction, constraintAction);
  }
  /** 
   * Find PaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ppfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PaymentProfileObjectDataList find (BSDMSessionContext context, PaymentProfileObjectFilter ppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ppfIn, defaultAction);
       
     cManager.checkConstraints(ppfIn, constraintAction);
       return find (context, ppfIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public PaymentProfileBean ()
  {
    try
    {
      _PaymentProfileCreateSpec = new BSDMInteractionSpec("PaymentProfileCreate", ApiMappings.getCallName ("PaymentProfileCreate"), Boolean.TRUE);

      _PaymentProfileUpdateSpec = new BSDMInteractionSpec("PaymentProfileUpdate", ApiMappings.getCallName ("PaymentProfileUpdate"), Boolean.TRUE);

      _PaymentProfileDeleteSpec = new BSDMInteractionSpec("PaymentProfileDelete", ApiMappings.getCallName ("PaymentProfileDelete"), Boolean.TRUE);

      _PaymentProfileGetSpec = new BSDMInteractionSpec("PaymentProfileGet", ApiMappings.getCallName ("PaymentProfileGet"), Boolean.TRUE);

      _PaymentProfileFindSpec = new BSDMInteractionSpec("PaymentProfileFind", ApiMappings.getCallName ("PaymentProfileFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public PaymentProfileBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public PaymentProfileBean(BSDMSettings settings, BSDMConnectionManager cm)
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
