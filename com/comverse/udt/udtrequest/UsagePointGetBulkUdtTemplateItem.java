/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointGetBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsgPntObjectKeyData UsgPntGetIn;
/**
 *
 * Constructor to create a  UsagePointGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsgPntObjectKeyData UsgPntGetInIn) {
    super(id, context, "UsagePointGet");
    UsgPntGetIn = UsgPntGetInIn;
  }

  public void translateToMap() {
    if (UsgPntGetIn != null) {
      UsgPntGetIn.resetFlags(true, true);
      addInput("UsagePoint", UsgPntObjectKeyHelper.toMap(UsgPntGetIn, new HashMap(), "UsgPntObjectKeyData").get("UsgPntObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsagePoint
 * @param UsgPntGetInIn Value of the UsgPntGetIn
 *
 */

  public void setUsagePoint(UsgPntObjectKeyData UsgPntGetInIn) {
    UsgPntGetIn = UsgPntGetInIn;
  }

  public void translateFromMap() {
    UsgPntGetIn = UsgPntObjectKeyHelper.fromMap(inputMap, "UsagePoint");
  }

/**
 *
 * Gets the UsagePoint
 * @return Value of the UsagePoint
 *
 */

  public UsgPntObjectKeyData getUsagePoint( ) {
    return UsgPntGetIn;
  }

}
