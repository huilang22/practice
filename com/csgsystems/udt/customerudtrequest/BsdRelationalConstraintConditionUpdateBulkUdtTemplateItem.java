/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintConditionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintConditionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionUpdateIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintConditionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionUpdateInIn) {
    super(id, context, "BsdRelationalConstraintConditionUpdate");
    bsdRelationalConstraintConditionUpdateIn = bsdRelationalConstraintConditionUpdateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintConditionUpdateIn != null) {
      bsdRelationalConstraintConditionUpdateIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(bsdRelationalConstraintConditionUpdateIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintCondition
 * @param bsdRelationalConstraintConditionUpdateInIn Value of the bsdRelationalConstraintConditionUpdateIn
 *
 */

  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionUpdateInIn) {
    bsdRelationalConstraintConditionUpdateIn = bsdRelationalConstraintConditionUpdateInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintConditionUpdateIn = BsdRelationalConstraintConditionObjectHelper.fromMap(inputMap, "BsdRelationalConstraintCondition");
  }

/**
 *
 * Gets the BsdRelationalConstraintCondition
 * @return Value of the BsdRelationalConstraintCondition
 *
 */

  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintCondition( ) {
    return bsdRelationalConstraintConditionUpdateIn;
  }

}
