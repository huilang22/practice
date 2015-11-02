/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageAdjustBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a BilledUsageAdjustBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageAdjustBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectData BilledUsageAdjustIn;
  protected Integer TransCode;
  protected Integer AdjReasonCode;
  protected Integer RequestStatus;
  protected Integer FraudIndicator;
  protected String Annotation;
  protected Integer PrimaryUnitsType;
  protected BigInteger PrimaryUnits;
  protected BigInteger Amount;
  protected String BillOrderNumber;
/**
 *
 * Constructor to create a  BilledUsageAdjustBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageAdjustBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectData BilledUsageAdjustInIn, Integer TransCodeIn, Integer AdjReasonCodeIn, Integer RequestStatusIn, Integer FraudIndicatorIn, String AnnotationIn, Integer PrimaryUnitsTypeIn, BigInteger PrimaryUnitsIn, BigInteger AmountIn, String BillOrderNumberIn) {
    super(id, context, "BilledUsageAdjust");
    BilledUsageAdjustIn = BilledUsageAdjustInIn;
    TransCode = TransCodeIn;
    AdjReasonCode = AdjReasonCodeIn;
    RequestStatus = RequestStatusIn;
    FraudIndicator = FraudIndicatorIn;
    Annotation = AnnotationIn;
    PrimaryUnitsType = PrimaryUnitsTypeIn;
    PrimaryUnits = PrimaryUnitsIn;
    Amount = AmountIn;
    BillOrderNumber = BillOrderNumberIn;
  }

  public void translateToMap() {
    if (BilledUsageAdjustIn != null) {
      BilledUsageAdjustIn.resetFlags(true, true);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsageAdjustIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
    if (TransCode != null) {
      addInput("TransCode", TransCode);
    }
    if (AdjReasonCode != null) {
      addInput("AdjReasonCode", AdjReasonCode);
    }
    if (RequestStatus != null) {
      addInput("RequestStatus", RequestStatus);
    }
    if (FraudIndicator != null) {
      addInput("FraudIndicator", FraudIndicator);
    }
    if (Annotation != null) {
      addInput("Annotation", Annotation);
    }
    if (PrimaryUnitsType != null) {
      addInput("PrimaryUnitsType", PrimaryUnitsType);
    }
    if (PrimaryUnits != null) {
      addInput("PrimaryUnits", PrimaryUnits);
    }
    if (Amount != null) {
      addInput("Amount", Amount);
    }
    if (BillOrderNumber != null) {
      addInput("BillOrderNumber", BillOrderNumber);
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsageAdjustInIn Value of the BilledUsageAdjustIn
 *
 */

  public void setBilledUsage(BilledUsageObjectData BilledUsageAdjustInIn) {
    BilledUsageAdjustIn = BilledUsageAdjustInIn;
  }

/**
 *
 * Sets the TransCode
 * @param TransCodeIn Value of the TransCode
 *
 */

  public void setTransCode(Integer TransCodeIn) {
    TransCode = TransCodeIn;
  }

/**
 *
 * Sets the AdjReasonCode
 * @param AdjReasonCodeIn Value of the AdjReasonCode
 *
 */

  public void setAdjReasonCode(Integer AdjReasonCodeIn) {
    AdjReasonCode = AdjReasonCodeIn;
  }

/**
 *
 * Sets the RequestStatus
 * @param RequestStatusIn Value of the RequestStatus
 *
 */

  public void setRequestStatus(Integer RequestStatusIn) {
    RequestStatus = RequestStatusIn;
  }

/**
 *
 * Sets the FraudIndicator
 * @param FraudIndicatorIn Value of the FraudIndicator
 *
 */

  public void setFraudIndicator(Integer FraudIndicatorIn) {
    FraudIndicator = FraudIndicatorIn;
  }

/**
 *
 * Sets the Annotation
 * @param AnnotationIn Value of the Annotation
 *
 */

  public void setAnnotation(String AnnotationIn) {
    Annotation = AnnotationIn;
  }

/**
 *
 * Sets the PrimaryUnitsType
 * @param PrimaryUnitsTypeIn Value of the PrimaryUnitsType
 *
 */

  public void setPrimaryUnitsType(Integer PrimaryUnitsTypeIn) {
    PrimaryUnitsType = PrimaryUnitsTypeIn;
  }

/**
 *
 * Sets the PrimaryUnits
 * @param PrimaryUnitsIn Value of the PrimaryUnits
 *
 */

  public void setPrimaryUnits(BigInteger PrimaryUnitsIn) {
    PrimaryUnits = PrimaryUnitsIn;
  }

/**
 *
 * Sets the Amount
 * @param AmountIn Value of the Amount
 *
 */

  public void setAmount(BigInteger AmountIn) {
    Amount = AmountIn;
  }

/**
 *
 * Sets the BillOrderNumber
 * @param BillOrderNumberIn Value of the BillOrderNumber
 *
 */

  public void setBillOrderNumber(String BillOrderNumberIn) {
    BillOrderNumber = BillOrderNumberIn;
  }

  public void translateFromMap() {
    BilledUsageAdjustIn = BilledUsageObjectHelper.fromMap(inputMap, "BilledUsage");
    TransCode = (Integer)inputMap.get("TransCode");
    AdjReasonCode = (Integer)inputMap.get("AdjReasonCode");
    RequestStatus = (Integer)inputMap.get("RequestStatus");
    FraudIndicator = (Integer)inputMap.get("FraudIndicator");
    Annotation = (String)inputMap.get("Annotation");
    PrimaryUnitsType = (Integer)inputMap.get("PrimaryUnitsType");
    PrimaryUnits = (BigInteger)inputMap.get("PrimaryUnits");
    Amount = (BigInteger)inputMap.get("Amount");
    BillOrderNumber = (String)inputMap.get("BillOrderNumber");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectData getBilledUsage( ) {
    return BilledUsageAdjustIn;
  }

/**
 *
 * Gets the TransCode
 * @return Value of the TransCode
 *
 */

  public Integer getTransCode( ) {
    return TransCode;
  }

/**
 *
 * Gets the AdjReasonCode
 * @return Value of the AdjReasonCode
 *
 */

  public Integer getAdjReasonCode( ) {
    return AdjReasonCode;
  }

/**
 *
 * Gets the RequestStatus
 * @return Value of the RequestStatus
 *
 */

  public Integer getRequestStatus( ) {
    return RequestStatus;
  }

/**
 *
 * Gets the FraudIndicator
 * @return Value of the FraudIndicator
 *
 */

  public Integer getFraudIndicator( ) {
    return FraudIndicator;
  }

/**
 *
 * Gets the Annotation
 * @return Value of the Annotation
 *
 */

  public String getAnnotation( ) {
    return Annotation;
  }

/**
 *
 * Gets the PrimaryUnitsType
 * @return Value of the PrimaryUnitsType
 *
 */

  public Integer getPrimaryUnitsType( ) {
    return PrimaryUnitsType;
  }

/**
 *
 * Gets the PrimaryUnits
 * @return Value of the PrimaryUnits
 *
 */

  public BigInteger getPrimaryUnits( ) {
    return PrimaryUnits;
  }

/**
 *
 * Gets the Amount
 * @return Value of the Amount
 *
 */

  public BigInteger getAmount( ) {
    return Amount;
  }

/**
 *
 * Gets the BillOrderNumber
 * @return Value of the BillOrderNumber
 *
 */

  public String getBillOrderNumber( ) {
    return BillOrderNumber;
  }

}
