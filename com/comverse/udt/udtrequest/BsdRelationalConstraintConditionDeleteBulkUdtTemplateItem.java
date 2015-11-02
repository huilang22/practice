/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintConditionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintConditionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionDeleteIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintConditionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionDeleteInIn) {
    super(id, context, "BsdRelationalConstraintConditionDelete");
    bsdRelationalConstraintConditionDeleteIn = bsdRelationalConstraintConditionDeleteInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintConditionDeleteIn != null) {
      bsdRelationalConstraintConditionDeleteIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(bsdRelationalConstraintConditionDeleteIn, new HashMap(), "BsdRelationalConstraintConditionObjectKeyData").get("BsdRelationalConstraintConditionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintCondition
 * @param bsdRelationalConstraintConditionDeleteInIn Value of the bsdRelationalConstraintConditionDeleteIn
 *
 */

  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionDeleteInIn) {
    bsdRelationalConstraintConditionDeleteIn = bsdRelationalConstraintConditionDeleteInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintConditionDeleteIn = BsdRelationalConstraintConditionObjectKeyHelper.fromMap(inputMap, "BsdRelationalConstraintCondition");
  }

/**
 *
 * Gets the BsdRelationalConstraintCondition
 * @return Value of the BsdRelationalConstraintCondition
 *
 */

  public BsdRelationalConstraintConditionObjectKeyData getBsdRelationalConstraintCondition( ) {
    return bsdRelationalConstraintConditionDeleteIn;
  }

}
