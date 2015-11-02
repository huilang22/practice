/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferPpvFindBulkUdtTemplateItem.java
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
 * Class used to create a CtcOfferPpvFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferPpvFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferFilterObjectFilter PpvFindIn;
/**
 *
 * Constructor to create a  CtcOfferPpvFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferPpvFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferFilterObjectFilter PpvFindInIn) {
    super(id, context, "CtcOfferPpvFind");
    PpvFindIn = PpvFindInIn;
  }

  public void translateToMap() {
    if (PpvFindIn != null) {
      Integer index =  PpvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(PpvFindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }


/**
 *
 * Sets the CtcOffer
 * @param PpvFindInIn Value of the PpvFindIn
 *
 */

  public void setCtcOffer(CtcOfferFilterObjectFilter PpvFindInIn) {
    PpvFindIn = PpvFindInIn;
  }

  public void translateFromMap() {
    PpvFindIn = CtcOfferFilterObjectHelper.fromMapFilter(inputMap, "CtcOffer");
  }

/**
 *
 * Gets the CtcOffer
 * @return Value of the CtcOffer
 *
 */

  public CtcOfferFilterObjectFilter getCtcOffer( ) {
    return PpvFindIn;
  }

}
