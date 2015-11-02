/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyMethodDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyMethodDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyMethodObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcOfferBuyMethodDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyMethodDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyMethodObjectKeyData DeleteInIn) {
    super(id, context, "CtcOfferBuyMethodDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferBuyMethodObjectKeyData").get("CtcOfferBuyMethodObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOfferBuyMethod
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcOfferBuyMethod(CtcOfferBuyMethodObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcOfferBuyMethodObjectKeyHelper.fromMap(inputMap, "CtcOfferBuyMethod");
  }

/**
 *
 * Gets the CtcOfferBuyMethod
 * @return Value of the CtcOfferBuyMethod
 *
 */

  public CtcOfferBuyMethodObjectKeyData getCtcOfferBuyMethod( ) {
    return DeleteIn;
  }

}
