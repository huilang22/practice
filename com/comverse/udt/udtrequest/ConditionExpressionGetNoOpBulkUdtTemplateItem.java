/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGetNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a ConditionExpressionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionExpressionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondExprObjData noOpIn;

/**
 *
 * Constructor to create a   ConditionExpressionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionExpressionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprObjData noOpInIn) {
    super(id, context, "ConditionExpressionGet");
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
