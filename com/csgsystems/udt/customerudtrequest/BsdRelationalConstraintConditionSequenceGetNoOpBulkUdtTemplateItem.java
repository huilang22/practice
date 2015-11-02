/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintConditionSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintConditionSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintConditionObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectKeyData noOpInIn) {
    super(id, context, "BsdRelationalConstraintConditionSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraintCondition
 * @param noOpInIn BsdRelationalConstraintConditionObjectKeyData to set
 *
 */
  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionObjectKeyData getBsdRelationalConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintConditionObjectKeyHelper.fromMap(inputMap, "BsdRelationalConstraintCondition");
  }
}
