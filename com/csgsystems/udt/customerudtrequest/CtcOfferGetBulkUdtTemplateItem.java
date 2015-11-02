/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcOfferGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectKeyData GetInIn) {
    super(id, context, "CtcOfferGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcOffer(CtcOfferObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcOfferObjectKeyHelper.fromMap(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferObjectKeyData getCtcOffer( ) {
    return GetIn;
  }

}
