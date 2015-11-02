/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintConditionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintConditionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintConditionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionDeleteIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintConditionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionDeleteInIn) {
    super(id, context, "BsdAttributeConstraintConditionDelete");
    bsdAttributeConstraintConditionDeleteIn = bsdAttributeConstraintConditionDeleteInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintConditionDeleteIn != null) {
      bsdAttributeConstraintConditionDeleteIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(bsdAttributeConstraintConditionDeleteIn, new HashMap(), "BsdAttributeConstraintConditionObjectKeyData").get("BsdAttributeConstraintConditionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintCondition
 * @param bsdAttributeConstraintConditionDeleteInIn Value of the bsdAttributeConstraintConditionDeleteIn
 *
 */

  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionDeleteInIn) {
    bsdAttributeConstraintConditionDeleteIn = bsdAttributeConstraintConditionDeleteInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintConditionDeleteIn = BsdAttributeConstraintConditionObjectKeyHelper.fromMap(inputMap, "BsdAttributeConstraintCondition");
  }

/**
 *
 * Gets the BsdAttributeConstraintCondition
 * @return Value of the BsdAttributeConstraintCondition
 *
 */

  public BsdAttributeConstraintConditionObjectKeyData getBsdAttributeConstraintCondition( ) {
    return bsdAttributeConstraintConditionDeleteIn;
  }

}
