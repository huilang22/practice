/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyMethodCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyMethodCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyMethodCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyMethodObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcOfferBuyMethodCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyMethodCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyMethodObjectData CreateInIn) {
    super(id, context, "CtcOfferBuyMethodCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }


/**
 *
 * Sets the CtcOfferBuyMethod
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcOfferBuyMethod(CtcOfferBuyMethodObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcOfferBuyMethodObjectHelper.fromMap(inputMap, "CtcOfferBuyMethod");
  }

/**
 *
 * Gets the CtcOfferBuyMethod
 * @return Value of the CtcOfferBuyMethod
 *
 */

  public CtcOfferBuyMethodObjectData getCtcOfferBuyMethod( ) {
    return CreateIn;
  }

}
