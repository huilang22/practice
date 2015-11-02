/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   CitTaskDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectBaseData noOpInIn) {
    super(id, context, "CitTaskDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(noOpIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }
/**
 *
 * Sets the  CitTask
 * @param noOpInIn CitTaskObjectBaseData to set
 *
 */
  public void setCitTask(CitTaskObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTask passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectBaseData getCitTask() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskObjectBaseHelper.fromMap(inputMap, "CitTask");
  }
}
