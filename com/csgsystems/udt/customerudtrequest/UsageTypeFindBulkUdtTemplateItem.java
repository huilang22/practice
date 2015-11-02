/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeObjectFilter utFindIn;
/**
 *
 * Constructor to create a  UsageTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectFilter utFindInIn) {
    super(id, context, "UsageTypeFind");
    utFindIn = utFindInIn;
  }

  public void translateToMap() {
    if (utFindIn != null) {
      Integer index =  utFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageType", UsageTypeObjectHelper.toMap(utFindIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }


/**
 *
 * Sets the UsageType
 * @param utFindInIn Value of the utFindIn
 *
 */

  public void setUsageType(UsageTypeObjectFilter utFindInIn) {
    utFindIn = utFindInIn;
  }

  public void translateFromMap() {
    utFindIn = UsageTypeObjectHelper.fromMapFilter(inputMap, "UsageType");
  }

/**
 *
 * Gets the UsageType
 * @return Value of the UsageType
 *
 */

  public UsageTypeObjectFilter getUsageType( ) {
    return utFindIn;
  }

}
