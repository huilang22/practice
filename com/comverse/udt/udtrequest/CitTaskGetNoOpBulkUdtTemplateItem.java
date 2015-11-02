/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskObjectData noOpIn;

/**
 *
 * Constructor to create a   CitTaskGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectData noOpInIn) {
    super(id, context, "CitTaskGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectHelper.toMap(noOpIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }
/**
 *
 * Sets the  CitTask
 * @param noOpInIn CitTaskObjectData to set
 *
 */
  public void setCitTask(CitTaskObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTask passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectData getCitTask() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskObjectHelper.fromMap(inputMap, "CitTask");
  }
}
