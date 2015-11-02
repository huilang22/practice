/*
 * Generated code DO NOT EDIT
 * Generated file: ExpressionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExpressionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExpressionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExprObjData updateIn;
/**
 *
 * Constructor to create a  ExpressionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExpressionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExprObjData updateInIn) {
    super(id, context, "ExpressionUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("Expression", ExprObjHelper.toMap(updateIn, new HashMap(), "Expression").get("Expression"));
    }
  }


/**
 *
 * Sets the Expression
 * @param updateInIn Value of the updateIn
 *
 */

  public void setExpression(ExprObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = ExprObjHelper.fromMap(inputMap, "Expression");
  }

/**
 *
 * Gets the Expression
 * @return Value of the Expression
 *
 */

  public ExprObjData getExpression( ) {
    return updateIn;
  }

}
