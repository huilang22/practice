/*
 * Generated code DO NOT EDIT
 * Generated file: RbrDecisionTreeCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrDecisionTreeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrDecisionTreeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrDecTreeObjectData RbrDecTreeCreateIn;
/**
 *
 * Constructor to create a  RbrDecisionTreeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrDecisionTreeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrDecTreeObjectData RbrDecTreeCreateInIn) {
    super(id, context, "RbrDecisionTreeCreate");
    RbrDecTreeCreateIn = RbrDecTreeCreateInIn;
  }

  public void translateToMap() {
    if (RbrDecTreeCreateIn != null) {
      RbrDecTreeCreateIn.resetFlags(true, true);
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(RbrDecTreeCreateIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }


/**
 *
 * Sets the RbrDecisionTree
 * @param RbrDecTreeCreateInIn Value of the RbrDecTreeCreateIn
 *
 */

  public void setRbrDecisionTree(RbrDecTreeObjectData RbrDecTreeCreateInIn) {
    RbrDecTreeCreateIn = RbrDecTreeCreateInIn;
  }

  public void translateFromMap() {
    RbrDecTreeCreateIn = RbrDecTreeObjectHelper.fromMap(inputMap, "RbrDecisionTree");
  }

/**
 *
 * Gets the RbrDecisionTree
 * @return Value of the RbrDecisionTree
 *
 */

  public RbrDecTreeObjectData getRbrDecisionTree( ) {
    return RbrDecTreeCreateIn;
  }

}
