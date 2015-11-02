/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsaRestrictionsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsaRestrictionsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsaRestrictionsObjectData URcreate_In;
/**
 *
 * Constructor to create a  UsaRestrictionsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsaRestrictionsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsaRestrictionsObjectData URcreate_InIn) {
    super(id, context, "UsaRestrictionsCreate");
    URcreate_In = URcreate_InIn;
  }

  public void translateToMap() {
    if (URcreate_In != null) {
      URcreate_In.resetFlags(true, true);
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URcreate_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }


/**
 *
 * Sets the UsaRestrictions
 * @param URcreate_InIn Value of the URcreate_In
 *
 */

  public void setUsaRestrictions(UsaRestrictionsObjectData URcreate_InIn) {
    URcreate_In = URcreate_InIn;
  }

  public void translateFromMap() {
    URcreate_In = UsaRestrictionsObjectHelper.fromMap(inputMap, "UsaRestrictions");
  }

/**
 *
 * Gets the UsaRestrictions
 * @return Value of the UsaRestrictions
 *
 */

  public UsaRestrictionsObjectData getUsaRestrictions( ) {
    return URcreate_In;
  }

}
