/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterFindBulkUdtTemplateItem.java
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
 * Class used to create a RevRcvCostCenterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RevRcvCostCenterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RevRcvCostCenterObjectFilter RRCCFindIn;
/**
 *
 * Constructor to create a  RevRcvCostCenterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RevRcvCostCenterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RevRcvCostCenterObjectFilter RRCCFindInIn) {
    super(id, context, "RevRcvCostCenterFind");
    RRCCFindIn = RRCCFindInIn;
  }

  public void translateToMap() {
    if (RRCCFindIn != null) {
      Integer index =  RRCCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(RRCCFindIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }


/**
 *
 * Sets the RevRcvCostCenter
 * @param RRCCFindInIn Value of the RRCCFindIn
 *
 */

  public void setRevRcvCostCenter(RevRcvCostCenterObjectFilter RRCCFindInIn) {
    RRCCFindIn = RRCCFindInIn;
  }

  public void translateFromMap() {
    RRCCFindIn = RevRcvCostCenterObjectHelper.fromMapFilter(inputMap, "RevRcvCostCenter");
  }

/**
 *
 * Gets the RevRcvCostCenter
 * @return Value of the RevRcvCostCenter
 *
 */

  public RevRcvCostCenterObjectFilter getRevRcvCostCenter( ) {
    return RRCCFindIn;
  }

}
