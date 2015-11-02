/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionUpdateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a PointRegionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PointRegionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointRegionObjectData PRUpdateIn;
/**
 *
 * Constructor to create a  PointRegionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointRegionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectData PRUpdateInIn) {
    super(id, context, "PointRegionUpdate");
    PRUpdateIn = PRUpdateInIn;
  }

  public void translateToMap() {
    if (PRUpdateIn != null) {
      PRUpdateIn.resetFlags(true, true);
      addInput("PointRegion", PointRegionObjectHelper.toMap(PRUpdateIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }


/**
 *
 * Sets the PointRegion
 * @param PRUpdateInIn Value of the PRUpdateIn
 *
 */

  public void setPointRegion(PointRegionObjectData PRUpdateInIn) {
    PRUpdateIn = PRUpdateInIn;
  }

  public void translateFromMap() {
    PRUpdateIn = PointRegionObjectHelper.fromMap(inputMap, "PointRegion");
  }

/**
 *
 * Gets the PointRegion
 * @return Value of the PointRegion
 *
 */

  public PointRegionObjectData getPointRegion( ) {
    return PRUpdateIn;
  }

}
