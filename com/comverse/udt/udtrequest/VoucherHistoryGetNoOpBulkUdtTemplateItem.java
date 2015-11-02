/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherHistoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherHistoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherHistoryObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherHistoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherHistoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherHistoryObjectData noOpInIn) {
    super(id, context, "VoucherHistoryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherHistory", VoucherHistoryObjectHelper.toMap(noOpIn, new HashMap(), "VoucherHistory").get("VoucherHistory"));
    }
  }
/**
 *
 * Sets the  VoucherHistory
 * @param noOpInIn VoucherHistoryObjectData to set
 *
 */
  public void setVoucherHistory(VoucherHistoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherHistory passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherHistoryObjectData getVoucherHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherHistoryObjectHelper.fromMap(inputMap, "VoucherHistory");
  }
}
