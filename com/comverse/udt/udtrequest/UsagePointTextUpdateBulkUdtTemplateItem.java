/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointTextUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointTextUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsagePointTextObjectData UsagePointTextUpdateIn;
/**
 *
 * Constructor to create a  UsagePointTextUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointTextUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsagePointTextObjectData UsagePointTextUpdateInIn) {
    super(id, context, "UsagePointTextUpdate");
    UsagePointTextUpdateIn = UsagePointTextUpdateInIn;
  }

  public void translateToMap() {
    if (UsagePointTextUpdateIn != null) {
      UsagePointTextUpdateIn.resetFlags(true, true);
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(UsagePointTextUpdateIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }


/**
 *
 * Sets the UsagePointText
 * @param UsagePointTextUpdateInIn Value of the UsagePointTextUpdateIn
 *
 */

  public void setUsagePointText(UsagePointTextObjectData UsagePointTextUpdateInIn) {
    UsagePointTextUpdateIn = UsagePointTextUpdateInIn;
  }

  public void translateFromMap() {
    UsagePointTextUpdateIn = UsagePointTextObjectHelper.fromMap(inputMap, "UsagePointText");
  }

/**
 *
 * Gets the UsagePointText
 * @return Value of the UsagePointText
 *
 */

  public UsagePointTextObjectData getUsagePointText( ) {
    return UsagePointTextUpdateIn;
  }

}
