/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcOfferFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectFilter FindInIn) {
    super(id, context, "CtcOfferFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(FindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcOffer(CtcOfferObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcOfferObjectHelper.fromMapFilter(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferObjectFilter getCtcOffer( ) {
    return FindIn;
  }

}
