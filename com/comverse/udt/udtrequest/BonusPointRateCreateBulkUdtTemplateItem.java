/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateCreateBulkUdtTemplateItem.java
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
