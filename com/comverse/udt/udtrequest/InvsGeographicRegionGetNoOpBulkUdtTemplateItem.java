/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsGeographicRegionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsGeographicRegionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsGeographicRegionObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsGeographicRegionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsGeographicRegionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsGeographicRegionObjectData noOpInIn) {
    super(id, context, "InvsGeographicRegionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(noOpIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }
/**
 *
 * Sets the  InvsGeographicRegion
 * @param noOpInIn InvsGeographicRegionObjectData to set
 *
 */
  public void setInvsGeographicRegion(InvsGeographicRegionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsGeographicRegion passed into the constructor
 * @return Simulated response
 *
 */
  public InvsGeographicRegionObjectData getInvsGeographicRegion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsGeographicRegionObjectHelper.fromMap(inputMap, "InvsGeographicRegion");
  }
}
