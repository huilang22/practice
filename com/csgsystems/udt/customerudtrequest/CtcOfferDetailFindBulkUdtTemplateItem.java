/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferDetailFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferDetailFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferDetailFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferFilterObjectFilter DetailFindIn;
/**
 *
 * Constructor to create a  CtcOfferDetailFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferDetailFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferFilterObjectFilter DetailFindInIn) {
    super(id, context, "CtcOfferDetailFind");
    DetailFindIn = DetailFindInIn;
  }

  public void translateToMap() {
    if (DetailFindIn != null) {
      Integer index =  DetailFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(DetailFindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param DetailFindInIn Value of the DetailFindIn
 *
 */

  public void setCtcOffer(CtcOfferFilterObjectFilter DetailFindInIn) {
    DetailFindIn = DetailFindInIn;
  }

  public void translateFromMap() {
    DetailFindIn = CtcOfferFilterObjectHelper.fromMapFilter(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferFilterObjectFilter getCtcOffer( ) {
    return DetailFindIn;
  }

}
