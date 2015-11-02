/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsGetBulkUdtTemplateItem.java
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
 * Class used to create a UsaRestrictionsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsaRestrictionsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsaRestrictionsObjectKeyData URget_In;
/**
 *
 * Constructor to create a  UsaRestrictionsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsaRestrictionsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsaRestrictionsObjectKeyData URget_InIn) {
    super(id, context, "UsaRestrictionsGet");
    URget_In = URget_InIn;
  }

  public void translateToMap() {
    if (URget_In != null) {
      URget_In.resetFlags(true, true);
      addInput("UsaRestrictions", UsaRestrictionsObjectKeyHelper.toMap(URget_In, new HashMap(), "UsaRestrictionsObjectKeyData").get("UsaRestrictionsObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsaRestrictions
 * @param URget_InIn Value of the URget_In
 *
 */

  public void setUsaRestrictions(UsaRestrictionsObjectKeyData URget_InIn) {
    URget_In = URget_InIn;
  }

  public void translateFromMap() {
    URget_In = UsaRestrictionsObjectKeyHelper.fromMap(inputMap, "UsaRestrictions");
  }

/**
 *
 * Gets the UsaRestrictions
 * @return Value of the UsaRestrictions
 *
 */

  public UsaRestrictionsObjectKeyData getUsaRestrictions( ) {
    return URget_In;
  }

}
