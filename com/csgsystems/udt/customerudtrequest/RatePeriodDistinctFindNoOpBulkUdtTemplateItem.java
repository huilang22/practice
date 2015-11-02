/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodDistinctFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RatePeriodDistinctFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodDistinctFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RatePeriodDistinctObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RatePeriodDistinctFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodDistinctFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodDistinctObjectDataList noOpInIn) {
    super(id, context, "RatePeriodDistinctFind");
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
        mapArray[i] = RatePeriodDistinctObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatePeriodDistinct", noOpIn);
      }
      addInput("RatePeriodDistinct", mapList);
    }
  }
/**
 *
 * Sets the  RatePeriodDistinct
 * @param noOpInIn RatePeriodDistinctObjectDataList to set
 *
 */
  public void setRatePeriodDistinct(RatePeriodDistinctObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriodDistinct passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodDistinctObjectDataList getRatePeriodDistinct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RatePeriodDistinctObjectHelper.fromMapList(inputMap, "RatePeriodDistinctList");
  }
}
