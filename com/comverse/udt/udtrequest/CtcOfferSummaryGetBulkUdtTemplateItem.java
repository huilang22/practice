/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferSummaryGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferSummaryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferSummaryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferObjectKeyData SummaryGetIn;
/**
 *
 * Constructor to create a  CtcOfferSummaryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferSummaryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferObjectKeyData SummaryGetInIn) {
    super(id, context, "CtcOfferSummaryGet");
    SummaryGetIn = SummaryGetInIn;
  }

  public void translateToMap() {
    if (SummaryGetIn != null) {
      SummaryGetIn.resetFlags(true, true);
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(SummaryGetIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param SummaryGetInIn Value of the SummaryGetIn
 *
 */

  public void setCtcOffer(CtcOfferObjectKeyData SummaryGetInIn) {
    SummaryGetIn = SummaryGetInIn;
  }

  public void translateFromMap() {
    SummaryGetIn = CtcOfferObjectKeyHelper.fromMap(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferObjectKeyData getCtcOffer( ) {
    return SummaryGetIn;
  }

}
