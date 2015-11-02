/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGrpFindBulkUdtTemplateItem.java
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
 * Class used to create a ConditionExpressionGrpFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionGrpFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprGrpObjFilter findIn;
/**
 *
 * Constructor to create a  ConditionExpressionGrpFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionGrpFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprGrpObjFilter findInIn) {
    super(id, context, "ConditionExpressionGrpFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConditionExpressionGrp", CondExprGrpObjHelper.toMap(findIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }


/**
 *
 * Sets the ConditionExpressionGrp
 * @param findInIn Value of the findIn
 *
 */

  public void setConditionExpressionGrp(CondExprGrpObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = CondExprGrpObjHelper.fromMapFilter(inputMap, "ConditionExpressionGrp");
  }

/**
 *
 * Gets the ConditionExpressionGrp
 * @return Value of the ConditionExpressionGrp
 *
 */

  public CondExprGrpObjFilter getConditionExpressionGrp( ) {
    return findIn;
  }

}
