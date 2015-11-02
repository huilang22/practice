/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyDetailDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOfferBuyDetailDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyDetailDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyDetailDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyDetailDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyDetailObjectData noOpInIn) {
    super(id, context, "CtcOfferBuyDetailDelete");
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
