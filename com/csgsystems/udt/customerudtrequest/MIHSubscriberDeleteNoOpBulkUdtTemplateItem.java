/*
 * Generated code DO NOT EDIT
 * Generated file: MIHSubscriberDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a MIHSubscriberDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MIHSubscriberDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   MIHSubscriberDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MIHSubscriberDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "MIHSubscriberDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("Output", noOpIn);
    }
  }
/**
 *
 * Sets the  Output
 * @param noOpInIn Integer to set
 *
 */
  public void setOutput(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Output passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("Output");
  }
}
