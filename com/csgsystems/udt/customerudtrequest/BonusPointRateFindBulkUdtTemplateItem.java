/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointRateFindBulkUdtTemplateItem.java
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
 * Class used to create a BonusPointRateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BonusPointRateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BonusPointRateObjectFilter BPRFindIn;
/**
 *
 * Constructor to create a  BonusPointRateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BonusPointRateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointRateObjectFilter BPRFindInIn) {
    super(id, context, "BonusPointRateFind");
    BPRFindIn = BPRFindInIn;
  }

  public void translateToMap() {
    if (BPRFindIn != null) {
      Integer index =  BPRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(BPRFindIn, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }


/**
 *
 * Sets the BonusPointRate
 * @param BPRFindInIn Value of the BPRFindIn
 *
 */

  public void setBonusPointRate(BonusPointRateObjectFilter BPRFindInIn) {
    BPRFindIn = BPRFindInIn;
  }

  public void translateFromMap() {
    BPRFindIn = BonusPointRateObjectHelper.fromMapFilter(inputMap, "BonusPointRate");
  }

/**
 *
 * Gets the BonusPointRate
 * @return Value of the BonusPointRate
 *
 */

  public BonusPointRateObjectFilter getBonusPointRate( ) {
    return BPRFindIn;
  }

}
