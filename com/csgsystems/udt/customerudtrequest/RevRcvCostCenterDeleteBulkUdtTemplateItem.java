/*
 * Generated code DO NOT EDIT
 * Generated file: RevRcvCostCenterDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a RevRcvCostCenterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RevRcvCostCenterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RevRcvCostCenterObjectKeyData RRCCDeleteIn;
/**
 *
 * Constructor to create a  RevRcvCostCenterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RevRcvCostCenterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCDeleteInIn) {
    super(id, context, "RevRcvCostCenterDelete");
    RRCCDeleteIn = RRCCDeleteInIn;
  }

  public void translateToMap() {
    if (RRCCDeleteIn != null) {
      RRCCDeleteIn.resetFlags(true, true);
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectKeyHelper.toMap(RRCCDeleteIn, new HashMap(), "RevRcvCostCenterObjectKeyData").get("RevRcvCostCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the RevRcvCostCenter
 * @param RRCCDeleteInIn Value of the RRCCDeleteIn
 *
 */

  public void setRevRcvCostCenter(RevRcvCostCenterObjectKeyData RRCCDeleteInIn) {
    RRCCDeleteIn = RRCCDeleteInIn;
  }

  public void translateFromMap() {
    RRCCDeleteIn = RevRcvCostCenterObjectKeyHelper.fromMap(inputMap, "RevRcvCostCenter");
  }

/**
 *
 * Gets the RevRcvCostCenter
 * @return Value of the RevRcvCostCenter
 *
 */

  public RevRcvCostCenterObjectKeyData getRevRcvCostCenter( ) {
    return RRCCDeleteIn;
  }

}
