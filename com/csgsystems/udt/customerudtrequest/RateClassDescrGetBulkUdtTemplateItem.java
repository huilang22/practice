/*
 * Generated code DO NOT EDIT
 * Generated file: RateClassDescrGetBulkUdtTemplateItem.java
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
 * Class used to create a RateClassDescrGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateClassDescrGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateClassDescrObjectKeyData RCDGetIn;
/**
 *
 * Constructor to create a  RateClassDescrGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateClassDescrGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateClassDescrObjectKeyData RCDGetInIn) {
    super(id, context, "RateClassDescrGet");
    RCDGetIn = RCDGetInIn;
  }

  public void translateToMap() {
    if (RCDGetIn != null) {
      RCDGetIn.resetFlags(true, true);
      addInput("RateClassDescr", RateClassDescrObjectKeyHelper.toMap(RCDGetIn, new HashMap(), "RateClassDescrObjectKeyData").get("RateClassDescrObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateClassDescr
 * @param RCDGetInIn Value of the RCDGetIn
 *
 */

  public void setRateClassDescr(RateClassDescrObjectKeyData RCDGetInIn) {
    RCDGetIn = RCDGetInIn;
  }

  public void translateFromMap() {
    RCDGetIn = RateClassDescrObjectKeyHelper.fromMap(inputMap, "RateClassDescr");
  }

/**
 *
 * Gets the RateClassDescr
 * @return Value of the RateClassDescr
 *
 */

  public RateClassDescrObjectKeyData getRateClassDescr( ) {
    return RCDGetIn;
  }

}
