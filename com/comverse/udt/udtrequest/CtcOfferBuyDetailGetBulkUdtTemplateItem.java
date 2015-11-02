/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailGetBulkUdtTemplateItem.java
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
