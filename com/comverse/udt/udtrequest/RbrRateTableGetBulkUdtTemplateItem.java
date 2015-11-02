/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTableGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTableGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRateTableObjectKeyData RbrRtTblGetIn;
/**
 *
 * Constructor to create a  RbrRateTableGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTableGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRateTableObjectKeyData RbrRtTblGetInIn) {
    super(id, context, "RbrRateTableGet");
    RbrRtTblGetIn = RbrRtTblGetInIn;
  }

  public void translateToMap() {
    if (RbrRtTblGetIn != null) {
      RbrRtTblGetIn.resetFlags(true, true);
      addInput("RbrRateTable", RbrRateTableObjectKeyHelper.toMap(RbrRtTblGetIn, new HashMap(), "RbrRateTableObjectKeyData").get("RbrRateTableObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrRateTable
 * @param RbrRtTblGetInIn Value of the RbrRtTblGetIn
 *
 */

  public void setRbrRateTable(RbrRateTableObjectKeyData RbrRtTblGetInIn) {
    RbrRtTblGetIn = RbrRtTblGetInIn;
  }

  public void translateFromMap() {
    RbrRtTblGetIn = RbrRateTableObjectKeyHelper.fromMap(inputMap, "RbrRateTable");
  }

/**
 *
 * Gets the RbrRateTable
 * @return Value of the RbrRateTable
 *
 */

  public RbrRateTableObjectKeyData getRbrRateTable( ) {
    return RbrRtTblGetIn;
  }

}
