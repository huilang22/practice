/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionExpressionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionExpressionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondExprObjData noOpIn;

/**
 *
 * Constructor to create a   ConditionExpressionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionExpressionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprObjData noOpInIn) {
    super(id, context, "ConditionExpressionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ConditionExpression", CondExprObjHelper.toMap(noOpIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }
/**
 *
 * Sets the  ConditionExpression
 * @param noOpInIn CondExprObjData to set
 *
 */
  public void setConditionExpression(CondExprObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionExpression passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprObjData getConditionExpression() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondExprObjHelper.fromMap(inputMap, "ConditionExpression");
  }
}
