/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchInvSourceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchInvSourceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BISObjectKeyData BISGetIn;
/**
 *
 * Constructor to create a  BatchInvSourceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchInvSourceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BISObjectKeyData BISGetInIn) {
    super(id, context, "BatchInvSourceGet");
    BISGetIn = BISGetInIn;
  }

  public void translateToMap() {
    if (BISGetIn != null) {
      BISGetIn.resetFlags(true, true);
      addInput("BatchInvSource", BISObjectKeyHelper.toMap(BISGetIn, new HashMap(), "BISObjectKeyData").get("BISObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchInvSource
 * @param BISGetInIn Value of the BISGetIn
 *
 */

  public void setBatchInvSource(BISObjectKeyData BISGetInIn) {
    BISGetIn = BISGetInIn;
  }

  public void translateFromMap() {
    BISGetIn = BISObjectKeyHelper.fromMap(inputMap, "BatchInvSource");
  }

/**
 *
 * Gets the BatchInvSource
 * @return Value of the BatchInvSource
 *
 */

  public BISObjectKeyData getBatchInvSource( ) {
    return BISGetIn;
  }

}
