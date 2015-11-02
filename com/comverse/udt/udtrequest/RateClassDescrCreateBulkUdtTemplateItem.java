/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RateClassDescrCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateClassDescrCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateClassDescrObjectData RCDCrIn;
/**
 *
 * Constructor to create a  RateClassDescrCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateClassDescrCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateClassDescrObjectData RCDCrInIn) {
    super(id, context, "RateClassDescrCreate");
    RCDCrIn = RCDCrInIn;
  }

  public void translateToMap() {
    if (RCDCrIn != null) {
      RCDCrIn.resetFlags(true, true);
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(RCDCrIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }


/**
 *
 * Sets the RateClassDescr
 * @param RCDCrInIn Value of the RCDCrIn
 *
 */

  public void setRateClassDescr(RateClassDescrObjectData RCDCrInIn) {
    RCDCrIn = RCDCrInIn;
  }

  public void translateFromMap() {
    RCDCrIn = RateClassDescrObjectHelper.fromMap(inputMap, "RateClassDescr");
  }

/**
 *
 * Gets the RateClassDescr
 * @return Value of the RateClassDescr
 *
 */

  public RateClassDescrObjectData getRateClassDescr( ) {
    return RCDCrIn;
  }

}
