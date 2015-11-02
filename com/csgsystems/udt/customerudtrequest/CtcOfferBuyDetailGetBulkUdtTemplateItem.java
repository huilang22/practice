/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyDetailGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyDetailGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyDetailGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectKeyData GetDetailIn;
/**
 *
 * Constructor to create a  CtcOfferBuyDetailGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyDetailGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectKeyData GetDetailInIn) {
    super(id, context, "CtcOfferBuyDetailGet");
    GetDetailIn = GetDetailInIn;
  }

  public void translateToMap() {
    if (GetDetailIn != null) {
      GetDetailIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(GetDetailIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param GetDetailInIn Value of the GetDetailIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectKeyData GetDetailInIn) {
    GetDetailIn = GetDetailInIn;
  }

  public void translateFromMap() {
    GetDetailIn = CtcOfferBuyObjectKeyHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectKeyData getCtcOfferBuy( ) {
    return GetDetailIn;
  }

}
