/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionExpressionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprObjData updateIn;
/**
 *
 * Constructor to create a  ConditionExpressionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprObjData updateInIn) {
    super(id, context, "ConditionExpressionUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("ConditionExpression", CondExprObjHelper.toMap(updateIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }


/**
 *
 * Sets the ConditionExpression
 * @param updateInIn Value of the updateIn
 *
 */

  public void setConditionExpression(CondExprObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = CondExprObjHelper.fromMap(inputMap, "ConditionExpression");
  }

/**
 *
 * Gets the ConditionExpression
 * @return Value of the ConditionExpression
 *
 */

  public CondExprObjData getConditionExpression( ) {
    return updateIn;
  }

}
