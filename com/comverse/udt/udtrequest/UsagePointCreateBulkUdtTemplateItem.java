/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsgPntObjectData UsgPntCreateIn;
/**
 *
 * Constructor to create a  UsagePointCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsgPntObjectData UsgPntCreateInIn) {
    super(id, context, "UsagePointCreate");
    UsgPntCreateIn = UsgPntCreateInIn;
  }

  public void translateToMap() {
    if (UsgPntCreateIn != null) {
      UsgPntCreateIn.resetFlags(true, true);
      addInput("UsagePoint", UsgPntObjectHelper.toMap(UsgPntCreateIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }


/**
 *
 * Sets the UsagePoint
 * @param UsgPntCreateInIn Value of the UsgPntCreateIn
 *
 */

  public void setUsagePoint(UsgPntObjectData UsgPntCreateInIn) {
    UsgPntCreateIn = UsgPntCreateInIn;
  }

  public void translateFromMap() {
    UsgPntCreateIn = UsgPntObjectHelper.fromMap(inputMap, "UsagePoint");
  }

/**
 *
 * Gets the UsagePoint
 * @return Value of the UsagePoint
 *
 */

  public UsgPntObjectData getUsagePoint( ) {
    return UsgPntCreateIn;
  }

}
