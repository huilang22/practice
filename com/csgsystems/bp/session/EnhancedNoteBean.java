
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: EnhancedNoteBean.java
 * Definition File: Customer/EnhancedNote.xml
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
import com.csgsystems.bp.interfaces.EnhancedNoteInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="EnhancedNoteSessionBean"
 * display-name="EnhancedNote Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/EnhancedNoteBean"
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

@Stateless(name="EnhancedNoteBean", mappedName = "EnhancedNote")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("EnhancedNotes")

public class EnhancedNoteBean implements EnhancedNoteInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _EnhancedNoteCreateSpec = null;
  /**
   * Creates a new enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EnhancedNoteObjectData create (EnhancedNoteObjectData enhancedNoteCreateIn) throws BSDMResourceException
  {
    return create (null, enhancedNoteCreateIn);
  }
  /**
   * Creates a new enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EnhancedNoteObjectData create (@HeaderParam ("context")BSDMSessionContext context,EnhancedNoteObjectData enhancedNoteCreateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EnhancedNoteCreateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (enhancedNoteCreateIn != null) EnhancedNoteObjectHelper.toMap (enhancedNoteCreateIn, record, "EnhancedNote");
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
return EnhancedNoteObjectHelper.fromMap (record, "EnhancedNote");
}

  private BSDMInteractionSpec _EnhancedNoteDeleteSpec = null;
  /**
   * Deletes a enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteDeleteIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EnhancedNoteObjectData delete (EnhancedNoteObjectKeyData enhancedNoteDeleteIn) throws BSDMResourceException
  {
    return delete (null, enhancedNoteDeleteIn);
  }
  /**
   * Deletes a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteDeleteIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@DELETE
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EnhancedNoteObjectData delete (@HeaderParam ("context")BSDMSessionContext context,EnhancedNoteObjectKeyData enhancedNoteDeleteIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EnhancedNoteDeleteSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (enhancedNoteDeleteIn != null) EnhancedNoteObjectKeyHelper.toMap (enhancedNoteDeleteIn, record, "EnhancedNote");
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
return EnhancedNoteObjectHelper.fromMap (record, "EnhancedNote");
}

  private BSDMInteractionSpec _EnhancedNoteFindSpec = null;
  /**
   * Finds enhanced notes.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteFindIn Input Filter Object.
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EnhancedNoteObjectDataList find (EnhancedNoteObjectFilter enhancedNoteFindIn) throws BSDMResourceException
  {
    return find (null, enhancedNoteFindIn);
  }
  /**
   * Finds enhanced notes.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteFindIn Input Filter Object.
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("find")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EnhancedNoteObjectDataList find (@HeaderParam ("context")BSDMSessionContext context,EnhancedNoteObjectFilter enhancedNoteFindIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EnhancedNoteFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (enhancedNoteFindIn != null) EnhancedNoteObjectHelper.toMap (enhancedNoteFindIn, record, "EnhancedNote");
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
return EnhancedNoteObjectHelper.fromMapList (record, "EnhancedNoteList");
}

  private BSDMInteractionSpec _EnhancedNoteGroupedFindSpec = null;
  /**
   * Finds enhanced notes and groups them when possible.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteGroupedFindIn Input Filter Object.
   * @param delimiter (null is allowed).
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EnhancedNoteObjectDataList groupedFind (EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, String delimiter) throws BSDMResourceException
  {
    return groupedFind (null, enhancedNoteGroupedFindIn, delimiter);
  }
  /**
   * Finds enhanced notes and groups them when possible.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGroupedFindIn Input Filter Object.
   * @param delimiter (null is allowed).
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("groupedFind")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EnhancedNoteObjectDataList groupedFind (@HeaderParam ("context")BSDMSessionContext context,EnhancedNoteObjectFilter enhancedNoteGroupedFindIn,@FormParam("delimiter")String delimiter) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EnhancedNoteGroupedFindSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (enhancedNoteGroupedFindIn != null) EnhancedNoteObjectHelper.toMap (enhancedNoteGroupedFindIn, record, "EnhancedNote");

      if (delimiter != null) record.put ("Delimiter", delimiter);
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
return EnhancedNoteObjectHelper.fromMapList (record, "EnhancedNoteList");
}

  private BSDMInteractionSpec _EnhancedNoteGetSpec = null;
  /**
   * Retrieves a specific enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteGetIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EnhancedNoteObjectData get (EnhancedNoteObjectKeyData enhancedNoteGetIn) throws BSDMResourceException
  {
    return get (null, enhancedNoteGetIn);
  }
  /**
   * Retrieves a specific enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGetIn Input Object Key.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("")
@Produces({"application/json","application/xml"})
  public EnhancedNoteObjectData get (@HeaderParam ("context")BSDMSessionContext context,@BeanParam EnhancedNoteObjectKeyData enhancedNoteGetIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EnhancedNoteGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (enhancedNoteGetIn != null) EnhancedNoteObjectKeyHelper.toMap (enhancedNoteGetIn, record, "EnhancedNote");
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
return EnhancedNoteObjectHelper.fromMap (record, "EnhancedNote");
}

  private BSDMInteractionSpec _EnhancedNoteSequenceGetSpec = null;
  /**
   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.
   * Convenience method using default BSDMSessionContext.
   * @return EnhancedNoteObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EnhancedNoteObjectKeyData sequenceGet () throws BSDMResourceException
  {
    return sequenceGet (null);
  }
  /**
   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.
   * @param context The session context to use when connecting to the APITS server.
   * @return EnhancedNoteObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
 
public EnhancedNoteObjectKeyData sequenceGet (BSDMSessionContext context) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EnhancedNoteSequenceGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
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
return EnhancedNoteObjectKeyHelper.fromMap (record, "EnhancedNote");
}

  private BSDMInteractionSpec _EnhancedNoteUpdateSpec = null;
  /**
   * Updates a enhanced note.
   * Convenience method using default BSDMSessionContext.
   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public EnhancedNoteObjectData update (EnhancedNoteObjectData enhancedNoteUpdateIn) throws BSDMResourceException
  {
    return update (null, enhancedNoteUpdateIn);
  }
  /**
   * Updates a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public EnhancedNoteObjectData update (@HeaderParam ("context")BSDMSessionContext context,EnhancedNoteObjectData enhancedNoteUpdateIn) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_EnhancedNoteUpdateSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (enhancedNoteUpdateIn != null) EnhancedNoteObjectHelper.toMap (enhancedNoteUpdateIn, record, "EnhancedNote");
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
return EnhancedNoteObjectHelper.fromMap (record, "EnhancedNote");
}

  /**

   * Creates a new enhanced note.

   * Convenience method using default BSDMSessionContext.

   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EnhancedNoteObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EnhancedNoteObjectData create (EnhancedNoteObjectData enhancedNoteCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return create (null, enhancedNoteCreateIn, defaultAction, constraintAction);
  }
  /** 
   * Creates a new enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteCreateIn Input  Object.  Defaulted Fields: NoteSource, IsPermanent, ChgWho, ChgDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EnhancedNoteObjectData create (BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(enhancedNoteCreateIn, defaultAction);
       
     cManager.checkConstraints(enhancedNoteCreateIn, constraintAction);
       return create (context, enhancedNoteCreateIn);
  }

  /**

   * Deletes a enhanced note.

   * Convenience method using default BSDMSessionContext.

   * @param enhancedNoteDeleteIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EnhancedNoteObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EnhancedNoteObjectData delete (EnhancedNoteObjectKeyData enhancedNoteDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return delete (null, enhancedNoteDeleteIn, defaultAction, constraintAction);
  }
  /** 
   * Deletes a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteDeleteIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EnhancedNoteObjectData delete (BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteDeleteIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(enhancedNoteDeleteIn, defaultAction);
       
     cManager.checkConstraints(enhancedNoteDeleteIn, constraintAction);
       return delete (context, enhancedNoteDeleteIn);
  }

  /**

   * Finds enhanced notes.

   * Convenience method using default BSDMSessionContext.

   * @param enhancedNoteFindIn Input Filter Object.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EnhancedNoteObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EnhancedNoteObjectDataList find (EnhancedNoteObjectFilter enhancedNoteFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return find (null, enhancedNoteFindIn, defaultAction, constraintAction);
  }
  /** 
   * Finds enhanced notes.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteFindIn Input Filter Object.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EnhancedNoteObjectDataList find (BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(enhancedNoteFindIn, defaultAction);
       
     cManager.checkConstraints(enhancedNoteFindIn, constraintAction);
       return find (context, enhancedNoteFindIn);
  }

  /**

   * Finds enhanced notes and groups them when possible.

   * Convenience method using default BSDMSessionContext.

   * @param enhancedNoteGroupedFindIn Input Filter Object.

   * @param delimiter (null is allowed).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EnhancedNoteObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EnhancedNoteObjectDataList groupedFind (EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, String delimiter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return groupedFind (null, enhancedNoteGroupedFindIn, delimiter, defaultAction, constraintAction);
  }
  /** 
   * Finds enhanced notes and groups them when possible.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGroupedFindIn Input Filter Object.
   * @param delimiter (null is allowed).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EnhancedNoteObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EnhancedNoteObjectDataList groupedFind (BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, String delimiter, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(enhancedNoteGroupedFindIn, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(enhancedNoteGroupedFindIn, constraintAction);
       
    //Constraints not supported on Input-Column
return groupedFind (context, enhancedNoteGroupedFindIn, delimiter);
  }

  /**

   * Retrieves a specific enhanced note.

   * Convenience method using default BSDMSessionContext.

   * @param enhancedNoteGetIn Input Object Key.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EnhancedNoteObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EnhancedNoteObjectData get (EnhancedNoteObjectKeyData enhancedNoteGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return get (null, enhancedNoteGetIn, defaultAction, constraintAction);
  }
  /** 
   * Retrieves a specific enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteGetIn Input Object Key.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EnhancedNoteObjectData get (BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(enhancedNoteGetIn, defaultAction);
       
     cManager.checkConstraints(enhancedNoteGetIn, constraintAction);
       return get (context, enhancedNoteGetIn);
  }

  /**

   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.

   * Convenience method using default BSDMSessionContext.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EnhancedNoteObjectKeyData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EnhancedNoteObjectKeyData sequenceGet (String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return sequenceGet (null, defaultAction, constraintAction);
  }
  /** 
   * Generates a new EnhancedNoteId for a new EnhancedNote. Used to pass to EnhancedNoteCreate later.
   * @param context The session context to use when connecting to the APITS server.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EnhancedNoteObjectKeyData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EnhancedNoteObjectKeyData sequenceGet (BSDMSessionContext context, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    return sequenceGet (context);
  }

  /**

   * Updates a enhanced note.

   * Convenience method using default BSDMSessionContext.

   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return EnhancedNoteObjectData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public EnhancedNoteObjectData update (EnhancedNoteObjectData enhancedNoteUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return update (null, enhancedNoteUpdateIn, defaultAction, constraintAction);
  }
  /** 
   * Updates a enhanced note.
   * @param context The session context to use when connecting to the APITS server.
   * @param enhancedNoteUpdateIn Input  Object.  Defaulted Fields: ChgWho, ChgDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return EnhancedNoteObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public EnhancedNoteObjectData update (BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(enhancedNoteUpdateIn, defaultAction);
       
     cManager.checkConstraints(enhancedNoteUpdateIn, constraintAction);
       return update (context, enhancedNoteUpdateIn);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public EnhancedNoteBean ()
  {
    try
    {
      _EnhancedNoteCreateSpec = new BSDMInteractionSpec("EnhancedNoteCreate", ApiMappings.getCallName ("EnhancedNoteCreate"), Boolean.TRUE);

      _EnhancedNoteDeleteSpec = new BSDMInteractionSpec("EnhancedNoteDelete", ApiMappings.getCallName ("EnhancedNoteDelete"), Boolean.TRUE);

      _EnhancedNoteFindSpec = new BSDMInteractionSpec("EnhancedNoteFind", ApiMappings.getCallName ("EnhancedNoteFind"), Boolean.TRUE);

      _EnhancedNoteGroupedFindSpec = new BSDMInteractionSpec("EnhancedNoteGroupedFind", ApiMappings.getCallName ("EnhancedNoteGroupedFind"), Boolean.TRUE);

      _EnhancedNoteGetSpec = new BSDMInteractionSpec("EnhancedNoteGet", ApiMappings.getCallName ("EnhancedNoteGet"), Boolean.TRUE);

      _EnhancedNoteSequenceGetSpec = new BSDMInteractionSpec("EnhancedNoteSequenceGet", ApiMappings.getCallName ("EnhancedNoteSequenceGet"), Boolean.FALSE);

      _EnhancedNoteUpdateSpec = new BSDMInteractionSpec("EnhancedNoteUpdate", ApiMappings.getCallName ("EnhancedNoteUpdate"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public EnhancedNoteBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public EnhancedNoteBean(BSDMSettings settings, BSDMConnectionManager cm)
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
