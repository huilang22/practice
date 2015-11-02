/*
 * Generated code DO NOT EDIT
 * Generated file: ExpressionGetBulkUdtTemplateItem.java
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
 * Class used to create a ExpressionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExpressionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExprObjKeyData getIn;
/**
 *
 * Constructor to create a  ExpressionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExpressionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ExprObjKeyData getInIn) {
    super(id, context, "ExpressionGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Expression", ExprObjKeyHelper.toMap(getIn, new HashMap(), "ExprObjKeyData").get("ExprObjKeyData"));
    }
  }


/**
 *
 * Sets the Expression
 * @param getInIn Value of the getIn
 *
 */

  public void setExpression(ExprObjKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = ExprObjKeyHelper.fromMap(inputMap, "Expression");
  }

/**
 *
 * Gets the Expression
 * @return Value of the Expression
 *
 */

  public ExprObjKeyData getExpression( ) {
    return getIn;
  }

}
