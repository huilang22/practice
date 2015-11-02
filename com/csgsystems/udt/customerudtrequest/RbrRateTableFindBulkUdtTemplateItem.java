/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTableFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTableFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTableFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRateTableObjectFilter RbrRtTblFndIn;
/**
 *
 * Constructor to create a  RbrRateTableFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTableFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRateTableObjectFilter RbrRtTblFndInIn) {
    super(id, context, "RbrRateTableFind");
    RbrRtTblFndIn = RbrRtTblFndInIn;
  }

  public void translateToMap() {
    if (RbrRtTblFndIn != null) {
      Integer index =  RbrRtTblFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(RbrRtTblFndIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }


/**
 *
 * Sets the RbrRateTable
 * @param RbrRtTblFndInIn Value of the RbrRtTblFndIn
 *
 */

  public void setRbrRateTable(RbrRateTableObjectFilter RbrRtTblFndInIn) {
    RbrRtTblFndIn = RbrRtTblFndInIn;
  }

  public void translateFromMap() {
    RbrRtTblFndIn = RbrRateTableObjectHelper.fromMapFilter(inputMap, "RbrRateTable");
  }

/**
 *
 * Gets the RbrRateTable
 * @return Value of the RbrRateTable
 *
 */

  public RbrRateTableObjectFilter getRbrRateTable( ) {
    return RbrRtTblFndIn;
  }

}
