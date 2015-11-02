/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionExpressionGrpGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionExpressionGrpGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondExprGrpObjData noOpIn;

/**
 *
 * Constructor to create a   ConditionExpressionGrpGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionExpressionGrpGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprGrpObjData noOpInIn) {
    super(id, context, "ConditionExpressionGrpGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ConditionExpressionGrp", CondExprGrpObjHelper.toMap(noOpIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
/**
 *
 * Sets the  ConditionExpressionGrp
 * @param noOpInIn CondExprGrpObjData to set
 *
 */
  public void setConditionExpressionGrp(CondExprGrpObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionExpressionGrp passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprGrpObjData getConditionExpressionGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondExprGrpObjHelper.fromMap(inputMap, "ConditionExpressionGrp");
  }
}
