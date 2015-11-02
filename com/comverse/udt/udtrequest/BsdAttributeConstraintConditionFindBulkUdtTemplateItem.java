/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionFindBulkUdtTemplateItem.java
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
