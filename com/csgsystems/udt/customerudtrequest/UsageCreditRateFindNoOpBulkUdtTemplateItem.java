/*
 * Generated code DO NOT EDIT
 * Generated file: UsageCreditRateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageCreditRateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageCreditRateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUCreditObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageCreditRateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageCreditRateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCreditObjectDataList noOpInIn) {
    super(id, context, "UsageCreditRateFind");
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
        mapArray[i] = RUCreditObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageCreditRate", noOpIn);
      }
      addInput("UsageCreditRate", mapList);
    }
  }
/**
 *
 * Sets the  UsageCreditRate
 * @param noOpInIn RUCreditObjectDataList to set
 *
 */
  public void setUsageCreditRate(RUCreditObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageCreditRate passed into the constructor
 * @return Simulated response
 *
 */
  public RUCreditObjectDataList getUsageCreditRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUCreditObjectHelper.fromMapList(inputMap, "UsageCreditRateList");
  }
}
