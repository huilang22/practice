/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyDetailUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyDetailUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectData UpdateDetailIn;
/**
 *
 * Constructor to create a  CtcOfferBuyDetailUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyDetailUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectData UpdateDetailInIn) {
    super(id, context, "CtcOfferBuyDetailUpdate");
    UpdateDetailIn = UpdateDetailInIn;
  }

  public void translateToMap() {
    if (UpdateDetailIn != null) {
      UpdateDetailIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(UpdateDetailIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param UpdateDetailInIn Value of the UpdateDetailIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectData UpdateDetailInIn) {
    UpdateDetailIn = UpdateDetailInIn;
  }

  public void translateFromMap() {
    UpdateDetailIn = CtcOfferBuyObjectHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectData getCtcOfferBuy( ) {
    return UpdateDetailIn;
  }

}
