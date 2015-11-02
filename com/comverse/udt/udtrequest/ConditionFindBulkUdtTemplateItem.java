/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ConditionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondObjFilter findIn;
/**
 *
 * Constructor to create a  ConditionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CondObjFilter findInIn) {
    super(id, context, "ConditionFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Condition", CondObjHelper.toMap(findIn, new HashMap(), "Condition").get("Condition"));
    }
  }


/**
 *
 * Sets the Condition
 * @param findInIn Value of the findIn
 *
 */

  public void setCondition(CondObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = CondObjHelper.fromMapFilter(inputMap, "Condition");
  }

/**
 *
 * Gets the Condition
 * @return Value of the Condition
 *
 */

  public CondObjFilter getCondition( ) {
    return findIn;
  }

}
