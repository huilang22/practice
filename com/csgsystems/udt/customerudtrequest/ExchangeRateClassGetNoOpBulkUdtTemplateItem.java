/*
 * Generated code DO NOT EDIT
 * Generated file: ExchangeRateClassGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExchangeRateClassGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExchangeRateClassGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExchangeRateClassObjectData noOpIn;

/**
 *
 * Constructor to create a   ExchangeRateClassGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExchangeRateClassGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectData noOpInIn) {
    super(id, context, "ExchangeRateClassGet");
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
