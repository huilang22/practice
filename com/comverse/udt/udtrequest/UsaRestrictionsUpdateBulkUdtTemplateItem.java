/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsaRestrictionsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsaRestrictionsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsaRestrictionsObjectData URupdate_In;
/**
 *
 * Constructor to create a  UsaRestrictionsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsaRestrictionsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsaRestrictionsObjectData URupdate_InIn) {
    super(id, context, "UsaRestrictionsUpdate");
    URupdate_In = URupdate_InIn;
  }

  public void translateToMap() {
    if (URupdate_In != null) {
      URupdate_In.resetFlags(true, true);
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URupdate_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }


/**
 *
 * Sets the UsaRestrictions
 * @param URupdate_InIn Value of the URupdate_In
 *
 */

  public void setUsaRestrictions(UsaRestrictionsObjectData URupdate_InIn) {
    URupdate_In = URupdate_InIn;
  }

  public void translateFromMap() {
    URupdate_In = UsaRestrictionsObjectHelper.fromMap(inputMap, "UsaRestrictions");
  }

/**
 *
 * Gets the UsaRestrictions
 * @return Value of the UsaRestrictions
 *
 */

  public UsaRestrictionsObjectData getUsaRestrictions( ) {
    return URupdate_In;
  }

}
