/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitTaskTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CitTaskTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectData noOpInIn) {
    super(id, context, "CitTaskTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(noOpIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
/**
 *
 * Sets the  CitTaskType
 * @param noOpInIn CitTaskTypeObjectData to set
 *
 */
  public void setCitTaskType(CitTaskTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTaskType passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskTypeObjectData getCitTaskType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskTypeObjectHelper.fromMap(inputMap, "CitTaskType");
  }
}
