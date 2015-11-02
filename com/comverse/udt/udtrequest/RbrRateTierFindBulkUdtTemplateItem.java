/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTierFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTierFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRteTierObjectFilter RbrRteTierFindIn;
/**
 *
 * Constructor to create a  RbrRateTierFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTierFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRteTierObjectFilter RbrRteTierFindInIn) {
    super(id, context, "RbrRateTierFind");
    RbrRteTierFindIn = RbrRteTierFindInIn;
  }

  public void translateToMap() {
    if (RbrRteTierFindIn != null) {
      Integer index =  RbrRteTierFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(RbrRteTierFindIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }


/**
 *
 * Sets the RbrRateTier
 * @param RbrRteTierFindInIn Value of the RbrRteTierFindIn
 *
 */

  public void setRbrRateTier(RbrRteTierObjectFilter RbrRteTierFindInIn) {
    RbrRteTierFindIn = RbrRteTierFindInIn;
  }

  public void translateFromMap() {
    RbrRteTierFindIn = RbrRteTierObjectHelper.fromMapFilter(inputMap, "RbrRateTier");
  }

/**
 *
 * Gets the RbrRateTier
 * @return Value of the RbrRateTier
 *
 */

  public RbrRteTierObjectFilter getRbrRateTier( ) {
    return RbrRteTierFindIn;
  }

}
