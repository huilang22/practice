/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyEventTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyEventTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeDeleteIn;
/**
 *
 * Constructor to create a  BatchNotifyEventTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyEventTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeDeleteInIn) {
    super(id, context, "BatchNotifyEventTypeDelete");
    batchNotifyEventTypeDeleteIn = batchNotifyEventTypeDeleteInIn;
  }

  public void translateToMap() {
    if (batchNotifyEventTypeDeleteIn != null) {
      batchNotifyEventTypeDeleteIn.resetFlags(true, true);
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectKeyHelper.toMap(batchNotifyEventTypeDeleteIn, new HashMap(), "BatchNotifyEventTypeObjectKeyData").get("BatchNotifyEventTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchNotifyEventType
 * @param batchNotifyEventTypeDeleteInIn Value of the batchNotifyEventTypeDeleteIn
 *
 */

  public void setBatchNotifyEventType(BatchNotifyEventTypeObjectKeyData batchNotifyEventTypeDeleteInIn) {
    batchNotifyEventTypeDeleteIn = batchNotifyEventTypeDeleteInIn;
  }

  public void translateFromMap() {
    batchNotifyEventTypeDeleteIn = BatchNotifyEventTypeObjectKeyHelper.fromMap(inputMap, "BatchNotifyEventType");
  }

/**
 *
 * Gets the BatchNotifyEventType
 * @return Value of the BatchNotifyEventType
 *
 */

  public BatchNotifyEventTypeObjectKeyData getBatchNotifyEventType( ) {
    return batchNotifyEventTypeDeleteIn;
  }

}
