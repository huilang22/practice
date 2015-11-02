/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatisticTypeRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatisticTypeRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatisticTypeRefObjectData noOpIn;

/**
 *
 * Constructor to create a   StatisticTypeRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatisticTypeRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeRefObjectData noOpInIn) {
    super(id, context, "StatisticTypeRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("StatisticTypeRef", StatisticTypeRefObjectHelper.toMap(noOpIn, new HashMap(), "StatisticTypeRef").get("StatisticTypeRef"));
    }
  }
/**
 *
 * Sets the  StatisticTypeRef
 * @param noOpInIn StatisticTypeRefObjectData to set
 *
 */
  public void setStatisticTypeRef(StatisticTypeRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatisticTypeRef passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeRefObjectData getStatisticTypeRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatisticTypeRefObjectHelper.fromMap(inputMap, "StatisticTypeRef");
  }
}
