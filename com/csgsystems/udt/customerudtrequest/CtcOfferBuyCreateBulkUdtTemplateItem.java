/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcOfferBuyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectData CreateInIn) {
    super(id, context, "CtcOfferBuyCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcOfferBuyObjectHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectData getCtcOfferBuy( ) {
    return CreateIn;
  }

}
