/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupCorridorCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupCorridorCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupCorridorObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupCorridorCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupCorridorCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectData noOpInIn) {
    super(id, context, "HqGroupCorridorCreate");
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
