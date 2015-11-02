/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountTargetFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountTargetFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountTargetFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DTObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DiscountTargetFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountTargetFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectDataList noOpInIn) {
    super(id, context, "DiscountTargetFind");
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
        mapArray[i] = DTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountTarget", noOpIn);
      }
      addInput("DiscountTarget", mapList);
    }
  }
/**
 *
 * Sets the  DiscountTarget
 * @param noOpInIn DTObjectDataList to set
 *
 */
  public void setDiscountTarget(DTObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountTarget passed into the constructor
 * @return Simulated response
 *
 */
  public DTObjectDataList getDiscountTarget() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DTObjectHelper.fromMapList(inputMap, "DiscountTargetList");
  }
}
