/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyMethodDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferBuyMethodDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyMethodDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyMethodObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyMethodDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyMethodDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyMethodObjectData noOpInIn) {
    super(id, context, "CtcOfferBuyMethodDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }
/**
 *
 * Sets the  CtcOfferBuyMethod
 * @param noOpInIn CtcOfferBuyMethodObjectData to set
 *
 */
  public void setCtcOfferBuyMethod(CtcOfferBuyMethodObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferBuyMethod passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyMethodObjectData getCtcOfferBuyMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferBuyMethodObjectHelper.fromMap(inputMap, "CtcOfferBuyMethod");
  }
}
