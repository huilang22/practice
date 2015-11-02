/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintConditionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintConditionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionCreateIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintConditionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionCreateInIn) {
    super(id, context, "BsdRelationalConstraintConditionCreate");
    bsdRelationalConstraintConditionCreateIn = bsdRelationalConstraintConditionCreateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintConditionCreateIn != null) {
      bsdRelationalConstraintConditionCreateIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(bsdRelationalConstraintConditionCreateIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintCondition
 * @param bsdRelationalConstraintConditionCreateInIn Value of the bsdRelationalConstraintConditionCreateIn
 *
 */

  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionCreateInIn) {
    bsdRelationalConstraintConditionCreateIn = bsdRelationalConstraintConditionCreateInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintConditionCreateIn = BsdRelationalConstraintConditionObjectHelper.fromMap(inputMap, "BsdRelationalConstraintCondition");
  }

/**
 *
 * Gets the BsdRelationalConstraintCondition
 * @return Value of the BsdRelationalConstraintCondition
 *
 */

  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintCondition( ) {
    return bsdRelationalConstraintConditionCreateIn;
  }

}
