/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyGetBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrRateLimitKeyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitKeyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysGetIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitKeyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysGetInIn) {
    super(id, context, "UnitCrRateLimitKeyGet");
    UnitCrRateLimitKeysGetIn = UnitCrRateLimitKeysGetInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitKeysGetIn != null) {
      UnitCrRateLimitKeysGetIn.resetFlags(true, true);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectKeyHelper.toMap(UnitCrRateLimitKeysGetIn, new HashMap(), "UnitCrRateLimitKeysObjectKeyData").get("UnitCrRateLimitKeysObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimitKey
 * @param UnitCrRateLimitKeysGetInIn Value of the UnitCrRateLimitKeysGetIn
 *
 */

  public void setUnitCrRateLimitKey(UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysGetInIn) {
    UnitCrRateLimitKeysGetIn = UnitCrRateLimitKeysGetInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitKeysGetIn = UnitCrRateLimitKeysObjectKeyHelper.fromMap(inputMap, "UnitCrRateLimitKey");
  }

/**
 *
 * Gets the UnitCrRateLimitKey
 * @return Value of the UnitCrRateLimitKey
 *
 */

  public UnitCrRateLimitKeysObjectKeyData getUnitCrRateLimitKey( ) {
    return UnitCrRateLimitKeysGetIn;
  }

}
