/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayDefinitionCheckNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BusinessDayDefinitionCheckNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BusinessDayDefinitionCheckNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected String noOpIn;

/**
 *
 * Constructor to create a   BusinessDayDefinitionCheckNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BusinessDayDefinitionCheckNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, String noOpInIn) {
    super(id, context, "BusinessDayDefinitionCheck");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("BDDcheckOut", noOpIn);
    }
  }
/**
 *
 * Sets the  BDDcheckOut
 * @param noOpInIn String to set
 *
 */
  public void setBDDcheckOut(String noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BDDcheckOut passed into the constructor
 * @return Simulated response
 *
 */
  public String getBDDcheckOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (String)inputMap.get("BDDcheckOut");
  }
}
