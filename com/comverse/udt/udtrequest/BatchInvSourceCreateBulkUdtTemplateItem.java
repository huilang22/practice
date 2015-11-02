/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchInvSourceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchInvSourceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BISObjectData BISCreateIn;
/**
 *
 * Constructor to create a  BatchInvSourceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchInvSourceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BISObjectData BISCreateInIn) {
    super(id, context, "BatchInvSourceCreate");
    BISCreateIn = BISCreateInIn;
  }

  public void translateToMap() {
    if (BISCreateIn != null) {
      BISCreateIn.resetFlags(true, true);
      addInput("BatchInvSource", BISObjectHelper.toMap(BISCreateIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }


/**
 *
 * Sets the BatchInvSource
 * @param BISCreateInIn Value of the BISCreateIn
 *
 */

  public void setBatchInvSource(BISObjectData BISCreateInIn) {
    BISCreateIn = BISCreateInIn;
  }

  public void translateFromMap() {
    BISCreateIn = BISObjectHelper.fromMap(inputMap, "BatchInvSource");
  }

/**
 *
 * Gets the BatchInvSource
 * @return Value of the BatchInvSource
 *
 */

  public BISObjectData getBatchInvSource( ) {
    return BISCreateIn;
  }

}
