/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RbrRateTableUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTableUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRateTableObjectData RbrRtTblUpdIn;
/**
 *
 * Constructor to create a  RbrRateTableUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTableUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRateTableObjectData RbrRtTblUpdInIn) {
    super(id, context, "RbrRateTableUpdate");
    RbrRtTblUpdIn = RbrRtTblUpdInIn;
  }

  public void translateToMap() {
    if (RbrRtTblUpdIn != null) {
      RbrRtTblUpdIn.resetFlags(true, true);
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(RbrRtTblUpdIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }


/**
 *
 * Sets the RbrRateTable
 * @param RbrRtTblUpdInIn Value of the RbrRtTblUpdIn
 *
 */

  public void setRbrRateTable(RbrRateTableObjectData RbrRtTblUpdInIn) {
    RbrRtTblUpdIn = RbrRtTblUpdInIn;
  }

  public void translateFromMap() {
    RbrRtTblUpdIn = RbrRateTableObjectHelper.fromMap(inputMap, "RbrRateTable");
  }

/**
 *
 * Gets the RbrRateTable
 * @return Value of the RbrRateTable
 *
 */

  public RbrRateTableObjectData getRbrRateTable( ) {
    return RbrRtTblUpdIn;
  }

}
