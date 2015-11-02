/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferBuyDetailFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferBuyDetailFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferBuyObjectFilter FindDetailIn;
/**
 *
 * Constructor to create a  CtcOfferBuyDetailFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferBuyDetailFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferBuyObjectFilter FindDetailInIn) {
    super(id, context, "CtcOfferBuyDetailFind");
    FindDetailIn = FindDetailInIn;
  }

  public void translateToMap() {
    if (FindDetailIn != null) {
      Integer index =  FindDetailIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(FindDetailIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }


/**
 *
 * Sets the CtcOfferBuy
 * @param FindDetailInIn Value of the FindDetailIn
 *
 */

  public void setCtcOfferBuy(CtcOfferBuyObjectFilter FindDetailInIn) {
    FindDetailIn = FindDetailInIn;
  }

  public void translateFromMap() {
    FindDetailIn = CtcOfferBuyObjectHelper.fromMapFilter(inputMap, "CtcOfferBuy");
  }

/**
 *
 * Gets the CtcOfferBuy
 * @return Value of the CtcOfferBuy
 *
 */

  public CtcOfferBuyObjectFilter getCtcOfferBuy( ) {
    return FindDetailIn;
  }

}
