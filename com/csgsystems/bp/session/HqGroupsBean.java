
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: HqGroupsBean.java
 * Definition File: Catalog/HqGroups.xml
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
import com.csgsystems.bp.interfaces.HqGroupsInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="HqGroupsSessionBean"
 * display-name="HqGroups Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/HqGroupsBean"
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

@Stateless(name="HqGroupsBean", mappedName = "HqGroups")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("HqGroups")

public class HqGroupsBean implements HqGroupsInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _HqGroupsCreateSpec = null;
  /**
   *  Creates a new Hq Group .
   * Convenience method using default BSDMSessionContext.
   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.
   * @param AccountExternalId (null is allowed).
   * @param AccountExternalIdType (null is allowed).
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupsObjectData create (HqGroupsObjectData hgcIn, String AccountExternalId, Integer AccountExternalIdType) throws BSDMResourceException
  {
    return create (null, hgcIn, AccountExternalId, AccountExternalIdType);
  }
  /**
   *  Creates a new Hq Group .
   * @param context The session context to use when connecting to the APITS server.
   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.
   * @param AccountExternalId (null is allowed).
   * @param AccountExternalIdType (null is allowed).
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupsObjectData create (@HeaderParam ("context")BSDMSessionContext context,HqGroupsObjectData hgcIn,@FormParam("AccountExternalId")String AccountExternalId,@FormParam("AccountExternalIdType")Integer AccountExternalIdType) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupsCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (hgcIn != null) HqGroupsObjectHelper.toMap (hgcIn, record, "HqGroups");

      if (AccountExternalId != null) record.put ("AccountExternalId", AccountExternalId);

      if (AccountExternalIdType != null) record.put ("AccountExternalIdType", AccountExternalIdType);
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
return HqGroupsObjectHelper.fromMap (record, "HqGroups");
}

  private BSDMInteractionSpec _HqGroupsUpdateSpec = null;
  /**
   * Update non-key fields in an group.    .
   * Convenience method using default BSDMSessionContext.
   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupsObjectData update (HqGroupsObjectData hguIn) throws BSDMResourceException
  {
    return update (null, hguIn);
  }
  /**
   * Update non-key fields in an group.    .
   * @param context The session context to use when connecting to the APITS server.
   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupsObjectData update (@HeaderParam ("context")BSDMSessionContext context,HqGroupsObjectData hguIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupsUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (hguIn != null) HqGroupsObjectHelper.toMap (hguIn, record, "HqGroups");
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
return HqGroupsObjectHelper.fromMap (record, "HqGroups");
}

  private BSDMInteractionSpec _HqGroupsFindSpec = null;
  /**
   * Finds Groups based upon the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param hgfIn Input Filter Object.
   * @return HqGroupsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupsObjectDataList find (HqGroupsObjectFilter hgfIn) throws BSDMResourceException
  {
    return find (null, hgfIn);
  }
  /**
   * Finds Groups based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgfIn Input Filter Object.
   * @return HqGroupsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupsObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,HqGroupsObjectFilter hgfIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupsFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (hgfIn != null) HqGroupsObjectHelper.toMap (hgfIn, record, "HqGroups");
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
return HqGroupsObjectHelper.fromMapList (record, "HqGroupsList");
}

  private BSDMInteractionSpec _HqGroupsGetSpec = null;
  /**
   * Retrieves a Group object based on its key..
   * Convenience method using default BSDMSessionContext.
   * @param hggIn Input  Object.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupsObjectData get (HqGroupsObjectData hggIn) throws BSDMResourceException
  {
    return get (null, hggIn);
  }
  /**
   * Retrieves a Group object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param hggIn Input  Object.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public HqGroupsObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam HqGroupsObjectData hggIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupsGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (hggIn != null) HqGroupsObjectHelper.toMap (hggIn, record, "HqGroups");
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
return HqGroupsObjectHelper.fromMap (record, "HqGroups");
}

  private BSDMInteractionSpec _HqGroupsDeleteSpec = null;
  /**
   * Cease a Group..
   * Convenience method using default BSDMSessionContext.
   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public HqGroupsObjectData delete (HqGroupsObjectData hgxIn) throws BSDMResourceException
  {
    return delete (null, hgxIn);
  }
  /**
   * Cease a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public HqGroupsObjectData delete (@HeaderParam ("context")BSDMSessionContext context,HqGroupsObjectData hgxIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupsDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (hgxIn != null) HqGroupsObjectHelper.toMap (hgxIn, record, "HqGroups");
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
return HqGroupsObjectHelper.fromMap (record, "HqGroups");
}

  private BSDMInteractionSpec _HqGroupsDeleteListSpec = null;
  /**
   * Cease groups that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param hgxlFilter Input Filter Object.
   * @param HGInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public void deleteList (HqGroupsObjectFilter hgxlFilter, Date HGInactiveDate) throws BSDMResourceException
  {
    deleteList (null, hgxlFilter, HGInactiveDate);
  }
  /**
   * Cease groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxlFilter Input Filter Object.
   * @param HGInactiveDate (null is allowed) (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("deleteList")
@Consumes({"application/json","application/xml"})

 public void deleteList (@HeaderParam ("context")BSDMSessionContext context,HqGroupsObjectFilter hgxlFilter,@FormParam("HGInactiveDate")Date HGInactiveDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_HqGroupsDeleteListSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (HGInactiveDate != null) record.put ("HGInactiveDate", HGInactiveDate);
      if (hgxlFilter != null) HqGroupsObjectHelper.toMap (hgxlFilter, record, "HgxlFilter");
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

   *  Creates a new Hq Group .

   * Convenience method using default BSDMSessionContext.

   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.

   * @param AccountExternalId (null is allowed).

   * @param AccountExternalIdType (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupsObjectData create (HqGroupsObjectData hgcIn, String AccountExternalId, Integer AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, hgcIn, AccountExternalId, AccountExternalIdType, defaultAction, constraintAction);
  }
  /** 
   *  Creates a new Hq Group .
   * @param context The session context to use when connecting to the APITS server.
   * @param hgcIn Input  Object.  Read-Only fields: GroupId.  Defaulted Fields: ChgDt, ChgWho.  Derived Fields: GroupId.
   * @param AccountExternalId (null is allowed).
   * @param AccountExternalIdType (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupsObjectData create (BSDMSessionContext context, HqGroupsObjectData hgcIn, String AccountExternalId, Integer AccountExternalIdType, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(hgcIn, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     cManager.checkConstraints(hgcIn, constraintAction);
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return create (context, hgcIn, AccountExternalId, AccountExternalIdType);
  }

  /**

   * Update non-key fields in an group.    .

   * Convenience method using default BSDMSessionContext.

   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupsObjectData update (HqGroupsObjectData hguIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, hguIn, defaultAction, constraintAction);
  }
  /** 
   * Update non-key fields in an group.    .
   * @param context The session context to use when connecting to the APITS server.
   * @param hguIn Input  Object.  Defaulted Fields: ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupsObjectData update (BSDMSessionContext context, HqGroupsObjectData hguIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(hguIn, defaultAction);
       
     cManager.checkConstraints(hguIn, constraintAction);
       return update (context, hguIn);
  }

  /**

   * Finds Groups based upon the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param hgfIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupsObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupsObjectDataList find (HqGroupsObjectFilter hgfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, hgfIn, defaultAction, constraintAction);
  }
  /** 
   * Finds Groups based upon the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgfIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupsObjectDataList find (BSDMSessionContext context, HqGroupsObjectFilter hgfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(hgfIn, defaultAction);
       
     cManager.checkConstraints(hgfIn, constraintAction);
       return find (context, hgfIn);
  }

  /**

   * Retrieves a Group object based on its key..

   * Convenience method using default BSDMSessionContext.

   * @param hggIn Input  Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupsObjectData get (HqGroupsObjectData hggIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, hggIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieves a Group object based on its key..
   * @param context The session context to use when connecting to the APITS server.
   * @param hggIn Input  Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupsObjectData get (BSDMSessionContext context, HqGroupsObjectData hggIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(hggIn, defaultAction);
       
     cManager.checkConstraints(hggIn, constraintAction);
       return get (context, hggIn);
  }

  /**

   * Cease a Group..

   * Convenience method using default BSDMSessionContext.

   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return HqGroupsObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public HqGroupsObjectData delete (HqGroupsObjectData hgxIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, hgxIn, defaultAction, constraintAction);
  }
  /** 
   * Cease a Group..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxIn Input  Object.  Defaulted Fields: InactiveDt, ChgDt, ChgWho.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return HqGroupsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public HqGroupsObjectData delete (BSDMSessionContext context, HqGroupsObjectData hgxIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(hgxIn, defaultAction);
       
     cManager.checkConstraints(hgxIn, constraintAction);
       return delete (context, hgxIn);
  }

  /**

   * Cease groups that match the supplied filter..

   * Convenience method using default BSDMSessionContext.

   * @param hgxlFilter Input Filter Object.

   * @param HGInactiveDate (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public void deleteList (HqGroupsObjectFilter hgxlFilter, Date HGInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    deleteList (null, hgxlFilter, HGInactiveDate, defaultAction, constraintAction);
  }
  /** 
   * Cease groups that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param hgxlFilter Input Filter Object.
   * @param HGInactiveDate (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public void deleteList (BSDMSessionContext context, HqGroupsObjectFilter hgxlFilter, Date HGInactiveDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(hgxlFilter, defaultAction);
       
    //Constraints not supported on Input-Column

     cManager.checkConstraints(hgxlFilter, constraintAction);
       deleteList (context, hgxlFilter, HGInactiveDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public HqGroupsBean ()
  {
    try
    {
      _HqGroupsCreateSpec = new BSDMInteractionSpec("HqGroupsCreate", ApiMappings.getCallName ("HqGroupsCreate"), Boolean.TRUE);

      _HqGroupsUpdateSpec = new BSDMInteractionSpec("HqGroupsUpdate", ApiMappings.getCallName ("HqGroupsUpdate"), Boolean.TRUE);

      _HqGroupsFindSpec = new BSDMInteractionSpec("HqGroupsFind", ApiMappings.getCallName ("HqGroupsFind"), Boolean.TRUE);

      _HqGroupsGetSpec = new BSDMInteractionSpec("HqGroupsGet", ApiMappings.getCallName ("HqGroupsGet"), Boolean.TRUE);

      _HqGroupsDeleteSpec = new BSDMInteractionSpec("HqGroupsDelete", ApiMappings.getCallName ("HqGroupsDelete"), Boolean.TRUE);

      _HqGroupsDeleteListSpec = new BSDMInteractionSpec("HqGroupsDeleteList", ApiMappings.getCallName ("HqGroupsDeleteList"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public HqGroupsBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public HqGroupsBean(BSDMSettings settings, BSDMConnectionManager cm)
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
