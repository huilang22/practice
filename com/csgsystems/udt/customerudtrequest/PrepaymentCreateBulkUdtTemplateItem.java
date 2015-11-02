/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentCreateBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentObjectData prepaymentCreateIn;
  protected Integer WaiveEpg;
/**
 *
 * Constructor to create a  PrepaymentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectData prepaymentCreateInIn, Integer WaiveEpgIn) {
    super(id, context, "PrepaymentCreate");
    prepaymentCreateIn = prepaymentCreateInIn;
    WaiveEpg = WaiveEpgIn;
  }

  public void translateToMap() {
    if (prepaymentCreateIn != null) {
      prepaymentCreateIn.resetFlags(true, true);
      addInput("Prepayment", PrepaymentObjectHelper.toMap(prepaymentCreateIn, new HashMap(), "Prepayment").get("Prepayment"));
    }
    if (WaiveEpg != null) {
      addInput("WaiveEpg", WaiveEpg);
    }
  }


/**
 *
 * Sets the Prepayment
 * @param prepaymentCreateInIn Value of the prepaymentCreateIn
 *
 */

  public void setPrepayment(PrepaymentObjectData prepaymentCreateInIn) {
    prepaymentCreateIn = prepaymentCreateInIn;
  }

/**
 *
 * Sets the WaiveEpg
 * @param WaiveEpgIn Value of the WaiveEpg
 *
 */

  public void setWaiveEpg(Integer WaiveEpgIn) {
    WaiveEpg = WaiveEpgIn;
  }

  public void translateFromMap() {
    prepaymentCreateIn = PrepaymentObjectHelper.fromMap(inputMap, "Prepayment");
    WaiveEpg = (Integer)inputMap.get("WaiveEpg");
  }

/**
 *
 * Gets the Prepayment
 * @return Value of the Prepayment
 *
 */

  public PrepaymentObjectData getPrepayment( ) {
    return prepaymentCreateIn;
  }

/**
 *
 * Gets the WaiveEpg
 * @return Value of the WaiveEpg
 *
 */

  public Integer getWaiveEpg( ) {
    return WaiveEpg;
  }

}
