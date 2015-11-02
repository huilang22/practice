/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsThresholdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsThresholdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsThresholdObjectFilter InvsThresholdFindIn;
/**
 *
 * Constructor to create a  InvsThresholdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsThresholdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectFilter InvsThresholdFindInIn) {
    super(id, context, "InvsThresholdFind");
    InvsThresholdFindIn = InvsThresholdFindInIn;
  }

  public void translateToMap() {
    if (InvsThresholdFindIn != null) {
      Integer index =  InvsThresholdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdFindIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }


/**
 *
 * Sets the InvsThreshold
 * @param InvsThresholdFindInIn Value of the InvsThresholdFindIn
 *
 */

  public void setInvsThreshold(InvsThresholdObjectFilter InvsThresholdFindInIn) {
    InvsThresholdFindIn = InvsThresholdFindInIn;
  }

  public void translateFromMap() {
    InvsThresholdFindIn = InvsThresholdObjectHelper.fromMapFilter(inputMap, "InvsThreshold");
  }

/**
 *
 * Gets the InvsThreshold
 * @return Value of the InvsThreshold
 *
 */

  public InvsThresholdObjectFilter getInvsThreshold( ) {
    return InvsThresholdFindIn;
  }

}
