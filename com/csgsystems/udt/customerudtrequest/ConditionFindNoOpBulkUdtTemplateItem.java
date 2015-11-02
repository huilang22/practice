/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ConditionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondObjDataList noOpIn;

/**
 *
 * Constructor to create a   ConditionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondObjDataList noOpInIn) {
    super(id, context, "ConditionFind");
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
        mapArray[i] = CondObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Condition", noOpIn);
      }
      addInput("Condition", mapList);
    }
  }
/**
 *
 * Sets the  Condition
 * @param noOpInIn CondObjDataList to set
 *
 */
  public void setCondition(CondObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Condition passed into the constructor
 * @return Simulated response
 *
 */
  public CondObjDataList getCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondObjHelper.fromMapList(inputMap, "ConditionList");
  }
}
