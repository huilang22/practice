/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ConditionExpressionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprObjKeyData getIn;
/**
 *
 * Constructor to create a  ConditionExpressionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprObjKeyData getInIn) {
    super(id, context, "ConditionExpressionGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ConditionExpression", CondExprObjKeyHelper.toMap(getIn, new HashMap(), "CondExprObjKeyData").get("CondExprObjKeyData"));
    }
  }


/**
 *
 * Sets the ConditionExpression
 * @param getInIn Value of the getIn
 *
 */

  public void setConditionExpression(CondExprObjKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = CondExprObjKeyHelper.fromMap(inputMap, "ConditionExpression");
  }

/**
 *
 * Gets the ConditionExpression
 * @return Value of the ConditionExpression
 *
 */

  public CondExprObjKeyData getConditionExpression( ) {
    return getIn;
  }

}
