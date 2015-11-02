/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTableCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTableCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTableCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRateTableObjectData RbrRtTblCrIn;
/**
 *
 * Constructor to create a  RbrRateTableCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTableCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRateTableObjectData RbrRtTblCrInIn) {
    super(id, context, "RbrRateTableCreate");
    RbrRtTblCrIn = RbrRtTblCrInIn;
  }

  public void translateToMap() {
    if (RbrRtTblCrIn != null) {
      RbrRtTblCrIn.resetFlags(true, true);
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(RbrRtTblCrIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }


/**
 *
 * Sets the RbrRateTable
 * @param RbrRtTblCrInIn Value of the RbrRtTblCrIn
 *
 */

  public void setRbrRateTable(RbrRateTableObjectData RbrRtTblCrInIn) {
    RbrRtTblCrIn = RbrRtTblCrInIn;
  }

  public void translateFromMap() {
    RbrRtTblCrIn = RbrRateTableObjectHelper.fromMap(inputMap, "RbrRateTable");
  }

/**
 *
 * Gets the RbrRateTable
 * @return Value of the RbrRateTable
 *
 */

  public RbrRateTableObjectData getRbrRateTable( ) {
    return RbrRtTblCrIn;
  }

}
