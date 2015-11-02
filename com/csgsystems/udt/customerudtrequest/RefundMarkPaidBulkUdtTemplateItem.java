/*
 * Generated code DO NOT EDIT
 * Generated file: RefundMarkPaidBulkUdtTemplateItem.java
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
 * Class used to create a RefundMarkPaidBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundMarkPaidBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundObjectKeyData refundMarkIn;
  protected Date TreasuryDate;
  protected String CheckNum;
/**
 *
 * Constructor to create a  RefundMarkPaidBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundMarkPaidBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectKeyData refundMarkInIn, Date TreasuryDateIn, String CheckNumIn) {
    super(id, context, "RefundMarkPaid");
    refundMarkIn = refundMarkInIn;
    TreasuryDate = TreasuryDateIn;
    CheckNum = CheckNumIn;
  }

  public void translateToMap() {
    if (refundMarkIn != null) {
      refundMarkIn.resetFlags(true, true);
      addInput("Refund", RefundObjectKeyHelper.toMap(refundMarkIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
    if (TreasuryDate != null) {
      addInput("TreasuryDate", TreasuryDate);
    }
    if (CheckNum != null) {
      addInput("CheckNum", CheckNum);
    }
  }


/**
 *
 * Sets the Refund
 * @param refundMarkInIn Value of the refundMarkIn
 *
 */

  public void setRefund(RefundObjectKeyData refundMarkInIn) {
    refundMarkIn = refundMarkInIn;
  }

/**
 *
 * Sets the TreasuryDate
 * @param TreasuryDateIn Value of the TreasuryDate
 *
 */

  public void setTreasuryDate(Date TreasuryDateIn) {
    TreasuryDate = TreasuryDateIn;
  }

/**
 *
 * Sets the CheckNum
 * @param CheckNumIn Value of the CheckNum
 *
 */

  public void setCheckNum(String CheckNumIn) {
    CheckNum = CheckNumIn;
  }

  public void translateFromMap() {
    refundMarkIn = RefundObjectKeyHelper.fromMap(inputMap, "Refund");
    TreasuryDate = (Date)inputMap.get("TreasuryDate");
    CheckNum = (String)inputMap.get("CheckNum");
  }

/**
 *
 * Gets the Refund
 * @return Value of the Refund
 *
 */

  public RefundObjectKeyData getRefund( ) {
    return refundMarkIn;
  }

/**
 *
 * Gets the TreasuryDate
 * @return Value of the TreasuryDate
 *
 */

  public Date getTreasuryDate( ) {
    return TreasuryDate;
  }

/**
 *
 * Gets the CheckNum
 * @return Value of the CheckNum
 *
 */

  public String getCheckNum( ) {
    return CheckNum;
  }

}
