/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrRateTierFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrRateTierFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrRteTierObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrRateTierFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrRateTierFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRteTierObjectDataList noOpInIn) {
    super(id, context, "RbrRateTierFind");
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
        mapArray[i] = RbrRteTierObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrRateTier", noOpIn);
      }
      addInput("RbrRateTier", mapList);
    }
  }
/**
 *
 * Sets the  RbrRateTier
 * @param noOpInIn RbrRteTierObjectDataList to set
 *
 */
  public void setRbrRateTier(RbrRteTierObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrRateTier passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRteTierObjectDataList getRbrRateTier() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrRteTierObjectHelper.fromMapList(inputMap, "RbrRateTierList");
  }
}
