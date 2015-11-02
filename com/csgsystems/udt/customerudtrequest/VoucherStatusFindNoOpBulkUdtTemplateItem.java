/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusObjectDataList noOpInIn) {
    super(id, context, "VoucherStatusFind");
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
        mapArray[i] = VoucherStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherStatus", noOpIn);
      }
      addInput("VoucherStatus", mapList);
    }
  }
/**
 *
 * Sets the  VoucherStatus
 * @param noOpInIn VoucherStatusObjectDataList to set
 *
 */
  public void setVoucherStatus(VoucherStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherStatus passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusObjectDataList getVoucherStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherStatusObjectHelper.fromMapList(inputMap, "VoucherStatusList");
  }
}
