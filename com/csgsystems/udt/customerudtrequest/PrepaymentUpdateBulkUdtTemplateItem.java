/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentObjectData prepaymentUpdateIn1;
  protected Integer _WaiveEpg;
/**
 *
 * Constructor to create a  PrepaymentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectData prepaymentUpdateIn1In, Integer _WaiveEpgIn) {
    super(id, context, "PrepaymentUpdate");
    prepaymentUpdateIn1 = prepaymentUpdateIn1In;
    _WaiveEpg = _WaiveEpgIn;
  }

  public void translateToMap() {
    if (prepaymentUpdateIn1 != null) {
      prepaymentUpdateIn1.resetFlags(true, true);
      addInput("Prepayment", PrepaymentObjectHelper.toMap(prepaymentUpdateIn1, new HashMap(), "Prepayment").get("Prepayment"));
    }
    if (_WaiveEpg != null) {
      addInput("WaiveEpg", _WaiveEpg);
    }
  }


/**
 *
 * Sets the Prepayment
 * @param prepaymentUpdateIn1In Value of the prepaymentUpdateIn1
 *
 */

  public void setPrepayment(PrepaymentObjectData prepaymentUpdateIn1In) {
    prepaymentUpdateIn1 = prepaymentUpdateIn1In;
  }

/**
 *
 * Sets the WaiveEpg
 * @param _WaiveEpgIn Value of the _WaiveEpg
 *
 */

  public void setWaiveEpg(Integer _WaiveEpgIn) {
    _WaiveEpg = _WaiveEpgIn;
  }

  public void translateFromMap() {
    prepaymentUpdateIn1 = PrepaymentObjectHelper.fromMap(inputMap, "Prepayment");
    _WaiveEpg = (Integer)inputMap.get("WaiveEpg");
  }

/**
 *
 * Gets the Prepayment
 * @return Value of the Prepayment
 *
 */

  public PrepaymentObjectData getPrepayment( ) {
    return prepaymentUpdateIn1;
  }

/**
 *
 * Gets the WaiveEpg
 * @return Value of the WaiveEpg
 *
 */

  public Integer getWaiveEpg( ) {
    return _WaiveEpg;
  }

}
