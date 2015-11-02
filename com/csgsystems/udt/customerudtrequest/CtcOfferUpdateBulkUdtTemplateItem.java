/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcOfferUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectData UpdateInIn) {
    super(id, context, "CtcOfferUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcOffer(CtcOfferObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcOfferObjectHelper.fromMap(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferObjectData getCtcOffer( ) {
    return UpdateIn;
  }

}
