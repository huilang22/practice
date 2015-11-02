/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionCreateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondObjData createIn;
/**
 *
 * Constructor to create a  ConditionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondObjData createInIn) {
    super(id, context, "ConditionCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("Condition", CondObjHelper.toMap(createIn, new HashMap(), "Condition").get("Condition"));
    }
  }


/**
 *
 * Sets the Condition
 * @param createInIn Value of the createIn
 *
 */

  public void setCondition(CondObjData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = CondObjHelper.fromMap(inputMap, "Condition");
  }

/**
 *
 * Gets the Condition
 * @return Value of the Condition
 *
 */

  public CondObjData getCondition( ) {
    return createIn;
  }

}
