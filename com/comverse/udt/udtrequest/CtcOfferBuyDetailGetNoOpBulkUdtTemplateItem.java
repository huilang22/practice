/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOfferBuyDetailGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyDetailGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyDetailGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyDetailGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyDetailObjectData noOpInIn) {
    super(id, context, "CtcOfferBuyDetailGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyDetailObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
/**
 *
 * Sets the  CtcOfferBuy
 * @param noOpInIn CtcOfferBuyDetailObjectData to set
 *
 */
  public void setCtcOfferBuy(CtcOfferBuyDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferBuy passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyDetailObjectData getCtcOfferBuy() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferBuyDetailObjectHelper.fromMap(inputMap, "CtcOfferBuy");
  }
}
