
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface ProductRcRateInterface extends BaliInterface {

  /**
   * Gets the RATE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_NRC_Type_Id_Nrc.
   * @return ProductRcRateNrcDescrGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (Integer In_NRC_Type_Id_Nrc) throws BSDMResourceException;
  /**
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc.
   * @return ProductRcRateNrcDescrGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (BSDMSessionContext context, Integer In_NRC_Type_Id_Nrc) throws BSDMResourceException;


  /**
   * Gets the RATE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_NRC_Type_Id_Nrc.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateNrcDescrGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (Integer In_NRC_Type_Id_Nrc, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateNrcDescrGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRcRateNrcDescrGetOutputData nrcDescrGet (BSDMSessionContext context, Integer In_NRC_Type_Id_Nrc, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the NRC Descriptio Code for the type_id_nrc..
   * Convenience method using default BSDMSessionContext.
   * @param In_NRC_Type_Id_Nrc2.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer nrcDescrTwo (Integer In_NRC_Type_Id_Nrc2) throws BSDMResourceException;
  /**
   * Gets the NRC Descriptio Code for the type_id_nrc..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc2.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer nrcDescrTwo (BSDMSessionContext context, Integer In_NRC_Type_Id_Nrc2) throws BSDMResourceException;


  /**
   * Gets the NRC Descriptio Code for the type_id_nrc..
   * Convenience method using default BSDMSessionContext.
   * @param In_NRC_Type_Id_Nrc2.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer nrcDescrTwo (Integer In_NRC_Type_Id_Nrc2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the NRC Descriptio Code for the type_id_nrc..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_NRC_Type_Id_Nrc2.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer nrcDescrTwo (BSDMSessionContext context, Integer In_NRC_Type_Id_Nrc2, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the bill cycle min date for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MinBillPeriod.
   * @param In_PRRMD_MinCutOffDate.
   * @return ProductRcRateBillMinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateBillMinGetOutputData billMinGet (String In_PRRMD_MinBillPeriod, Date In_PRRMD_MinCutOffDate) throws BSDMResourceException;
  /**
   * Gets the bill cycle min date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MinBillPeriod.
   * @param In_PRRMD_MinCutOffDate.
   * @return ProductRcRateBillMinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateBillMinGetOutputData billMinGet (BSDMSessionContext context, String In_PRRMD_MinBillPeriod, Date In_PRRMD_MinCutOffDate) throws BSDMResourceException;


  /**
   * Gets the bill cycle min date for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MinBillPeriod.
   * @param In_PRRMD_MinCutOffDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateBillMinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRcRateBillMinGetOutputData billMinGet (String In_PRRMD_MinBillPeriod, Date In_PRRMD_MinCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the bill cycle min date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MinBillPeriod.
   * @param In_PRRMD_MinCutOffDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateBillMinGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRcRateBillMinGetOutputData billMinGet (BSDMSessionContext context, String In_PRRMD_MinBillPeriod, Date In_PRRMD_MinCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the bill cycle max date for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MaxBillPeriod.
   * @param In_PRRMD_MaxCutOffDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Date billMaxGet (String In_PRRMD_MaxBillPeriod, Date In_PRRMD_MaxCutOffDate) throws BSDMResourceException;
  /**
   * Gets the bill cycle max date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillPeriod.
   * @param In_PRRMD_MaxCutOffDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Date billMaxGet (BSDMSessionContext context, String In_PRRMD_MaxBillPeriod, Date In_PRRMD_MaxCutOffDate) throws BSDMResourceException;


  /**
   * Gets the bill cycle max date for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MaxBillPeriod.
   * @param In_PRRMD_MaxCutOffDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Date billMaxGet (String In_PRRMD_MaxBillPeriod, Date In_PRRMD_MaxCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the bill cycle max date for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillPeriod.
   * @param In_PRRMD_MaxCutOffDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Date billMaxGet (BSDMSessionContext context, String In_PRRMD_MaxBillPeriod, Date In_PRRMD_MaxCutOffDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the bill cycle max date (second version) for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MaxBillTwo.
   * @param In_PRRMD_MaxCutTwoDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Date billMaxTwo (String In_PRRMD_MaxBillTwo, Date In_PRRMD_MaxCutTwoDate) throws BSDMResourceException;
  /**
   * Gets the bill cycle max date (second version) for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillTwo.
   * @param In_PRRMD_MaxCutTwoDate.
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Date billMaxTwo (BSDMSessionContext context, String In_PRRMD_MaxBillTwo, Date In_PRRMD_MaxCutTwoDate) throws BSDMResourceException;


  /**
   * Gets the bill cycle max date (second version) for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRMD_MaxBillTwo.
   * @param In_PRRMD_MaxCutTwoDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Date billMaxTwo (String In_PRRMD_MaxBillTwo, Date In_PRRMD_MaxCutTwoDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the bill cycle max date (second version) for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRMD_MaxBillTwo.
   * @param In_PRRMD_MaxCutTwoDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Date as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Date billMaxTwo (BSDMSessionContext context, String In_PRRMD_MaxBillTwo, Date In_PRRMD_MaxCutTwoDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the bill cycle count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_BILL_Bill_Period.
   * @param In_BILL_Bill_Thru_Dt.
   * @param In_BILL_RequestDate.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer billCountGet (String In_BILL_Bill_Period, Date In_BILL_Bill_Thru_Dt, Date In_BILL_RequestDate) throws BSDMResourceException;
  /**
   * Gets the bill cycle count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_BILL_Bill_Period.
   * @param In_BILL_Bill_Thru_Dt.
   * @param In_BILL_RequestDate.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer billCountGet (BSDMSessionContext context, String In_BILL_Bill_Period, Date In_BILL_Bill_Thru_Dt, Date In_BILL_RequestDate) throws BSDMResourceException;


  /**
   * Gets the bill cycle count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_BILL_Bill_Period.
   * @param In_BILL_Bill_Thru_Dt.
   * @param In_BILL_RequestDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer billCountGet (String In_BILL_Bill_Period, Date In_BILL_Bill_Thru_Dt, Date In_BILL_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the bill cycle count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_BILL_Bill_Period.
   * @param In_BILL_Bill_Thru_Dt.
   * @param In_BILL_RequestDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer billCountGet (BSDMSessionContext context, String In_BILL_Bill_Period, Date In_BILL_Bill_Thru_Dt, Date In_BILL_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the cmf count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CMF_Cnt_Account_No.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer cmfCountGet (Integer In_CMF_Cnt_Account_No) throws BSDMResourceException;
  /**
   * Gets the cmf count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Cnt_Account_No.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer cmfCountGet (BSDMSessionContext context, Integer In_CMF_Cnt_Account_No) throws BSDMResourceException;


  /**
   * Gets the cmf count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CMF_Cnt_Account_No.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer cmfCountGet (Integer In_CMF_Cnt_Account_No, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the cmf count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Cnt_Account_No.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer cmfCountGet (BSDMSessionContext context, Integer In_CMF_Cnt_Account_No, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the service count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CSC_Subscr_No.
   * @param In_CSC_Subscr_No_Resets.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer svCountGet (Integer In_CSC_Subscr_No, Integer In_CSC_Subscr_No_Resets) throws BSDMResourceException;
  /**
   * Gets the service count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CSC_Subscr_No.
   * @param In_CSC_Subscr_No_Resets.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer svCountGet (BSDMSessionContext context, Integer In_CSC_Subscr_No, Integer In_CSC_Subscr_No_Resets) throws BSDMResourceException;


  /**
   * Gets the service count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CSC_Subscr_No.
   * @param In_CSC_Subscr_No_Resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer svCountGet (Integer In_CSC_Subscr_No, Integer In_CSC_Subscr_No_Resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the service count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CSC_Subscr_No.
   * @param In_CSC_Subscr_No_Resets.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer svCountGet (BSDMSessionContext context, Integer In_CSC_Subscr_No, Integer In_CSC_Subscr_No_Resets, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the customer count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CCV_Tracking_Id.
   * @param In_CCV_Tracking_Id_Serv.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer customerCount (Integer In_CCV_Tracking_Id, Integer In_CCV_Tracking_Id_Serv) throws BSDMResourceException;
  /**
   * Gets the customer count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCV_Tracking_Id.
   * @param In_CCV_Tracking_Id_Serv.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer customerCount (BSDMSessionContext context, Integer In_CCV_Tracking_Id, Integer In_CCV_Tracking_Id_Serv) throws BSDMResourceException;


  /**
   * Gets the customer count for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CCV_Tracking_Id.
   * @param In_CCV_Tracking_Id_Serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer customerCount (Integer In_CCV_Tracking_Id, Integer In_CCV_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the customer count for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCV_Tracking_Id.
   * @param In_CCV_Tracking_Id_Serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer customerCount (BSDMSessionContext context, Integer In_CCV_Tracking_Id, Integer In_CCV_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the CMF data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CMF_Account_No.
   * @param In_CMF_Request_Date.
   * @return ProductRcRateCmfDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateCmfDataGetOutputData cmfDataGet (Integer In_CMF_Account_No, Date In_CMF_Request_Date) throws BSDMResourceException;
  /**
   * Gets the CMF data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Account_No.
   * @param In_CMF_Request_Date.
   * @return ProductRcRateCmfDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateCmfDataGetOutputData cmfDataGet (BSDMSessionContext context, Integer In_CMF_Account_No, Date In_CMF_Request_Date) throws BSDMResourceException;


  /**
   * Gets the CMF data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CMF_Account_No.
   * @param In_CMF_Request_Date.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateCmfDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRcRateCmfDataGetOutputData cmfDataGet (Integer In_CMF_Account_No, Date In_CMF_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the CMF data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CMF_Account_No.
   * @param In_CMF_Request_Date.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateCmfDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRcRateCmfDataGetOutputData cmfDataGet (BSDMSessionContext context, Integer In_CMF_Account_No, Date In_CMF_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the SERVICE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_SERVICE_Subscr_No.
   * @param In_SERVICE_Subscr_No_Resets.
   * @param In_SERVICE_Request_Date.
   * @return PRRServiceDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PRRServiceDataObjectDataList serviceDataGet (Integer In_SERVICE_Subscr_No, Integer In_SERVICE_Subscr_No_Resets, Date In_SERVICE_Request_Date) throws BSDMResourceException;
  /**
   * Gets the SERVICE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_SERVICE_Subscr_No.
   * @param In_SERVICE_Subscr_No_Resets.
   * @param In_SERVICE_Request_Date.
   * @return PRRServiceDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PRRServiceDataObjectDataList serviceDataGet (BSDMSessionContext context, Integer In_SERVICE_Subscr_No, Integer In_SERVICE_Subscr_No_Resets, Date In_SERVICE_Request_Date) throws BSDMResourceException;


  /**
   * Gets the SERVICE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_SERVICE_Subscr_No.
   * @param In_SERVICE_Subscr_No_Resets.
   * @param In_SERVICE_Request_Date.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PRRServiceDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PRRServiceDataObjectDataList serviceDataGet (Integer In_SERVICE_Subscr_No, Integer In_SERVICE_Subscr_No_Resets, Date In_SERVICE_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the SERVICE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_SERVICE_Subscr_No.
   * @param In_SERVICE_Subscr_No_Resets.
   * @param In_SERVICE_Request_Date.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PRRServiceDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PRRServiceDataObjectDataList serviceDataGet (BSDMSessionContext context, Integer In_SERVICE_Subscr_No, Integer In_SERVICE_Subscr_No_Resets, Date In_SERVICE_Request_Date, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the RATE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_RATE_CurrencyCode.
   * @return ProductRcRateRateCrDataOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateRateCrDataOutputData rateCrData (Integer In_RATE_CurrencyCode) throws BSDMResourceException;
  /**
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_RATE_CurrencyCode.
   * @return ProductRcRateRateCrDataOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateRateCrDataOutputData rateCrData (BSDMSessionContext context, Integer In_RATE_CurrencyCode) throws BSDMResourceException;


  /**
   * Gets the RATE data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_RATE_CurrencyCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateRateCrDataOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRcRateRateCrDataOutputData rateCrData (Integer In_RATE_CurrencyCode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the RATE data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_RATE_CurrencyCode.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateRateCrDataOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRcRateRateCrDataOutputData rateCrData (BSDMSessionContext context, Integer In_RATE_CurrencyCode, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the DESCRIPTIONS data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_Desc_Acount_No.
   * @param In_Desc_Description_Code.
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public String descrDataGet (Integer In_Desc_Acount_No, Integer In_Desc_Description_Code) throws BSDMResourceException;
  /**
   * Gets the DESCRIPTIONS data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_Desc_Acount_No.
   * @param In_Desc_Description_Code.
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public String descrDataGet (BSDMSessionContext context, Integer In_Desc_Acount_No, Integer In_Desc_Description_Code) throws BSDMResourceException;


  /**
   * Gets the DESCRIPTIONS data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_Desc_Acount_No.
   * @param In_Desc_Description_Code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public String descrDataGet (Integer In_Desc_Acount_No, Integer In_Desc_Description_Code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the DESCRIPTIONS data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_Desc_Acount_No.
   * @param In_Desc_Description_Code.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return String as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public String descrDataGet (BSDMSessionContext context, Integer In_Desc_Acount_No, Integer In_Desc_Description_Code, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the Customer Contract data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param PRRContract_In Input  Object.
   * @param In_Contract_RequestDt.
   * @return PRRContractDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PRRContractDataObjectDataList customerDataGet (PRRContractDataObjectData PRRContract_In, Date In_Contract_RequestDt) throws BSDMResourceException;
  /**
   * Gets the Customer Contract data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRRContract_In Input  Object.
   * @param In_Contract_RequestDt.
   * @return PRRContractDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PRRContractDataObjectDataList customerDataGet (BSDMSessionContext context, PRRContractDataObjectData PRRContract_In, Date In_Contract_RequestDt) throws BSDMResourceException;


  /**
   * Gets the Customer Contract data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param PRRContract_In Input  Object.
   * @param In_Contract_RequestDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PRRContractDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PRRContractDataObjectDataList customerDataGet (PRRContractDataObjectData PRRContract_In, Date In_Contract_RequestDt, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the Customer Contract data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRRContract_In Input  Object.
   * @param In_Contract_RequestDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PRRContractDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PRRContractDataObjectDataList customerDataGet (BSDMSessionContext context, PRRContractDataObjectData PRRContract_In, Date In_Contract_RequestDt, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the CCK data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CCK_Tracking_Id.
   * @param In_CCK_Tracking_Id_Serv.
   * @return ProductRcRateCkDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateCkDataGetOutputData ckDataGet (Integer In_CCK_Tracking_Id, BigInteger In_CCK_Tracking_Id_Serv) throws BSDMResourceException;
  /**
   * Gets the CCK data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCK_Tracking_Id.
   * @param In_CCK_Tracking_Id_Serv.
   * @return ProductRcRateCkDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRcRateCkDataGetOutputData ckDataGet (BSDMSessionContext context, Integer In_CCK_Tracking_Id, BigInteger In_CCK_Tracking_Id_Serv) throws BSDMResourceException;


  /**
   * Gets the CCK data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_CCK_Tracking_Id.
   * @param In_CCK_Tracking_Id_Serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateCkDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRcRateCkDataGetOutputData ckDataGet (Integer In_CCK_Tracking_Id, BigInteger In_CCK_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the CCK data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_CCK_Tracking_Id.
   * @param In_CCK_Tracking_Id_Serv.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRcRateCkDataGetOutputData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRcRateCkDataGetOutputData ckDataGet (BSDMSessionContext context, Integer In_CCK_Tracking_Id, BigInteger In_CCK_Tracking_Id_Serv, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Gets the RC data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRGRD_ElemId.
   * @param In_PRRGRD_TrackingId.
   * @param In_PRRGRD_TrackingIdServ.
   * @param In_PRRGRD_RequestDate.
   * @return PRRRcDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PRRRcDataObjectDataList getRcData (Integer In_PRRGRD_ElemId, Integer In_PRRGRD_TrackingId, Integer In_PRRGRD_TrackingIdServ, Date In_PRRGRD_RequestDate) throws BSDMResourceException;
  /**
   * Gets the RC data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRGRD_ElemId.
   * @param In_PRRGRD_TrackingId.
   * @param In_PRRGRD_TrackingIdServ.
   * @param In_PRRGRD_RequestDate.
   * @return PRRRcDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public PRRRcDataObjectDataList getRcData (BSDMSessionContext context, Integer In_PRRGRD_ElemId, Integer In_PRRGRD_TrackingId, Integer In_PRRGRD_TrackingIdServ, Date In_PRRGRD_RequestDate) throws BSDMResourceException;


  /**
   * Gets the RC data for the provided input fields..
   * Convenience method using default BSDMSessionContext.
   * @param In_PRRGRD_ElemId.
   * @param In_PRRGRD_TrackingId.
   * @param In_PRRGRD_TrackingIdServ.
   * @param In_PRRGRD_RequestDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PRRRcDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PRRRcDataObjectDataList getRcData (Integer In_PRRGRD_ElemId, Integer In_PRRGRD_TrackingId, Integer In_PRRGRD_TrackingIdServ, Date In_PRRGRD_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Gets the RC data for the provided input fields..
   * @param context The session context to use when connecting to the APITS server.
   * @param In_PRRGRD_ElemId.
   * @param In_PRRGRD_TrackingId.
   * @param In_PRRGRD_TrackingIdServ.
   * @param In_PRRGRD_RequestDate.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PRRRcDataObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PRRRcDataObjectDataList getRcData (BSDMSessionContext context, Integer In_PRRGRD_ElemId, Integer In_PRRGRD_TrackingId, Integer In_PRRGRD_TrackingIdServ, Date In_PRRGRD_RequestDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
