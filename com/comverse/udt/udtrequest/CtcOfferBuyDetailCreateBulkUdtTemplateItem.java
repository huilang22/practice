/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyDetailCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyDetailCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectData CreateDetailIn;
/**
 *
 * Constructor to create a  CtcOfferBuyDetailCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyDetailCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectData CreateDetailInIn) {
    super(id, context, "CtcOfferBuyDetailCreate");
    CreateDetailIn = CreateDetailInIn;
  }

  public void translateToMap() {
    if (CreateDetailIn != null) {
      CreateDetailIn.resetFlags(true, true);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(CreateDetailIn, new HashMap(), "CreateDetailOut").get("CreateDetailOut"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param CreateDetailInIn Value of the CreateDetailIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectData CreateDetailInIn) {
    CreateDetailIn = CreateDetailInIn;
  }

  public void translateFromMap() {
    CreateDetailIn = CtcOfferBuyObjectHelper.fromMap(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectData getCtcOfferBuy( ) {
    return CreateDetailIn;
  }

}
