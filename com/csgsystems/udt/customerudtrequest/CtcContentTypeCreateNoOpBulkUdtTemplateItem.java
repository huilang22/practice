/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcContentTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcContentTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcContentTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcContentTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcContentTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectData noOpInIn) {
    super(id, context, "CtcContentTypeCreate");
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
