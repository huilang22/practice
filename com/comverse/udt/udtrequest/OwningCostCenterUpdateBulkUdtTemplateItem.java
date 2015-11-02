/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OwningCostCenterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OwningCostCenterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OwningCostCenterObjectData OCCUpdateIn;
/**
 *
 * Constructor to create a  OwningCostCenterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OwningCostCenterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectData OCCUpdateInIn) {
    super(id, context, "OwningCostCenterUpdate");
    OCCUpdateIn = OCCUpdateInIn;
  }

  public void translateToMap() {
    if (OCCUpdateIn != null) {
      OCCUpdateIn.resetFlags(true, true);
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(OCCUpdateIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }


/**
 *
 * Sets the OwningCostCenter
 * @param OCCUpdateInIn Value of the OCCUpdateIn
 *
 */

  public void setOwningCostCenter(OwningCostCenterObjectData OCCUpdateInIn) {
    OCCUpdateIn = OCCUpdateInIn;
  }

  public void translateFromMap() {
    OCCUpdateIn = OwningCostCenterObjectHelper.fromMap(inputMap, "OwningCostCenter");
  }

/**
 *
 * Gets the OwningCostCenter
 * @return Value of the OwningCostCenter
 *
 */

  public OwningCostCenterObjectData getOwningCostCenter( ) {
    return OCCUpdateIn;
  }

}
