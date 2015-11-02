/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RevRcvCostCenterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RevRcvCostCenterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RevRcvCostCenterObjectData RRCCUpdateIn;
/**
 *
 * Constructor to create a  RevRcvCostCenterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RevRcvCostCenterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RevRcvCostCenterObjectData RRCCUpdateInIn) {
    super(id, context, "RevRcvCostCenterUpdate");
    RRCCUpdateIn = RRCCUpdateInIn;
  }

  public void translateToMap() {
    if (RRCCUpdateIn != null) {
      RRCCUpdateIn.resetFlags(true, true);
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(RRCCUpdateIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }


/**
 *
 * Sets the RevRcvCostCenter
 * @param RRCCUpdateInIn Value of the RRCCUpdateIn
 *
 */

  public void setRevRcvCostCenter(RevRcvCostCenterObjectData RRCCUpdateInIn) {
    RRCCUpdateIn = RRCCUpdateInIn;
  }

  public void translateFromMap() {
    RRCCUpdateIn = RevRcvCostCenterObjectHelper.fromMap(inputMap, "RevRcvCostCenter");
  }

/**
 *
 * Gets the RevRcvCostCenter
 * @return Value of the RevRcvCostCenter
 *
 */

  public RevRcvCostCenterObjectData getRevRcvCostCenter( ) {
    return RRCCUpdateIn;
  }

}
