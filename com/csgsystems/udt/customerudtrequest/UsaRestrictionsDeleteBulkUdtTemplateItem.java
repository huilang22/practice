/*
 * Generated code DO NOT EDIT
 * Generated file: UsaRestrictionsDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a UsaRestrictionsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class UsaRestrictionsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsaRestrictionsObjectData URdelete_In;
/**
 *
 * Constructor to create a  UsaRestrictionsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsaRestrictionsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, UsaRestrictionsObjectData URdelete_InIn) {
    super(id, context, "UsaRestrictionsDelete");
    URdelete_In = URdelete_InIn;
  }

  public void translateToMap() {
    if (URdelete_In != null) {
      URdelete_In.resetFlags(true, true);
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URdelete_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }


/**
 *
 * Sets the UsaRestrictions
 * @param URdelete_InIn Value of the URdelete_In
 *
 */

  public void setUsaRestrictions(UsaRestrictionsObjectData URdelete_InIn) {
    URdelete_In = URdelete_InIn;
  }

  public void translateFromMap() {
    URdelete_In = UsaRestrictionsObjectHelper.fromMap(inputMap, "UsaRestrictions");
  }

/**
 *
 * Gets the UsaRestrictions
 * @return Value of the UsaRestrictions
 *
 */

  public UsaRestrictionsObjectData getUsaRestrictions( ) {
    return URdelete_In;
  }

}
