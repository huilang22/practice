/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointTextFindBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointTextFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointTextFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsagePointTextObjectFilter UsagePointTextFindIn;
/**
 *
 * Constructor to create a  UsagePointTextFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointTextFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsagePointTextObjectFilter UsagePointTextFindInIn) {
    super(id, context, "UsagePointTextFind");
    UsagePointTextFindIn = UsagePointTextFindInIn;
  }

  public void translateToMap() {
    if (UsagePointTextFindIn != null) {
      Integer index =  UsagePointTextFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(UsagePointTextFindIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }


/**
 *
 * Sets the UsagePointText
 * @param UsagePointTextFindInIn Value of the UsagePointTextFindIn
 *
 */

  public void setUsagePointText(UsagePointTextObjectFilter UsagePointTextFindInIn) {
    UsagePointTextFindIn = UsagePointTextFindInIn;
  }

  public void translateFromMap() {
    UsagePointTextFindIn = UsagePointTextObjectHelper.fromMapFilter(inputMap, "UsagePointText");
  }

/**
 *
 * Gets the UsagePointText
 * @return Value of the UsagePointText
 *
 */

  public UsagePointTextObjectFilter getUsagePointText( ) {
    return UsagePointTextFindIn;
  }

}
