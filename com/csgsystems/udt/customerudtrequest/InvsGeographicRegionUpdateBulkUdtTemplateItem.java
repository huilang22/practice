/*
 * Generated code DO NOT EDIT
 * Generated file: InvsGeographicRegionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsGeographicRegionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsGeographicRegionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsGeographicRegionObjectData InvsGeographicRegionUpdateIn;
/**
 *
 * Constructor to create a  InvsGeographicRegionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsGeographicRegionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsGeographicRegionObjectData InvsGeographicRegionUpdateInIn) {
    super(id, context, "InvsGeographicRegionUpdate");
    InvsGeographicRegionUpdateIn = InvsGeographicRegionUpdateInIn;
  }

  public void translateToMap() {
    if (InvsGeographicRegionUpdateIn != null) {
      InvsGeographicRegionUpdateIn.resetFlags(true, true);
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(InvsGeographicRegionUpdateIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }


/**
 *
 * Sets the InvsGeographicRegion
 * @param InvsGeographicRegionUpdateInIn Value of the InvsGeographicRegionUpdateIn
 *
 */

  public void setInvsGeographicRegion(InvsGeographicRegionObjectData InvsGeographicRegionUpdateInIn) {
    InvsGeographicRegionUpdateIn = InvsGeographicRegionUpdateInIn;
  }

  public void translateFromMap() {
    InvsGeographicRegionUpdateIn = InvsGeographicRegionObjectHelper.fromMap(inputMap, "InvsGeographicRegion");
  }

/**
 *
 * Gets the InvsGeographicRegion
 * @return Value of the InvsGeographicRegion
 *
 */

  public InvsGeographicRegionObjectData getInvsGeographicRegion( ) {
    return InvsGeographicRegionUpdateIn;
  }

}
