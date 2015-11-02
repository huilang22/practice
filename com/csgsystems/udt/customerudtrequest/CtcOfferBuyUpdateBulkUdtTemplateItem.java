/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcOfferBuyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectData UpdateInIn) {
    super(id, context, "CtcOfferBuyUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcOfferBuyObjectHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectData getCtcOfferBuy( ) {
    return UpdateIn;
  }

}
