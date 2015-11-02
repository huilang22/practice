/*
 * Generated code DO NOT EDIT
 * Generated file: PointRegionGetBulkUdtTemplateItem.java
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
 * Class used to create a PointRegionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PointRegionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointRegionObjectKeyData PRGetIn;
/**
 *
 * Constructor to create a  PointRegionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointRegionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectKeyData PRGetInIn) {
    super(id, context, "PointRegionGet");
    PRGetIn = PRGetInIn;
  }

  public void translateToMap() {
    if (PRGetIn != null) {
      PRGetIn.resetFlags(true, true);
      addInput("PointRegion", PointRegionObjectKeyHelper.toMap(PRGetIn, new HashMap(), "PointRegionObjectKeyData").get("PointRegionObjectKeyData"));
    }
  }


/**
 *
 * Sets the PointRegion
 * @param PRGetInIn Value of the PRGetIn
 *
 */

  public void setPointRegion(PointRegionObjectKeyData PRGetInIn) {
    PRGetIn = PRGetInIn;
  }

  public void translateFromMap() {
    PRGetIn = PointRegionObjectKeyHelper.fromMap(inputMap, "PointRegion");
  }

/**
 *
 * Gets the PointRegion
 * @return Value of the PointRegion
 *
 */

  public PointRegionObjectKeyData getPointRegion( ) {
    return PRGetIn;
  }

}
