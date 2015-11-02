/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OwningCostCenterDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OwningCostCenterDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OwningCostCenterObjectData noOpIn;

/**
 *
 * Constructor to create a   OwningCostCenterDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OwningCostCenterDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectData noOpInIn) {
    super(id, context, "OwningCostCenterDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(noOpIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
/**
 *
 * Sets the  OwningCostCenter
 * @param noOpInIn OwningCostCenterObjectData to set
 *
 */
  public void setOwningCostCenter(OwningCostCenterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OwningCostCenter passed into the constructor
 * @return Simulated response
 *
 */
  public OwningCostCenterObjectData getOwningCostCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OwningCostCenterObjectHelper.fromMap(inputMap, "OwningCostCenter");
  }
}
