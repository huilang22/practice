/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcOfferCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectData CreateInIn) {
    super(id, context, "CtcOfferCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(CreateIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcOffer(CtcOfferObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcOfferObjectHelper.fromMap(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferObjectData getCtcOffer( ) {
    return CreateIn;
  }

}
