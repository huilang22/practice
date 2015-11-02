/*
 * Generated code DO NOT EDIT
 * Generated file: RbrDecisionTreeDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RbrDecisionTreeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrDecisionTreeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrDecTreeObjectKeyData RbrDecTreeDeleteIn;
/**
 *
 * Constructor to create a  RbrDecisionTreeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrDecisionTreeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrDecTreeObjectKeyData RbrDecTreeDeleteInIn) {
    super(id, context, "RbrDecisionTreeDelete");
    RbrDecTreeDeleteIn = RbrDecTreeDeleteInIn;
  }

  public void translateToMap() {
    if (RbrDecTreeDeleteIn != null) {
      RbrDecTreeDeleteIn.resetFlags(true, true);
      addInput("RbrDecisionTree", RbrDecTreeObjectKeyHelper.toMap(RbrDecTreeDeleteIn, new HashMap(), "RbrDecTreeObjectKeyData").get("RbrDecTreeObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrDecisionTree
 * @param RbrDecTreeDeleteInIn Value of the RbrDecTreeDeleteIn
 *
 */

  public void setRbrDecisionTree(RbrDecTreeObjectKeyData RbrDecTreeDeleteInIn) {
    RbrDecTreeDeleteIn = RbrDecTreeDeleteInIn;
  }

  public void translateFromMap() {
    RbrDecTreeDeleteIn = RbrDecTreeObjectKeyHelper.fromMap(inputMap, "RbrDecisionTree");
  }

/**
 *
 * Gets the RbrDecisionTree
 * @return Value of the RbrDecisionTree
 *
 */

  public RbrDecTreeObjectKeyData getRbrDecisionTree( ) {
    return RbrDecTreeDeleteIn;
  }

}
