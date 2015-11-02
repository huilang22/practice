/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionUpdateBulkUdtTemplateItem.java
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
