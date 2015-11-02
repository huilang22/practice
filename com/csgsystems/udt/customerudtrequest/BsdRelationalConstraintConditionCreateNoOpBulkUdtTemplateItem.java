/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintConditionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintConditionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintConditionObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectData noOpInIn) {
    super(id, context, "BsdRelationalConstraintConditionCreate");
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
