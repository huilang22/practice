/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintConditionGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintConditionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintConditionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionGetIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintConditionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionGetInIn) {
    super(id, context, "BsdAttributeConstraintConditionGet");
    bsdAttributeConstraintConditionGetIn = bsdAttributeConstraintConditionGetInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintConditionGetIn != null) {
      bsdAttributeConstraintConditionGetIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(bsdAttributeConstraintConditionGetIn, new HashMap(), "BsdAttributeConstraintConditionObjectKeyData").get("BsdAttributeConstraintConditionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintCondition
 * @param bsdAttributeConstraintConditionGetInIn Value of the bsdAttributeConstraintConditionGetIn
 *
 */

  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionGetInIn) {
    bsdAttributeConstraintConditionGetIn = bsdAttributeConstraintConditionGetInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintConditionGetIn = BsdAttributeConstraintConditionObjectKeyHelper.fromMap(inputMap, "BsdAttributeConstraintCondition");
  }

/**
 *
 * Gets the BsdAttributeConstraintCondition
 * @return Value of the BsdAttributeConstraintCondition
 *
 */

  public BsdAttributeConstraintConditionObjectKeyData getBsdAttributeConstraintCondition( ) {
    return bsdAttributeConstraintConditionGetIn;
  }

}
