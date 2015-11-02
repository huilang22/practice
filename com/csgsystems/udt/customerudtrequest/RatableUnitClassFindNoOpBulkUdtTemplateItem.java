/*
 * Generated code DO NOT EDIT
 * Generated file: RatableUnitClassFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatableUnitClassFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatableUnitClassFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RatableUnitClassFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatableUnitClassFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCObjectDataList noOpInIn) {
    super(id, context, "RatableUnitClassFind");
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
        mapArray[i] = RUCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RatableUnitClass", noOpIn);
      }
      addInput("RatableUnitClass", mapList);
    }
  }
/**
 *
 * Sets the  RatableUnitClass
 * @param noOpInIn RUCObjectDataList to set
 *
 */
  public void setRatableUnitClass(RUCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatableUnitClass passed into the constructor
 * @return Simulated response
 *
 */
  public RUCObjectDataList getRatableUnitClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUCObjectHelper.fromMapList(inputMap, "RatableUnitClassList");
  }
}
