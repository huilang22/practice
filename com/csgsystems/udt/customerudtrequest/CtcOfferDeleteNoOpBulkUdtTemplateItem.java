/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectData noOpInIn) {
    super(id, context, "CtcOfferDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(noOpIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
/**
 *
 * Sets the  CtcOffer
 * @param noOpInIn CtcOfferObjectData to set
 *
 */
  public void setCtcOffer(CtcOfferObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOffer passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferObjectData getCtcOffer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferObjectHelper.fromMap(inputMap, "CtcOffer");
  }
}
