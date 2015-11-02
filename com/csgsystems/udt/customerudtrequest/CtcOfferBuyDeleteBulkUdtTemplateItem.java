/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcOfferBuyDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectKeyData DeleteInIn) {
    super(id, context, "CtcOfferBuyDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcOfferBuyObjectKeyHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectKeyData getCtcOfferBuy( ) {
    return DeleteIn;
  }

}
