/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyMethodFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyMethodFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyMethodFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyMethodObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcOfferBuyMethodFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyMethodFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyMethodObjectFilter FindInIn) {
    super(id, context, "CtcOfferBuyMethodFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }


/**
 *
 * Sets the CtcOfferBuyMethod
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcOfferBuyMethod(CtcOfferBuyMethodObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcOfferBuyMethodObjectHelper.fromMapFilter(inputMap, "CtcOfferBuyMethod");
  }

/**
 *
 * Gets the CtcOfferBuyMethod
 * @return Value of the CtcOfferBuyMethod
 *
 */

  public CtcOfferBuyMethodObjectFilter getCtcOfferBuyMethod( ) {
    return FindIn;
  }

}
