/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintConditionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintConditionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionGetIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintConditionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionGetInIn) {
    super(id, context, "BsdRelationalConstraintConditionGet");
    bsdRelationalConstraintConditionGetIn = bsdRelationalConstraintConditionGetInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintConditionGetIn != null) {
      bsdRelationalConstraintConditionGetIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(bsdRelationalConstraintConditionGetIn, new HashMap(), "BsdRelationalConstraintConditionObjectKeyData").get("BsdRelationalConstraintConditionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintCondition
 * @param bsdRelationalConstraintConditionGetInIn Value of the bsdRelationalConstraintConditionGetIn
 *
 */

  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionGetInIn) {
    bsdRelationalConstraintConditionGetIn = bsdRelationalConstraintConditionGetInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintConditionGetIn = BsdRelationalConstraintConditionObjectKeyHelper.fromMap(inputMap, "BsdRelationalConstraintCondition");
  }

/**
 *
 * Gets the BsdRelationalConstraintCondition
 * @return Value of the BsdRelationalConstraintCondition
 *
 */

  public BsdRelationalConstraintConditionObjectKeyData getBsdRelationalConstraintCondition( ) {
    return bsdRelationalConstraintConditionGetIn;
  }

}
