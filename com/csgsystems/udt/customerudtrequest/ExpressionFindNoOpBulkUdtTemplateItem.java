/*
 * Generated code DO NOT EDIT
 * Generated file: ExpressionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExpressionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExpressionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExprObjDataList noOpIn;

/**
 *
 * Constructor to create a   ExpressionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExpressionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExprObjDataList noOpInIn) {
    super(id, context, "ExpressionFind");
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
        mapArray[i] = ExprObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Expression", noOpIn);
      }
      addInput("Expression", mapList);
    }
  }
/**
 *
 * Sets the  Expression
 * @param noOpInIn ExprObjDataList to set
 *
 */
  public void setExpression(ExprObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Expression passed into the constructor
 * @return Simulated response
 *
 */
  public ExprObjDataList getExpression() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExprObjHelper.fromMapList(inputMap, "ExpressionList");
  }
}
