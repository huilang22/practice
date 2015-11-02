/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionGrpGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionGrpGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionGrpGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondGrpObjData noOpIn;

/**
 *
 * Constructor to create a   ConditionGrpGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionGrpGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondGrpObjData noOpInIn) {
    super(id, context, "ConditionGrpGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ConditionGrp", CondGrpObjHelper.toMap(noOpIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
/**
 *
 * Sets the  ConditionGrp
 * @param noOpInIn CondGrpObjData to set
 *
 */
  public void setConditionGrp(CondGrpObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionGrp passed into the constructor
 * @return Simulated response
 *
 */
  public CondGrpObjData getConditionGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondGrpObjHelper.fromMap(inputMap, "ConditionGrp");
  }
}
