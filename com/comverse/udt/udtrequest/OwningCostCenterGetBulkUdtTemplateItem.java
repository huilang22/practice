/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterGetBulkUdtTemplateItem.java
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
 * Class used to create a OwningCostCenterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OwningCostCenterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OwningCostCenterObjectKeyData OCCGetIn;
/**
 *
 * Constructor to create a  OwningCostCenterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OwningCostCenterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectKeyData OCCGetInIn) {
    super(id, context, "OwningCostCenterGet");
    OCCGetIn = OCCGetInIn;
  }

  public void translateToMap() {
    if (OCCGetIn != null) {
      OCCGetIn.resetFlags(true, true);
      addInput("OwningCostCenter", OwningCostCenterObjectKeyHelper.toMap(OCCGetIn, new HashMap(), "OwningCostCenterObjectKeyData").get("OwningCostCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the OwningCostCenter
 * @param OCCGetInIn Value of the OCCGetIn
 *
 */

  public void setOwningCostCenter(OwningCostCenterObjectKeyData OCCGetInIn) {
    OCCGetIn = OCCGetInIn;
  }

  public void translateFromMap() {
    OCCGetIn = OwningCostCenterObjectKeyHelper.fromMap(inputMap, "OwningCostCenter");
  }

/**
 *
 * Gets the OwningCostCenter
 * @return Value of the OwningCostCenter
 *
 */

  public OwningCostCenterObjectKeyData getOwningCostCenter( ) {
    return OCCGetIn;
  }

}
