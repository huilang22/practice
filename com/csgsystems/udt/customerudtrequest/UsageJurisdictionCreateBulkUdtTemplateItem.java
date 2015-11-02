/*
 * Generated code DO NOT EDIT
 * Generated file: UsageJurisdictionCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsageJurisdictionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageJurisdictionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageJurisdictionObjectData ujCrIn;
/**
 *
 * Constructor to create a  UsageJurisdictionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageJurisdictionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectData ujCrInIn) {
    super(id, context, "UsageJurisdictionCreate");
    ujCrIn = ujCrInIn;
  }

  public void translateToMap() {
    if (ujCrIn != null) {
      ujCrIn.resetFlags(true, true);
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(ujCrIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }


/**
 *
 * Sets the UsageJurisdiction
 * @param ujCrInIn Value of the ujCrIn
 *
 */

  public void setUsageJurisdiction(UsageJurisdictionObjectData ujCrInIn) {
    ujCrIn = ujCrInIn;
  }

  public void translateFromMap() {
    ujCrIn = UsageJurisdictionObjectHelper.fromMap(inputMap, "UsageJurisdiction");
  }

/**
 *
 * Gets the UsageJurisdiction
 * @return Value of the UsageJurisdiction
 *
 */

  public UsageJurisdictionObjectData getUsageJurisdiction( ) {
    return ujCrIn;
  }

}
