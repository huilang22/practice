
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: AdjustmentBean.java
 * Definition File: Customer/Adjustment.xml
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
import com.csgsystems.bp.interfaces.AdjustmentInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="AdjustmentSessionBean"
 * display-name="Adjustment Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/AdjustmentBean"
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

@Stateless(name="AdjustmentBean", mappedName = "Adjustment")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("Adjustments")

public class AdjustmentBean implements AdjustmentInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _AdjustmentGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData get (AdjustmentObjectKeyData getIn) throws BSDMResourceException
  {
    return get (null, getIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public AdjustmentObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam AdjustmentObjectKeyData getIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (getIn != null) AdjustmentObjectKeyHelper.toMap (getIn, record, "Adjustment");
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _AdjustmentFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectDataList find (AdjustmentObjectFilter findIn) throws BSDMResourceException
  {
    return find (null, findIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectFilter findIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findIn != null) AdjustmentObjectHelper.toMap (findIn, record, "Adjustment");
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
return AdjustmentObjectHelper.fromMapList (record, "AdjustmentList");
}

  private BSDMInteractionSpec _AdjustmentFindCountSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer findCount (AdjustmentObjectFilter findCountIn) throws BSDMResourceException
  {
    return findCount (null, findCountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("findCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer findCount (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectFilter findCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (findCountIn != null) AdjustmentObjectHelper.toMap (findCountIn, record, "Adjustment");
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

  private BSDMInteractionSpec _AdjustmentNoBackoutFindSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectDataList noBackoutFind (AdjustmentObjectFilter nbfindIn) throws BSDMResourceException
  {
    return noBackoutFind (null, nbfindIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("noBackoutFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectDataList noBackoutFind (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectFilter nbfindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentNoBackoutFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (nbfindIn != null) AdjustmentObjectHelper.toMap (nbfindIn, record, "Adjustment");
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
return AdjustmentObjectHelper.fromMapList (record, "AdjustmentList");
}

  private BSDMInteractionSpec _AdjustmentNoBackoutFindCountSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param nbfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer noBackoutFindCount (AdjustmentObjectFilter nbfindCountIn) throws BSDMResourceException
  {
    return noBackoutFindCount (null, nbfindCountIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindCountIn Input Filter Object.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("noBackoutFindCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer noBackoutFindCount (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectFilter nbfindCountIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentNoBackoutFindCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (nbfindCountIn != null) AdjustmentObjectHelper.toMap (nbfindCountIn, record, "Adjustment");
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

  private BSDMInteractionSpec _AdjustmentCreateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData create (AdjustmentObjectData adjCreateIn) throws BSDMResourceException
  {
    return create (null, adjCreateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData create (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectData adjCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (adjCreateIn != null) AdjustmentObjectHelper.toMap (adjCreateIn, record, "Adjustment");
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _AdjustmentUpdateSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData update (AdjustmentObjectData adjUpdateIn) throws BSDMResourceException
  {
    return update (null, adjUpdateIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData update (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectData adjUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (adjUpdateIn != null) AdjustmentObjectHelper.toMap (adjUpdateIn, record, "Adjustment");
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _AdjustmentModifySpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData modify (AdjustmentObjectData adjModifyIn) throws BSDMResourceException
  {
    return modify (null, adjModifyIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("modify")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData modify (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectData adjModifyIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentModifySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (adjModifyIn != null) AdjustmentObjectHelper.toMap (adjModifyIn, record, "Adjustment");
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _AdjustmentCancelSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData cancel (AdjustmentObjectData adjCancelIn) throws BSDMResourceException
  {
    return cancel (null, adjCancelIn);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("cancel")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData cancel (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectData adjCancelIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentCancelSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (adjCancelIn != null) AdjustmentObjectHelper.toMap (adjCancelIn, record, "Adjustment");
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _AdjustmentApproveSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.
   * @param SupervisorName.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData approve (AdjustmentObjectData adjApproveIn, String SupervisorName) throws BSDMResourceException
  {
    return approve (null, adjApproveIn, SupervisorName);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.
   * @param SupervisorName.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("approve")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData approve (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectData adjApproveIn,@FormParam("SupervisorName")String SupervisorName) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentApproveSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (adjApproveIn != null) AdjustmentObjectHelper.toMap (adjApproveIn, record, "Adjustment");

      if (SupervisorName != null) record.put ("SupervisorName", SupervisorName);
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _AdjustmentDenySpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.
   * @param supervisor_name.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public AdjustmentObjectData deny (AdjustmentObjectData adjDenyIn, String supervisor_name) throws BSDMResourceException
  {
    return deny (null, adjDenyIn, supervisor_name);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.
   * @param supervisor_name.
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("deny")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public AdjustmentObjectData deny (@HeaderParam ("context")BSDMSessionContext context,AdjustmentObjectData adjDenyIn,@FormParam("supervisor_name")String supervisor_name) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_AdjustmentDenySpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (adjDenyIn != null) AdjustmentObjectHelper.toMap (adjDenyIn, record, "Adjustment");

      if (supervisor_name != null) record.put ("SupervisorName", supervisor_name);
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
return AdjustmentObjectHelper.fromMap (record, "Adjustment");
}

  private BSDMInteractionSpec _InvoiceAdjustmentTotalGetSpec = null;
  /**
   * Convenience method using default BSDMSessionContext.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public BigInteger invoiceAdjustmentTotalGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id) throws BSDMResourceException
  {
    return invoiceAdjustmentTotalGet (null, bill_ref_no, bill_ref_resets, open_item_id);
  }
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("invoiceAdjustmentTotalGet")
@Produces({"application/json","application/xml"})
  public BigInteger invoiceAdjustmentTotalGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("bill_ref_no")Integer bill_ref_no,@QueryParam("bill_ref_resets")Integer bill_ref_resets,@QueryParam("open_item_id")Integer open_item_id) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvoiceAdjustmentTotalGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (bill_ref_no != null) record.put ("BillRefNo", bill_ref_no);

      if (bill_ref_resets != null) record.put ("BillRefResets", bill_ref_resets);

      if (open_item_id != null) record.put ("OpenItemId", open_item_id);
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
Object _tmp = record.get ("TotalAmount");
    BigInteger _out = null;
        _out = (BigInteger) _tmp;
          
    return _out
 ;
}

  /**

   * Convenience method using default BSDMSessionContext.

   * @param getIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData get (AdjustmentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, getIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData get (BSDMSessionContext context, AdjustmentObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(getIn, defaultAction);
       
     cManager.checkConstraints(getIn, constraintAction);
       return get (context, getIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param findIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectDataList find (AdjustmentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, findIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectDataList find (BSDMSessionContext context, AdjustmentObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findIn, defaultAction);
       
     cManager.checkConstraints(findIn, constraintAction);
       return find (context, findIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param findCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer findCount (AdjustmentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return findCount (null, findCountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param findCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer findCount (BSDMSessionContext context, AdjustmentObjectFilter findCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(findCountIn, defaultAction);
       
     cManager.checkConstraints(findCountIn, constraintAction);
       return findCount (context, findCountIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param nbfindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectDataList noBackoutFind (AdjustmentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return noBackoutFind (null, nbfindIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectDataList noBackoutFind (BSDMSessionContext context, AdjustmentObjectFilter nbfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(nbfindIn, defaultAction);
       
     cManager.checkConstraints(nbfindIn, constraintAction);
       return noBackoutFind (context, nbfindIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param nbfindCountIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer noBackoutFindCount (AdjustmentObjectFilter nbfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return noBackoutFindCount (null, nbfindCountIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param nbfindCountIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer noBackoutFindCount (BSDMSessionContext context, AdjustmentObjectFilter nbfindCountIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(nbfindCountIn, defaultAction);
       
     cManager.checkConstraints(nbfindCountIn, constraintAction);
       return noBackoutFindCount (context, nbfindCountIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData create (AdjustmentObjectData adjCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, adjCreateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCreateIn Input  Object.  Read-Only fields: ServerId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData create (BSDMSessionContext context, AdjustmentObjectData adjCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(adjCreateIn, defaultAction);
       
     cManager.checkConstraints(adjCreateIn, constraintAction);
       return create (context, adjCreateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData update (AdjustmentObjectData adjUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, adjUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param adjUpdateIn Input  Object.  Read-Only fields: ServerId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData update (BSDMSessionContext context, AdjustmentObjectData adjUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(adjUpdateIn, defaultAction);
       
     cManager.checkConstraints(adjUpdateIn, constraintAction);
       return update (context, adjUpdateIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData modify (AdjustmentObjectData adjModifyIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return modify (null, adjModifyIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param adjModifyIn Input  Object.  Read-Only fields: ServerId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData modify (BSDMSessionContext context, AdjustmentObjectData adjModifyIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(adjModifyIn, defaultAction);
       
     cManager.checkConstraints(adjModifyIn, constraintAction);
       return modify (context, adjModifyIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData cancel (AdjustmentObjectData adjCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return cancel (null, adjCancelIn, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param adjCancelIn Input  Object.  Read-Only fields: ServerId.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData cancel (BSDMSessionContext context, AdjustmentObjectData adjCancelIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(adjCancelIn, defaultAction);
       
     cManager.checkConstraints(adjCancelIn, constraintAction);
       return cancel (context, adjCancelIn);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.

   * @param SupervisorName.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData approve (AdjustmentObjectData adjApproveIn, String SupervisorName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return approve (null, adjApproveIn, SupervisorName, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param adjApproveIn Input  Object.  Read-Only fields: ServerId.
   * @param SupervisorName.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData approve (BSDMSessionContext context, AdjustmentObjectData adjApproveIn, String SupervisorName, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(adjApproveIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(adjApproveIn, constraintAction);
       
    //Constraints not supported on Input-Column
return approve (context, adjApproveIn, SupervisorName);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.

   * @param supervisor_name.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return AdjustmentObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public AdjustmentObjectData deny (AdjustmentObjectData adjDenyIn, String supervisor_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return deny (null, adjDenyIn, supervisor_name, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param adjDenyIn Input  Object.  Read-Only fields: ServerId.
   * @param supervisor_name.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return AdjustmentObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public AdjustmentObjectData deny (BSDMSessionContext context, AdjustmentObjectData adjDenyIn, String supervisor_name, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(adjDenyIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(adjDenyIn, constraintAction);
       
    //Constraints not supported on Input-Column
return deny (context, adjDenyIn, supervisor_name);
  }

  /**

   * Convenience method using default BSDMSessionContext.

   * @param bill_ref_no.

   * @param bill_ref_resets.

   * @param open_item_id.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return BigInteger as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public BigInteger invoiceAdjustmentTotalGet (Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return invoiceAdjustmentTotalGet (null, bill_ref_no, bill_ref_resets, open_item_id, defaultAction, constraintAction);
  }
  /** 
   * @param context The session context to use when connecting to the APITS server.
   * @param bill_ref_no.
   * @param bill_ref_resets.
   * @param open_item_id.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return BigInteger as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public BigInteger invoiceAdjustmentTotalGet (BSDMSessionContext context, Integer bill_ref_no, Integer bill_ref_resets, Integer open_item_id, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return invoiceAdjustmentTotalGet (context, bill_ref_no, bill_ref_resets, open_item_id);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public AdjustmentBean ()
  {
    try
    {
      _AdjustmentGetSpec = new BSDMInteractionSpec("AdjustmentGet", ApiMappings.getCallName ("AdjustmentGet"), Boolean.TRUE);

      _AdjustmentFindSpec = new BSDMInteractionSpec("AdjustmentFind", ApiMappings.getCallName ("AdjustmentFind"), Boolean.TRUE);

      _AdjustmentFindCountSpec = new BSDMInteractionSpec("AdjustmentFindCount", ApiMappings.getCallName ("AdjustmentFindCount"), Boolean.TRUE);

      _AdjustmentNoBackoutFindSpec = new BSDMInteractionSpec("AdjustmentNoBackoutFind", ApiMappings.getCallName ("AdjustmentNoBackoutFind"), Boolean.TRUE);

      _AdjustmentNoBackoutFindCountSpec = new BSDMInteractionSpec("AdjustmentNoBackoutFindCount", ApiMappings.getCallName ("AdjustmentNoBackoutFindCount"), Boolean.TRUE);

      _AdjustmentCreateSpec = new BSDMInteractionSpec("AdjustmentCreate", ApiMappings.getCallName ("AdjustmentCreate"), Boolean.TRUE);

      _AdjustmentUpdateSpec = new BSDMInteractionSpec("AdjustmentUpdate", ApiMappings.getCallName ("AdjustmentUpdate"), Boolean.TRUE);

      _AdjustmentModifySpec = new BSDMInteractionSpec("AdjustmentModify", ApiMappings.getCallName ("AdjustmentModify"), Boolean.TRUE);

      _AdjustmentCancelSpec = new BSDMInteractionSpec("AdjustmentCancel", ApiMappings.getCallName ("AdjustmentCancel"), Boolean.TRUE);

      _AdjustmentApproveSpec = new BSDMInteractionSpec("AdjustmentApprove", ApiMappings.getCallName ("AdjustmentApprove"), Boolean.TRUE);

      _AdjustmentDenySpec = new BSDMInteractionSpec("AdjustmentDeny", ApiMappings.getCallName ("AdjustmentDeny"), Boolean.TRUE);

      _InvoiceAdjustmentTotalGetSpec = new BSDMInteractionSpec("InvoiceAdjustmentTotalGet", ApiMappings.getCallName ("InvoiceAdjustmentTotalGet"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public AdjustmentBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public AdjustmentBean(BSDMSettings settings, BSDMConnectionManager cm)
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
