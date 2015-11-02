/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionGetBulkUdtTemplateItem.java
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
 * Class used to create a ConditionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondObjKeyData getIn;
/**
 *
 * Constructor to create a  ConditionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CondObjKeyData getInIn) {
    super(id, context, "ConditionGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Condition", CondObjKeyHelper.toMap(getIn, new HashMap(), "CondObjKeyData").get("CondObjKeyData"));
    }
  }


/**
 *
 * Sets the Condition
 * @param getInIn Value of the getIn
 *
 */

  public void setCondition(CondObjKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = CondObjKeyHelper.fromMap(inputMap, "Condition");
  }

/**
 *
 * Gets the Condition
 * @return Value of the Condition
 *
 */

  public CondObjKeyData getCondition( ) {
    return getIn;
  }

}
