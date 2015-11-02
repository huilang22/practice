/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherHistoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherHistoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherHistoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VoucherHistoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherHistoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherHistoryObjectDataList noOpInIn) {
    super(id, context, "VoucherHistoryFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = VoucherHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherHistory", noOpIn);
      }
      addInput("VoucherHistory", mapList);
    }
  }
/**
 *
 * Sets the  VoucherHistory
 * @param noOpInIn VoucherHistoryObjectDataList to set
 *
 */
  public void setVoucherHistory(VoucherHistoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherHistory passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherHistoryObjectDataList getVoucherHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherHistoryObjectHelper.fromMapList(inputMap, "VoucherHistoryList");
  }
}
