/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdRelationalConstraintConditionDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintConditionDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintConditionObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectData noOpInIn) {
    super(id, context, "BsdRelationalConstraintConditionDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraintCondition
 * @param noOpInIn BsdRelationalConstraintConditionObjectData to set
 *
 */
  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintConditionObjectHelper.fromMap(inputMap, "BsdRelationalConstraintCondition");
  }
}
