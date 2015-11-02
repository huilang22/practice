/*
 * Generated code DO NOT EDIT
 * Generated file: InvsCountryCodeGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsCountryCodeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsCountryCodeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsCountryCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsCountryCodeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsCountryCodeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsCountryCodeObjectData noOpInIn) {
    super(id, context, "InvsCountryCodeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsCountryCode", InvsCountryCodeObjectHelper.toMap(noOpIn, new HashMap(), "InvsCountryCode").get("InvsCountryCode"));
    }
  }
/**
 *
 * Sets the  InvsCountryCode
 * @param noOpInIn InvsCountryCodeObjectData to set
 *
 */
  public void setInvsCountryCode(InvsCountryCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsCountryCode passed into the constructor
 * @return Simulated response
 *
 */
  public InvsCountryCodeObjectData getInvsCountryCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsCountryCodeObjectHelper.fromMap(inputMap, "InvsCountryCode");
  }
}
