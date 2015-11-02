/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectData noOpInIn) {
    super(id, context, "CtcOfferUpdate");
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
