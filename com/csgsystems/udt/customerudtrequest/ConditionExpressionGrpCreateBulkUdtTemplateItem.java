/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGrpCreateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionExpressionGrpCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionGrpCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprGrpObjBaseData createIn;
/**
 *
 * Constructor to create a  ConditionExpressionGrpCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionGrpCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprGrpObjBaseData createInIn) {
    super(id, context, "ConditionExpressionGrpCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(createIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }


/**
 *
 * Sets the ConditionExpressionGrp
 * @param createInIn Value of the createIn
 *
 */

  public void setConditionExpressionGrp(CondExprGrpObjBaseData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = CondExprGrpObjBaseHelper.fromMap(inputMap, "ConditionExpressionGrp");
  }

/**
 *
 * Gets the ConditionExpressionGrp
 * @return Value of the ConditionExpressionGrp
 *
 */

  public CondExprGrpObjBaseData getConditionExpressionGrp( ) {
    return createIn;
  }

}
