/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcOfferBuyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectKeyData GetInIn) {
    super(id, context, "CtcOfferBuyGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcOfferBuyObjectKeyHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectKeyData getCtcOfferBuy( ) {
    return GetIn;
  }

}
