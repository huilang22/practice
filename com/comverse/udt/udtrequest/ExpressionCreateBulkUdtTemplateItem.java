/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionCreateBulkUdtTemplateItem.java
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
 * Class used to create a ExpressionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExpressionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExprObjData createIn;
/**
 *
 * Constructor to create a  ExpressionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExpressionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExprObjData createInIn) {
    super(id, context, "ExpressionCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("Expression", ExprObjHelper.toMap(createIn, new HashMap(), "Expression").get("Expression"));
    }
  }


/**
 *
 * Sets the Expression
 * @param createInIn Value of the createIn
 *
 */

  public void setExpression(ExprObjData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = ExprObjHelper.fromMap(inputMap, "Expression");
  }

/**
 *
 * Gets the Expression
 * @return Value of the Expression
 *
 */

  public ExprObjData getExpression( ) {
    return createIn;
  }

}
