
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ContactBean.java
 * Definition File: Customer/Contact.xml
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
import com.csgsystems.bp.interfaces.ContactInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ContactSessionBean"
 * display-name="Contact Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ContactBean"
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

@Stateless(name="ContactBean", mappedName = "Contact")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Contacts")

public class ContactBean implements ContactInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ContactGetSpec = null;
  /**
   * Get a Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactgetIn Input Object Key.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ContactObjectData get (ContactObjectKeyData ContactgetIn) throws BSDMResourceException
  {
    return get (null, ContactgetIn);
  }
  /**
   * Get a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactgetIn Input Object Key.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ContactObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ContactObjectKeyData ContactgetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ContactGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ContactgetIn != null) ContactObjectKeyHelper.toMap (ContactgetIn, record, "Contact");
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
return ContactObjectHelper.fromMap (record, "Contact");
}

  private BSDMInteractionSpec _ContactFindSpec = null;
  /**
   * Find Contact's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ContactfindIn Input Filter Object.
   * @return ContactObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ContactObjectDataList find (ContactObjectFilter ContactfindIn) throws BSDMResourceException
  {
    return find (null, ContactfindIn);
  }
  /**
   * Find Contact's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactfindIn Input Filter Object.
   * @return ContactObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ContactObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ContactObjectFilter ContactfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ContactFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ContactfindIn != null) ContactObjectHelper.toMap (ContactfindIn, record, "Contact");
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
return ContactObjectHelper.fromMapList (record, "ContactList");
}

  private BSDMInteractionSpec _ContactCreateSpec = null;
  /**
   * Create a new Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ContactObjectData create (ContactObjectData ContactCreateIn) throws BSDMResourceException
  {
    return create (null, ContactCreateIn);
  }
  /**
   * Create a new Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ContactObjectData create (@HeaderParam ("context")BSDMSessionContext context,ContactObjectData ContactCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ContactCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ContactCreateIn != null) ContactObjectHelper.toMap (ContactCreateIn, record, "Contact");
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
return ContactObjectHelper.fromMap (record, "Contact");
}

  private BSDMInteractionSpec _ContactUpdateSpec = null;
  /**
   * Update non-key fields of a Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ContactObjectData update (ContactObjectData ContactUpdateIn) throws BSDMResourceException
  {
    return update (null, ContactUpdateIn);
  }
  /**
   * Update non-key fields of a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ContactObjectData update (@HeaderParam ("context")BSDMSessionContext context,ContactObjectData ContactUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ContactUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ContactUpdateIn != null) ContactObjectHelper.toMap (ContactUpdateIn, record, "Contact");
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
return ContactObjectHelper.fromMap (record, "Contact");
}

  /**

   * Get a Contact..

   * Convenience method using default BSDMSessionContext.

   * @param ContactgetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ContactObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ContactObjectData get (ContactObjectKeyData ContactgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, ContactgetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactgetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ContactObjectData get (BSDMSessionContext context, ContactObjectKeyData ContactgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ContactgetIn, defaultAction);
       
     cManager.checkConstraints(ContactgetIn, constraintAction);
       return get (context, ContactgetIn);
  }

  /**

   * Find Contact's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ContactfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ContactObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ContactObjectDataList find (ContactObjectFilter ContactfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, ContactfindIn, defaultAction, constraintAction);
  }
  /** 
   * Find Contact's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ContactObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ContactObjectDataList find (BSDMSessionContext context, ContactObjectFilter ContactfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ContactfindIn, defaultAction);
       
     cManager.checkConstraints(ContactfindIn, constraintAction);
       return find (context, ContactfindIn);
  }

  /**

   * Create a new Contact..

   * Convenience method using default BSDMSessionContext.

   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ContactObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ContactObjectData create (ContactObjectData ContactCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, ContactCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ContactObjectData create (BSDMSessionContext context, ContactObjectData ContactCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ContactCreateIn, defaultAction);
       
     cManager.checkConstraints(ContactCreateIn, constraintAction);
       return create (context, ContactCreateIn);
  }

  /**

   * Update non-key fields of a Contact..

   * Convenience method using default BSDMSessionContext.

   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ContactObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ContactObjectData update (ContactObjectData ContactUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, ContactUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields of a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ContactObjectData update (BSDMSessionContext context, ContactObjectData ContactUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ContactUpdateIn, defaultAction);
       
     cManager.checkConstraints(ContactUpdateIn, constraintAction);
       return update (context, ContactUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ContactBean ()
  {
    try
    {
      _ContactGetSpec = new BSDMInteractionSpec("ContactGet", ApiMappings.getCallName ("ContactGet"), Boolean.TRUE);

      _ContactFindSpec = new BSDMInteractionSpec("ContactFind", ApiMappings.getCallName ("ContactFind"), Boolean.TRUE);

      _ContactCreateSpec = new BSDMInteractionSpec("ContactCreate", ApiMappings.getCallName ("ContactCreate"), Boolean.TRUE);

      _ContactUpdateSpec = new BSDMInteractionSpec("ContactUpdate", ApiMappings.getCallName ("ContactUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ContactBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ContactBean(BSDMSettings settings, BSDMConnectionManager cm)
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
