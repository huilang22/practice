/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointRateGetBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointRateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointRateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointRateObjectKeyData BPRGetIn;
/**
 *
 * Constructor to create a  BonusPointRateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointRateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointRateObjectKeyData BPRGetInIn) {
    super(id, context, "BonusPointRateGet");
    BPRGetIn = BPRGetInIn;
  }

  public void translateToMap() {
    if (BPRGetIn != null) {
      BPRGetIn.resetFlags(true, true);
      addInput("BonusPointRate", BonusPointRateObjectKeyHelper.toMap(BPRGetIn, new HashMap(), "BonusPointRateObjectKeyData").get("BonusPointRateObjectKeyData"));
    }
  }


/**
 *
 * Sets the BonusPointRate
 * @param BPRGetInIn Value of the BPRGetIn
 *
 */

  public void setBonusPointRate(BonusPointRateObjectKeyData BPRGetInIn) {
    BPRGetIn = BPRGetInIn;
  }

  public void translateFromMap() {
    BPRGetIn = BonusPointRateObjectKeyHelper.fromMap(inputMap, "BonusPointRate");
  }

/**
 *
 * Gets the BonusPointRate
 * @return Value of the BonusPointRate
 *
 */

  public BonusPointRateObjectKeyData getBonusPointRate( ) {
    return BPRGetIn;
  }

}
