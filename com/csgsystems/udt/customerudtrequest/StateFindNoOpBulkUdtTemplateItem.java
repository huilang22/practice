/*
 * Generated code DO NOT EDIT
 * Generated file: StateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   StateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectDataList noOpInIn) {
    super(id, context, "StateFind");
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
        mapArray[i] = StateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("State", noOpIn);
      }
      addInput("State", mapList);
    }
  }
/**
 *
 * Sets the  State
 * @param noOpInIn StateObjectDataList to set
 *
 */
  public void setState(StateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the State passed into the constructor
 * @return Simulated response
 *
 */
  public StateObjectDataList getState() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StateObjectHelper.fromMapList(inputMap, "StateList");
  }
}
