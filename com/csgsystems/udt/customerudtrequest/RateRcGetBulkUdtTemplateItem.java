/*
 * Generated code DO NOT EDIT
 * Generated file: RateRcGetBulkUdtTemplateItem.java
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
 * Class used to create a RateRcGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateRcGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RACObjectKeyData RACGetIn;
/**
 *
 * Constructor to create a  RateRcGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateRcGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RACObjectKeyData RACGetInIn) {
    super(id, context, "RateRcGet");
    RACGetIn = RACGetInIn;
  }

  public void translateToMap() {
    if (RACGetIn != null) {
      RACGetIn.resetFlags(true, true);
      addInput("RateRc", RACObjectKeyHelper.toMap(RACGetIn, new HashMap(), "RACObjectKeyData").get("RACObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateRc
 * @param RACGetInIn Value of the RACGetIn
 *
 */

  public void setRateRc(RACObjectKeyData RACGetInIn) {
    RACGetIn = RACGetInIn;
  }

  public void translateFromMap() {
    RACGetIn = RACObjectKeyHelper.fromMap(inputMap, "RateRc");
  }

/**
 *
 * Gets the RateRc
 * @return Value of the RateRc
 *
 */

  public RACObjectKeyData getRateRc( ) {
    return RACGetIn;
  }

}
