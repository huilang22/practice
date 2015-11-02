/*
 * Generated code DO NOT EDIT
 * Generated file: InvsGeographicRegionFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsGeographicRegionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsGeographicRegionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsGeographicRegionObjectFilter InvsGeographicRegionFindIn;
/**
 *
 * Constructor to create a  InvsGeographicRegionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsGeographicRegionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsGeographicRegionObjectFilter InvsGeographicRegionFindInIn) {
    super(id, context, "InvsGeographicRegionFind");
    InvsGeographicRegionFindIn = InvsGeographicRegionFindInIn;
  }

  public void translateToMap() {
    if (InvsGeographicRegionFindIn != null) {
      Integer index =  InvsGeographicRegionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(InvsGeographicRegionFindIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }


/**
 *
 * Sets the InvsGeographicRegion
 * @param InvsGeographicRegionFindInIn Value of the InvsGeographicRegionFindIn
 *
 */

  public void setInvsGeographicRegion(InvsGeographicRegionObjectFilter InvsGeographicRegionFindInIn) {
    InvsGeographicRegionFindIn = InvsGeographicRegionFindInIn;
  }

  public void translateFromMap() {
    InvsGeographicRegionFindIn = InvsGeographicRegionObjectHelper.fromMapFilter(inputMap, "InvsGeographicRegion");
  }

/**
 *
 * Gets the InvsGeographicRegion
 * @return Value of the InvsGeographicRegion
 *
 */

  public InvsGeographicRegionObjectFilter getInvsGeographicRegion( ) {
    return InvsGeographicRegionFindIn;
  }

}
