/*
 * Generated code DO NOT EDIT
 * Generated file: CollectorGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a CollectorGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CollectorGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CollectorObjectData noOpIn;

/**
 *
 * Constructor to create a   CollectorGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CollectorGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectorObjectData noOpInIn) {
    super(id, context, "CollectorGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Collector", CollectorObjectHelper.toMap(noOpIn, new HashMap(), "Collector").get("Collector"));
    }
  }
/**
 *
 * Sets the  Collector
 * @param noOpInIn CollectorObjectData to set
 *
 */
  public void setCollector(CollectorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Collector passed into the constructor
 * @return Simulated response
 *
 */
  public CollectorObjectData getCollector() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CollectorObjectHelper.fromMap(inputMap, "Collector");
  }
}
