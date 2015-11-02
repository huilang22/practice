
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ProductRateKeyBean.java
 * Definition File: Customer/ProductRateKey.xml
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
import com.csgsystems.bp.interfaces.ProductRateKeyInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ProductRateKeySessionBean"
 * display-name="ProductRateKey Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ProductRateKeyBean"
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

@Stateless(name="ProductRateKeyBean", mappedName = "ProductRateKey")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ProductRateKeys")

public class ProductRateKeyBean implements ProductRateKeyInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ProductRateKeyGetSpec = null;
  /**
   * Retrieve a unique ProductRateKey row..
   * Convenience method using default BSDMSessionContext.
   * @param PRKGetIn Input Object Key.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateKeyObjectData get (ProductRateKeyObjectKeyData PRKGetIn) throws BSDMResourceException
  {
    return get (null, PRKGetIn);
  }
  /**
   * Retrieve a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKGetIn Input Object Key.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public ProductRateKeyObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam ProductRateKeyObjectKeyData PRKGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateKeyGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PRKGetIn != null) ProductRateKeyObjectKeyHelper.toMap (PRKGetIn, record, "ProductRateKey");
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
return ProductRateKeyObjectHelper.fromMap (record, "ProductRateKey");
}

  private BSDMInteractionSpec _ProductRateKeyFindSpec = null;
  /**
   * Find ProductRateKey's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PRKFindIn Input Filter Object.
   * @return ProductRateKeyObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateKeyObjectDataList find (ProductRateKeyObjectFilter PRKFindIn) throws BSDMResourceException
  {
    return find (null, PRKFindIn);
  }
  /**
   * Find ProductRateKey's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKFindIn Input Filter Object.
   * @return ProductRateKeyObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductRateKeyObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,ProductRateKeyObjectFilter PRKFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateKeyFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PRKFindIn != null) ProductRateKeyObjectHelper.toMap (PRKFindIn, record, "ProductRateKey");
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
return ProductRateKeyObjectHelper.fromMapList (record, "ProductRateKeyList");
}

  private BSDMInteractionSpec _ProductRateKeyCreateSpec = null;
  /**
   * Create a new ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateKeyObjectData create (ProductRateKeyObjectData PRKCreateIn) throws BSDMResourceException
  {
    return create (null, PRKCreateIn);
  }
  /**
   * Create a new ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductRateKeyObjectData create (@HeaderParam ("context")BSDMSessionContext context,ProductRateKeyObjectData PRKCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateKeyCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PRKCreateIn != null) ProductRateKeyObjectHelper.toMap (PRKCreateIn, record, "ProductRateKey");
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
return ProductRateKeyObjectHelper.fromMap (record, "ProductRateKey");
}

  private BSDMInteractionSpec _ProductRateKeyUpdateSpec = null;
  /**
   * Update the non-key fields of a ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRateKeyObjectData update (ProductRateKeyObjectData PRKUpdateIn) throws BSDMResourceException
  {
    return update (null, PRKUpdateIn);
  }
  /**
   * Update the non-key fields of a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductRateKeyObjectData update (@HeaderParam ("context")BSDMSessionContext context,ProductRateKeyObjectData PRKUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateKeyUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PRKUpdateIn != null) ProductRateKeyObjectHelper.toMap (PRKUpdateIn, record, "ProductRateKey");
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
return ProductRateKeyObjectHelper.fromMap (record, "ProductRateKey");
}

  private BSDMInteractionSpec _ProductRateKeyDeleteSpec = null;
  /**
   * Cease a ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKDeleteIn Input Object Key.
   * @param PRKCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void delete (ProductRateKeyObjectKeyData PRKDeleteIn, Date PRKCeaseDate) throws BSDMResourceException
  {
    delete (null, PRKDeleteIn, PRKCeaseDate);
  }
  /**
   * Cease a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKDeleteIn Input Object Key.
   * @param PRKCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})

 public void delete (@HeaderParam ("context")BSDMSessionContext context,ProductRateKeyObjectKeyData PRKDeleteIn,@FormParam("PRKCeaseDate")Date PRKCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateKeyDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PRKDeleteIn != null) ProductRateKeyObjectKeyHelper.toMap (PRKDeleteIn, record, "ProductRateKey");

      if (PRKCeaseDate != null) record.put ("InactiveDate", PRKCeaseDate);
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

  private BSDMInteractionSpec _ProductRateKeyDeleteListSpec = null;
  /**
   * Cease the ProductRateKeys that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ProductRateKeyFilter Input Filter Object.
   * @param PRKLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (ProductRateKeyObjectFilter ProductRateKeyFilter, Date PRKLCeaseDate) throws BSDMResourceException
  {
    deleteList (null, ProductRateKeyFilter, PRKLCeaseDate);
  }
  /**
   * Cease the ProductRateKeys that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateKeyFilter Input Filter Object.
   * @param PRKLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,ProductRateKeyObjectFilter ProductRateKeyFilter,@FormParam("PRKLCeaseDate")Date PRKLCeaseDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateKeyDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (ProductRateKeyFilter != null) ProductRateKeyObjectHelper.toMap (ProductRateKeyFilter, record, "ProductRateKeyFilter");

      if (PRKLCeaseDate != null) record.put ("InactiveDate", PRKLCeaseDate);
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

  private BSDMInteractionSpec _ProductRateKeyJurisdictionDeriveSpec = null;
  /**
   * Derives a ProductJurisdiction for a unique ProductRateKey row..
   * Convenience method using default BSDMSessionContext.
   * @param TargetLocCode.
   * @param OriginLocCode.
   * @param ActiveDate.
   * @param ElementId.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer jurisdictionDerive (Integer TargetLocCode, Integer OriginLocCode, Date ActiveDate, Integer ElementId) throws BSDMResourceException
  {
    return jurisdictionDerive (null, TargetLocCode, OriginLocCode, ActiveDate, ElementId);
  }
  /**
   * Derives a ProductJurisdiction for a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TargetLocCode.
   * @param OriginLocCode.
   * @param ActiveDate.
   * @param ElementId.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("jurisdictionDerive")
@Produces({"application/json","application/xml"})
  public Integer jurisdictionDerive (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("TargetLocCode")Integer TargetLocCode,@QueryParam("OriginLocCode")Integer OriginLocCode,@QueryParam("ActiveDate")Date ActiveDate,@QueryParam("ElementId")Integer ElementId) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRateKeyJurisdictionDeriveSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (TargetLocCode != null) record.put ("TargetLocCode", TargetLocCode);

      if (OriginLocCode != null) record.put ("OriginLocCode", OriginLocCode);

      if (ActiveDate != null) record.put ("ActiveDate", ActiveDate);

      if (ElementId != null) record.put ("ElementId", ElementId);
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
Object _tmp = record.get ("JurisdictionCode");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  /**

   * Retrieve a unique ProductRateKey row..

   * Convenience method using default BSDMSessionContext.

   * @param PRKGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateKeyObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateKeyObjectData get (ProductRateKeyObjectKeyData PRKGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, PRKGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateKeyObjectData get (BSDMSessionContext context, ProductRateKeyObjectKeyData PRKGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PRKGetIn, defaultAction);
       
     cManager.checkConstraints(PRKGetIn, constraintAction);
       return get (context, PRKGetIn);
  }

  /**

   * Find ProductRateKey's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param PRKFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateKeyObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateKeyObjectDataList find (ProductRateKeyObjectFilter PRKFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, PRKFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find ProductRateKey's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateKeyObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateKeyObjectDataList find (BSDMSessionContext context, ProductRateKeyObjectFilter PRKFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PRKFindIn, defaultAction);
       
     cManager.checkConstraints(PRKFindIn, constraintAction);
       return find (context, PRKFindIn);
  }

  /**

   * Create a new ProductRateKey..

   * Convenience method using default BSDMSessionContext.

   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateKeyObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateKeyObjectData create (ProductRateKeyObjectData PRKCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, PRKCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Create a new ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateKeyObjectData create (BSDMSessionContext context, ProductRateKeyObjectData PRKCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PRKCreateIn, defaultAction);
       
     cManager.checkConstraints(PRKCreateIn, constraintAction);
       return create (context, PRKCreateIn);
  }

  /**

   * Update the non-key fields of a ProductRateKey..

   * Convenience method using default BSDMSessionContext.

   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRateKeyObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRateKeyObjectData update (ProductRateKeyObjectData PRKUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, PRKUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Update the non-key fields of a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRateKeyObjectData update (BSDMSessionContext context, ProductRateKeyObjectData PRKUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PRKUpdateIn, defaultAction);
       
     cManager.checkConstraints(PRKUpdateIn, constraintAction);
       return update (context, PRKUpdateIn);
  }

  /**

   * Cease a ProductRateKey..

   * Convenience method using default BSDMSessionContext.

   * @param PRKDeleteIn Input Object Key.

   * @param PRKCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void delete (ProductRateKeyObjectKeyData PRKDeleteIn, Date PRKCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    delete (null, PRKDeleteIn, PRKCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKDeleteIn Input Object Key.
   * @param PRKCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void delete (BSDMSessionContext context, ProductRateKeyObjectKeyData PRKDeleteIn, Date PRKCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PRKDeleteIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(PRKDeleteIn, constraintAction);
       
    //Constraints not supported on Input-Column
delete (context, PRKDeleteIn, PRKCeaseDate);
  }

  /**

   * Cease the ProductRateKeys that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param ProductRateKeyFilter Input Filter Object.

   * @param PRKLCeaseDate (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (ProductRateKeyObjectFilter ProductRateKeyFilter, Date PRKLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, ProductRateKeyFilter, PRKLCeaseDate, defaultAction, constraintAction);
  }
  /** 
   * Cease the ProductRateKeys that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateKeyFilter Input Filter Object.
   * @param PRKLCeaseDate (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, ProductRateKeyObjectFilter ProductRateKeyFilter, Date PRKLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(ProductRateKeyFilter, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(ProductRateKeyFilter, constraintAction);
       
    //Constraints not supported on Input-Column
deleteList (context, ProductRateKeyFilter, PRKLCeaseDate);
  }

  /**

   * Derives a ProductJurisdiction for a unique ProductRateKey row..

   * Convenience method using default BSDMSessionContext.

   * @param TargetLocCode.

   * @param OriginLocCode.

   * @param ActiveDate.

   * @param ElementId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer jurisdictionDerive (Integer TargetLocCode, Integer OriginLocCode, Date ActiveDate, Integer ElementId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return jurisdictionDerive (null, TargetLocCode, OriginLocCode, ActiveDate, ElementId, defaultAction, constraintAction);
  }
  /** 
   * Derives a ProductJurisdiction for a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TargetLocCode.
   * @param OriginLocCode.
   * @param ActiveDate.
   * @param ElementId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer jurisdictionDerive (BSDMSessionContext context, Integer TargetLocCode, Integer OriginLocCode, Date ActiveDate, Integer ElementId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return jurisdictionDerive (context, TargetLocCode, OriginLocCode, ActiveDate, ElementId);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ProductRateKeyBean ()
  {
    try
    {
      _ProductRateKeyGetSpec = new BSDMInteractionSpec("ProductRateKeyGet", ApiMappings.getCallName ("ProductRateKeyGet"), Boolean.TRUE);

      _ProductRateKeyFindSpec = new BSDMInteractionSpec("ProductRateKeyFind", ApiMappings.getCallName ("ProductRateKeyFind"), Boolean.TRUE);

      _ProductRateKeyCreateSpec = new BSDMInteractionSpec("ProductRateKeyCreate", ApiMappings.getCallName ("ProductRateKeyCreate"), Boolean.TRUE);

      _ProductRateKeyUpdateSpec = new BSDMInteractionSpec("ProductRateKeyUpdate", ApiMappings.getCallName ("ProductRateKeyUpdate"), Boolean.TRUE);

      _ProductRateKeyDeleteSpec = new BSDMInteractionSpec("ProductRateKeyDelete", ApiMappings.getCallName ("ProductRateKeyDelete"), Boolean.TRUE);

      _ProductRateKeyDeleteListSpec = new BSDMInteractionSpec("ProductRateKeyDeleteList", ApiMappings.getCallName ("ProductRateKeyDeleteList"), Boolean.TRUE);

      _ProductRateKeyJurisdictionDeriveSpec = new BSDMInteractionSpec("ProductRateKeyJurisdictionDerive", ApiMappings.getCallName ("ProductRateKeyJurisdictionDerive"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ProductRateKeyBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ProductRateKeyBean(BSDMSettings settings, BSDMConnectionManager cm)
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
