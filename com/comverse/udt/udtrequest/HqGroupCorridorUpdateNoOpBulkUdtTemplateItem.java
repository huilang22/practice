/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupCorridorUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupCorridorUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupCorridorObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupCorridorUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupCorridorUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectData noOpInIn) {
    super(id, context, "HqGroupCorridorUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
/**
 *
 * Sets the  HqGroupCorridor
 * @param noOpInIn HqGroupCorridorObjectData to set
 *
 */
  public void setHqGroupCorridor(HqGroupCorridorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupCorridor passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupCorridorObjectData getHqGroupCorridor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupCorridorObjectHelper.fromMap(inputMap, "HqGroupCorridor");
  }
}
