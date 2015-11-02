/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusInfoFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusInfoFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusInfoObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusInfoFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusInfoFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectDataList noOpInIn) {
    super(id, context, "VoucherStatusInfoFind");
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
        mapArray[i] = VoucherStatusInfoObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherStatusInfo", noOpIn);
      }
      addInput("VoucherStatusInfo", mapList);
    }
  }
/**
 *
 * Sets the  VoucherStatusInfo
 * @param noOpInIn VoucherStatusInfoObjectDataList to set
 *
 */
  public void setVoucherStatusInfo(VoucherStatusInfoObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherStatusInfo passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusInfoObjectDataList getVoucherStatusInfo() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherStatusInfoObjectHelper.fromMapList(inputMap, "VoucherStatusInfoList");
  }
}
