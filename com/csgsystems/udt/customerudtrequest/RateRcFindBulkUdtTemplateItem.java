/*
 * Generated code DO NOT EDIT
 * Generated file: RateRcFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RateRcFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateRcFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RACObjectFilter RACFindIn;
/**
 *
 * Constructor to create a  RateRcFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateRcFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RACObjectFilter RACFindInIn) {
    super(id, context, "RateRcFind");
    RACFindIn = RACFindInIn;
  }

  public void translateToMap() {
    if (RACFindIn != null) {
      Integer index =  RACFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateRc", RACObjectHelper.toMap(RACFindIn, new HashMap(), "RateRc").get("RateRc"));
    }
  }


/**
 *
 * Sets the RateRc
 * @param RACFindInIn Value of the RACFindIn
 *
 */

  public void setRateRc(RACObjectFilter RACFindInIn) {
    RACFindIn = RACFindInIn;
  }

  public void translateFromMap() {
    RACFindIn = RACObjectHelper.fromMapFilter(inputMap, "RateRc");
  }

/**
 *
 * Gets the RateRc
 * @return Value of the RateRc
 *
 */

  public RACObjectFilter getRateRc( ) {
    return RACFindIn;
  }

}
