/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BonusPointRateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BonusPointRateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BonusPointRateObjectData noOpIn;

/**
 *
 * Constructor to create a   BonusPointRateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BonusPointRateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointRateObjectData noOpInIn) {
    super(id, context, "BonusPointRateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(noOpIn, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }
/**
 *
 * Sets the  BonusPointRate
 * @param noOpInIn BonusPointRateObjectData to set
 *
 */
  public void setBonusPointRate(BonusPointRateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BonusPointRate passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointRateObjectData getBonusPointRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BonusPointRateObjectHelper.fromMap(inputMap, "BonusPointRate");
  }
}
