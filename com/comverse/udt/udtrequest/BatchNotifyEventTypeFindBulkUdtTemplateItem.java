/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyEventTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyEventTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyEventTypeObjectFilter batchNotifyEventTypeFindIn;
/**
 *
 * Constructor to create a  BatchNotifyEventTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyEventTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyEventTypeObjectFilter batchNotifyEventTypeFindInIn) {
    super(id, context, "BatchNotifyEventTypeFind");
    batchNotifyEventTypeFindIn = batchNotifyEventTypeFindInIn;
  }

  public void translateToMap() {
    if (batchNotifyEventTypeFindIn != null) {
      Integer index =  batchNotifyEventTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(batchNotifyEventTypeFindIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }


/**
 *
 * Sets the BatchNotifyEventType
 * @param batchNotifyEventTypeFindInIn Value of the batchNotifyEventTypeFindIn
 *
 */

  public void setBatchNotifyEventType(BatchNotifyEventTypeObjectFilter batchNotifyEventTypeFindInIn) {
    batchNotifyEventTypeFindIn = batchNotifyEventTypeFindInIn;
  }

  public void translateFromMap() {
    batchNotifyEventTypeFindIn = BatchNotifyEventTypeObjectHelper.fromMapFilter(inputMap, "BatchNotifyEventType");
  }

/**
 *
 * Gets the BatchNotifyEventType
 * @return Value of the BatchNotifyEventType
 *
 */

  public BatchNotifyEventTypeObjectFilter getBatchNotifyEventType( ) {
    return batchNotifyEventTypeFindIn;
  }

}
