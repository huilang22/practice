/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BoundaryGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a BoundaryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BoundaryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BoundaryObjectData noOpIn;

/**
 *
 * Constructor to create a   BoundaryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BoundaryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BoundaryObjectData noOpInIn) {
    super(id, context, "BoundaryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Boundary", BoundaryObjectHelper.toMap(noOpIn, new HashMap(), "Boundary").get("Boundary"));
    }
  }
/**
 *
 * Sets the  Boundary
 * @param noOpInIn BoundaryObjectData to set
 *
 */
  public void setBoundary(BoundaryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Boundary passed into the constructor
 * @return Simulated response
 *
 */
  public BoundaryObjectData getBoundary() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BoundaryObjectHelper.fromMap(inputMap, "Boundary");
  }
}
