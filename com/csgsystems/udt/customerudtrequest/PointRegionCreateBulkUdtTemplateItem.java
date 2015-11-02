/*
 * Generated code DO NOT EDIT
 * Generated file: PointRegionCreateBulkUdtTemplateItem.java
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
 * Class used to create a PointRegionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PointRegionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointRegionObjectData PRCreateIn;
/**
 *
 * Constructor to create a  PointRegionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointRegionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectData PRCreateInIn) {
    super(id, context, "PointRegionCreate");
    PRCreateIn = PRCreateInIn;
  }

  public void translateToMap() {
    if (PRCreateIn != null) {
      PRCreateIn.resetFlags(true, true);
      addInput("PointRegion", PointRegionObjectHelper.toMap(PRCreateIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }


/**
 *
 * Sets the PointRegion
 * @param PRCreateInIn Value of the PRCreateIn
 *
 */

  public void setPointRegion(PointRegionObjectData PRCreateInIn) {
    PRCreateIn = PRCreateInIn;
  }

  public void translateFromMap() {
    PRCreateIn = PointRegionObjectHelper.fromMap(inputMap, "PointRegion");
  }

/**
 *
 * Gets the PointRegion
 * @return Value of the PointRegion
 *
 */

  public PointRegionObjectData getPointRegion( ) {
    return PRCreateIn;
  }

}
