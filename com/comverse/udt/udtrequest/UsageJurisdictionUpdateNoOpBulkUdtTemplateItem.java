/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageJurisdictionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageJurisdictionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageJurisdictionObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageJurisdictionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageJurisdictionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectData noOpInIn) {
    super(id, context, "UsageJurisdictionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(noOpIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }
/**
 *
 * Sets the  UsageJurisdiction
 * @param noOpInIn UsageJurisdictionObjectData to set
 *
 */
  public void setUsageJurisdiction(UsageJurisdictionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageJurisdiction passed into the constructor
 * @return Simulated response
 *
 */
  public UsageJurisdictionObjectData getUsageJurisdiction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageJurisdictionObjectHelper.fromMap(inputMap, "UsageJurisdiction");
  }
}
