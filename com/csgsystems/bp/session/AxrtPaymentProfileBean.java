
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AxrtPaymentProfileBean.java
 * Definition File: Customer/AxrtPaymentProfile.xml
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
import com.csgsystems.bp.interfaces.AxrtPaymentProfileInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AxrtPaymentProfileSessionBean"
 * display-name="AxrtPaymentProfile Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AxrtPaymentProfileBean"
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

@Stateless(name="AxrtPaymentProfileBean", mappedName = "AxrtPaymentProfile")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("AxrtPaymentProfiles")

public class AxrtPaymentProfileBean implements AxrtPaymentProfileInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AxrtPaymentProfileCreateSpec = null;
  /**
   * Create a AxrtPaymentProfile based upon its input values..
   * Convenience method using default BSDMSessionContext.
   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AxrtPaymentProfileObjectData create (AxrtPaymentProfileObjectData axrtppcIn) throws BSDMResourceException
  {
    return create (null, axrtppcIn);
  }
  /**
   * Create a AxrtPaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AxrtPaymentProfileObjectData create (@HeaderParam ("context")BSDMSessionContext context,AxrtPaymentProfileObjectData axrtppcIn) throws BSDMResourceException
{
	BSDMResourceException cex = null;
	BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AxrtPaymentProfileCreateSpec, context);
	MappedRecord record       = null;
	Connection connection     = null;
	Interaction interaction   = null;
	try
	{
	record = cf.getRecordFactory ().createMappedRecord (null);
	      if (axrtppcIn != null) AxrtPaymentProfileObjectHelper.toMap (axrtppcIn, record, "AxrtPaymentProfile");
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
	return AxrtPaymentProfileObjectHelper.fromMap (record, "AxrtPaymentProfile");
}

  private BSDMInteractionSpec _AxrtPaymentProfileUpdateSpec = null;
  /**
   * Update a AxrtPaymentProfile.
   * Convenience method using default BSDMSessionContext.
   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AxrtPaymentProfileObjectData update (AxrtPaymentProfileObjectData axrtppuIn) throws BSDMResourceException
  {
    return update (null, axrtppuIn);
  }
  /**
   * Update a AxrtPaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AxrtPaymentProfileObjectData update (@HeaderParam ("context")BSDMSessionContext context,AxrtPaymentProfileObjectData axrtppuIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AxrtPaymentProfileUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (axrtppuIn != null) AxrtPaymentProfileObjectHelper.toMap (axrtppuIn, record, "AxrtPaymentProfile");
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
return AxrtPaymentProfileObjectHelper.fromMap (record, "AxrtPaymentProfile");
}

  private BSDMInteractionSpec _AxrtPaymentProfileDeleteSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param axrtppdIn Input  Object.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AxrtPaymentProfileObjectData delete (AxrtPaymentProfileObjectData axrtppdIn) throws BSDMResourceException
  {
    return delete (null, axrtppdIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppdIn Input  Object.
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AxrtPaymentProfileObjectData delete (@HeaderParam ("context")BSDMSessionContext context,AxrtPaymentProfileObjectData axrtppdIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AxrtPaymentProfileDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (axrtppdIn != null) AxrtPaymentProfileObjectHelper.toMap (axrtppdIn, record, "AxrtPaymentProfile");
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
return AxrtPaymentProfileObjectHelper.fromMap (record, "AxrtPaymentProfile");
}

  private BSDMInteractionSpec _AxrtPaymentProfileFindSpec = null;
  /**
   * Find AxrtPaymentProfiles that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param axrtppfIn Input Filter Object.
   * @return AxrtPaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AxrtPaymentProfileObjectDataList find (AxrtPaymentProfileObjectFilter axrtppfIn) throws BSDMResourceException
  {
    return find (null, axrtppfIn);
  }
  /**
   * Find AxrtPaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppfIn Input Filter Object.
   * @return AxrtPaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AxrtPaymentProfileObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AxrtPaymentProfileObjectFilter axrtppfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AxrtPaymentProfileFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (axrtppfIn != null) AxrtPaymentProfileObjectHelper.toMap (axrtppfIn, record, "AxrtPaymentProfile");
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
return AxrtPaymentProfileObjectHelper.fromMapList (record, "AxrtPaymentProfileList");
}

  /**

   * Create a AxrtPaymentProfile based upon its input values..

   * Convenience method using default BSDMSessionContext.

   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AxrtPaymentProfileObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AxrtPaymentProfileObjectData create (AxrtPaymentProfileObjectData axrtppcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, axrtppcIn, defaultAction, constraintAction);
  }
  /** 
   * Create a AxrtPaymentProfile based upon its input values..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppcIn Input  Object.  Derived Fields: ProfileId, ProfileCreationTime.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AxrtPaymentProfileObjectData create (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppcIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(axrtppcIn, defaultAction);
       
     cManager.checkConstraints(axrtppcIn, constraintAction);
       return create (context, axrtppcIn);
  }

  /**

   * Update a AxrtPaymentProfile.

   * Convenience method using default BSDMSessionContext.

   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AxrtPaymentProfileObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AxrtPaymentProfileObjectData update (AxrtPaymentProfileObjectData axrtppuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, axrtppuIn, defaultAction, constraintAction);
  }
  /** 
   * Update a AxrtPaymentProfile.
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppuIn Input  Object.  Read-Only fields: CyclicalBillUsed, IsTemporary, NonRealtimeOnly.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AxrtPaymentProfileObjectData update (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppuIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(axrtppuIn, defaultAction);
       
     cManager.checkConstraints(axrtppuIn, constraintAction);
       return update (context, axrtppuIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param axrtppdIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AxrtPaymentProfileObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AxrtPaymentProfileObjectData delete (AxrtPaymentProfileObjectData axrtppdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, axrtppdIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppdIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AxrtPaymentProfileObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AxrtPaymentProfileObjectData delete (BSDMSessionContext context, AxrtPaymentProfileObjectData axrtppdIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(axrtppdIn, defaultAction);
       
     cManager.checkConstraints(axrtppdIn, constraintAction);
       return delete (context, axrtppdIn);
  }

  /**

   * Find AxrtPaymentProfiles that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param axrtppfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AxrtPaymentProfileObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AxrtPaymentProfileObjectDataList find (AxrtPaymentProfileObjectFilter axrtppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, axrtppfIn, defaultAction, constraintAction);
  }
  /** 
   * Find AxrtPaymentProfiles that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param axrtppfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AxrtPaymentProfileObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AxrtPaymentProfileObjectDataList find (BSDMSessionContext context, AxrtPaymentProfileObjectFilter axrtppfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(axrtppfIn, defaultAction);
       
     cManager.checkConstraints(axrtppfIn, constraintAction);
       return find (context, axrtppfIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AxrtPaymentProfileBean ()
  {
    try
    {
      _AxrtPaymentProfileCreateSpec = new BSDMInteractionSpec("AxrtPaymentProfileCreate", ApiMappings.getCallName ("AxrtPaymentProfileCreate"), Boolean.TRUE);

      _AxrtPaymentProfileUpdateSpec = new BSDMInteractionSpec("AxrtPaymentProfileUpdate", ApiMappings.getCallName ("AxrtPaymentProfileUpdate"), Boolean.TRUE);

      _AxrtPaymentProfileDeleteSpec = new BSDMInteractionSpec("AxrtPaymentProfileDelete", ApiMappings.getCallName ("AxrtPaymentProfileDelete"), Boolean.TRUE);

      _AxrtPaymentProfileFindSpec = new BSDMInteractionSpec("AxrtPaymentProfileFind", ApiMappings.getCallName ("AxrtPaymentProfileFind"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AxrtPaymentProfileBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AxrtPaymentProfileBean(BSDMSettings settings, BSDMConnectionManager cm)
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
