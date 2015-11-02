/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferDetailGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferDetailGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferDetailGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferObjectKeyData DetailGetIn;
/**
 *
 * Constructor to create a  CtcOfferDetailGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferDetailGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectKeyData DetailGetInIn) {
    super(id, context, "CtcOfferDetailGet");
    DetailGetIn = DetailGetInIn;
  }

  public void translateToMap() {
    if (DetailGetIn != null) {
      DetailGetIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(DetailGetIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param DetailGetInIn Value of the DetailGetIn
 *
 */

  public void setCtcOffer(CtcOfferObjectKeyData DetailGetInIn) {
    DetailGetIn = DetailGetInIn;
  }

  public void translateFromMap() {
    DetailGetIn = CtcOfferObjectKeyHelper.fromMap(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferObjectKeyData getCtcOffer( ) {
    return DetailGetIn;
  }

}
