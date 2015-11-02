/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitKeyDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a UnitCrRateLimitKeyDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrRateLimitKeyDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysDeleteIn;
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrRateLimitKeyDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysDeleteInIn) {
    super(id, context, "UnitCrRateLimitKeyDelete");
    UnitCrRateLimitKeysDeleteIn = UnitCrRateLimitKeysDeleteInIn;
  }

  public void translateToMap() {
    if (UnitCrRateLimitKeysDeleteIn != null) {
      UnitCrRateLimitKeysDeleteIn.resetFlags(true, true);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectKeyHelper.toMap(UnitCrRateLimitKeysDeleteIn, new HashMap(), "UnitCrRateLimitKeysObjectKeyData").get("UnitCrRateLimitKeysObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitCrRateLimitKey
 * @param UnitCrRateLimitKeysDeleteInIn Value of the UnitCrRateLimitKeysDeleteIn
 *
 */

  public void setUnitCrRateLimitKey(UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysDeleteInIn) {
    UnitCrRateLimitKeysDeleteIn = UnitCrRateLimitKeysDeleteInIn;
  }

  public void translateFromMap() {
    UnitCrRateLimitKeysDeleteIn = UnitCrRateLimitKeysObjectKeyHelper.fromMap(inputMap, "UnitCrRateLimitKey");
  }

/**
 *
 * Gets the UnitCrRateLimitKey
 * @return Value of the UnitCrRateLimitKey
 *
 */

  public UnitCrRateLimitKeysObjectKeyData getUnitCrRateLimitKey( ) {
    return UnitCrRateLimitKeysDeleteIn;
  }

}
