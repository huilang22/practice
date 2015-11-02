
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GenericEnumerationBean.java
 * Definition File: Admin/GenericEnumeration.xml
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
import com.csgsystems.bp.interfaces.GenericEnumerationInterface;

/**
  * 
The GenericEnumeration API is used to configure new language specific enumerations, often used by GUIs.
    .
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GenericEnumerationSessionBean"
 * display-name="GenericEnumeration Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GenericEnumerationBean"
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

@Stateless(name="GenericEnumerationBean", mappedName = "GenericEnumeration")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("GenericEnumerations")

public class GenericEnumerationBean implements GenericEnumerationInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GenericEnumerationGetSpec = null;
  /**
   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEGetIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GEObjectData get (GEObjectKeyData GEGetIn) throws BSDMResourceException
  {
    return get (null, GEGetIn);
  }
  /**
   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEGetIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public GEObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam GEObjectKeyData GEGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenericEnumerationGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GEGetIn != null) GEObjectKeyHelper.toMap (GEGetIn, record, "GenericEnumeration");
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
return GEObjectHelper.fromMap (record, "GenericEnumeration");
}

  private BSDMInteractionSpec _GenericEnumerationFindSpec = null;
  /**
   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEFindIn Input Filter Object.
   * @return GEObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GEObjectDataList find (GEObjectFilter GEFindIn) throws BSDMResourceException
  {
    return find (null, GEFindIn);
  }
  /**
   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEFindIn Input Filter Object.
   * @return GEObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GEObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GEObjectFilter GEFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenericEnumerationFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GEFindIn != null) GEObjectHelper.toMap (GEFindIn, record, "GenericEnumeration");
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
return GEObjectHelper.fromMapList (record, "GenericEnumerationList");
}

  private BSDMInteractionSpec _GenericEnumerationUpdateSpec = null;
  /**
   * 
Update the values (other than the key) of the GenericEnumeration object.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEUpdateIn Input  Object.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GEObjectData update (GEObjectData GEUpdateIn) throws BSDMResourceException
  {
    return update (null, GEUpdateIn);
  }
  /**
   * 
Update the values (other than the key) of the GenericEnumeration object.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEUpdateIn Input  Object.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GEObjectData update (@HeaderParam ("context")BSDMSessionContext context,GEObjectData GEUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenericEnumerationUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GEUpdateIn != null) GEObjectHelper.toMap (GEUpdateIn, record, "GenericEnumeration");
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
return GEObjectHelper.fromMap (record, "GenericEnumeration");
}

  private BSDMInteractionSpec _GenericEnumerationDeleteSpec = null;
  /**
   * 
Delete the Generic Enumeration row.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GEDeleteIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GEObjectData delete (GEObjectKeyData GEDeleteIn) throws BSDMResourceException
  {
    return delete (null, GEDeleteIn);
  }
  /**
   * 
Delete the Generic Enumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEDeleteIn Input Object Key.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GEObjectData delete (@HeaderParam ("context")BSDMSessionContext context,GEObjectKeyData GEDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenericEnumerationDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GEDeleteIn != null) GEObjectKeyHelper.toMap (GEDeleteIn, record, "GenericEnumeration");
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
return GEObjectHelper.fromMap (record, "GenericEnumeration");
}

  private BSDMInteractionSpec _GenericEnumerationCreateSpec = null;
  /**
   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .
   * Convenience method using default BSDMSessionContext.
   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GEObjectData create (GEObjectData GECreateIn) throws BSDMResourceException
  {
    return create (null, GECreateIn);
  }
  /**
   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GEObjectData create (@HeaderParam ("context")BSDMSessionContext context,GEObjectData GECreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GenericEnumerationCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GECreateIn != null) GEObjectHelper.toMap (GECreateIn, record, "GenericEnumeration");
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
return GEObjectHelper.fromMap (record, "GenericEnumeration");
}

  /**

   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .

   * Convenience method using default BSDMSessionContext.

   * @param GEGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GEObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GEObjectData get (GEObjectKeyData GEGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, GEGetIn, defaultAction, constraintAction);
  }
  /** 
   * 
The GenericEnumerationGet method retrieves one GenericEnumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GEObjectData get (BSDMSessionContext context, GEObjectKeyData GEGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GEGetIn, defaultAction);
       
     cManager.checkConstraints(GEGetIn, constraintAction);
       return get (context, GEGetIn);
  }

  /**

   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .

   * Convenience method using default BSDMSessionContext.

   * @param GEFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GEObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GEObjectDataList find (GEObjectFilter GEFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GEFindIn, defaultAction, constraintAction);
  }
  /** 
   * 
Finds all GenericEnumeration objects matching the supplied filter.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GEObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GEObjectDataList find (BSDMSessionContext context, GEObjectFilter GEFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GEFindIn, defaultAction);
       
     cManager.checkConstraints(GEFindIn, constraintAction);
       return find (context, GEFindIn);
  }

  /**

   * 
Update the values (other than the key) of the GenericEnumeration object.
            .

   * Convenience method using default BSDMSessionContext.

   * @param GEUpdateIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GEObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GEObjectData update (GEObjectData GEUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, GEUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * 
Update the values (other than the key) of the GenericEnumeration object.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEUpdateIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GEObjectData update (BSDMSessionContext context, GEObjectData GEUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GEUpdateIn, defaultAction);
       
     cManager.checkConstraints(GEUpdateIn, constraintAction);
       return update (context, GEUpdateIn);
  }

  /**

   * 
Delete the Generic Enumeration row.
            .

   * Convenience method using default BSDMSessionContext.

   * @param GEDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GEObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GEObjectData delete (GEObjectKeyData GEDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, GEDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * 
Delete the Generic Enumeration row.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GEDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GEObjectData delete (BSDMSessionContext context, GEObjectKeyData GEDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GEDeleteIn, defaultAction);
       
     cManager.checkConstraints(GEDeleteIn, constraintAction);
       return delete (context, GEDeleteIn);
  }

  /**

   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .

   * Convenience method using default BSDMSessionContext.

   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GEObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GEObjectData create (GEObjectData GECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, GECreateIn, defaultAction, constraintAction);
  }
  /** 
   * 
Insert a new row in GENERIC_ENUMERATION_VALUES, as well as if necessary GENERIC_ENUMERATION_REF.
            .
   * @param context The session context to use when connecting to the APITS server.
   * @param GECreateIn Input  Object.  Defaulted Fields: LanguageCode, IsDefault, IsInternal, SortIndex.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GEObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GEObjectData create (BSDMSessionContext context, GEObjectData GECreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GECreateIn, defaultAction);
       
     cManager.checkConstraints(GECreateIn, constraintAction);
       return create (context, GECreateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GenericEnumerationBean ()
  {
    try
    {
      _GenericEnumerationGetSpec = new BSDMInteractionSpec("GenericEnumerationGet", ApiMappings.getCallName ("GenericEnumerationGet"), Boolean.TRUE);

      _GenericEnumerationFindSpec = new BSDMInteractionSpec("GenericEnumerationFind", ApiMappings.getCallName ("GenericEnumerationFind"), Boolean.TRUE);

      _GenericEnumerationUpdateSpec = new BSDMInteractionSpec("GenericEnumerationUpdate", ApiMappings.getCallName ("GenericEnumerationUpdate"), Boolean.TRUE);

      _GenericEnumerationDeleteSpec = new BSDMInteractionSpec("GenericEnumerationDelete", ApiMappings.getCallName ("GenericEnumerationDelete"), Boolean.TRUE);

      _GenericEnumerationCreateSpec = new BSDMInteractionSpec("GenericEnumerationCreate", ApiMappings.getCallName ("GenericEnumerationCreate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GenericEnumerationBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GenericEnumerationBean(BSDMSettings settings, BSDMConnectionManager cm)
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
