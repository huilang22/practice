
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: GeocodeBean.java
 * Definition File: Admin/Geocode.xml
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
import com.csgsystems.bp.interfaces.GeocodeInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="GeocodeSessionBean"
 * display-name="Geocode Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/GeocodeBean"
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

@Stateless(name="GeocodeBean", mappedName = "Geocode")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Geocodes")

public class GeocodeBean implements GeocodeInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _GeocodeFindSpec = null;
  /**
   * Find Geocodes for the supplied address info..
   * Convenience method using default BSDMSessionContext.
   * @param GeocodeAddress Input  Object.
   * @return GeocodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GeocodeObjectDataList find (GeocodeAddressObjectData GeocodeAddress) throws BSDMResourceException
  {
    return find (null, GeocodeAddress);
  }
  /**
   * Find Geocodes for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param GeocodeAddress Input  Object.
   * @return GeocodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GeocodeObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,GeocodeAddressObjectData GeocodeAddress) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GeocodeFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (GeocodeAddress != null) GeocodeAddressObjectHelper.toMap (GeocodeAddress, record, "GeocodeAddress");
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
return GeocodeObjectHelper.fromMapList (record, "GeocodeList");
}

  private BSDMInteractionSpec _GeocodeComponentsFindSpec = null;
  /**
   * Find Geocode Components for the supplied address info..
   * Convenience method using default BSDMSessionContext.
   * @param City (null is allowed).
   * @param County (null is allowed).
   * @param State.
   * @return GeocodeComponentsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public GeocodeComponentsObjectDataList componentsFind (String City, String County, String State) throws BSDMResourceException
  {
    return componentsFind (null, City, County, State);
  }
  /**
   * Find Geocode Components for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param City (null is allowed).
   * @param County (null is allowed).
   * @param State.
   * @return GeocodeComponentsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("componentsFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public GeocodeComponentsObjectDataList componentsFind (@HeaderParam ("context")BSDMSessionContext context,String City,@FormParam("County")String County,@FormParam("State")String State) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_GeocodeComponentsFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (City != null) record.put ("City", City);

      if (County != null) record.put ("County", County);

      if (State != null) record.put ("State", State);
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
return GeocodeComponentsObjectHelper.fromMapList (record, "GeocodeComponentsList");
}

  private BSDMInteractionSpec _ConvertGeocodeSpec = null;
  /**
   * Convert Vertex Geocode to FX Geocode..
   * Convenience method using default BSDMSessionContext.
   * @param CountryCode (null is allowed).
   * @param FranchiseCode (null is allowed).
   * @param VertexGeocode (null is allowed).
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public String convertGeocode (Integer CountryCode, Integer FranchiseCode, String VertexGeocode) throws BSDMResourceException
  {
    return convertGeocode (null, CountryCode, FranchiseCode, VertexGeocode);
  }
  /**
   * Convert Vertex Geocode to FX Geocode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CountryCode (null is allowed).
   * @param FranchiseCode (null is allowed).
   * @param VertexGeocode (null is allowed).
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("convertGeocode")
@Produces({"application/json","application/xml"})
  public String convertGeocode (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("CountryCode")Integer CountryCode,@QueryParam("FranchiseCode")Integer FranchiseCode,@QueryParam("VertexGeocode")String VertexGeocode) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ConvertGeocodeSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (CountryCode != null) record.put ("CountryCode", CountryCode);

      if (FranchiseCode != null) record.put ("FranchiseCode", FranchiseCode);

      if (VertexGeocode != null) record.put ("VertexGeocode", VertexGeocode);
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
Object _tmp = record.get ("FXgeocode");
    String _out = null;
        _out = (String) _tmp;
          
    return _out
 ;
}

  /**

   * Find Geocodes for the supplied address info..

   * Convenience method using default BSDMSessionContext.

   * @param GeocodeAddress Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GeocodeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GeocodeObjectDataList find (GeocodeAddressObjectData GeocodeAddress, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, GeocodeAddress, defaultAction, constraintAction);
  }
  /** 
   * Find Geocodes for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param GeocodeAddress Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GeocodeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GeocodeObjectDataList find (BSDMSessionContext context, GeocodeAddressObjectData GeocodeAddress, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(GeocodeAddress, defaultAction);
       
     cManager.checkConstraints(GeocodeAddress, constraintAction);
       return find (context, GeocodeAddress);
  }

  /**

   * Find Geocode Components for the supplied address info..

   * Convenience method using default BSDMSessionContext.

   * @param City (null is allowed).

   * @param County (null is allowed).

   * @param State.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return GeocodeComponentsObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public GeocodeComponentsObjectDataList componentsFind (String City, String County, String State, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return componentsFind (null, City, County, State, defaultAction, constraintAction);
  }
  /** 
   * Find Geocode Components for the supplied address info..
   * @param context The session context to use when connecting to the APITS server.
   * @param City (null is allowed).
   * @param County (null is allowed).
   * @param State.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return GeocodeComponentsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public GeocodeComponentsObjectDataList componentsFind (BSDMSessionContext context, String City, String County, String State, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return componentsFind (context, City, County, State);
  }

  /**

   * Convert Vertex Geocode to FX Geocode..

   * Convenience method using default BSDMSessionContext.

   * @param CountryCode (null is allowed).

   * @param FranchiseCode (null is allowed).

   * @param VertexGeocode (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return String as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public String convertGeocode (Integer CountryCode, Integer FranchiseCode, String VertexGeocode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return convertGeocode (null, CountryCode, FranchiseCode, VertexGeocode, defaultAction, constraintAction);
  }
  /** 
   * Convert Vertex Geocode to FX Geocode..
   * @param context The session context to use when connecting to the APITS server.
   * @param CountryCode (null is allowed).
   * @param FranchiseCode (null is allowed).
   * @param VertexGeocode (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public String convertGeocode (BSDMSessionContext context, Integer CountryCode, Integer FranchiseCode, String VertexGeocode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return convertGeocode (context, CountryCode, FranchiseCode, VertexGeocode);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public GeocodeBean ()
  {
    try
    {
      _GeocodeFindSpec = new BSDMInteractionSpec("GeocodeFind", ApiMappings.getCallName ("GeocodeFind"), Boolean.TRUE);

      _GeocodeComponentsFindSpec = new BSDMInteractionSpec("GeocodeComponentsFind", ApiMappings.getCallName ("GeocodeComponentsFind"), Boolean.TRUE);

      _ConvertGeocodeSpec = new BSDMInteractionSpec("ConvertGeocode", ApiMappings.getCallName ("ConvertGeocode"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public GeocodeBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public GeocodeBean(BSDMSettings settings, BSDMConnectionManager cm)
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
