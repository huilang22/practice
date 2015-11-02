/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassDeleteNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a ExchangeRateClassDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExchangeRateClassDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExchangeRateClassObjectData noOpIn;

/**
 *
 * Constructor to create a   ExchangeRateClassDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExchangeRateClassDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExchangeRateClassObjectData noOpInIn) {
    super(id, context, "ExchangeRateClassDelete");
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
