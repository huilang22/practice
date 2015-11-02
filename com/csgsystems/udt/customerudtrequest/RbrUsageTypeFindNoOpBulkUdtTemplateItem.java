/*
 * Generated code DO NOT EDIT
 * Generated file: RbrUsageTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrUsageTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrUsageTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrUsageTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrUsageTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrUsageTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrUsageTypeObjectDataList noOpInIn) {
    super(id, context, "RbrUsageTypeFind");
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
        mapArray[i] = RbrUsageTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrUsageType", noOpIn);
      }
      addInput("RbrUsageType", mapList);
    }
  }
/**
 *
 * Sets the  RbrUsageType
 * @param noOpInIn RbrUsageTypeObjectDataList to set
 *
 */
  public void setRbrUsageType(RbrUsageTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrUsageType passed into the constructor
 * @return Simulated response
 *
 */
  public RbrUsageTypeObjectDataList getRbrUsageType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrUsageTypeObjectHelper.fromMapList(inputMap, "RbrUsageTypeList");
  }
}
