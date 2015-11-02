/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionFindBulkUdtTemplateItem.java
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
 * Class used to create a ExpressionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExpressionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExprObjFilter findIn;
/**
 *
 * Constructor to create a  ExpressionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExpressionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ExprObjFilter findInIn) {
    super(id, context, "ExpressionFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Expression", ExprObjHelper.toMap(findIn, new HashMap(), "Expression").get("Expression"));
    }
  }


/**
 *
 * Sets the Expression
 * @param findInIn Value of the findIn
 *
 */

  public void setExpression(ExprObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = ExprObjHelper.fromMapFilter(inputMap, "Expression");
  }

/**
 *
 * Gets the Expression
 * @return Value of the Expression
 *
 */

  public ExprObjFilter getExpression( ) {
    return findIn;
  }

}
