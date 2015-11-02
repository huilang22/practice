/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionCreateBulkUdtTemplateItem.java
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
