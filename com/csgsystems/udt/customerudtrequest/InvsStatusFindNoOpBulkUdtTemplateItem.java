/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStatusFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStatusObjectDataList noOpInIn) {
    super(id, context, "InvsStatusFind");
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
        mapArray[i] = InvsStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsStatus", noOpIn);
      }
      addInput("InvsStatus", mapList);
    }
  }
/**
 *
 * Sets the  InvsStatus
 * @param noOpInIn InvsStatusObjectDataList to set
 *
 */
  public void setInvsStatus(InvsStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsStatus passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStatusObjectDataList getInvsStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsStatusObjectHelper.fromMapList(inputMap, "InvsStatusList");
  }
}
