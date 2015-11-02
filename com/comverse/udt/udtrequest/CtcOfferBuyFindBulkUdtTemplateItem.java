/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcOfferBuyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectFilter FindInIn) {
    super(id, context, "CtcOfferBuyFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcOfferBuyObjectHelper.fromMapFilter(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectFilter getCtcOfferBuy( ) {
    return FindIn;
  }

}
