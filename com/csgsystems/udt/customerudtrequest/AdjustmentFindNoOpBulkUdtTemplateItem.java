/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdjustmentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectDataList noOpInIn) {
    super(id, context, "AdjustmentFind");
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
        mapArray[i] = AdjustmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Adjustment", noOpIn);
      }
      addInput("Adjustment", mapList);
    }
  }
/**
 *
 * Sets the  Adjustment
 * @param noOpInIn AdjustmentObjectDataList to set
 *
 */
  public void setAdjustment(AdjustmentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Adjustment passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentObjectDataList getAdjustment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentObjectHelper.fromMapList(inputMap, "AdjustmentList");
  }
}
