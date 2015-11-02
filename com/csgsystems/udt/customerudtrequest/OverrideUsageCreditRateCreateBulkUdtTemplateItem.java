/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideUsageCreditRateCreateBulkUdtTemplateItem.java
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
 * Class used to create a OverrideUsageCreditRateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OverrideUsageCreditRateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCOverrideObjectData iRUCOCreateIn;
/**
 *
 * Constructor to create a  OverrideUsageCreditRateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OverrideUsageCreditRateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCOverrideObjectData iRUCOCreateInIn) {
    super(id, context, "OverrideUsageCreditRateCreate");
    iRUCOCreateIn = iRUCOCreateInIn;
  }

  public void translateToMap() {
    if (iRUCOCreateIn != null) {
      iRUCOCreateIn.resetFlags(true, true);
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(iRUCOCreateIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }


/**
 *
 * Sets the OverrideUsageCreditRate
 * @param iRUCOCreateInIn Value of the iRUCOCreateIn
 *
 */

  public void setOverrideUsageCreditRate(RUCOverrideObjectData iRUCOCreateInIn) {
    iRUCOCreateIn = iRUCOCreateInIn;
  }

  public void translateFromMap() {
    iRUCOCreateIn = RUCOverrideObjectHelper.fromMap(inputMap, "OverrideUsageCreditRate");
  }

/**
 *
 * Gets the OverrideUsageCreditRate
 * @return Value of the OverrideUsageCreditRate
 *
 */

  public RUCOverrideObjectData getOverrideUsageCreditRate( ) {
    return iRUCOCreateIn;
  }

}
