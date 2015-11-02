/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a DiscountTargetFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountTargetFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTObjectFilter DTFindIn;
/**
 *
 * Constructor to create a  DiscountTargetFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountTargetFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectFilter DTFindInIn) {
    super(id, context, "DiscountTargetFind");
    DTFindIn = DTFindInIn;
  }

  public void translateToMap() {
    if (DTFindIn != null) {
      Integer index =  DTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountTarget", DTObjectHelper.toMap(DTFindIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }


/**
 *
 * Sets the DiscountTarget
 * @param DTFindInIn Value of the DTFindIn
 *
 */

  public void setDiscountTarget(DTObjectFilter DTFindInIn) {
    DTFindIn = DTFindInIn;
  }

  public void translateFromMap() {
    DTFindIn = DTObjectHelper.fromMapFilter(inputMap, "DiscountTarget");
  }

/**
 *
 * Gets the DiscountTarget
 * @return Value of the DiscountTarget
 *
 */

  public DTObjectFilter getDiscountTarget( ) {
    return DTFindIn;
  }

}
