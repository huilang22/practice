/*
 * Generated code DO NOT EDIT
 * Generated file: ExchangeRateClassUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExchangeRateClassUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExchangeRateClassUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExchangeRateClassObjectData noOpIn;

/**
 *
 * Constructor to create a   ExchangeRateClassUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExchangeRateClassUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectData noOpInIn) {
    super(id, context, "ExchangeRateClassUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(noOpIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }
/**
 *
 * Sets the  ExchangeRateClass
 * @param noOpInIn ExchangeRateClassObjectData to set
 *
 */
  public void setExchangeRateClass(ExchangeRateClassObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExchangeRateClass passed into the constructor
 * @return Simulated response
 *
 */
  public ExchangeRateClassObjectData getExchangeRateClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExchangeRateClassObjectHelper.fromMap(inputMap, "ExchangeRateClass");
  }
}
