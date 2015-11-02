/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcContentTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcContentTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcContentTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcContentTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcContentTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectData noOpInIn) {
    super(id, context, "CtcContentTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }
/**
 *
 * Sets the  CtcContentType
 * @param noOpInIn CtcContentTypeObjectData to set
 *
 */
  public void setCtcContentType(CtcContentTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcContentType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcContentTypeObjectData getCtcContentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcContentTypeObjectHelper.fromMap(inputMap, "CtcContentType");
  }
}
