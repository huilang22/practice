/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointDeleteBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsgPntObjectKeyData UsgPntDeleteIn;
/**
 *
 * Constructor to create a  UsagePointDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, UsgPntObjectKeyData UsgPntDeleteInIn) {
    super(id, context, "UsagePointDelete");
    UsgPntDeleteIn = UsgPntDeleteInIn;
  }

  public void translateToMap() {
    if (UsgPntDeleteIn != null) {
      UsgPntDeleteIn.resetFlags(true, true);
      addInput("UsagePoint", UsgPntObjectKeyHelper.toMap(UsgPntDeleteIn, new HashMap(), "UsgPntObjectKeyData").get("UsgPntObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsagePoint
 * @param UsgPntDeleteInIn Value of the UsgPntDeleteIn
 *
 */

  public void setUsagePoint(UsgPntObjectKeyData UsgPntDeleteInIn) {
    UsgPntDeleteIn = UsgPntDeleteInIn;
  }

  public void translateFromMap() {
    UsgPntDeleteIn = UsgPntObjectKeyHelper.fromMap(inputMap, "UsagePoint");
  }

/**
 *
 * Gets the UsagePoint
 * @return Value of the UsagePoint
 *
 */

  public UsgPntObjectKeyData getUsagePoint( ) {
    return UsgPntDeleteIn;
  }

}
