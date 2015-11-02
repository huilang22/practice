/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherHistoryGetBulkUdtTemplateItem.java
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
 * Class used to create a VoucherHistoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherHistoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherHistoryObjectKeyData VouGIn;
/**
 *
 * Constructor to create a  VoucherHistoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherHistoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherHistoryObjectKeyData VouGInIn) {
    super(id, context, "VoucherHistoryGet");
    VouGIn = VouGInIn;
  }

  public void translateToMap() {
    if (VouGIn != null) {
      VouGIn.resetFlags(true, true);
      addInput("VoucherHistory", VoucherHistoryObjectKeyHelper.toMap(VouGIn, new HashMap(), "VoucherHistoryObjectKeyData").get("VoucherHistoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the VoucherHistory
 * @param VouGInIn Value of the VouGIn
 *
 */

  public void setVoucherHistory(VoucherHistoryObjectKeyData VouGInIn) {
    VouGIn = VouGInIn;
  }

  public void translateFromMap() {
    VouGIn = VoucherHistoryObjectKeyHelper.fromMap(inputMap, "VoucherHistory");
  }

/**
 *
 * Gets the VoucherHistory
 * @return Value of the VoucherHistory
 *
 */

  public VoucherHistoryObjectKeyData getVoucherHistory( ) {
    return VouGIn;
  }

}
