
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: BalanceLineItemBean.java
 * Definition File: Customer/BalanceLineItem.xml
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
import com.csgsystems.bp.interfaces.BalanceLineItemInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="BalanceLineItemSessionBean"
 * display-name="BalanceLineItem Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/BalanceLineItemBean"
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

@Stateless(name="BalanceLineItemBean", mappedName = "BalanceLineItem")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("BalanceLineItems")

public class BalanceLineItemBean implements BalanceLineItemInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _BalanceLineItemGetSpec = null;
  /**
   * Get a BalanceLineItem..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemGetIn Input Object Key.
   * @return BalanceLineItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BalanceLineItemObjectData get (BalanceLineItemObjectKeyData BalanceLineItemGetIn) throws BSDMResourceException
  {
    return get (null, BalanceLineItemGetIn);
  }
  /**
   * Get a BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemGetIn Input Object Key.
   * @return BalanceLineItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public BalanceLineItemObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BalanceLineItemObjectKeyData BalanceLineItemGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BalanceLineItemGetIn != null) BalanceLineItemObjectKeyHelper.toMap (BalanceLineItemGetIn, record, "BalanceLineItem");
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
return BalanceLineItemObjectHelper.fromMap (record, "BalanceLineItem");
}

  private BSDMInteractionSpec _BalanceLineItemFindSpec = null;
  /**
   * Find BalanceLineItem's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemFindIn Input Filter Object.
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BalanceLineItemObjectDataList find (BalanceLineItemObjectFilter BalanceLineItemFindIn) throws BSDMResourceException
  {
    return find (null, BalanceLineItemFindIn);
  }
  /**
   * Find BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindIn Input Filter Object.
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BalanceLineItemObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,BalanceLineItemObjectFilter BalanceLineItemFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BalanceLineItemFindIn != null) BalanceLineItemObjectHelper.toMap (BalanceLineItemFindIn, record, "BalanceLineItem");
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
return BalanceLineItemObjectHelper.fromMapList (record, "BalanceLineItemList");
}

  private BSDMInteractionSpec _BalanceLineItemFindCountSpec = null;
  /**
   * Find Count of BalanceLineItem's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (BalanceLineItemObjectFilter BalanceLineItemFindCountIn) throws BSDMResourceException
  {
    return findCount (null, BalanceLineItemFindCountIn);
  }
  /**
   * Find Count of BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,BalanceLineItemObjectFilter BalanceLineItemFindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BalanceLineItemFindCountIn != null) BalanceLineItemObjectHelper.toMap (BalanceLineItemFindCountIn, record, "BalanceLineItem");
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
Object _tmp = record.get ("TotalCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _BalanceLineItemByAccountFindSpec = null;
  /**
   * Find BalanceLineItem's by Account and Invoice attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAcctFindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BalanceLineItemObjectDataList byAccountFind (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, Boolean LatestInvoice) throws BSDMResourceException
  {
    return byAccountFind (null, BalanceLineItemAcctFindIn, LatestInvoice);
  }
  /**
   * Find BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("byAccountFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public BalanceLineItemObjectDataList byAccountFind (@HeaderParam ("context")BSDMSessionContext context,BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn,@FormParam("LatestInvoice")Boolean LatestInvoice) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemByAccountFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BalanceLineItemAcctFindIn != null) BalanceLineItemAccountObjectHelper.toMap (BalanceLineItemAcctFindIn, record, "BalanceLineItem");

      if (LatestInvoice != null) record.put ("LatestInvoice", LatestInvoice);
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
return BalanceLineItemObjectHelper.fromMapList (record, "BalanceLineItemList");
}

  private BSDMInteractionSpec _BalanceLineItemByAccountCountSpec = null;
  /**
   * Find Count BalanceLineItem's by Account and Invoice attributes..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAcctFindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer byAccountCount (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, Boolean LatestInvoice1) throws BSDMResourceException
  {
    return byAccountCount (null, BalanceLineItemAcctFindCountIn, LatestInvoice1);
  }
  /**
   * Find Count BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("byAccountCount")
@Produces({"application/json","application/xml"})
  public Integer byAccountCount (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn,@QueryParam("LatestInvoice1")Boolean LatestInvoice1) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemByAccountCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BalanceLineItemAcctFindCountIn != null) BalanceLineItemAccountObjectHelper.toMap (BalanceLineItemAcctFindCountIn, record, "BalanceLineItem");

      if (LatestInvoice1 != null) record.put ("LatestInvoice", LatestInvoice1);
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
Object _tmp = record.get ("TotalCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _BalanceLineItemAmountGetSpec = null;
  /**
   * Retrieve the Amounts for a particular BalanceLineItem..
   * Convenience method using default BSDMSessionContext.
   * @param BalanceLineItemAmountGetIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger amountGet (BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn) throws BSDMResourceException
  {
    return amountGet (null, BalanceLineItemAmountGetIn);
  }
  /**
   * Retrieve the Amounts for a particular BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAmountGetIn Input Object Key.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("amountGet")
@Produces({"application/json","application/xml"})
  public BigInteger amountGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_BalanceLineItemAmountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (BalanceLineItemAmountGetIn != null) BalanceLineItemObjectKeyHelper.toMap (BalanceLineItemAmountGetIn, record, "BalanceLineItem");
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
Object _tmp = record.get ("AdjustmentEligibleAmount");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  /**

   * Get a BalanceLineItem..

   * Convenience method using default BSDMSessionContext.

   * @param BalanceLineItemGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BalanceLineItemObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BalanceLineItemObjectData get (BalanceLineItemObjectKeyData BalanceLineItemGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, BalanceLineItemGetIn, defaultAction, constraintAction);
  }
  /** 
   * Get a BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BalanceLineItemObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BalanceLineItemObjectData get (BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BalanceLineItemGetIn, defaultAction);
       
     cManager.checkConstraints(BalanceLineItemGetIn, constraintAction);
       return get (context, BalanceLineItemGetIn);
  }

  /**

   * Find BalanceLineItem's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param BalanceLineItemFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BalanceLineItemObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BalanceLineItemObjectDataList find (BalanceLineItemObjectFilter BalanceLineItemFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, BalanceLineItemFindIn, defaultAction, constraintAction);
  }
  /** 
   * Find BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BalanceLineItemObjectDataList find (BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BalanceLineItemFindIn, defaultAction);
       
     cManager.checkConstraints(BalanceLineItemFindIn, constraintAction);
       return find (context, BalanceLineItemFindIn);
  }

  /**

   * Find Count of BalanceLineItem's that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param BalanceLineItemFindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (BalanceLineItemObjectFilter BalanceLineItemFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, BalanceLineItemFindCountIn, defaultAction, constraintAction);
  }
  /** 
   * Find Count of BalanceLineItem's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemFindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BalanceLineItemFindCountIn, defaultAction);
       
     cManager.checkConstraints(BalanceLineItemFindCountIn, constraintAction);
       return findCount (context, BalanceLineItemFindCountIn);
  }

  /**

   * Find BalanceLineItem's by Account and Invoice attributes..

   * Convenience method using default BSDMSessionContext.

   * @param BalanceLineItemAcctFindIn Input Filter Object.

   * @param LatestInvoice (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BalanceLineItemObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BalanceLineItemObjectDataList byAccountFind (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountFind (null, BalanceLineItemAcctFindIn, LatestInvoice, defaultAction, constraintAction);
  }
  /** 
   * Find BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindIn Input Filter Object.
   * @param LatestInvoice (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BalanceLineItemObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BalanceLineItemObjectDataList byAccountFind (BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn, Boolean LatestInvoice, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BalanceLineItemAcctFindIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BalanceLineItemAcctFindIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byAccountFind (context, BalanceLineItemAcctFindIn, LatestInvoice);
  }

  /**

   * Find Count BalanceLineItem's by Account and Invoice attributes..

   * Convenience method using default BSDMSessionContext.

   * @param BalanceLineItemAcctFindCountIn Input Filter Object.

   * @param LatestInvoice1 (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer byAccountCount (BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return byAccountCount (null, BalanceLineItemAcctFindCountIn, LatestInvoice1, defaultAction, constraintAction);
  }
  /** 
   * Find Count BalanceLineItem's by Account and Invoice attributes..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAcctFindCountIn Input Filter Object.
   * @param LatestInvoice1 (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer byAccountCount (BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn, Boolean LatestInvoice1, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BalanceLineItemAcctFindCountIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(BalanceLineItemAcctFindCountIn, constraintAction);
       
    //Constraints not supported on Input-Column
return byAccountCount (context, BalanceLineItemAcctFindCountIn, LatestInvoice1);
  }

  /**

   * Retrieve the Amounts for a particular BalanceLineItem..

   * Convenience method using default BSDMSessionContext.

   * @param BalanceLineItemAmountGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger amountGet (BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return amountGet (null, BalanceLineItemAmountGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieve the Amounts for a particular BalanceLineItem..
   * @param context The session context to use when connecting to the APITS server.
   * @param BalanceLineItemAmountGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger amountGet (BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(BalanceLineItemAmountGetIn, defaultAction);
       
     cManager.checkConstraints(BalanceLineItemAmountGetIn, constraintAction);
       return amountGet (context, BalanceLineItemAmountGetIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public BalanceLineItemBean ()
  {
    try
    {
      _BalanceLineItemGetSpec = new BSDMInteractionSpec("BalanceLineItemGet", ApiMappings.getCallName ("BalanceLineItemGet"), Boolean.TRUE);

      _BalanceLineItemFindSpec = new BSDMInteractionSpec("BalanceLineItemFind", ApiMappings.getCallName ("BalanceLineItemFind"), Boolean.TRUE);

      _BalanceLineItemFindCountSpec = new BSDMInteractionSpec("BalanceLineItemFindCount", ApiMappings.getCallName ("BalanceLineItemFindCount"), Boolean.TRUE);

      _BalanceLineItemByAccountFindSpec = new BSDMInteractionSpec("BalanceLineItemByAccountFind", ApiMappings.getCallName ("BalanceLineItemByAccountFind"), Boolean.TRUE);

      _BalanceLineItemByAccountCountSpec = new BSDMInteractionSpec("BalanceLineItemByAccountCount", ApiMappings.getCallName ("BalanceLineItemByAccountCount"), Boolean.TRUE);

      _BalanceLineItemAmountGetSpec = new BSDMInteractionSpec("BalanceLineItemAmountGet", ApiMappings.getCallName ("BalanceLineItemAmountGet"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public BalanceLineItemBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public BalanceLineItemBean(BSDMSettings settings, BSDMConnectionManager cm)
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
