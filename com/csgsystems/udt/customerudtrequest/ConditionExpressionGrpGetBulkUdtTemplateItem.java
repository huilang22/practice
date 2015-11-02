/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGrpGetBulkUdtTemplateItem.java
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
 * Class used to create a ConditionExpressionGrpGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionExpressionGrpGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondExprGrpObjBaseKeyData getIn;
/**
 *
 * Constructor to create a  ConditionExpressionGrpGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionExpressionGrpGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CondExprGrpObjBaseKeyData getInIn) {
    super(id, context, "ConditionExpressionGrpGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseKeyHelper.toMap(getIn, new HashMap(), "CondExprGrpObjBaseKeyData").get("CondExprGrpObjBaseKeyData"));
    }
  }


/**
 *
 * Sets the ConditionExpressionGrp
 * @param getInIn Value of the getIn
 *
 */

  public void setConditionExpressionGrp(CondExprGrpObjBaseKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = CondExprGrpObjBaseKeyHelper.fromMap(inputMap, "ConditionExpressionGrp");
  }

/**
 *
 * Gets the ConditionExpressionGrp
 * @return Value of the ConditionExpressionGrp
 *
 */

  public CondExprGrpObjBaseKeyData getConditionExpressionGrp( ) {
    return getIn;
  }

}
