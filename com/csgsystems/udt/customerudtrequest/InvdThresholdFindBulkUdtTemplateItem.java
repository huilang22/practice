/*
 * Generated code DO NOT EDIT
 * Generated file: InvdThresholdFindBulkUdtTemplateItem.java
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
 * Class used to create a InvdThresholdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdThresholdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdThresholdObjectFilter InvdThresholdFindIn;
/**
 *
 * Constructor to create a  InvdThresholdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdThresholdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectFilter InvdThresholdFindInIn) {
    super(id, context, "InvdThresholdFind");
    InvdThresholdFindIn = InvdThresholdFindInIn;
  }

  public void translateToMap() {
    if (InvdThresholdFindIn != null) {
      Integer index =  InvdThresholdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(InvdThresholdFindIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }


/**
 *
 * Sets the InvdThreshold
 * @param InvdThresholdFindInIn Value of the InvdThresholdFindIn
 *
 */

  public void setInvdThreshold(InvdThresholdObjectFilter InvdThresholdFindInIn) {
    InvdThresholdFindIn = InvdThresholdFindInIn;
  }

  public void translateFromMap() {
    InvdThresholdFindIn = InvdThresholdObjectHelper.fromMapFilter(inputMap, "InvdThreshold");
  }

/**
 *
 * Gets the InvdThreshold
 * @return Value of the InvdThreshold
 *
 */

  public InvdThresholdObjectFilter getInvdThreshold( ) {
    return InvdThresholdFindIn;
  }

}
