/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionGrpUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ConditionGrpUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConditionGrpUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CondGrpObjData updateIn;
/**
 *
 * Constructor to create a  ConditionGrpUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConditionGrpUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CondGrpObjData updateInIn) {
    super(id, context, "ConditionGrpUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("ConditionGrp", CondGrpObjHelper.toMap(updateIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }


/**
 *
 * Sets the ConditionGrp
 * @param updateInIn Value of the updateIn
 *
 */

  public void setConditionGrp(CondGrpObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = CondGrpObjHelper.fromMap(inputMap, "ConditionGrp");
  }

/**
 *
 * Gets the ConditionGrp
 * @return Value of the ConditionGrp
 *
 */

  public CondGrpObjData getConditionGrp( ) {
    return updateIn;
  }

}
