/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeConstraintConditionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeConstraintConditionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionCreateIn;
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeConstraintConditionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionCreateInIn) {
    super(id, context, "BsdAttributeConstraintConditionCreate");
    bsdAttributeConstraintConditionCreateIn = bsdAttributeConstraintConditionCreateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeConstraintConditionCreateIn != null) {
      bsdAttributeConstraintConditionCreateIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(bsdAttributeConstraintConditionCreateIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }


/**
 *
 * Sets the BsdAttributeConstraintCondition
 * @param bsdAttributeConstraintConditionCreateInIn Value of the bsdAttributeConstraintConditionCreateIn
 *
 */

  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionCreateInIn) {
    bsdAttributeConstraintConditionCreateIn = bsdAttributeConstraintConditionCreateInIn;
  }

  public void translateFromMap() {
    bsdAttributeConstraintConditionCreateIn = BsdAttributeConstraintConditionObjectHelper.fromMap(inputMap, "BsdAttributeConstraintCondition");
  }

/**
 *
 * Gets the BsdAttributeConstraintCondition
 * @return Value of the BsdAttributeConstraintCondition
 *
 */

  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintCondition( ) {
    return bsdAttributeConstraintConditionCreateIn;
  }

}
