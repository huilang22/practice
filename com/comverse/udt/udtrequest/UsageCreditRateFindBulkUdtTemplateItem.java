/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageCreditRateFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageCreditRateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageCreditRateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCreditObjectFilter RUCFindIn;
/**
 *
 * Constructor to create a  UsageCreditRateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageCreditRateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCreditObjectFilter RUCFindInIn) {
    super(id, context, "UsageCreditRateFind");
    RUCFindIn = RUCFindInIn;
  }

  public void translateToMap() {
    if (RUCFindIn != null) {
      Integer index =  RUCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageCreditRate", RUCreditObjectHelper.toMap(RUCFindIn, new HashMap(), "UsageCreditRate").get("UsageCreditRate"));
    }
  }


/**
 *
 * Sets the UsageCreditRate
 * @param RUCFindInIn Value of the RUCFindIn
 *
 */

  public void setUsageCreditRate(RUCreditObjectFilter RUCFindInIn) {
    RUCFindIn = RUCFindInIn;
  }

  public void translateFromMap() {
    RUCFindIn = RUCreditObjectHelper.fromMapFilter(inputMap, "UsageCreditRate");
  }

/**
 *
 * Gets the UsageCreditRate
 * @return Value of the UsageCreditRate
 *
 */

  public RUCreditObjectFilter getUsageCreditRate( ) {
    return RUCFindIn;
  }

}
