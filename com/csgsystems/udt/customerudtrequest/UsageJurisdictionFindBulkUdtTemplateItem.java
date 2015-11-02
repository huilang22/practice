/*
 * Generated code DO NOT EDIT
 * Generated file: UsageJurisdictionFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageJurisdictionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageJurisdictionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageJurisdictionObjectFilter UsageJurisdictionFindIn;
/**
 *
 * Constructor to create a  UsageJurisdictionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageJurisdictionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectFilter UsageJurisdictionFindInIn) {
    super(id, context, "UsageJurisdictionFind");
    UsageJurisdictionFindIn = UsageJurisdictionFindInIn;
  }

  public void translateToMap() {
    if (UsageJurisdictionFindIn != null) {
      Integer index =  UsageJurisdictionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(UsageJurisdictionFindIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }


/**
 *
 * Sets the UsageJurisdiction
 * @param UsageJurisdictionFindInIn Value of the UsageJurisdictionFindIn
 *
 */

  public void setUsageJurisdiction(UsageJurisdictionObjectFilter UsageJurisdictionFindInIn) {
    UsageJurisdictionFindIn = UsageJurisdictionFindInIn;
  }

  public void translateFromMap() {
    UsageJurisdictionFindIn = UsageJurisdictionObjectHelper.fromMapFilter(inputMap, "UsageJurisdiction");
  }

/**
 *
 * Gets the UsageJurisdiction
 * @return Value of the UsageJurisdiction
 *
 */

  public UsageJurisdictionObjectFilter getUsageJurisdiction( ) {
    return UsageJurisdictionFindIn;
  }

}
