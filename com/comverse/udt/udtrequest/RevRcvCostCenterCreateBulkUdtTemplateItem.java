/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterCreateBulkUdtTemplateItem.java
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
 * Class used to create a RevRcvCostCenterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RevRcvCostCenterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RevRcvCostCenterObjectData RRCCCreateIn;
/**
 *
 * Constructor to create a  RevRcvCostCenterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RevRcvCostCenterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RevRcvCostCenterObjectData RRCCCreateInIn) {
    super(id, context, "RevRcvCostCenterCreate");
    RRCCCreateIn = RRCCCreateInIn;
  }

  public void translateToMap() {
    if (RRCCCreateIn != null) {
      RRCCCreateIn.resetFlags(true, true);
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(RRCCCreateIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }


/**
 *
 * Sets the RevRcvCostCenter
 * @param RRCCCreateInIn Value of the RRCCCreateIn
 *
 */

  public void setRevRcvCostCenter(RevRcvCostCenterObjectData RRCCCreateInIn) {
    RRCCCreateIn = RRCCCreateInIn;
  }

  public void translateFromMap() {
    RRCCCreateIn = RevRcvCostCenterObjectHelper.fromMap(inputMap, "RevRcvCostCenter");
  }

/**
 *
 * Gets the RevRcvCostCenter
 * @return Value of the RevRcvCostCenter
 *
 */

  public RevRcvCostCenterObjectData getRevRcvCostCenter( ) {
    return RRCCCreateIn;
  }

}
