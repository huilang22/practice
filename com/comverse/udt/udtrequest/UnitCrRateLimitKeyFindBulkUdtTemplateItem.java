/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyFindBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitKeyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitKeyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitKeysObjectFilter UnitCrRateLimitKeysFindIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitKeyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitKeysObjectFilter UnitCrRateLimitKeysFindInIn) {
    super(id, context, "UnitCrRateLimitKeyFind");
    UnitCrRateLimitKeysFindIn = UnitCrRateLimitKeysFindInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitKeysFindIn != null) {
      Integer index =  UnitCrRateLimitKeysFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(UnitCrRateLimitKeysFindIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimitKey
 * @param UnitCrRateLimitKeysFindInIn Value of the UnitCrRateLimitKeysFindIn
 *
 */

  public void setUnitCrRateLimitKey(UnitCrRateLimitKeysObjectFilter UnitCrRateLimitKeysFindInIn) {
    UnitCrRateLimitKeysFindIn = UnitCrRateLimitKeysFindInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitKeysFindIn = UnitCrRateLimitKeysObjectHelper.fromMapFilter(inputMap, "UnitCrRateLimitKey");
  }

/**
 *
 * Gets the UnitCrRateLimitKey
 * @return Value of the UnitCrRateLimitKey
 *
 */

  public UnitCrRateLimitKeysObjectFilter getUnitCrRateLimitKey( ) {
    return UnitCrRateLimitKeysFindIn;
  }

}
