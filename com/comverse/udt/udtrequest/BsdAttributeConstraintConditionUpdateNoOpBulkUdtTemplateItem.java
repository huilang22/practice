/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdAttributeConstraintConditionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintConditionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintConditionObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectData noOpInIn) {
    super(id, context, "BsdAttributeConstraintConditionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintCondition
 * @param noOpInIn BsdAttributeConstraintConditionObjectData to set
 *
 */
  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintConditionObjectHelper.fromMap(inputMap, "BsdAttributeConstraintCondition");
  }
}
