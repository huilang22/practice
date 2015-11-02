/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LateFeeTypesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LateFeeTypesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LFTObjectData noOpIn;

/**
 *
 * Constructor to create a   LateFeeTypesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LateFeeTypesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LFTObjectData noOpInIn) {
    super(id, context, "LateFeeTypesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LateFeeTypes", LFTObjectHelper.toMap(noOpIn, new HashMap(), "LateFeeTypes").get("LateFeeTypes"));
    }
  }
/**
 *
 * Sets the  LateFeeTypes
 * @param noOpInIn LFTObjectData to set
 *
 */
  public void setLateFeeTypes(LFTObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LateFeeTypes passed into the constructor
 * @return Simulated response
 *
 */
  public LFTObjectData getLateFeeTypes() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LFTObjectHelper.fromMap(inputMap, "LateFeeTypes");
  }
}
