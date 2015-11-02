
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ProductRcRateBean.java
 * Definition File: Customer/ProductRcRate.xml
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
import com.csgsystems.bp.interfaces.ProductRcRateInterface;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ProductRcRateSessionBean"
 * display-name="ProductRcRate Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ProductRcRateBean"
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

@Stateless(name="ProductRcRateBean", mappedName = "ProductRcRate")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ProductRcRates")

public class ProductRcRateBean implements ProductRcRateInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ProductRcRateNrcDescrGetSpec = null;
  /**
   * Gets the RATE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_NRC_Type_Id_Nrc.
   * @return ProductRcRateNrcDescrGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (Integer In_NRC_Type_Id_Nrc) throws BSDMResourceException
  {
    return nrcDescrGet (null, In_NRC_Type_Id_Nrc);
  }
  /**
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc.
   * @return ProductRcRateNrcDescrGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("nrcDescrGet")
@Produces({"application/json","application/xml"})
  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_NRC_Type_Id_Nrc")Integer In_NRC_Type_Id_Nrc) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateNrcDescrGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_NRC_Type_Id_Nrc != null) record.put ("InNRCTypeIdNrc", In_NRC_Type_Id_Nrc);
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
return ProductRcRateNrcDescrGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _ProductRcRateNrcDescrTwoSpec = null;
  /**
   * Gets the NRC Descriptio Code for the type_id_nrc..
   * Convenience method using default BSDMSessionContext.
   * @param In_NRC_Type_Id_Nrc2.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer nrcDescrTwo (Integer In_NRC_Type_Id_Nrc2) throws BSDMResourceException
  {
    return nrcDescrTwo (null, In_NRC_Type_Id_Nrc2);
  }
  /**
   * Gets the NRC Descriptio Code for the type_id_nrc..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc2.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("nrcDescrTwo")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer nrcDescrTwo (@HeaderParam ("context")BSDMSessionContext context,Integer In_NRC_Type_Id_Nrc2) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateNrcDescrTwoSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_NRC_Type_Id_Nrc2 != null) record.put ("InNRCTypeIdNrc2", In_NRC_Type_Id_Nrc2);
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
Object _tmp = record.get ("InNRCDescriptionCode");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateBillMinGetSpec = null;
  /**
   * Gets the bill cycle min date for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MinBillPeriod.
   * @param In_PRRMD_MinCutOffDate.
   * @return ProductRcRateBillMinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRcRateBillMinGetOutputData billMinGet (String In_PRRMD_MinBillPeriod, Date In_PRRMD_MinCutOffDate) throws BSDMResourceException
  {
    return billMinGet (null, In_PRRMD_MinBillPeriod, In_PRRMD_MinCutOffDate);
  }
  /**
   * Gets the bill cycle min date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MinBillPeriod.
   * @param In_PRRMD_MinCutOffDate.
   * @return ProductRcRateBillMinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("billMinGet")
@Produces({"application/json","application/xml"})
  public ProductRcRateBillMinGetOutputData billMinGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_PRRMD_MinBillPeriod")String In_PRRMD_MinBillPeriod,@QueryParam("In_PRRMD_MinCutOffDate")Date In_PRRMD_MinCutOffDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateBillMinGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_PRRMD_MinBillPeriod != null) record.put ("InPRRMDMinBillPeriod", In_PRRMD_MinBillPeriod);

      if (In_PRRMD_MinCutOffDate != null) record.put ("InPRRMDMinCutOffDate", In_PRRMD_MinCutOffDate);
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
return ProductRcRateBillMinGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _ProductRcRateBillMaxGetSpec = null;
  /**
   * Gets the bill cycle max date for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MaxBillPeriod.
   * @param In_PRRMD_MaxCutOffDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Date billMaxGet (String In_PRRMD_MaxBillPeriod, Date In_PRRMD_MaxCutOffDate) throws BSDMResourceException
  {
    return billMaxGet (null, In_PRRMD_MaxBillPeriod, In_PRRMD_MaxCutOffDate);
  }
  /**
   * Gets the bill cycle max date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillPeriod.
   * @param In_PRRMD_MaxCutOffDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("billMaxGet")
@Produces({"application/json","application/xml"})
  public Date billMaxGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_PRRMD_MaxBillPeriod")String In_PRRMD_MaxBillPeriod,@QueryParam("In_PRRMD_MaxCutOffDate")Date In_PRRMD_MaxCutOffDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateBillMaxGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_PRRMD_MaxBillPeriod != null) record.put ("InPRRMDMaxBillPeriod", In_PRRMD_MaxBillPeriod);

      if (In_PRRMD_MaxCutOffDate != null) record.put ("InPRRMDMaxCutOffDate", In_PRRMD_MaxCutOffDate);
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
Object _tmp = record.get ("OutPRRMDMaxCutOffDate");
    Date _out = null;
        _out = (Date) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateBillMaxTwoSpec = null;
  /**
   * Gets the bill cycle max date (second version) for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MaxBillTwo.
   * @param In_PRRMD_MaxCutTwoDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Date billMaxTwo (String In_PRRMD_MaxBillTwo, Date In_PRRMD_MaxCutTwoDate) throws BSDMResourceException
  {
    return billMaxTwo (null, In_PRRMD_MaxBillTwo, In_PRRMD_MaxCutTwoDate);
  }
  /**
   * Gets the bill cycle max date (second version) for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillTwo.
   * @param In_PRRMD_MaxCutTwoDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("billMaxTwo")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Date billMaxTwo (@HeaderParam ("context")BSDMSessionContext context,String In_PRRMD_MaxBillTwo,@FormParam("In_PRRMD_MaxCutTwoDate")Date In_PRRMD_MaxCutTwoDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateBillMaxTwoSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_PRRMD_MaxBillTwo != null) record.put ("InPRRMDMaxBillTwo", In_PRRMD_MaxBillTwo);

      if (In_PRRMD_MaxCutTwoDate != null) record.put ("InPRRMDMaxCutTwoDate", In_PRRMD_MaxCutTwoDate);
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
Object _tmp = record.get ("OutPRRMDMaxCutTwoDate");
    Date _out = null;
        _out = (Date) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateBillCountGetSpec = null;
  /**
   * Gets the bill cycle count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_BILL_Bill_Period.
   * @param In_BILL_Bill_Thru_Dt.
   * @param In_BILL_RequestDate.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer billCountGet (String In_BILL_Bill_Period, Date In_BILL_Bill_Thru_Dt, Date In_BILL_RequestDate) throws BSDMResourceException
  {
    return billCountGet (null, In_BILL_Bill_Period, In_BILL_Bill_Thru_Dt, In_BILL_RequestDate);
  }
  /**
   * Gets the bill cycle count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_BILL_Bill_Period.
   * @param In_BILL_Bill_Thru_Dt.
   * @param In_BILL_RequestDate.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("billCountGet")
@Produces({"application/json","application/xml"})
  public Integer billCountGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_BILL_Bill_Period")String In_BILL_Bill_Period,@QueryParam("In_BILL_Bill_Thru_Dt")Date In_BILL_Bill_Thru_Dt,@QueryParam("In_BILL_RequestDate")Date In_BILL_RequestDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateBillCountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_BILL_Bill_Period != null) record.put ("InBILLBillPeriod", In_BILL_Bill_Period);

      if (In_BILL_Bill_Thru_Dt != null) record.put ("InBILLBillThruDt", In_BILL_Bill_Thru_Dt);

      if (In_BILL_RequestDate != null) record.put ("InBILLRequestDate", In_BILL_RequestDate);
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
Object _tmp = record.get ("InBILLBlCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateCmfCountGetSpec = null;
  /**
   * Gets the cmf count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CMF_Cnt_Account_No.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer cmfCountGet (Integer In_CMF_Cnt_Account_No) throws BSDMResourceException
  {
    return cmfCountGet (null, In_CMF_Cnt_Account_No);
  }
  /**
   * Gets the cmf count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Cnt_Account_No.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("cmfCountGet")
@Produces({"application/json","application/xml"})
  public Integer cmfCountGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_CMF_Cnt_Account_No")Integer In_CMF_Cnt_Account_No) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateCmfCountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_CMF_Cnt_Account_No != null) record.put ("InCMFCntAccountNo", In_CMF_Cnt_Account_No);
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
Object _tmp = record.get ("OutCMFCmfCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateSvCountGetSpec = null;
  /**
   * Gets the service count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CSC_Subscr_No.
   * @param In_CSC_Subscr_No_Resets.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer svCountGet (Integer In_CSC_Subscr_No, Integer In_CSC_Subscr_No_Resets) throws BSDMResourceException
  {
    return svCountGet (null, In_CSC_Subscr_No, In_CSC_Subscr_No_Resets);
  }
  /**
   * Gets the service count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CSC_Subscr_No.
   * @param In_CSC_Subscr_No_Resets.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("svCountGet")
@Produces({"application/json","application/xml"})
  public Integer svCountGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_CSC_Subscr_No")Integer In_CSC_Subscr_No,@QueryParam("In_CSC_Subscr_No_Resets")Integer In_CSC_Subscr_No_Resets) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateSvCountGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_CSC_Subscr_No != null) record.put ("InCSCSubscrNo", In_CSC_Subscr_No);

      if (In_CSC_Subscr_No_Resets != null) record.put ("InCSCSubscrNoResets", In_CSC_Subscr_No_Resets);
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
Object _tmp = record.get ("InCSCCvCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateCustomerCountSpec = null;
  /**
   * Gets the customer count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CCV_Tracking_Id.
   * @param In_CCV_Tracking_Id_Serv.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public Integer customerCount (Integer In_CCV_Tracking_Id, Integer In_CCV_Tracking_Id_Serv) throws BSDMResourceException
  {
    return customerCount (null, In_CCV_Tracking_Id, In_CCV_Tracking_Id_Serv);
  }
  /**
   * Gets the customer count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCV_Tracking_Id.
   * @param In_CCV_Tracking_Id_Serv.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("customerCount")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public Integer customerCount (@HeaderParam ("context")BSDMSessionContext context,Integer In_CCV_Tracking_Id,@FormParam("In_CCV_Tracking_Id_Serv")Integer In_CCV_Tracking_Id_Serv) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateCustomerCountSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_CCV_Tracking_Id != null) record.put ("InCCVTrackingId", In_CCV_Tracking_Id);

      if (In_CCV_Tracking_Id_Serv != null) record.put ("InCCVTrackingIdServ", In_CCV_Tracking_Id_Serv);
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
Object _tmp = record.get ("InCCVCcvCount");
    Integer _out = null;
        _out = (Integer) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateCmfDataGetSpec = null;
  /**
   * Gets the CMF data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CMF_Account_No.
   * @param In_CMF_Request_Date.
   * @return ProductRcRateCmfDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRcRateCmfDataGetOutputData cmfDataGet (Integer In_CMF_Account_No, Date In_CMF_Request_Date) throws BSDMResourceException
  {
    return cmfDataGet (null, In_CMF_Account_No, In_CMF_Request_Date);
  }
  /**
   * Gets the CMF data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Account_No.
   * @param In_CMF_Request_Date.
   * @return ProductRcRateCmfDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("cmfDataGet")
@Produces({"application/json","application/xml"})
  public ProductRcRateCmfDataGetOutputData cmfDataGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_CMF_Account_No")Integer In_CMF_Account_No,@QueryParam("In_CMF_Request_Date")Date In_CMF_Request_Date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateCmfDataGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_CMF_Account_No != null) record.put ("InCMFAccountNo", In_CMF_Account_No);

      if (In_CMF_Request_Date != null) record.put ("InCMFRequestDate", In_CMF_Request_Date);
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
return ProductRcRateCmfDataGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _ProductRcRateServiceDataGetSpec = null;
  /**
   * Gets the SERVICE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_SERVICE_Subscr_No.
   * @param In_SERVICE_Subscr_No_Resets.
   * @param In_SERVICE_Request_Date.
   * @return PRRServiceDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PRRServiceDataObjectDataList serviceDataGet (Integer In_SERVICE_Subscr_No, Integer In_SERVICE_Subscr_No_Resets, Date In_SERVICE_Request_Date) throws BSDMResourceException
  {
    return serviceDataGet (null, In_SERVICE_Subscr_No, In_SERVICE_Subscr_No_Resets, In_SERVICE_Request_Date);
  }
  /**
   * Gets the SERVICE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_SERVICE_Subscr_No.
   * @param In_SERVICE_Subscr_No_Resets.
   * @param In_SERVICE_Request_Date.
   * @return PRRServiceDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("serviceDataGet")
@Produces({"application/json","application/xml"})
  public PRRServiceDataObjectDataList serviceDataGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_SERVICE_Subscr_No")Integer In_SERVICE_Subscr_No,@QueryParam("In_SERVICE_Subscr_No_Resets")Integer In_SERVICE_Subscr_No_Resets,@QueryParam("In_SERVICE_Request_Date")Date In_SERVICE_Request_Date) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateServiceDataGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_SERVICE_Subscr_No != null) record.put ("InSERVICESubscrNo", In_SERVICE_Subscr_No);

      if (In_SERVICE_Subscr_No_Resets != null) record.put ("InSERVICESubscrNoResets", In_SERVICE_Subscr_No_Resets);

      if (In_SERVICE_Request_Date != null) record.put ("InSERVICERequestDate", In_SERVICE_Request_Date);
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
return PRRServiceDataObjectHelper.fromMapList (record, "ProductRcRateList");
}

  private BSDMInteractionSpec _ProductRcRateRateCrDataSpec = null;
  /**
   * Gets the RATE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_RATE_CurrencyCode.
   * @return ProductRcRateRateCrDataOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRcRateRateCrDataOutputData rateCrData (Integer In_RATE_CurrencyCode) throws BSDMResourceException
  {
    return rateCrData (null, In_RATE_CurrencyCode);
  }
  /**
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_RATE_CurrencyCode.
   * @return ProductRcRateRateCrDataOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@PUT
@Path("rateCrData")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductRcRateRateCrDataOutputData rateCrData (@HeaderParam ("context")BSDMSessionContext context,Integer In_RATE_CurrencyCode) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateRateCrDataSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_RATE_CurrencyCode != null) record.put ("InRATECurrencyCode", In_RATE_CurrencyCode);
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
return ProductRcRateRateCrDataOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _ProductRcRateDescrDataGetSpec = null;
  /**
   * Gets the DESCRIPTIONS data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_Desc_Acount_No.
   * @param In_Desc_Description_Code.
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public String descrDataGet (Integer In_Desc_Acount_No, Integer In_Desc_Description_Code) throws BSDMResourceException
  {
    return descrDataGet (null, In_Desc_Acount_No, In_Desc_Description_Code);
  }
  /**
   * Gets the DESCRIPTIONS data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_Desc_Acount_No.
   * @param In_Desc_Description_Code.
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("descrDataGet")
@Produces({"application/json","application/xml"})
  public String descrDataGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_Desc_Acount_No")Integer In_Desc_Acount_No,@QueryParam("In_Desc_Description_Code")Integer In_Desc_Description_Code) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateDescrDataGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_Desc_Acount_No != null) record.put ("InDescAcountNo", In_Desc_Acount_No);

      if (In_Desc_Description_Code != null) record.put ("InDescDescriptionCode", In_Desc_Description_Code);
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
Object _tmp = record.get ("InRATEDescriptionText");
    String _out = null;
        _out = (String) _tmp;
          
    return _out
 ;
}

  private BSDMInteractionSpec _ProductRcRateCustomerDataGetSpec = null;
  /**
   * Gets the Customer Contract data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param PRRContract_In Input  Object.
   * @param In_Contract_RequestDt.
   * @return PRRContractDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PRRContractDataObjectDataList customerDataGet (PRRContractDataObjectData PRRContract_In, Date In_Contract_RequestDt) throws BSDMResourceException
  {
    return customerDataGet (null, PRRContract_In, In_Contract_RequestDt);
  }
  /**
   * Gets the Customer Contract data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRRContract_In Input  Object.
   * @param In_Contract_RequestDt.
   * @return PRRContractDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("customerDataGet")
@Produces({"application/json","application/xml"})
  public PRRContractDataObjectDataList customerDataGet (@HeaderParam ("context")BSDMSessionContext context,@BeanParam PRRContractDataObjectData PRRContract_In,@QueryParam("In_Contract_RequestDt")Date In_Contract_RequestDt) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateCustomerDataGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);
      if (PRRContract_In != null) PRRContractDataObjectHelper.toMap (PRRContract_In, record, "ProductRcRate");

      if (In_Contract_RequestDt != null) record.put ("InContractRequestDt", In_Contract_RequestDt);
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
return PRRContractDataObjectHelper.fromMapList (record, "ProductRcRateList");
}

  private BSDMInteractionSpec _ProductRcRateCkDataGetSpec = null;
  /**
   * Gets the CCK data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CCK_Tracking_Id.
   * @param In_CCK_Tracking_Id_Serv.
   * @return ProductRcRateCkDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductRcRateCkDataGetOutputData ckDataGet (Integer In_CCK_Tracking_Id, BigInteger In_CCK_Tracking_Id_Serv) throws BSDMResourceException
  {
    return ckDataGet (null, In_CCK_Tracking_Id, In_CCK_Tracking_Id_Serv);
  }
  /**
   * Gets the CCK data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCK_Tracking_Id.
   * @param In_CCK_Tracking_Id_Serv.
   * @return ProductRcRateCkDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("ckDataGet")
@Produces({"application/json","application/xml"})
  public ProductRcRateCkDataGetOutputData ckDataGet (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_CCK_Tracking_Id")Integer In_CCK_Tracking_Id,@QueryParam("In_CCK_Tracking_Id_Serv")BigInteger In_CCK_Tracking_Id_Serv) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateCkDataGetSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_CCK_Tracking_Id != null) record.put ("InCCKTrackingId", In_CCK_Tracking_Id);

      if (In_CCK_Tracking_Id_Serv != null) record.put ("InCCKTrackingIdServ", In_CCK_Tracking_Id_Serv);
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
return ProductRcRateCkDataGetOutputHelper.fromMap (record);
}

  private BSDMInteractionSpec _ProductRcRateGetRcDataSpec = null;
  /**
   * Gets the RC data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRGRD_ElemId.
   * @param In_PRRGRD_TrackingId.
   * @param In_PRRGRD_TrackingIdServ.
   * @param In_PRRGRD_RequestDate.
   * @return PRRRcDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PRRRcDataObjectDataList getRcData (Integer In_PRRGRD_ElemId, Integer In_PRRGRD_TrackingId, Integer In_PRRGRD_TrackingIdServ, Date In_PRRGRD_RequestDate) throws BSDMResourceException
  {
    return getRcData (null, In_PRRGRD_ElemId, In_PRRGRD_TrackingId, In_PRRGRD_TrackingIdServ, In_PRRGRD_RequestDate);
  }
  /**
   * Gets the RC data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRGRD_ElemId.
   * @param In_PRRGRD_TrackingId.
   * @param In_PRRGRD_TrackingIdServ.
   * @param In_PRRGRD_RequestDate.
   * @return PRRRcDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@GET
@Path("getRcData")
@Produces({"application/json","application/xml"})
  public PRRRcDataObjectDataList getRcData (@HeaderParam ("context")BSDMSessionContext context,@QueryParam("In_PRRGRD_ElemId")Integer In_PRRGRD_ElemId,@QueryParam("In_PRRGRD_TrackingId")Integer In_PRRGRD_TrackingId,@QueryParam("In_PRRGRD_TrackingIdServ")Integer In_PRRGRD_TrackingIdServ,@QueryParam("In_PRRGRD_RequestDate")Date In_PRRGRD_RequestDate) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductRcRateGetRcDataSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (In_PRRGRD_ElemId != null) record.put ("InPRRGRDElemId", In_PRRGRD_ElemId);

      if (In_PRRGRD_TrackingId != null) record.put ("InPRRGRDTrackingId", In_PRRGRD_TrackingId);

      if (In_PRRGRD_TrackingIdServ != null) record.put ("InPRRGRDTrackingIdServ", In_PRRGRD_TrackingIdServ);

      if (In_PRRGRD_RequestDate != null) record.put ("InPRRGRDRequestDate", In_PRRGRD_RequestDate);
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
return PRRRcDataObjectHelper.fromMapList (record, "ProductRcRateList");
}

  /**

   * Gets the RATE data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_NRC_Type_Id_Nrc.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRcRateNrcDescrGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (Integer In_NRC_Type_Id_Nrc, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return nrcDescrGet (null, In_NRC_Type_Id_Nrc, defaultAction, constraintAction);
  }
  /** 
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRcRateNrcDescrGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (BSDMSessionContext context, Integer In_NRC_Type_Id_Nrc, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column
return nrcDescrGet (context, In_NRC_Type_Id_Nrc);
  }

  /**

   * Gets the NRC Descriptio Code for the type_id_nrc..

   * Convenience method using default BSDMSessionContext.

   * @param In_NRC_Type_Id_Nrc2.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer nrcDescrTwo (Integer In_NRC_Type_Id_Nrc2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return nrcDescrTwo (null, In_NRC_Type_Id_Nrc2, defaultAction, constraintAction);
  }
  /** 
   * Gets the NRC Descriptio Code for the type_id_nrc..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc2.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer nrcDescrTwo (BSDMSessionContext context, Integer In_NRC_Type_Id_Nrc2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column
return nrcDescrTwo (context, In_NRC_Type_Id_Nrc2);
  }

  /**

   * Gets the bill cycle min date for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_PRRMD_MinBillPeriod.

   * @param In_PRRMD_MinCutOffDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRcRateBillMinGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRcRateBillMinGetOutputData billMinGet (String In_PRRMD_MinBillPeriod, Date In_PRRMD_MinCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return billMinGet (null, In_PRRMD_MinBillPeriod, In_PRRMD_MinCutOffDate, defaultAction, constraintAction);
  }
  /** 
   * Gets the bill cycle min date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MinBillPeriod.
   * @param In_PRRMD_MinCutOffDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRcRateBillMinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRcRateBillMinGetOutputData billMinGet (BSDMSessionContext context, String In_PRRMD_MinBillPeriod, Date In_PRRMD_MinCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return billMinGet (context, In_PRRMD_MinBillPeriod, In_PRRMD_MinCutOffDate);
  }

  /**

   * Gets the bill cycle max date for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_PRRMD_MaxBillPeriod.

   * @param In_PRRMD_MaxCutOffDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Date as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Date billMaxGet (String In_PRRMD_MaxBillPeriod, Date In_PRRMD_MaxCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return billMaxGet (null, In_PRRMD_MaxBillPeriod, In_PRRMD_MaxCutOffDate, defaultAction, constraintAction);
  }
  /** 
   * Gets the bill cycle max date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillPeriod.
   * @param In_PRRMD_MaxCutOffDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Date billMaxGet (BSDMSessionContext context, String In_PRRMD_MaxBillPeriod, Date In_PRRMD_MaxCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return billMaxGet (context, In_PRRMD_MaxBillPeriod, In_PRRMD_MaxCutOffDate);
  }

  /**

   * Gets the bill cycle max date (second version) for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_PRRMD_MaxBillTwo.

   * @param In_PRRMD_MaxCutTwoDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Date as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Date billMaxTwo (String In_PRRMD_MaxBillTwo, Date In_PRRMD_MaxCutTwoDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return billMaxTwo (null, In_PRRMD_MaxBillTwo, In_PRRMD_MaxCutTwoDate, defaultAction, constraintAction);
  }
  /** 
   * Gets the bill cycle max date (second version) for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillTwo.
   * @param In_PRRMD_MaxCutTwoDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Date billMaxTwo (BSDMSessionContext context, String In_PRRMD_MaxBillTwo, Date In_PRRMD_MaxCutTwoDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return billMaxTwo (context, In_PRRMD_MaxBillTwo, In_PRRMD_MaxCutTwoDate);
  }

  /**

   * Gets the bill cycle count for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_BILL_Bill_Period.

   * @param In_BILL_Bill_Thru_Dt.

   * @param In_BILL_RequestDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer billCountGet (String In_BILL_Bill_Period, Date In_BILL_Bill_Thru_Dt, Date In_BILL_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return billCountGet (null, In_BILL_Bill_Period, In_BILL_Bill_Thru_Dt, In_BILL_RequestDate, defaultAction, constraintAction);
  }
  /** 
   * Gets the bill cycle count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_BILL_Bill_Period.
   * @param In_BILL_Bill_Thru_Dt.
   * @param In_BILL_RequestDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer billCountGet (BSDMSessionContext context, String In_BILL_Bill_Period, Date In_BILL_Bill_Thru_Dt, Date In_BILL_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return billCountGet (context, In_BILL_Bill_Period, In_BILL_Bill_Thru_Dt, In_BILL_RequestDate);
  }

  /**

   * Gets the cmf count for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_CMF_Cnt_Account_No.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer cmfCountGet (Integer In_CMF_Cnt_Account_No, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return cmfCountGet (null, In_CMF_Cnt_Account_No, defaultAction, constraintAction);
  }
  /** 
   * Gets the cmf count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Cnt_Account_No.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer cmfCountGet (BSDMSessionContext context, Integer In_CMF_Cnt_Account_No, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column
return cmfCountGet (context, In_CMF_Cnt_Account_No);
  }

  /**

   * Gets the service count for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_CSC_Subscr_No.

   * @param In_CSC_Subscr_No_Resets.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer svCountGet (Integer In_CSC_Subscr_No, Integer In_CSC_Subscr_No_Resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return svCountGet (null, In_CSC_Subscr_No, In_CSC_Subscr_No_Resets, defaultAction, constraintAction);
  }
  /** 
   * Gets the service count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CSC_Subscr_No.
   * @param In_CSC_Subscr_No_Resets.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer svCountGet (BSDMSessionContext context, Integer In_CSC_Subscr_No, Integer In_CSC_Subscr_No_Resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return svCountGet (context, In_CSC_Subscr_No, In_CSC_Subscr_No_Resets);
  }

  /**

   * Gets the customer count for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_CCV_Tracking_Id.

   * @param In_CCV_Tracking_Id_Serv.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return Integer as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public Integer customerCount (Integer In_CCV_Tracking_Id, Integer In_CCV_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return customerCount (null, In_CCV_Tracking_Id, In_CCV_Tracking_Id_Serv, defaultAction, constraintAction);
  }
  /** 
   * Gets the customer count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCV_Tracking_Id.
   * @param In_CCV_Tracking_Id_Serv.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public Integer customerCount (BSDMSessionContext context, Integer In_CCV_Tracking_Id, Integer In_CCV_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return customerCount (context, In_CCV_Tracking_Id, In_CCV_Tracking_Id_Serv);
  }

  /**

   * Gets the CMF data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_CMF_Account_No.

   * @param In_CMF_Request_Date.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRcRateCmfDataGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRcRateCmfDataGetOutputData cmfDataGet (Integer In_CMF_Account_No, Date In_CMF_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return cmfDataGet (null, In_CMF_Account_No, In_CMF_Request_Date, defaultAction, constraintAction);
  }
  /** 
   * Gets the CMF data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Account_No.
   * @param In_CMF_Request_Date.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRcRateCmfDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRcRateCmfDataGetOutputData cmfDataGet (BSDMSessionContext context, Integer In_CMF_Account_No, Date In_CMF_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return cmfDataGet (context, In_CMF_Account_No, In_CMF_Request_Date);
  }

  /**

   * Gets the SERVICE data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_SERVICE_Subscr_No.

   * @param In_SERVICE_Subscr_No_Resets.

   * @param In_SERVICE_Request_Date.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PRRServiceDataObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PRRServiceDataObjectDataList serviceDataGet (Integer In_SERVICE_Subscr_No, Integer In_SERVICE_Subscr_No_Resets, Date In_SERVICE_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return serviceDataGet (null, In_SERVICE_Subscr_No, In_SERVICE_Subscr_No_Resets, In_SERVICE_Request_Date, defaultAction, constraintAction);
  }
  /** 
   * Gets the SERVICE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_SERVICE_Subscr_No.
   * @param In_SERVICE_Subscr_No_Resets.
   * @param In_SERVICE_Request_Date.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PRRServiceDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PRRServiceDataObjectDataList serviceDataGet (BSDMSessionContext context, Integer In_SERVICE_Subscr_No, Integer In_SERVICE_Subscr_No_Resets, Date In_SERVICE_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return serviceDataGet (context, In_SERVICE_Subscr_No, In_SERVICE_Subscr_No_Resets, In_SERVICE_Request_Date);
  }

  /**

   * Gets the RATE data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_RATE_CurrencyCode.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRcRateRateCrDataOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRcRateRateCrDataOutputData rateCrData (Integer In_RATE_CurrencyCode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return rateCrData (null, In_RATE_CurrencyCode, defaultAction, constraintAction);
  }
  /** 
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_RATE_CurrencyCode.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRcRateRateCrDataOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRcRateRateCrDataOutputData rateCrData (BSDMSessionContext context, Integer In_RATE_CurrencyCode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column
return rateCrData (context, In_RATE_CurrencyCode);
  }

  /**

   * Gets the DESCRIPTIONS data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_Desc_Acount_No.

   * @param In_Desc_Description_Code.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return String as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public String descrDataGet (Integer In_Desc_Acount_No, Integer In_Desc_Description_Code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return descrDataGet (null, In_Desc_Acount_No, In_Desc_Description_Code, defaultAction, constraintAction);
  }
  /** 
   * Gets the DESCRIPTIONS data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_Desc_Acount_No.
   * @param In_Desc_Description_Code.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public String descrDataGet (BSDMSessionContext context, Integer In_Desc_Acount_No, Integer In_Desc_Description_Code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return descrDataGet (context, In_Desc_Acount_No, In_Desc_Description_Code);
  }

  /**

   * Gets the Customer Contract data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param PRRContract_In Input  Object.

   * @param In_Contract_RequestDt.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PRRContractDataObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PRRContractDataObjectDataList customerDataGet (PRRContractDataObjectData PRRContract_In, Date In_Contract_RequestDt, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return customerDataGet (null, PRRContract_In, In_Contract_RequestDt, defaultAction, constraintAction);
  }
  /** 
   * Gets the Customer Contract data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRRContract_In Input  Object.
   * @param In_Contract_RequestDt.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PRRContractDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PRRContractDataObjectDataList customerDataGet (BSDMSessionContext context, PRRContractDataObjectData PRRContract_In, Date In_Contract_RequestDt, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
     dManager.setObjectDefaults(PRRContract_In, defaultAction);
       
    //Defaulting not supported on Input-Column

     cManager.checkConstraints(PRRContract_In, constraintAction);
       
    //Constraints not supported on Input-Column
return customerDataGet (context, PRRContract_In, In_Contract_RequestDt);
  }

  /**

   * Gets the CCK data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_CCK_Tracking_Id.

   * @param In_CCK_Tracking_Id_Serv.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductRcRateCkDataGetOutputData as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductRcRateCkDataGetOutputData ckDataGet (Integer In_CCK_Tracking_Id, BigInteger In_CCK_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return ckDataGet (null, In_CCK_Tracking_Id, In_CCK_Tracking_Id_Serv, defaultAction, constraintAction);
  }
  /** 
   * Gets the CCK data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCK_Tracking_Id.
   * @param In_CCK_Tracking_Id_Serv.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductRcRateCkDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductRcRateCkDataGetOutputData ckDataGet (BSDMSessionContext context, Integer In_CCK_Tracking_Id, BigInteger In_CCK_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column
return ckDataGet (context, In_CCK_Tracking_Id, In_CCK_Tracking_Id_Serv);
  }

  /**

   * Gets the RC data for the provided input fields..

   * Convenience method using default BSDMSessionContext.

   * @param In_PRRGRD_ElemId.

   * @param In_PRRGRD_TrackingId.

   * @param In_PRRGRD_TrackingIdServ.

   * @param In_PRRGRD_RequestDate.

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PRRRcDataObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PRRRcDataObjectDataList getRcData (Integer In_PRRGRD_ElemId, Integer In_PRRGRD_TrackingId, Integer In_PRRGRD_TrackingIdServ, Date In_PRRGRD_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return getRcData (null, In_PRRGRD_ElemId, In_PRRGRD_TrackingId, In_PRRGRD_TrackingIdServ, In_PRRGRD_RequestDate, defaultAction, constraintAction);
  }
  /** 
   * Gets the RC data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRGRD_ElemId.
   * @param In_PRRGRD_TrackingId.
   * @param In_PRRGRD_TrackingIdServ.
   * @param In_PRRGRD_RequestDate.
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PRRRcDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PRRRcDataObjectDataList getRcData (BSDMSessionContext context, Integer In_PRRGRD_ElemId, Integer In_PRRGRD_TrackingId, Integer In_PRRGRD_TrackingIdServ, Date In_PRRGRD_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
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
return getRcData (context, In_PRRGRD_ElemId, In_PRRGRD_TrackingId, In_PRRGRD_TrackingIdServ, In_PRRGRD_RequestDate);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ProductRcRateBean ()
  {
    try
    {
      _ProductRcRateNrcDescrGetSpec = new BSDMInteractionSpec("ProductRcRateNrcDescrGet", ApiMappings.getCallName ("ProductRcRateNrcDescrGet"), Boolean.TRUE);

      _ProductRcRateNrcDescrTwoSpec = new BSDMInteractionSpec("ProductRcRateNrcDescrTwo", ApiMappings.getCallName ("ProductRcRateNrcDescrTwo"), Boolean.TRUE);

      _ProductRcRateBillMinGetSpec = new BSDMInteractionSpec("ProductRcRateBillMinGet", ApiMappings.getCallName ("ProductRcRateBillMinGet"), Boolean.TRUE);

      _ProductRcRateBillMaxGetSpec = new BSDMInteractionSpec("ProductRcRateBillMaxGet", ApiMappings.getCallName ("ProductRcRateBillMaxGet"), Boolean.TRUE);

      _ProductRcRateBillMaxTwoSpec = new BSDMInteractionSpec("ProductRcRateBillMaxTwo", ApiMappings.getCallName ("ProductRcRateBillMaxTwo"), Boolean.TRUE);

      _ProductRcRateBillCountGetSpec = new BSDMInteractionSpec("ProductRcRateBillCountGet", ApiMappings.getCallName ("ProductRcRateBillCountGet"), Boolean.TRUE);

      _ProductRcRateCmfCountGetSpec = new BSDMInteractionSpec("ProductRcRateCmfCountGet", ApiMappings.getCallName ("ProductRcRateCmfCountGet"), Boolean.TRUE);

      _ProductRcRateSvCountGetSpec = new BSDMInteractionSpec("ProductRcRateSvCountGet", ApiMappings.getCallName ("ProductRcRateSvCountGet"), Boolean.TRUE);

      _ProductRcRateCustomerCountSpec = new BSDMInteractionSpec("ProductRcRateCustomerCount", ApiMappings.getCallName ("ProductRcRateCustomerCount"), Boolean.TRUE);

      _ProductRcRateCmfDataGetSpec = new BSDMInteractionSpec("ProductRcRateCmfDataGet", ApiMappings.getCallName ("ProductRcRateCmfDataGet"), Boolean.TRUE);

      _ProductRcRateServiceDataGetSpec = new BSDMInteractionSpec("ProductRcRateServiceDataGet", ApiMappings.getCallName ("ProductRcRateServiceDataGet"), Boolean.TRUE);

      _ProductRcRateRateCrDataSpec = new BSDMInteractionSpec("ProductRcRateRateCrData", ApiMappings.getCallName ("ProductRcRateRateCrData"), Boolean.TRUE);

      _ProductRcRateDescrDataGetSpec = new BSDMInteractionSpec("ProductRcRateDescrDataGet", ApiMappings.getCallName ("ProductRcRateDescrDataGet"), Boolean.TRUE);

      _ProductRcRateCustomerDataGetSpec = new BSDMInteractionSpec("ProductRcRateCustomerDataGet", ApiMappings.getCallName ("ProductRcRateCustomerDataGet"), Boolean.TRUE);

      _ProductRcRateCkDataGetSpec = new BSDMInteractionSpec("ProductRcRateCkDataGet", ApiMappings.getCallName ("ProductRcRateCkDataGet"), Boolean.TRUE);

      _ProductRcRateGetRcDataSpec = new BSDMInteractionSpec("ProductRcRateGetRcData", ApiMappings.getCallName ("ProductRcRateGetRcData"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ProductRcRateBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ProductRcRateBean(BSDMSettings settings, BSDMConnectionManager cm)
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
