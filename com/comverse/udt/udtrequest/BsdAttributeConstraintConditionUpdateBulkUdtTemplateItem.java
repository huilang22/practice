/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintConditionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintConditionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionUpdateIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintConditionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionUpdateInIn) {
    super(id, context, "BsdAttributeConstraintConditionUpdate");
    bsdAttributeConstraintConditionUpdateIn = bsdAttributeConstraintConditionUpdateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintConditionUpdateIn != null) {
      bsdAttributeConstraintConditionUpdateIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(bsdAttributeConstraintConditionUpdateIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintCondition
 * @param bsdAttributeConstraintConditionUpdateInIn Value of the bsdAttributeConstraintConditionUpdateIn
 *
 */

  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionUpdateInIn) {
    bsdAttributeConstraintConditionUpdateIn = bsdAttributeConstraintConditionUpdateInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintConditionUpdateIn = BsdAttributeConstraintConditionObjectHelper.fromMap(inputMap, "BsdAttributeConstraintCondition");
  }

/**
 *
 * Gets the BsdAttributeConstraintCondition
 * @return Value of the BsdAttributeConstraintCondition
 *
 */

  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintCondition( ) {
    return bsdAttributeConstraintConditionUpdateIn;
  }

}
