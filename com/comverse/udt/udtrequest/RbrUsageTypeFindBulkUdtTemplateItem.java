/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrUsageTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrUsageTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrUsageTypeObjectFilter RbrUsgTypeFndIn;
/**
 *
 * Constructor to create a  RbrUsageTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrUsageTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrUsageTypeObjectFilter RbrUsgTypeFndInIn) {
    super(id, context, "RbrUsageTypeFind");
    RbrUsgTypeFndIn = RbrUsgTypeFndInIn;
  }

  public void translateToMap() {
    if (RbrUsgTypeFndIn != null) {
      Integer index =  RbrUsgTypeFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(RbrUsgTypeFndIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }


/**
 *
 * Sets the RbrUsageType
 * @param RbrUsgTypeFndInIn Value of the RbrUsgTypeFndIn
 *
 */

  public void setRbrUsageType(RbrUsageTypeObjectFilter RbrUsgTypeFndInIn) {
    RbrUsgTypeFndIn = RbrUsgTypeFndInIn;
  }

  public void translateFromMap() {
    RbrUsgTypeFndIn = RbrUsageTypeObjectHelper.fromMapFilter(inputMap, "RbrUsageType");
  }

/**
 *
 * Gets the RbrUsageType
 * @return Value of the RbrUsageType
 *
 */

  public RbrUsageTypeObjectFilter getRbrUsageType( ) {
    return RbrUsgTypeFndIn;
  }

}
