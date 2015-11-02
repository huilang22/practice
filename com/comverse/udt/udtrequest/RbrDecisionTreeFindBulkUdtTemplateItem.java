/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrDecisionTreeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrDecisionTreeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrDecTreeObjectFilter RbrDecTreeFindIn;
/**
 *
 * Constructor to create a  RbrDecisionTreeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrDecisionTreeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrDecTreeObjectFilter RbrDecTreeFindInIn) {
    super(id, context, "RbrDecisionTreeFind");
    RbrDecTreeFindIn = RbrDecTreeFindInIn;
  }

  public void translateToMap() {
    if (RbrDecTreeFindIn != null) {
      Integer index =  RbrDecTreeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(RbrDecTreeFindIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }


/**
 *
 * Sets the RbrDecisionTree
 * @param RbrDecTreeFindInIn Value of the RbrDecTreeFindIn
 *
 */

  public void setRbrDecisionTree(RbrDecTreeObjectFilter RbrDecTreeFindInIn) {
    RbrDecTreeFindIn = RbrDecTreeFindInIn;
  }

  public void translateFromMap() {
    RbrDecTreeFindIn = RbrDecTreeObjectHelper.fromMapFilter(inputMap, "RbrDecisionTree");
  }

/**
 *
 * Gets the RbrDecisionTree
 * @return Value of the RbrDecisionTree
 *
 */

  public RbrDecTreeObjectFilter getRbrDecisionTree( ) {
    return RbrDecTreeFindIn;
  }

}
