/*
 * Generated code DO NOT EDIT
 * Generated file: InvsRateCenterFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsRateCenterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsRateCenterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsRateCenterObjectFilter InvsRateCenterFindIn;
/**
 *
 * Constructor to create a  InvsRateCenterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsRateCenterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsRateCenterObjectFilter InvsRateCenterFindInIn) {
    super(id, context, "InvsRateCenterFind");
    InvsRateCenterFindIn = InvsRateCenterFindInIn;
  }

  public void translateToMap() {
    if (InvsRateCenterFindIn != null) {
      Integer index =  InvsRateCenterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(InvsRateCenterFindIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }


/**
 *
 * Sets the InvsRateCenter
 * @param InvsRateCenterFindInIn Value of the InvsRateCenterFindIn
 *
 */

  public void setInvsRateCenter(InvsRateCenterObjectFilter InvsRateCenterFindInIn) {
    InvsRateCenterFindIn = InvsRateCenterFindInIn;
  }

  public void translateFromMap() {
    InvsRateCenterFindIn = InvsRateCenterObjectHelper.fromMapFilter(inputMap, "InvsRateCenter");
  }

/**
 *
 * Gets the InvsRateCenter
 * @return Value of the InvsRateCenter
 *
 */

  public InvsRateCenterObjectFilter getInvsRateCenter( ) {
    return InvsRateCenterFindIn;
  }

}
