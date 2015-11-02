/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorConvertNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorConvertNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorConvertNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CorridorObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorConvertNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorConvertNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectData noOpInIn) {
    super(id, context, "CorridorConvert");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Corridor", CorridorObjectHelper.toMap(noOpIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }
/**
 *
 * Sets the  Corridor
 * @param noOpInIn CorridorObjectData to set
 *
 */
  public void setCorridor(CorridorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Corridor passed into the constructor
 * @return Simulated response
 *
 */
  public CorridorObjectData getCorridor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CorridorObjectHelper.fromMap(inputMap, "Corridor");
  }
}
