/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyDetailDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyDetailDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyDetailDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectKeyData DeleteDetailIn;
/**
 *
 * Constructor to create a  CtcOfferBuyDetailDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyDetailDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectKeyData DeleteDetailInIn) {
    super(id, context, "CtcOfferBuyDetailDelete");
    DeleteDetailIn = DeleteDetailInIn;
  }

  public void translateToMap() {
    if (DeleteDetailIn != null) {
      DeleteDetailIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(DeleteDetailIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param DeleteDetailInIn Value of the DeleteDetailIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectKeyData DeleteDetailInIn) {
    DeleteDetailIn = DeleteDetailInIn;
  }

  public void translateFromMap() {
    DeleteDetailIn = CtcOfferBuyObjectKeyHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectKeyData getCtcOfferBuy( ) {
    return DeleteDetailIn;
  }

}
