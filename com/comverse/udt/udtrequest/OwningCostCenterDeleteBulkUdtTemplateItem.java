/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterDeleteBulkUdtTemplateItem.java
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
 * Class used to create a OwningCostCenterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class OwningCostCenterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OwningCostCenterObjectKeyData OCCDeleteIn;
/**
 *
 * Constructor to create a  OwningCostCenterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OwningCostCenterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectKeyData OCCDeleteInIn) {
    super(id, context, "OwningCostCenterDelete");
    OCCDeleteIn = OCCDeleteInIn;
  }

  public void translateToMap() {
    if (OCCDeleteIn != null) {
      OCCDeleteIn.resetFlags(true, true);
      addInput("OwningCostCenter", OwningCostCenterObjectKeyHelper.toMap(OCCDeleteIn, new HashMap(), "OwningCostCenterObjectKeyData").get("OwningCostCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the OwningCostCenter
 * @param OCCDeleteInIn Value of the OCCDeleteIn
 *
 */

  public void setOwningCostCenter(OwningCostCenterObjectKeyData OCCDeleteInIn) {
    OCCDeleteIn = OCCDeleteInIn;
  }

  public void translateFromMap() {
    OCCDeleteIn = OwningCostCenterObjectKeyHelper.fromMap(inputMap, "OwningCostCenter");
  }

/**
 *
 * Gets the OwningCostCenter
 * @return Value of the OwningCostCenter
 *
 */

  public OwningCostCenterObjectKeyData getOwningCostCenter( ) {
    return OCCDeleteIn;
  }

}
