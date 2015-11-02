/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RPObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RatePeriodFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectDataList noOpInIn) {
    super(id, context, "RatePeriodFind");
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
        mapArray[i] = RPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatePeriod", noOpIn);
      }
      addInput("RatePeriod", mapList);
    }
  }
/**
 *
 * Sets the  RatePeriod
 * @param noOpInIn RPObjectDataList to set
 *
 */
  public void setRatePeriod(RPObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriod passed into the constructor
 * @return Simulated response
 *
 */
  public RPObjectDataList getRatePeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RPObjectHelper.fromMapList(inputMap, "RatePeriodList");
  }
}
