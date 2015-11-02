/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferBuyUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectData noOpInIn) {
    super(id, context, "CtcOfferBuyUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
/**
 *
 * Sets the  CtcOfferBuy
 * @param noOpInIn CtcOfferBuyObjectData to set
 *
 */
  public void setCtcOfferBuy(CtcOfferBuyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferBuy passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyObjectData getCtcOfferBuy() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferBuyObjectHelper.fromMap(inputMap, "CtcOfferBuy");
  }
}
