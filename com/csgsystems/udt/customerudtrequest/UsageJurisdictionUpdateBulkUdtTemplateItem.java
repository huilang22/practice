/*
 * Generated code DO NOT EDIT
 * Generated file: UsageJurisdictionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsageJurisdictionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageJurisdictionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageJurisdictionObjectData UsageJurisdictionUpdateIn;
/**
 *
 * Constructor to create a  UsageJurisdictionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageJurisdictionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectData UsageJurisdictionUpdateInIn) {
    super(id, context, "UsageJurisdictionUpdate");
    UsageJurisdictionUpdateIn = UsageJurisdictionUpdateInIn;
  }

  public void translateToMap() {
    if (UsageJurisdictionUpdateIn != null) {
      UsageJurisdictionUpdateIn.resetFlags(true, true);
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(UsageJurisdictionUpdateIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }


/**
 *
 * Sets the UsageJurisdiction
 * @param UsageJurisdictionUpdateInIn Value of the UsageJurisdictionUpdateIn
 *
 */

  public void setUsageJurisdiction(UsageJurisdictionObjectData UsageJurisdictionUpdateInIn) {
    UsageJurisdictionUpdateIn = UsageJurisdictionUpdateInIn;
  }

  public void translateFromMap() {
    UsageJurisdictionUpdateIn = UsageJurisdictionObjectHelper.fromMap(inputMap, "UsageJurisdiction");
  }

/**
 *
 * Gets the UsageJurisdiction
 * @return Value of the UsageJurisdiction
 *
 */

  public UsageJurisdictionObjectData getUsageJurisdiction( ) {
    return UsageJurisdictionUpdateIn;
  }

}
