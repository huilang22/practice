/*
 * Generated code DO NOT EDIT
 * Generated file: RevRcvCostCenterGetBulkUdtTemplateItem.java
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
 * Class used to create a RevRcvCostCenterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RevRcvCostCenterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RevRcvCostCenterObjectKeyData RRCCGetIn;
/**
 *
 * Constructor to create a  RevRcvCostCenterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RevRcvCostCenterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RevRcvCostCenterObjectKeyData RRCCGetInIn) {
    super(id, context, "RevRcvCostCenterGet");
    RRCCGetIn = RRCCGetInIn;
  }

  public void translateToMap() {
    if (RRCCGetIn != null) {
      RRCCGetIn.resetFlags(true, true);
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectKeyHelper.toMap(RRCCGetIn, new HashMap(), "RevRcvCostCenterObjectKeyData").get("RevRcvCostCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the RevRcvCostCenter
 * @param RRCCGetInIn Value of the RRCCGetIn
 *
 */

  public void setRevRcvCostCenter(RevRcvCostCenterObjectKeyData RRCCGetInIn) {
    RRCCGetIn = RRCCGetInIn;
  }

  public void translateFromMap() {
    RRCCGetIn = RevRcvCostCenterObjectKeyHelper.fromMap(inputMap, "RevRcvCostCenter");
  }

/**
 *
 * Gets the RevRcvCostCenter
 * @return Value of the RevRcvCostCenter
 *
 */

  public RevRcvCostCenterObjectKeyData getRevRcvCostCenter( ) {
    return RRCCGetIn;
  }

}
