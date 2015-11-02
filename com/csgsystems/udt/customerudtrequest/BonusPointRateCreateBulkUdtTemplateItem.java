/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointRateCreateBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointRateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointRateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointRateObjectData BPRCreateIn;
/**
 *
 * Constructor to create a  BonusPointRateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointRateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointRateObjectData BPRCreateInIn) {
    super(id, context, "BonusPointRateCreate");
    BPRCreateIn = BPRCreateInIn;
  }

  public void translateToMap() {
    if (BPRCreateIn != null) {
      BPRCreateIn.resetFlags(true, true);
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(BPRCreateIn, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }


/**
 *
 * Sets the BonusPointRate
 * @param BPRCreateInIn Value of the BPRCreateIn
 *
 */

  public void setBonusPointRate(BonusPointRateObjectData BPRCreateInIn) {
    BPRCreateIn = BPRCreateInIn;
  }

  public void translateFromMap() {
    BPRCreateIn = BonusPointRateObjectHelper.fromMap(inputMap, "BonusPointRate");
  }

/**
 *
 * Gets the BonusPointRate
 * @return Value of the BonusPointRate
 *
 */

  public BonusPointRateObjectData getBonusPointRate( ) {
    return BPRCreateIn;
  }

}
