/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointFindBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsgPntObjectFilter UsgPntFindIn;
/**
 *
 * Constructor to create a  UsagePointFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsgPntObjectFilter UsgPntFindInIn) {
    super(id, context, "UsagePointFind");
    UsgPntFindIn = UsgPntFindInIn;
  }

  public void translateToMap() {
    if (UsgPntFindIn != null) {
      Integer index =  UsgPntFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsagePoint", UsgPntObjectHelper.toMap(UsgPntFindIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }


/**
 *
 * Sets the UsagePoint
 * @param UsgPntFindInIn Value of the UsgPntFindIn
 *
 */

  public void setUsagePoint(UsgPntObjectFilter UsgPntFindInIn) {
    UsgPntFindIn = UsgPntFindInIn;
  }

  public void translateFromMap() {
    UsgPntFindIn = UsgPntObjectHelper.fromMapFilter(inputMap, "UsagePoint");
  }

/**
 *
 * Gets the UsagePoint
 * @return Value of the UsagePoint
 *
 */

  public UsgPntObjectFilter getUsagePoint( ) {
    return UsgPntFindIn;
  }

}
