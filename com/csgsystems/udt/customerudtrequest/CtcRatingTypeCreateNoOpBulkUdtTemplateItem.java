/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingTypeCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcRatingTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcRatingTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcRatingTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcRatingTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcRatingTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectData noOpInIn) {
    super(id, context, "CtcRatingTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
/**
 *
 * Sets the  CtcRatingType
 * @param noOpInIn CtcRatingTypeObjectData to set
 *
 */
  public void setCtcRatingType(CtcRatingTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcRatingType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingTypeObjectData getCtcRatingType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcRatingTypeObjectHelper.fromMap(inputMap, "CtcRatingType");
  }
}
