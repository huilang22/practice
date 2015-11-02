/*
 * Generated code DO NOT EDIT
 * Generated file: IndustryTypeGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a IndustryTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class IndustryTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected IndustryTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   IndustryTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public IndustryTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, IndustryTypeObjectData noOpInIn) {
    super(id, context, "IndustryTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(noOpIn, new HashMap(), "IndustryType").get("IndustryType"));
    }
  }
/**
 *
 * Sets the  IndustryType
 * @param noOpInIn IndustryTypeObjectData to set
 *
 */
  public void setIndustryType(IndustryTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the IndustryType passed into the constructor
 * @return Simulated response
 *
 */
  public IndustryTypeObjectData getIndustryType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = IndustryTypeObjectHelper.fromMap(inputMap, "IndustryType");
  }
}
