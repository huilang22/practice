/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a PrepaymentDistributionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PrepaymentDistributionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PrepaymentDistributionObjectData noOpIn;

/**
 *
 * Constructor to create a   PrepaymentDistributionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PrepaymentDistributionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentDistributionObjectData noOpInIn) {
    super(id, context, "PrepaymentDistributionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectHelper.toMap(noOpIn, new HashMap(), "PrepaymentDistribution").get("PrepaymentDistribution"));
    }
  }
/**
 *
 * Sets the  PrepaymentDistribution
 * @param noOpInIn PrepaymentDistributionObjectData to set
 *
 */
  public void setPrepaymentDistribution(PrepaymentDistributionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PrepaymentDistribution passed into the constructor
 * @return Simulated response
 *
 */
  public PrepaymentDistributionObjectData getPrepaymentDistribution() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PrepaymentDistributionObjectHelper.fromMap(inputMap, "PrepaymentDistribution");
  }
}
