/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitImportanceDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitImportanceDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitImportanceObjectData noOpIn;

/**
 *
 * Constructor to create a   CitImportanceDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitImportanceDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectData noOpInIn) {
    super(id, context, "CitImportanceDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitImportance", CitImportanceObjectHelper.toMap(noOpIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
/**
 *
 * Sets the  CitImportance
 * @param noOpInIn CitImportanceObjectData to set
 *
 */
  public void setCitImportance(CitImportanceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitImportance passed into the constructor
 * @return Simulated response
 *
 */
  public CitImportanceObjectData getCitImportance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitImportanceObjectHelper.fromMap(inputMap, "CitImportance");
  }
}
