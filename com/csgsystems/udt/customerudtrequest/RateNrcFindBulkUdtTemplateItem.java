/*
 * Generated code DO NOT EDIT
 * Generated file: RateNrcFindBulkUdtTemplateItem.java
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
 * Class used to create a RateNrcFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateNrcFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateNrcObjectFilter rnrcFindIn;
/**
 *
 * Constructor to create a  RateNrcFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateNrcFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateNrcObjectFilter rnrcFindInIn) {
    super(id, context, "RateNrcFind");
    rnrcFindIn = rnrcFindInIn;
  }

  public void translateToMap() {
    if (rnrcFindIn != null) {
      Integer index =  rnrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateNrc", RateNrcObjectHelper.toMap(rnrcFindIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }


/**
 *
 * Sets the RateNrc
 * @param rnrcFindInIn Value of the rnrcFindIn
 *
 */

  public void setRateNrc(RateNrcObjectFilter rnrcFindInIn) {
    rnrcFindIn = rnrcFindInIn;
  }

  public void translateFromMap() {
    rnrcFindIn = RateNrcObjectHelper.fromMapFilter(inputMap, "RateNrc");
  }

/**
 *
 * Gets the RateNrc
 * @return Value of the RateNrc
 *
 */

  public RateNrcObjectFilter getRateNrc( ) {
    return rnrcFindIn;
  }

}
