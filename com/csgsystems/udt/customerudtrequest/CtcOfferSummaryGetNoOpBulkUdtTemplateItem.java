/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferSummaryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferSummaryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferSummaryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferSummaryObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferSummaryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferSummaryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferSummaryObjectData noOpInIn) {
    super(id, context, "CtcOfferSummaryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferSummaryObjectHelper.toMap(noOpIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
/**
 *
 * Sets the  CtcOffer
 * @param noOpInIn CtcOfferSummaryObjectData to set
 *
 */
  public void setCtcOffer(CtcOfferSummaryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOffer passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferSummaryObjectData getCtcOffer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferSummaryObjectHelper.fromMap(inputMap, "CtcOffer");
  }
}
