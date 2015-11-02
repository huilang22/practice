/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusMovementFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherStatusMovementFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherStatusMovementFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherStatusMovementObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VoucherStatusMovementFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherStatusMovementFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusMovementObjectDataList noOpInIn) {
    super(id, context, "VoucherStatusMovementFind");
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
        mapArray[i] = VoucherStatusMovementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherStatusMovement", noOpIn);
      }
      addInput("VoucherStatusMovement", mapList);
    }
  }
/**
 *
 * Sets the  VoucherStatusMovement
 * @param noOpInIn VoucherStatusMovementObjectDataList to set
 *
 */
  public void setVoucherStatusMovement(VoucherStatusMovementObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherStatusMovement passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherStatusMovementObjectDataList getVoucherStatusMovement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherStatusMovementObjectHelper.fromMapList(inputMap, "VoucherStatusMovementList");
  }
}
