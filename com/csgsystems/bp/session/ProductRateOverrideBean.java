
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ProductRateOverrideBean.java
 * Definition File: Customer/ProductRateOverride.xml
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
import com.csgsystems.bp.interfaces.ProductRateOverrideInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ProductRateOverrideSessionBean"
 * display-name="ProductRateOverride Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ProductRateOverrideBean"
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

@Stateless(name="ProductRateOverrideBean", mappedName = "ProductRateOverride")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ProductRateOverrides")

public class ProductRateOverrideBean implements ProductRateOverrideInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ProductRateOverrideCreateSpec = null;
  /**
   * Create a new ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateOverrideObjectData create (ProductRateOverrideObjectData PROCreateIn) throws BSDMResourceException
  {
    return create (null, PROCreateIn);
  }
  /**
   * Create a new ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductRateOverrideObjectData create (@HeaderParam ("context")BSDMSessionContext context,ProductRateOverrideObjectData PROCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateOverrideCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PROCreateIn != null) ProductRateOverrideObjectHelper.toMap (PROCreateIn, record, "ProductRateOverride");
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
return ProductRateOverrideObjectHelper.fromMap (record, "ProductRateOverride");
}

  private BSDMInteractionSpec _ProductRateOverrideUpdateSpec = null;
  /**
   * Update the non-key fields of a ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateOverrideObjectData update (ProductRateOverrideObjectData PROUpdateIn) throws BSDMResourceException
  {
    return update (null, PROUpdateIn);
  }
  /**
   * Update the non-key fields of a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductRateOverrideObjectData update (@HeaderParam ("context")BSDMSessionContext context,ProductRateOverrideObjectData PROUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateOverrideUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PROUpdateIn != null) ProductRateOverrideObjectHelper.toMap (PROUpdateIn, record, "ProductRateOverride");
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
return ProductRateOverrideObjectHelper.fromMap (record, "ProductRateOverride");
}

  private BSDMInteractionSpec _ProductRateOverrideGetSpec = null;
  /**
   * Retrieve a unique ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PROGetIn Input Object Key.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateOverrideObjectData get (ProductRateOverrideObjectKeyData PROGetIn) throws BSDMResourceException
  {
    return get (null, PROGetIn);
  }
  /**
   * Retrieve a unique ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROGetIn Input Object Key.
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ProductRateOverrideObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ProductRateOverrideObjectKeyData PROGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateOverrideGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PROGetIn != null) ProductRateOverrideObjectKeyHelper.toMap (PROGetIn, record, "ProductRateOverride");
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
return ProductRateOverrideObjectHelper.fromMap (record, "ProductRateOverride");
}

  private BSDMInteractionSpec _ProductRateOverrideFindSpec = null;
  /**
   * Find ProductRateOverride's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PROFindIn Input Filter Object.
   * @return ProductRateOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateOverrideObjectDataList find (ProductRateOverrideObjectFilter PROFindIn) throws BSDMResourceException
  {
    return find (null, PROFindIn);
  }
  /**
   * Find ProductRateOverride's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROFindIn Input Filter Object.
   * @return ProductRateOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductRateOverrideObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ProductRateOverrideObjectFilter PROFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateOverrideFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PROFindIn != null) ProductRateOverrideObjectHelper.toMap (PROFindIn, record, "ProductRateOverride");
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
return ProductRateOverrideObjectHelper.fromMapList (record, "ProductRateOverrideList");
}

  private BSDMInteractionSpec _ProductRateOverrideDeleteSpec = null;
  /**
   * Cease a ProductRateOverride..
   * Convenience method using default BSDMSessionContext.
   * @param PRODeleteIn Input Object Key.
   * @param PRODCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void delete (ProductRateOverrideObjectKeyData PRODeleteIn, Date PRODCeaseDate) throws BSDMResourceException
  {
    delete (null, PRODeleteIn, PRODCeaseDate);
  }
  /**
   * Cease a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRODeleteIn Input Object Key.
   * @param PRODCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})

 public void delete (@HeaderParam ("context")BSDMSessionContext context,ProductRateOverrideObjectKeyData PRODeleteIn,@FormParam("PRODCeaseDate")Date PRODCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateOverrideDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PRODeleteIn != null) ProductRateOverrideObjectKeyHelper.toMap (PRODeleteIn, record, "ProductRateOverride");

      if (PRODCeaseDate != null) record.put ("InactiveDate", PRODCeaseDate);
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
return;
}

  private BSDMInteractionSpec _ProductRateOverrideDeleteListSpec = null;
  /**
   * Cease the ProductRateOverrides that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ProductRateOverrideFilter Input Filter Object.
   * @param PRODLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (ProductRateOverrideObjectFilter ProductRateOverrideFilter, Date PRODLCeaseDate) throws BSDMResourceException
  {
    deleteList (null, ProductRateOverrideFilter, PRODLCeaseDate);
  }
  /**
   * Cease the ProductRateOverrides that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateOverrideFilter Input Filter Object.
   * @param PRODLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,ProductRateOverrideObjectFilter ProductRateOverrideFilter,@FormParam("PRODLCeaseDate")Date PRODLCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateOverrideDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ProductRateOverrideFilter != null) ProductRateOverrideObjectHelper.toMap (ProductRateOverrideFilter, record, "ProductRateOverrideFilter");

      if (PRODLCeaseDate != null) record.put ("InactiveDate", PRODLCeaseDate);
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
return;
}

  /**

   * Create a new ProductRateOverride..

   * Convenience method using default BSDMSessionContext.

   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateOverrideObjectData create (ProductRateOverrideObjectData PROCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, PROCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROCreateIn Input  Object.  Defaulted Fields: ActiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateOverrideObjectData create (BSDMSessionContext context, ProductRateOverrideObjectData PROCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PROCreateIn, defaultAction);
       
     cManager.checkConstraints(PROCreateIn, constraintAction);
       return create (context, PROCreateIn);
  }

  /**

   * Update the non-key fields of a ProductRateOverride..

   * Convenience method using default BSDMSessionContext.

   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateOverrideObjectData update (ProductRateOverrideObjectData PROUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PROUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROUpdateIn Input  Object.  Read-Only fields: InactiveDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateOverrideObjectData update (BSDMSessionContext context, ProductRateOverrideObjectData PROUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PROUpdateIn, defaultAction);
       
     cManager.checkConstraints(PROUpdateIn, constraintAction);
       return update (context, PROUpdateIn);
  }

  /**

   * Retrieve a unique ProductRateOverride..

   * Convenience method using default BSDMSessionContext.

   * @param PROGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateOverrideObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateOverrideObjectData get (ProductRateOverrideObjectKeyData PROGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PROGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateOverrideObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateOverrideObjectData get (BSDMSessionContext context, ProductRateOverrideObjectKeyData PROGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PROGetIn, defaultAction);
       
     cManager.checkConstraints(PROGetIn, constraintAction);
       return get (context, PROGetIn);
  }

  /**

   * Find ProductRateOverride's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param PROFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateOverrideObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateOverrideObjectDataList find (ProductRateOverrideObjectFilter PROFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PROFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ProductRateOverride's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PROFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateOverrideObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateOverrideObjectDataList find (BSDMSessionContext context, ProductRateOverrideObjectFilter PROFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PROFindIn, defaultAction);
       
     cManager.checkConstraints(PROFindIn, constraintAction);
       return find (context, PROFindIn);
  }

  /**

   * Cease a ProductRateOverride..

   * Convenience method using default BSDMSessionContext.

   * @param PRODeleteIn Input Object Key.

   * @param PRODCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void delete (ProductRateOverrideObjectKeyData PRODeleteIn, Date PRODCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    delete (null, PRODeleteIn, PRODCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease a ProductRateOverride..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRODeleteIn Input Object Key.
   * @param PRODCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void delete (BSDMSessionContext context, ProductRateOverrideObjectKeyData PRODeleteIn, Date PRODCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PRODeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(PRODeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
delete (context, PRODeleteIn, PRODCeaseDate);
  }

  /**

   * Cease the ProductRateOverrides that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ProductRateOverrideFilter Input Filter Object.

   * @param PRODLCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (ProductRateOverrideObjectFilter ProductRateOverrideFilter, Date PRODLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, ProductRateOverrideFilter, PRODLCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease the ProductRateOverrides that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateOverrideFilter Input Filter Object.
   * @param PRODLCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, ProductRateOverrideObjectFilter ProductRateOverrideFilter, Date PRODLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ProductRateOverrideFilter, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ProductRateOverrideFilter, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, ProductRateOverrideFilter, PRODLCeaseDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ProductRateOverrideBean ()
  {
    try
    {
      _ProductRateOverrideCreateSpec = new BSDMInteractionSpec("ProductRateOverrideCreate", ApiMappings.getCallName ("ProductRateOverrideCreate"), Boolean.TRUE);

      _ProductRateOverrideUpdateSpec = new BSDMInteractionSpec("ProductRateOverrideUpdate", ApiMappings.getCallName ("ProductRateOverrideUpdate"), Boolean.TRUE);

      _ProductRateOverrideGetSpec = new BSDMInteractionSpec("ProductRateOverrideGet", ApiMappings.getCallName ("ProductRateOverrideGet"), Boolean.TRUE);

      _ProductRateOverrideFindSpec = new BSDMInteractionSpec("ProductRateOverrideFind", ApiMappings.getCallName ("ProductRateOverrideFind"), Boolean.TRUE);

      _ProductRateOverrideDeleteSpec = new BSDMInteractionSpec("ProductRateOverrideDelete", ApiMappings.getCallName ("ProductRateOverrideDelete"), Boolean.TRUE);

      _ProductRateOverrideDeleteListSpec = new BSDMInteractionSpec("ProductRateOverrideDeleteList", ApiMappings.getCallName ("ProductRateOverrideDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ProductRateOverrideBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ProductRateOverrideBean(BSDMSettings settings, BSDMConnectionManager cm)
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
