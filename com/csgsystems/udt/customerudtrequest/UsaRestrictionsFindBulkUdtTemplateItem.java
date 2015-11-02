/*
 * Generated code DO NOT EDIT
 * Generated file: UsaRestrictionsFindBulkUdtTemplateItem.java
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
 * Class used to create a UsaRestrictionsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsaRestrictionsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsaRestrictionsObjectFilter URfind_In;
/**
 *
 * Constructor to create a  UsaRestrictionsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsaRestrictionsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsaRestrictionsObjectFilter URfind_InIn) {
    super(id, context, "UsaRestrictionsFind");
    URfind_In = URfind_InIn;
  }

  public void translateToMap() {
    if (URfind_In != null) {
      Integer index =  URfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URfind_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }


/**
 *
 * Sets the UsaRestrictions
 * @param URfind_InIn Value of the URfind_In
 *
 */

  public void setUsaRestrictions(UsaRestrictionsObjectFilter URfind_InIn) {
    URfind_In = URfind_InIn;
  }

  public void translateFromMap() {
    URfind_In = UsaRestrictionsObjectHelper.fromMapFilter(inputMap, "UsaRestrictions");
  }

/**
 *
 * Gets the UsaRestrictions
 * @return Value of the UsaRestrictions
 *
 */

  public UsaRestrictionsObjectFilter getUsaRestrictions( ) {
    return URfind_In;
  }

}
