/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTableDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTableDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTableDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRateTableObjectKeyData RbrRtTblDeleteIn;
/**
 *
 * Constructor to create a  RbrRateTableDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTableDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRateTableObjectKeyData RbrRtTblDeleteInIn) {
    super(id, context, "RbrRateTableDelete");
    RbrRtTblDeleteIn = RbrRtTblDeleteInIn;
  }

  public void translateToMap() {
    if (RbrRtTblDeleteIn != null) {
      RbrRtTblDeleteIn.resetFlags(true, true);
      addInput("RbrRateTable", RbrRateTableObjectKeyHelper.toMap(RbrRtTblDeleteIn, new HashMap(), "RbrRateTableObjectKeyData").get("RbrRateTableObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrRateTable
 * @param RbrRtTblDeleteInIn Value of the RbrRtTblDeleteIn
 *
 */

  public void setRbrRateTable(RbrRateTableObjectKeyData RbrRtTblDeleteInIn) {
    RbrRtTblDeleteIn = RbrRtTblDeleteInIn;
  }

  public void translateFromMap() {
    RbrRtTblDeleteIn = RbrRateTableObjectKeyHelper.fromMap(inputMap, "RbrRateTable");
  }

/**
 *
 * Gets the RbrRateTable
 * @return Value of the RbrRateTable
 *
 */

  public RbrRateTableObjectKeyData getRbrRateTable( ) {
    return RbrRtTblDeleteIn;
  }

}
