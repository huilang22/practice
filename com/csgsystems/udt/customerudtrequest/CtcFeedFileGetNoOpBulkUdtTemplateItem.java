/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcFeedFileGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcFeedFileGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcFeedFileObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcFeedFileGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcFeedFileGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFeedFileObjectData noOpInIn) {
    super(id, context, "CtcFeedFileGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(noOpIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }
/**
 *
 * Sets the  CtcFeedFile
 * @param noOpInIn CtcFeedFileObjectData to set
 *
 */
  public void setCtcFeedFile(CtcFeedFileObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcFeedFile passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFeedFileObjectData getCtcFeedFile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcFeedFileObjectHelper.fromMap(inputMap, "CtcFeedFile");
  }
}
