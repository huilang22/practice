/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyDetailUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferBuyDetailUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyDetailUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyDetailUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyDetailUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyDetailObjectData noOpInIn) {
    super(id, context, "CtcOfferBuyDetailUpdate");
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
