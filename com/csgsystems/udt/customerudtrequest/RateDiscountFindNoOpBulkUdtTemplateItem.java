/*
 * Generated code DO NOT EDIT
 * Generated file: RateDiscountFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateDiscountFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateDiscountFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateDiscountObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateDiscountFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateDiscountFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectDataList noOpInIn) {
    super(id, context, "RateDiscountFind");
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
        mapArray[i] = RateDiscountObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateDiscount", noOpIn);
      }
      addInput("RateDiscount", mapList);
    }
  }
/**
 *
 * Sets the  RateDiscount
 * @param noOpInIn RateDiscountObjectDataList to set
 *
 */
  public void setRateDiscount(RateDiscountObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateDiscount passed into the constructor
 * @return Simulated response
 *
 */
  public RateDiscountObjectDataList getRateDiscount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateDiscountObjectHelper.fromMapList(inputMap, "RateDiscountList");
  }
}
