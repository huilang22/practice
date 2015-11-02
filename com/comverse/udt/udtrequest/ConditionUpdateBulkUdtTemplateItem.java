/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondObjData updateIn;
/**
 *
 * Constructor to create a  ConditionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondObjData updateInIn) {
    super(id, context, "ConditionUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("Condition", CondObjHelper.toMap(updateIn, new HashMap(), "Condition").get("Condition"));
    }
  }


/**
 *
 * Sets the Condition
 * @param updateInIn Value of the updateIn
 *
 */

  public void setCondition(CondObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = CondObjHelper.fromMap(inputMap, "Condition");
  }

/**
 *
 * Gets the Condition
 * @return Value of the Condition
 *
 */

  public CondObjData getCondition( ) {
    return updateIn;
  }

}
