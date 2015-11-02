/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionFindBulkUdtTemplateItem.java
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
 * Class used to create a ConditionExpressionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprObjFilter findIn;
/**
 *
 * Constructor to create a  ConditionExpressionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprObjFilter findInIn) {
    super(id, context, "ConditionExpressionFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConditionExpression", CondExprObjHelper.toMap(findIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }


/**
 *
 * Sets the ConditionExpression
 * @param findInIn Value of the findIn
 *
 */

  public void setConditionExpression(CondExprObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = CondExprObjHelper.fromMapFilter(inputMap, "ConditionExpression");
  }

/**
 *
 * Gets the ConditionExpression
 * @return Value of the ConditionExpression
 *
 */

  public CondExprObjFilter getConditionExpression( ) {
    return findIn;
  }

}
