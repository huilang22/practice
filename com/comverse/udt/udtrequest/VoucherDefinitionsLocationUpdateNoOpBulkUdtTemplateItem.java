/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsLocationUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherDefinitionsLocationUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherDefinitionsLocationUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherDefinitionsObjectData noOpIn;

/**
 *
 * Constructor to create a   VoucherDefinitionsLocationUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherDefinitionsLocationUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectData noOpInIn) {
    super(id, context, "VoucherDefinitionsLocationUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(noOpIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
/**
 *
 * Sets the  VoucherDefinitions
 * @param noOpInIn VoucherDefinitionsObjectData to set
 *
 */
  public void setVoucherDefinitions(VoucherDefinitionsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherDefinitions passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherDefinitionsObjectData getVoucherDefinitions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherDefinitionsObjectHelper.fromMap(inputMap, "VoucherDefinitions");
  }
}
