/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointRegionDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointRegionDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointRegionObjectData noOpIn;

/**
 *
 * Constructor to create a   PointRegionDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointRegionDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectData noOpInIn) {
    super(id, context, "PointRegionDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PointRegion", PointRegionObjectHelper.toMap(noOpIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
/**
 *
 * Sets the  PointRegion
 * @param noOpInIn PointRegionObjectData to set
 *
 */
  public void setPointRegion(PointRegionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PointRegion passed into the constructor
 * @return Simulated response
 *
 */
  public PointRegionObjectData getPointRegion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PointRegionObjectHelper.fromMap(inputMap, "PointRegion");
  }
}
