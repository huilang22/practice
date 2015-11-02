/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeRefFindBulkUdtTemplateItem.java
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
 * Class used to create a StatisticTypeRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class StatisticTypeRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatisticTypeRefObjectFilter StatisticTypeRefFindIn;
/**
 *
 * Constructor to create a  StatisticTypeRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatisticTypeRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeRefObjectFilter StatisticTypeRefFindInIn) {
    super(id, context, "StatisticTypeRefFind");
    StatisticTypeRefFindIn = StatisticTypeRefFindInIn;
  }

  public void translateToMap() {
    if (StatisticTypeRefFindIn != null) {
      Integer index =  StatisticTypeRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatisticTypeRef", StatisticTypeRefObjectHelper.toMap(StatisticTypeRefFindIn, new HashMap(), "StatisticTypeRef").get("StatisticTypeRef"));
    }
  }


/**
 *
 * Sets the StatisticTypeRef
 * @param StatisticTypeRefFindInIn Value of the StatisticTypeRefFindIn
 *
 */

  public void setStatisticTypeRef(StatisticTypeRefObjectFilter StatisticTypeRefFindInIn) {
    StatisticTypeRefFindIn = StatisticTypeRefFindInIn;
  }

  public void translateFromMap() {
    StatisticTypeRefFindIn = StatisticTypeRefObjectHelper.fromMapFilter(inputMap, "StatisticTypeRef");
  }

/**
 *
 * Gets the StatisticTypeRef
 * @return Value of the StatisticTypeRef
 *
 */

  public StatisticTypeRefObjectFilter getStatisticTypeRef( ) {
    return StatisticTypeRefFindIn;
  }

}
