/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherTypesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherTypesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherTypesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherTypesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VoucherTypesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherTypesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherTypesObjectDataList noOpInIn) {
    super(id, context, "VoucherTypesFind");
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
        mapArray[i] = VoucherTypesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherTypes", noOpIn);
      }
      addInput("VoucherTypes", mapList);
    }
  }
/**
 *
 * Sets the  VoucherTypes
 * @param noOpInIn VoucherTypesObjectDataList to set
 *
 */
  public void setVoucherTypes(VoucherTypesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherTypes passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherTypesObjectDataList getVoucherTypes() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherTypesObjectHelper.fromMapList(inputMap, "VoucherTypesList");
  }
}
