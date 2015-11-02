/*
 * Generated code DO NOT EDIT
 * Generated file: LateFeeRateOverridesGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a LateFeeRateOverridesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LateFeeRateOverridesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LateFeeRateOverridesObjectKeyData LFROgIn;
/**
 *
 * Constructor to create a  LateFeeRateOverridesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LateFeeRateOverridesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROgInIn) {
    super(id, context, "LateFeeRateOverridesGet");
    LFROgIn = LFROgInIn;
  }

  public void translateToMap() {
    if (LFROgIn != null) {
      LFROgIn.resetFlags(true, true);
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectKeyHelper.toMap(LFROgIn, new HashMap(), "LateFeeRateOverridesObjectKeyData").get("LateFeeRateOverridesObjectKeyData"));
    }
  }


/**
 *
 * Sets the LateFeeRateOverrides
 * @param LFROgInIn Value of the LFROgIn
 *
 */

  public void setLateFeeRateOverrides(LateFeeRateOverridesObjectKeyData LFROgInIn) {
    LFROgIn = LFROgInIn;
  }

  public void translateFromMap() {
    LFROgIn = LateFeeRateOverridesObjectKeyHelper.fromMap(inputMap, "LateFeeRateOverrides");
  }

/**
 *
 * Gets the LateFeeRateOverrides
 * @return Value of the LateFeeRateOverrides
 *
 */

  public LateFeeRateOverridesObjectKeyData getLateFeeRateOverrides( ) {
    return LFROgIn;
  }

}
