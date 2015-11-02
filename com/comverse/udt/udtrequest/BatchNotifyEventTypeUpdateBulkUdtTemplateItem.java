/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyEventTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyEventTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyEventTypeObjectData batchNotifyEventTypeUpdateIn;
/**
 *
 * Constructor to create a  BatchNotifyEventTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyEventTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyEventTypeObjectData batchNotifyEventTypeUpdateInIn) {
    super(id, context, "BatchNotifyEventTypeUpdate");
    batchNotifyEventTypeUpdateIn = batchNotifyEventTypeUpdateInIn;
  }

  public void translateToMap() {
    if (batchNotifyEventTypeUpdateIn != null) {
      batchNotifyEventTypeUpdateIn.resetFlags(true, true);
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(batchNotifyEventTypeUpdateIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }


/**
 *
 * Sets the BatchNotifyEventType
 * @param batchNotifyEventTypeUpdateInIn Value of the batchNotifyEventTypeUpdateIn
 *
 */

  public void setBatchNotifyEventType(BatchNotifyEventTypeObjectData batchNotifyEventTypeUpdateInIn) {
    batchNotifyEventTypeUpdateIn = batchNotifyEventTypeUpdateInIn;
  }

  public void translateFromMap() {
    batchNotifyEventTypeUpdateIn = BatchNotifyEventTypeObjectHelper.fromMap(inputMap, "BatchNotifyEventType");
  }

/**
 *
 * Gets the BatchNotifyEventType
 * @return Value of the BatchNotifyEventType
 *
 */

  public BatchNotifyEventTypeObjectData getBatchNotifyEventType( ) {
    return batchNotifyEventTypeUpdateIn;
  }

}
