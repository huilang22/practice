/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionExpressionGrpUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionExpressionGrpUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondExprGrpObjBaseData noOpIn;

/**
 *
 * Constructor to create a   ConditionExpressionGrpUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionExpressionGrpUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprGrpObjBaseData noOpInIn) {
    super(id, context, "ConditionExpressionGrpUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(noOpIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
/**
 *
 * Sets the  ConditionExpressionGrp
 * @param noOpInIn CondExprGrpObjBaseData to set
 *
 */
  public void setConditionExpressionGrp(CondExprGrpObjBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionExpressionGrp passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprGrpObjBaseData getConditionExpressionGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondExprGrpObjBaseHelper.fromMap(inputMap, "ConditionExpressionGrp");
  }
}
