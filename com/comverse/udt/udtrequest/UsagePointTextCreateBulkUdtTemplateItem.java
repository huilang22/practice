/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointTextCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointTextCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsagePointTextObjectData UsagePointTextCreateIn;
/**
 *
 * Constructor to create a  UsagePointTextCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointTextCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsagePointTextObjectData UsagePointTextCreateInIn) {
    super(id, context, "UsagePointTextCreate");
    UsagePointTextCreateIn = UsagePointTextCreateInIn;
  }

  public void translateToMap() {
    if (UsagePointTextCreateIn != null) {
      UsagePointTextCreateIn.resetFlags(true, true);
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(UsagePointTextCreateIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }


/**
 *
 * Sets the UsagePointText
 * @param UsagePointTextCreateInIn Value of the UsagePointTextCreateIn
 *
 */

  public void setUsagePointText(UsagePointTextObjectData UsagePointTextCreateInIn) {
    UsagePointTextCreateIn = UsagePointTextCreateInIn;
  }

  public void translateFromMap() {
    UsagePointTextCreateIn = UsagePointTextObjectHelper.fromMap(inputMap, "UsagePointText");
  }

/**
 *
 * Gets the UsagePointText
 * @return Value of the UsagePointText
 *
 */

  public UsagePointTextObjectData getUsagePointText( ) {
    return UsagePointTextCreateIn;
  }

}
