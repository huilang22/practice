/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrRateTableDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrRateTableDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrRateTableObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrRateTableDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrRateTableDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRateTableObjectData noOpInIn) {
    super(id, context, "RbrRateTableDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(noOpIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }
/**
 *
 * Sets the  RbrRateTable
 * @param noOpInIn RbrRateTableObjectData to set
 *
 */
  public void setRbrRateTable(RbrRateTableObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrRateTable passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRateTableObjectData getRbrRateTable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrRateTableObjectHelper.fromMap(inputMap, "RbrRateTable");
  }
}
