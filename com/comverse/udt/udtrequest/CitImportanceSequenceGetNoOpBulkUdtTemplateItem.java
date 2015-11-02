/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitImportanceSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitImportanceSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitImportanceObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   CitImportanceSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitImportanceSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitImportanceObjectKeyData noOpInIn) {
    super(id, context, "CitImportanceSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
/**
 *
 * Sets the  CitImportance
 * @param noOpInIn CitImportanceObjectKeyData to set
 *
 */
  public void setCitImportance(CitImportanceObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitImportance passed into the constructor
 * @return Simulated response
 *
 */
  public CitImportanceObjectKeyData getCitImportance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitImportanceObjectKeyHelper.fromMap(inputMap, "CitImportance");
  }
}
