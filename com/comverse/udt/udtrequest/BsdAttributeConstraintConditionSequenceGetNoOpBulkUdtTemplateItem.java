/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintConditionSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintConditionSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintConditionObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectKeyData noOpInIn) {
    super(id, context, "BsdAttributeConstraintConditionSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintCondition
 * @param noOpInIn BsdAttributeConstraintConditionObjectKeyData to set
 *
 */
  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintConditionObjectKeyData getBsdAttributeConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintConditionObjectKeyHelper.fromMap(inputMap, "BsdAttributeConstraintCondition");
  }
}
