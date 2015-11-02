/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsLocationValuesUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationValuesUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationValuesObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationValuesUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationValuesUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationValuesObjectData noOpInIn) {
    super(id, context, "InvsLocationValuesUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }
/**
 *
 * Sets the  InvsLocationValues
 * @param noOpInIn InvsLocationValuesObjectData to set
 *
 */
  public void setInvsLocationValues(InvsLocationValuesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationValues passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationValuesObjectData getInvsLocationValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationValuesObjectHelper.fromMap(inputMap, "InvsLocationValues");
  }
}
