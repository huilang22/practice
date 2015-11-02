/*
 * Generated code DO NOT EDIT
 * Generated file: RefinancePlanFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RefinancePlanFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RefinancePlanFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RefinancePlanObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RefinancePlanFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RefinancePlanFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RefinancePlanObjectDataList noOpInIn) {
    super(id, context, "RefinancePlanFind");
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
        mapArray[i] = RefinancePlanObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RefinancePlan", noOpIn);
      }
      addInput("RefinancePlan", mapList);
    }
  }
/**
 *
 * Sets the  RefinancePlan
 * @param noOpInIn RefinancePlanObjectDataList to set
 *
 */
  public void setRefinancePlan(RefinancePlanObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RefinancePlan passed into the constructor
 * @return Simulated response
 *
 */
  public RefinancePlanObjectDataList getRefinancePlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RefinancePlanObjectHelper.fromMapList(inputMap, "RefinancePlanList");
  }
}
