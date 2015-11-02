/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferDetailGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferDetailGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferDetailGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferDetailGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferDetailGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferDetailObjectData noOpInIn) {
    super(id, context, "CtcOfferDetailGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferDetailObjectHelper.toMap(noOpIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
/**
 *
 * Sets the  CtcOffer
 * @param noOpInIn CtcOfferDetailObjectData to set
 *
 */
  public void setCtcOffer(CtcOfferDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOffer passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferDetailObjectData getCtcOffer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferDetailObjectHelper.fromMap(inputMap, "CtcOffer");
  }
}
