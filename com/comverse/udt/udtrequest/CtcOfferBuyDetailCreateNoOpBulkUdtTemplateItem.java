/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferBuyDetailCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferBuyDetailCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferBuyDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferBuyDetailCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferBuyDetailCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyDetailObjectData noOpInIn) {
    super(id, context, "CtcOfferBuyDetailCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CreateDetailOut", CtcOfferBuyDetailObjectHelper.toMap(noOpIn, new HashMap(), "CreateDetailOut").get("CreateDetailOut"));
    }
  }
/**
 *
 * Sets the  CreateDetailOut
 * @param noOpInIn CtcOfferBuyDetailObjectData to set
 *
 */
  public void setCreateDetailOut(CtcOfferBuyDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CreateDetailOut passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyDetailObjectData getCreateDetailOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferBuyDetailObjectHelper.fromMap(inputMap, "CreateDetailOut");
  }
}
