/*
 * Generated code DO NOT EDIT
 * Generated file: PointRegionFindBulkUdtTemplateItem.java
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
 * Class used to create a PointRegionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PointRegionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointRegionObjectFilter PRFindIn;
/**
 *
 * Constructor to create a  PointRegionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointRegionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectFilter PRFindInIn) {
    super(id, context, "PointRegionFind");
    PRFindIn = PRFindInIn;
  }

  public void translateToMap() {
    if (PRFindIn != null) {
      Integer index =  PRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PointRegion", PointRegionObjectHelper.toMap(PRFindIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }


/**
 *
 * Sets the PointRegion
 * @param PRFindInIn Value of the PRFindIn
 *
 */

  public void setPointRegion(PointRegionObjectFilter PRFindInIn) {
    PRFindIn = PRFindInIn;
  }

  public void translateFromMap() {
    PRFindIn = PointRegionObjectHelper.fromMapFilter(inputMap, "PointRegion");
  }

/**
 *
 * Gets the PointRegion
 * @return Value of the PointRegion
 *
 */

  public PointRegionObjectFilter getPointRegion( ) {
    return PRFindIn;
  }

}
