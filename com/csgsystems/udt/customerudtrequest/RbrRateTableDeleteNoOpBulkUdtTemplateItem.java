/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTableDeleteNoOpBulkUdtTemplateItem.java
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
