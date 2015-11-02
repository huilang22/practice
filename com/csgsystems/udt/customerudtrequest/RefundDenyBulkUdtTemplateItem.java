/*
 * Generated code DO NOT EDIT
 * Generated file: RefundDenyBulkUdtTemplateItem.java
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
 * Class used to create a RefundDenyBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundDenyBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundObjectKeyData refundDenyIn;
  protected Integer TreasuryFlag;
/**
 *
 * Constructor to create a  RefundDenyBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundDenyBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectKeyData refundDenyInIn, Integer TreasuryFlagIn) {
    super(id, context, "RefundDeny");
    refundDenyIn = refundDenyInIn;
    TreasuryFlag = TreasuryFlagIn;
  }

  public void translateToMap() {
    if (refundDenyIn != null) {
      refundDenyIn.resetFlags(true, true);
      addInput("Refund", RefundObjectKeyHelper.toMap(refundDenyIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
    if (TreasuryFlag != null) {
      addInput("TreasuryFlag", TreasuryFlag);
    }
  }


/**
 *
 * Sets the Refund
 * @param refundDenyInIn Value of the refundDenyIn
 *
 */

  public void setRefund(RefundObjectKeyData refundDenyInIn) {
    refundDenyIn = refundDenyInIn;
  }

/**
 *
 * Sets the TreasuryFlag
 * @param TreasuryFlagIn Value of the TreasuryFlag
 *
 */

  public void setTreasuryFlag(Integer TreasuryFlagIn) {
    TreasuryFlag = TreasuryFlagIn;
  }

  public void translateFromMap() {
    refundDenyIn = RefundObjectKeyHelper.fromMap(inputMap, "Refund");
    TreasuryFlag = (Integer)inputMap.get("TreasuryFlag");
  }

/**
 *
 * Gets the Refund
 * @return Value of the Refund
 *
 */

  public RefundObjectKeyData getRefund( ) {
    return refundDenyIn;
  }

/**
 *
 * Gets the TreasuryFlag
 * @return Value of the TreasuryFlag
 *
 */

  public Integer getTreasuryFlag( ) {
    return TreasuryFlag;
  }

}
