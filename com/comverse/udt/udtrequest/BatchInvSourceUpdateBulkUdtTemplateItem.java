/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * Class used to create a BatchInvSourceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchInvSourceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BISObjectData BISUpdateIn;
/**
 *
 * Constructor to create a  BatchInvSourceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchInvSourceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BISObjectData BISUpdateInIn) {
    super(id, context, "BatchInvSourceUpdate");
    BISUpdateIn = BISUpdateInIn;
  }

  public void translateToMap() {
    if (BISUpdateIn != null) {
      BISUpdateIn.resetFlags(true, true);
      addInput("BatchInvSource", BISObjectHelper.toMap(BISUpdateIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }


/**
 *
 * Sets the BatchInvSource
 * @param BISUpdateInIn Value of the BISUpdateIn
 *
 */

  public void setBatchInvSource(BISObjectData BISUpdateInIn) {
    BISUpdateIn = BISUpdateInIn;
  }

  public void translateFromMap() {
    BISUpdateIn = BISObjectHelper.fromMap(inputMap, "BatchInvSource");
  }

/**
 *
 * Gets the BatchInvSource
 * @return Value of the BatchInvSource
 *
 */

  public BISObjectData getBatchInvSource( ) {
    return BISUpdateIn;
  }

}
