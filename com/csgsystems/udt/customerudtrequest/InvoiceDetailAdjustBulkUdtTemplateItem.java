/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailAdjustBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a InvoiceDetailAdjustBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailAdjustBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailObjectData InvoiceDetailAdjustIn;
  protected Integer TransCode;
  protected Integer AdjReasonCode;
  protected Integer RequestStatus;
  protected Integer FraudIndicator;
  protected String Annotation;
  protected Integer PrimaryUnitsType;
  protected BigInteger PrimaryUnits;
  protected BigInteger Amount;
  protected String BillOrderNumber;
  protected Date EffectiveDate;
/**
 *
 * Constructor to create a  InvoiceDetailAdjustBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailAdjustBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectData InvoiceDetailAdjustInIn, Integer TransCodeIn, Integer AdjReasonCodeIn, Integer RequestStatusIn, Integer FraudIndicatorIn, String AnnotationIn, Integer PrimaryUnitsTypeIn, BigInteger PrimaryUnitsIn, BigInteger AmountIn, String BillOrderNumberIn, Date EffectiveDateIn) {
    super(id, context, "InvoiceDetailAdjust");
    InvoiceDetailAdjustIn = InvoiceDetailAdjustInIn;
    TransCode = TransCodeIn;
    AdjReasonCode = AdjReasonCodeIn;
    RequestStatus = RequestStatusIn;
    FraudIndicator = FraudIndicatorIn;
    Annotation = AnnotationIn;
    PrimaryUnitsType = PrimaryUnitsTypeIn;
    PrimaryUnits = PrimaryUnitsIn;
    Amount = AmountIn;
    BillOrderNumber = BillOrderNumberIn;
    EffectiveDate = EffectiveDateIn;
  }

  public void translateToMap() {
    if (InvoiceDetailAdjustIn != null) {
      InvoiceDetailAdjustIn.resetFlags(true, true);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailAdjustIn, new HashMap(), "Adjustment").get("Adjustment"));
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
    if (EffectiveDate != null) {
      addInput("EffectiveDate", EffectiveDate);
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailAdjustInIn Value of the InvoiceDetailAdjustIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectData InvoiceDetailAdjustInIn) {
    InvoiceDetailAdjustIn = InvoiceDetailAdjustInIn;
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

/**
 *
 * Sets the EffectiveDate
 * @param EffectiveDateIn Value of the EffectiveDate
 *
 */

  public void setEffectiveDate(Date EffectiveDateIn) {
    EffectiveDate = EffectiveDateIn;
  }

  public void translateFromMap() {
    InvoiceDetailAdjustIn = InvoiceDetailObjectHelper.fromMap(inputMap, "InvoiceDetail");
    TransCode = (Integer)inputMap.get("TransCode");
    AdjReasonCode = (Integer)inputMap.get("AdjReasonCode");
    RequestStatus = (Integer)inputMap.get("RequestStatus");
    FraudIndicator = (Integer)inputMap.get("FraudIndicator");
    Annotation = (String)inputMap.get("Annotation");
    PrimaryUnitsType = (Integer)inputMap.get("PrimaryUnitsType");
    PrimaryUnits = (BigInteger)inputMap.get("PrimaryUnits");
    Amount = (BigInteger)inputMap.get("Amount");
    BillOrderNumber = (String)inputMap.get("BillOrderNumber");
    EffectiveDate = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectData getInvoiceDetail( ) {
    return InvoiceDetailAdjustIn;
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

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return EffectiveDate;
  }

}
