/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrRateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrRateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrRatesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrRateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrRateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectDataList noOpInIn) {
    super(id, context, "RbrRateFind");
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
        mapArray[i] = RbrRatesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrRate", noOpIn);
      }
      addInput("RbrRate", mapList);
    }
  }
/**
 *
 * Sets the  RbrRate
 * @param noOpInIn RbrRatesObjectDataList to set
 *
 */
  public void setRbrRate(RbrRatesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrRate passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRatesObjectDataList getRbrRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrRatesObjectHelper.fromMapList(inputMap, "RbrRateList");
  }
}
