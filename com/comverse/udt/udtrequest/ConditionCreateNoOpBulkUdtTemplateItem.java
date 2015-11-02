/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondObjData noOpIn;

/**
 *
 * Constructor to create a   ConditionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondObjData noOpInIn) {
    super(id, context, "ConditionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Condition", CondObjHelper.toMap(noOpIn, new HashMap(), "Condition").get("Condition"));
    }
  }
/**
 *
 * Sets the  Condition
 * @param noOpInIn CondObjData to set
 *
 */
  public void setCondition(CondObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Condition passed into the constructor
 * @return Simulated response
 *
 */
  public CondObjData getCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondObjHelper.fromMap(inputMap, "Condition");
  }
}
