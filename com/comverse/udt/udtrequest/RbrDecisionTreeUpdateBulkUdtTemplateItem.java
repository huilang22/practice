/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RbrDecisionTreeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrDecisionTreeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrDecTreeObjectData RbrDecTreeUpdateIn;
/**
 *
 * Constructor to create a  RbrDecisionTreeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrDecisionTreeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrDecTreeObjectData RbrDecTreeUpdateInIn) {
    super(id, context, "RbrDecisionTreeUpdate");
    RbrDecTreeUpdateIn = RbrDecTreeUpdateInIn;
  }

  public void translateToMap() {
    if (RbrDecTreeUpdateIn != null) {
      RbrDecTreeUpdateIn.resetFlags(true, true);
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(RbrDecTreeUpdateIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }


/**
 *
 * Sets the RbrDecisionTree
 * @param RbrDecTreeUpdateInIn Value of the RbrDecTreeUpdateIn
 *
 */

  public void setRbrDecisionTree(RbrDecTreeObjectData RbrDecTreeUpdateInIn) {
    RbrDecTreeUpdateIn = RbrDecTreeUpdateInIn;
  }

  public void translateFromMap() {
    RbrDecTreeUpdateIn = RbrDecTreeObjectHelper.fromMap(inputMap, "RbrDecisionTree");
  }

/**
 *
 * Gets the RbrDecisionTree
 * @return Value of the RbrDecisionTree
 *
 */

  public RbrDecTreeObjectData getRbrDecisionTree( ) {
    return RbrDecTreeUpdateIn;
  }

}
