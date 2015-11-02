/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextGetBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointTextGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointTextGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsagePointTextObjectKeyData UsagePointTextGetIn;
/**
 *
 * Constructor to create a  UsagePointTextGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointTextGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsagePointTextObjectKeyData UsagePointTextGetInIn) {
    super(id, context, "UsagePointTextGet");
    UsagePointTextGetIn = UsagePointTextGetInIn;
  }

  public void translateToMap() {
    if (UsagePointTextGetIn != null) {
      UsagePointTextGetIn.resetFlags(true, true);
      addInput("UsagePointText", UsagePointTextObjectKeyHelper.toMap(UsagePointTextGetIn, new HashMap(), "UsagePointTextObjectKeyData").get("UsagePointTextObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsagePointText
 * @param UsagePointTextGetInIn Value of the UsagePointTextGetIn
 *
 */

  public void setUsagePointText(UsagePointTextObjectKeyData UsagePointTextGetInIn) {
    UsagePointTextGetIn = UsagePointTextGetInIn;
  }

  public void translateFromMap() {
    UsagePointTextGetIn = UsagePointTextObjectKeyHelper.fromMap(inputMap, "UsagePointText");
  }

/**
 *
 * Gets the UsagePointText
 * @return Value of the UsagePointText
 *
 */

  public UsagePointTextObjectKeyData getUsagePointText( ) {
    return UsagePointTextGetIn;
  }

}
