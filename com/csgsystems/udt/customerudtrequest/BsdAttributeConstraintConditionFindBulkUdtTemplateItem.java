/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintConditionFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintConditionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintConditionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintConditionObjectFilter bsdAttributeConstraintConditionFindIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintConditionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectFilter bsdAttributeConstraintConditionFindInIn) {
    super(id, context, "BsdAttributeConstraintConditionFind");
    bsdAttributeConstraintConditionFindIn = bsdAttributeConstraintConditionFindInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintConditionFindIn != null) {
      Integer index =  bsdAttributeConstraintConditionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(bsdAttributeConstraintConditionFindIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintCondition
 * @param bsdAttributeConstraintConditionFindInIn Value of the bsdAttributeConstraintConditionFindIn
 *
 */

  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectFilter bsdAttributeConstraintConditionFindInIn) {
    bsdAttributeConstraintConditionFindIn = bsdAttributeConstraintConditionFindInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintConditionFindIn = BsdAttributeConstraintConditionObjectHelper.fromMapFilter(inputMap, "BsdAttributeConstraintCondition");
  }

/**
 *
 * Gets the BsdAttributeConstraintCondition
 * @return Value of the BsdAttributeConstraintCondition
 *
 */

  public BsdAttributeConstraintConditionObjectFilter getBsdAttributeConstraintCondition( ) {
    return bsdAttributeConstraintConditionFindIn;
  }

}
