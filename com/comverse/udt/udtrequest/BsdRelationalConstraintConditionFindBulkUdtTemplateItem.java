/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalConstraintConditionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalConstraintConditionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalConstraintConditionObjectFilter bsdRelationalConstraintConditionFindIn;
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalConstraintConditionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectFilter bsdRelationalConstraintConditionFindInIn) {
    super(id, context, "BsdRelationalConstraintConditionFind");
    bsdRelationalConstraintConditionFindIn = bsdRelationalConstraintConditionFindInIn;
  }

  public void translateToMap() {
    if (bsdRelationalConstraintConditionFindIn != null) {
      Integer index =  bsdRelationalConstraintConditionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(bsdRelationalConstraintConditionFindIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }


/**
 *
 * Sets the BsdRelationalConstraintCondition
 * @param bsdRelationalConstraintConditionFindInIn Value of the bsdRelationalConstraintConditionFindIn
 *
 */

  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectFilter bsdRelationalConstraintConditionFindInIn) {
    bsdRelationalConstraintConditionFindIn = bsdRelationalConstraintConditionFindInIn;
  }

  public void translateFromMap() {
    bsdRelationalConstraintConditionFindIn = BsdRelationalConstraintConditionObjectHelper.fromMapFilter(inputMap, "BsdRelationalConstraintCondition");
  }

/**
 *
 * Gets the BsdRelationalConstraintCondition
 * @return Value of the BsdRelationalConstraintCondition
 *
 */

  public BsdRelationalConstraintConditionObjectFilter getBsdRelationalConstraintCondition( ) {
    return bsdRelationalConstraintConditionFindIn;
  }

}
