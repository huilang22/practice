/*
 * Generated code DO NOT EDIT
 * Generated file: RbrDecisionTreeGetBulkUdtTemplateItem.java
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
