/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGrpUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionExpressionGrpUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionGrpUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprGrpObjBaseData updateIn;
/**
 *
 * Constructor to create a  ConditionExpressionGrpUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionGrpUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprGrpObjBaseData updateInIn) {
    super(id, context, "ConditionExpressionGrpUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(updateIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }


/**
 *
 * Sets the ConditionExpressionGrp
 * @param updateInIn Value of the updateIn
 *
 */

  public void setConditionExpressionGrp(CondExprGrpObjBaseData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = CondExprGrpObjBaseHelper.fromMap(inputMap, "ConditionExpressionGrp");
  }

/**
 *
 * Gets the ConditionExpressionGrp
 * @return Value of the ConditionExpressionGrp
 *
 */

  public CondExprGrpObjBaseData getConditionExpressionGrp( ) {
    return updateIn;
  }

}
