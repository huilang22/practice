/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExpressionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExpressionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExprObjData noOpIn;

/**
 *
 * Constructor to create a   ExpressionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExpressionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExprObjData noOpInIn) {
    super(id, context, "ExpressionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Expression", ExprObjHelper.toMap(noOpIn, new HashMap(), "Expression").get("Expression"));
    }
  }
/**
 *
 * Sets the  Expression
 * @param noOpInIn ExprObjData to set
 *
 */
  public void setExpression(ExprObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Expression passed into the constructor
 * @return Simulated response
 *
 */
  public ExprObjData getExpression() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExprObjHelper.fromMap(inputMap, "Expression");
  }
}
