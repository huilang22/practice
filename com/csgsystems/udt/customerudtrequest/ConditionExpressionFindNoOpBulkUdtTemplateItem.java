/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionExpressionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionExpressionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondExprObjDataList noOpIn;

/**
 *
 * Constructor to create a   ConditionExpressionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionExpressionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprObjDataList noOpInIn) {
    super(id, context, "ConditionExpressionFind");
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
        mapArray[i] = CondExprObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConditionExpression", noOpIn);
      }
      addInput("ConditionExpression", mapList);
    }
  }
/**
 *
 * Sets the  ConditionExpression
 * @param noOpInIn CondExprObjDataList to set
 *
 */
  public void setConditionExpression(CondExprObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionExpression passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprObjDataList getConditionExpression() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondExprObjHelper.fromMapList(inputMap, "ConditionExpressionList");
  }
}
