/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyCreateBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitKeyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitKeyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyCreateIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitKeyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyCreateInIn) {
    super(id, context, "UnitCrRateLimitKeyCreate");
    UnitCrRateLimitKeyCreateIn = UnitCrRateLimitKeyCreateInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitKeyCreateIn != null) {
      UnitCrRateLimitKeyCreateIn.resetFlags(true, true);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(UnitCrRateLimitKeyCreateIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimitKey
 * @param UnitCrRateLimitKeyCreateInIn Value of the UnitCrRateLimitKeyCreateIn
 *
 */

  public void setUnitCrRateLimitKey(UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyCreateInIn) {
    UnitCrRateLimitKeyCreateIn = UnitCrRateLimitKeyCreateInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitKeyCreateIn = UnitCrRateLimitKeysObjectHelper.fromMap(inputMap, "UnitCrRateLimitKey");
  }

/**
 *
 * Gets the UnitCrRateLimitKey
 * @return Value of the UnitCrRateLimitKey
 *
 */

  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKey( ) {
    return UnitCrRateLimitKeyCreateIn;
  }

}
