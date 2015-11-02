/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrUsageTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrUsageTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrUsageTypeObjectKeyData RbrUsgTypeGetIn;
/**
 *
 * Constructor to create a  RbrUsageTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrUsageTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrUsageTypeObjectKeyData RbrUsgTypeGetInIn) {
    super(id, context, "RbrUsageTypeGet");
    RbrUsgTypeGetIn = RbrUsgTypeGetInIn;
  }

  public void translateToMap() {
    if (RbrUsgTypeGetIn != null) {
      RbrUsgTypeGetIn.resetFlags(true, true);
      addInput("RbrUsageType", RbrUsageTypeObjectKeyHelper.toMap(RbrUsgTypeGetIn, new HashMap(), "RbrUsageTypeObjectKeyData").get("RbrUsageTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrUsageType
 * @param RbrUsgTypeGetInIn Value of the RbrUsgTypeGetIn
 *
 */

  public void setRbrUsageType(RbrUsageTypeObjectKeyData RbrUsgTypeGetInIn) {
    RbrUsgTypeGetIn = RbrUsgTypeGetInIn;
  }

  public void translateFromMap() {
    RbrUsgTypeGetIn = RbrUsageTypeObjectKeyHelper.fromMap(inputMap, "RbrUsageType");
  }

/**
 *
 * Gets the RbrUsageType
 * @return Value of the RbrUsageType
 *
 */

  public RbrUsageTypeObjectKeyData getRbrUsageType( ) {
    return RbrUsgTypeGetIn;
  }

}
