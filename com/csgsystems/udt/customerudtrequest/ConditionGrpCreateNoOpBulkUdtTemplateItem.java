/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionGrpCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionGrpCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionGrpCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondGrpObjBaseData noOpIn;

/**
 *
 * Constructor to create a   ConditionGrpCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionGrpCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondGrpObjBaseData noOpInIn) {
    super(id, context, "ConditionGrpCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ConditionGrp", CondGrpObjBaseHelper.toMap(noOpIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
/**
 *
 * Sets the  ConditionGrp
 * @param noOpInIn CondGrpObjBaseData to set
 *
 */
  public void setConditionGrp(CondGrpObjBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionGrp passed into the constructor
 * @return Simulated response
 *
 */
  public CondGrpObjBaseData getConditionGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondGrpObjBaseHelper.fromMap(inputMap, "ConditionGrp");
  }
}
