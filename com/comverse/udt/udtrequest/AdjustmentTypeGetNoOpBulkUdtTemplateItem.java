/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjustmentTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeObjectData noOpInIn) {
    super(id, context, "AdjustmentTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AdjustmentType", AdjustmentTypeObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
  }
/**
 *
 * Sets the  AdjustmentType
 * @param noOpInIn AdjustmentTypeObjectData to set
 *
 */
  public void setAdjustmentType(AdjustmentTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentType passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeObjectData getAdjustmentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentTypeObjectHelper.fromMap(inputMap, "AdjustmentType");
  }
}
