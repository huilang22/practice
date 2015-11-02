/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterCreateBulkUdtTemplateItem.java
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
 * Class used to create a OwningCostCenterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OwningCostCenterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OwningCostCenterObjectData OCCCreateIn;
/**
 *
 * Constructor to create a  OwningCostCenterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OwningCostCenterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectData OCCCreateInIn) {
    super(id, context, "OwningCostCenterCreate");
    OCCCreateIn = OCCCreateInIn;
  }

  public void translateToMap() {
    if (OCCCreateIn != null) {
      OCCCreateIn.resetFlags(true, true);
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(OCCCreateIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }


/**
 *
 * Sets the OwningCostCenter
 * @param OCCCreateInIn Value of the OCCCreateIn
 *
 */

  public void setOwningCostCenter(OwningCostCenterObjectData OCCCreateInIn) {
    OCCCreateIn = OCCCreateInIn;
  }

  public void translateFromMap() {
    OCCCreateIn = OwningCostCenterObjectHelper.fromMap(inputMap, "OwningCostCenter");
  }

/**
 *
 * Gets the OwningCostCenter
 * @return Value of the OwningCostCenter
 *
 */

  public OwningCostCenterObjectData getOwningCostCenter( ) {
    return OCCCreateIn;
  }

}
