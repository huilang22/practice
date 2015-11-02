/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a OverrideDiscountRateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideDiscountRateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RDOverrideObjectFilter RDOFindIn;
/**
 *
 * Constructor to create a  OverrideDiscountRateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideDiscountRateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RDOverrideObjectFilter RDOFindInIn) {
    super(id, context, "OverrideDiscountRateFind");
    RDOFindIn = RDOFindInIn;
  }

  public void translateToMap() {
    if (RDOFindIn != null) {
      Integer index =  RDOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(RDOFindIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }


/**
 *
 * Sets the OverrideDiscountRate
 * @param RDOFindInIn Value of the RDOFindIn
 *
 */

  public void setOverrideDiscountRate(RDOverrideObjectFilter RDOFindInIn) {
    RDOFindIn = RDOFindInIn;
  }

  public void translateFromMap() {
    RDOFindIn = RDOverrideObjectHelper.fromMapFilter(inputMap, "OverrideDiscountRate");
  }

/**
 *
 * Gets the OverrideDiscountRate
 * @return Value of the OverrideDiscountRate
 *
 */

  public RDOverrideObjectFilter getOverrideDiscountRate( ) {
    return RDOFindIn;
  }

}
