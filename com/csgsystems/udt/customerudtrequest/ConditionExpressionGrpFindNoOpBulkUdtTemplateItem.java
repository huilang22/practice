/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGrpFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionExpressionGrpFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionExpressionGrpFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondExprGrpObjDataList noOpIn;

/**
 *
 * Constructor to create a   ConditionExpressionGrpFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionExpressionGrpFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprGrpObjDataList noOpInIn) {
    super(id, context, "ConditionExpressionGrpFind");
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
        mapArray[i] = CondExprGrpObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConditionExpressionGrp", noOpIn);
      }
      addInput("ConditionExpressionGrp", mapList);
    }
  }
/**
 *
 * Sets the  ConditionExpressionGrp
 * @param noOpInIn CondExprGrpObjDataList to set
 *
 */
  public void setConditionExpressionGrp(CondExprGrpObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionExpressionGrp passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprGrpObjDataList getConditionExpressionGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondExprGrpObjHelper.fromMapList(inputMap, "ConditionExpressionGrpList");
  }
}
