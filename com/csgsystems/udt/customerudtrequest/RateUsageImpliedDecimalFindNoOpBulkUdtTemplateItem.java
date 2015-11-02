/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageImpliedDecimalFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUsageImpliedDecimalFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUsageImpliedDecimalFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUsageImpliedDecimalObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateUsageImpliedDecimalFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUsageImpliedDecimalFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageImpliedDecimalObjectDataList noOpInIn) {
    super(id, context, "RateUsageImpliedDecimalFind");
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
        mapArray[i] = RateUsageImpliedDecimalObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateUsageImpliedDecimal", noOpIn);
      }
      addInput("RateUsageImpliedDecimal", mapList);
    }
  }
/**
 *
 * Sets the  RateUsageImpliedDecimal
 * @param noOpInIn RateUsageImpliedDecimalObjectDataList to set
 *
 */
  public void setRateUsageImpliedDecimal(RateUsageImpliedDecimalObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUsageImpliedDecimal passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageImpliedDecimalObjectDataList getRateUsageImpliedDecimal() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUsageImpliedDecimalObjectHelper.fromMapList(inputMap, "RateUsageImpliedDecimalList");
  }
}
