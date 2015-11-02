/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyMethodGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyMethodGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyMethodObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcOfferBuyMethodGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyMethodGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyMethodObjectKeyData GetInIn) {
    super(id, context, "CtcOfferBuyMethodGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferBuyMethodObjectKeyData").get("CtcOfferBuyMethodObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferBuyMethod
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcOfferBuyMethod(CtcOfferBuyMethodObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcOfferBuyMethodObjectKeyHelper.fromMap(inputMap, "CtcOfferBuyMethod");
  }

/**
 *
 * Gets the CtcOfferBuyMethod
 * @return Value of the CtcOfferBuyMethod
 *
 */

  public CtcOfferBuyMethodObjectKeyData getCtcOfferBuyMethod( ) {
    return GetIn;
  }

}
