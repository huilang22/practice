/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionCreateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionExpressionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprObjData createIn;
/**
 *
 * Constructor to create a  ConditionExpressionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprObjData createInIn) {
    super(id, context, "ConditionExpressionCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("ConditionExpression", CondExprObjHelper.toMap(createIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }


/**
 *
 * Sets the ConditionExpression
 * @param createInIn Value of the createIn
 *
 */

  public void setConditionExpression(CondExprObjData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = CondExprObjHelper.fromMap(inputMap, "ConditionExpression");
  }

/**
 *
 * Gets the ConditionExpression
 * @return Value of the ConditionExpression
 *
 */

  public CondExprObjData getConditionExpression( ) {
    return createIn;
  }

}
