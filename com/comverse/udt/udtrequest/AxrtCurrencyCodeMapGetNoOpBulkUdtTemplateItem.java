/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCurrencyCodeMapGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AxrtCurrencyCodeMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AxrtCurrencyCodeMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AxrtCurrencyCodeMapObjectData noOpIn;

/**
 *
 * Constructor to create a   AxrtCurrencyCodeMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AxrtCurrencyCodeMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtCurrencyCodeMapObjectData noOpInIn) {
    super(id, context, "AxrtCurrencyCodeMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AxrtCurrencyCodeMap", AxrtCurrencyCodeMapObjectHelper.toMap(noOpIn, new HashMap(), "AxrtCurrencyCodeMap").get("AxrtCurrencyCodeMap"));
    }
  }
/**
 *
 * Sets the  AxrtCurrencyCodeMap
 * @param noOpInIn AxrtCurrencyCodeMapObjectData to set
 *
 */
  public void setAxrtCurrencyCodeMap(AxrtCurrencyCodeMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AxrtCurrencyCodeMap passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtCurrencyCodeMapObjectData getAxrtCurrencyCodeMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AxrtCurrencyCodeMapObjectHelper.fromMap(inputMap, "AxrtCurrencyCodeMap");
  }
}
