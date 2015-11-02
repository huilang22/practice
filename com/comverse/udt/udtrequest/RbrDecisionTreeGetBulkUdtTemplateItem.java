/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrDecisionTreeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrDecisionTreeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrDecTreeObjectKeyData RbrDecTreeGetIn;
/**
 *
 * Constructor to create a  RbrDecisionTreeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrDecisionTreeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrDecTreeObjectKeyData RbrDecTreeGetInIn) {
    super(id, context, "RbrDecisionTreeGet");
    RbrDecTreeGetIn = RbrDecTreeGetInIn;
  }

  public void translateToMap() {
    if (RbrDecTreeGetIn != null) {
      RbrDecTreeGetIn.resetFlags(true, true);
      addInput("RbrDecisionTree", RbrDecTreeObjectKeyHelper.toMap(RbrDecTreeGetIn, new HashMap(), "RbrDecTreeObjectKeyData").get("RbrDecTreeObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrDecisionTree
 * @param RbrDecTreeGetInIn Value of the RbrDecTreeGetIn
 *
 */

  public void setRbrDecisionTree(RbrDecTreeObjectKeyData RbrDecTreeGetInIn) {
    RbrDecTreeGetIn = RbrDecTreeGetInIn;
  }

  public void translateFromMap() {
    RbrDecTreeGetIn = RbrDecTreeObjectKeyHelper.fromMap(inputMap, "RbrDecisionTree");
  }

/**
 *
 * Gets the RbrDecisionTree
 * @return Value of the RbrDecisionTree
 *
 */

  public RbrDecTreeObjectKeyData getRbrDecisionTree( ) {
    return RbrDecTreeGetIn;
  }

}
