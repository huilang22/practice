/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferSummaryFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferSummaryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferSummaryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferFilterObjectFilter SummaryFindIn;
/**
 *
 * Constructor to create a  CtcOfferSummaryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferSummaryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferFilterObjectFilter SummaryFindInIn) {
    super(id, context, "CtcOfferSummaryFind");
    SummaryFindIn = SummaryFindInIn;
  }

  public void translateToMap() {
    if (SummaryFindIn != null) {
      Integer index =  SummaryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(SummaryFindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param SummaryFindInIn Value of the SummaryFindIn
 *
 */

  public void setCtcOffer(CtcOfferFilterObjectFilter SummaryFindInIn) {
    SummaryFindIn = SummaryFindInIn;
  }

  public void translateFromMap() {
    SummaryFindIn = CtcOfferFilterObjectHelper.fromMapFilter(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferFilterObjectFilter getCtcOffer( ) {
    return SummaryFindIn;
  }

}
